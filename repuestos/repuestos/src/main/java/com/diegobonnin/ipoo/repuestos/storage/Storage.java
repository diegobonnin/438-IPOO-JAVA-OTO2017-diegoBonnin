package com.diegobonnin.ipoo.repuestos.storage;

import com.diegobonnin.ipoo.repuestos.cliente.Cliente;

public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
