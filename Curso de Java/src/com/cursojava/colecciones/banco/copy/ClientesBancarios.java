package com.cursojava.colecciones.banco.copy;

import java.util.*;

public class ClientesBancarios {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Antonio L�pez", "0001", 20000);
		Cliente cliente2 = new Cliente("Rafael G�mez", "0002", 15000);
		Cliente cliente3 = new Cliente("Ana Mart�n", "0003", 200000);
		Cliente cliente4 = new Cliente("Juan D�az", "0004", 20);
		
		
		Set<Cliente>clientesDelBanco = new HashSet<Cliente>();
		
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
				
		System.out.println("+-----+----------------+--------------+");
		System.out.println("| ID  | Nombre Cliente | Saldo actual |");
		System.out.println("+-----+----------------+--------------+");
		for(Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.getDatos());
			System.out.println("+-----+----------------+--------------+");
		}
		
	}

}
