package com.diegobonnin.ipoo.baseDeDatos;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TestConexion {
	
	@Test	
	public void test(){
		
		Conexion c=new Conexion(
				"jdbc:postgresql://localhost:5432/repuestos", // url 
				"org.postgresql.Driver", // clase del driver
				"postgres", // usuario
				"postgres" // contraseña
		);
		
		assertNotNull(c);
		
		try {
			c.conectar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		assertNotNull(c.getCon());

		// Insert
		
		PreparedStatement ps=null;
		
		try{
			Connection con=c.getCon();
			ps=con.prepareStatement(
				"INSERT INTO personas(" +
				"lugar_de_nacimiento, fecha_de_nacimiento, " + 
				"nacionalidad, tipo_doc, nro_doc, " + 
				"direccion_particular, telefono, nombre) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
			);
			
			
			ps.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
			ps.setString(3, "PY");
			ps.setString(4, "CI");
			ps.setString(5, "99999999");
			ps.setString(6, "Palma");
			ps.setString(7, "999999");
			ps.setString(8, "Juan López");
			ps.setString(1, "Fernando de la Mora");
			
			// Cantidad de filas afectadas
			int insertado=ps.executeUpdate();
			
			if(insertado > 0){
				System.out.println("Inserto");
			}

		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			if(ps!=null){
				try{
					ps.close();
				}catch(SQLException sqle){
					sqle.printStackTrace();
				}
			}
		}
		
		PreparedStatement psDelete=null;
		
		try{
			Connection con=c.getCon();
			psDelete=con.prepareStatement("delete from personas where id=?");
			psDelete.setInt(1, 5);
			
			// Cantidad de filas afectadas
			int eliminado=psDelete.executeUpdate();
			
			if(eliminado > 0){
				System.out.println("Eliminado");
			}

		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			if(psDelete!=null){
				try{
					psDelete.close();
				}catch(SQLException sqle){
					sqle.printStackTrace();
				}
			}
		}
		
		PreparedStatement psUpdate=null;
		
		try{
			Connection con=c.getCon();
			psUpdate=con.prepareStatement("update personas set nacionalidad=? where id=?");
			psUpdate.setInt(1, 6);
			psUpdate.setString(2, "BR");
			
			// Cantidad de filas afectadas
			int actualizado=psUpdate.executeUpdate();
			
			if(actualizado > 0){
				System.out.println("Actualizado");
			}

		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			if(psUpdate!=null){
				try{
					psUpdate.close();
				}catch(SQLException sqle){
					sqle.printStackTrace();
				}
			}
		}		
		
		
		Statement s=null;
		ResultSet rs=null;
		
		try{
			Connection con=c.getCon();
			s=con.createStatement();
			rs=s.executeQuery("select * from personas");
			while(rs.next()){
				System.out.println("id: " + rs.getString("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Fecha de Nac.: " + rs.getDate("fecha_de_nacimiento"));
				Date d=rs.getDate("fecha_de_nacimiento");
				System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(d));
				System.out.println("Lugar de Nac.: " + rs.getString("lugar_de_nacimiento"));
			}
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			if(s!=null){
				try{
					s.close();
				}catch(SQLException sqle){
					sqle.printStackTrace();
				}
			}
			if(rs!=null){
				try{
					rs.close();
				}catch(SQLException sqle){
					sqle.printStackTrace();
				}
			}
		}
		
		try {
			c.desconectar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
	}

}
