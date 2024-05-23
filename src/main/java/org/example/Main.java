package org.example;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // domicilios
        Domicilio domicilioBanco = new Domicilio("Calle 1", 123, "Colonia 1", "Estado 1", 11111);
        Domicilio domicilioCliente1 = new Domicilio("Calle 2", 456, "Colonia 2", "Estado 2", 22222);
        Domicilio domicilioCliente2 = new Domicilio("Calle 3", 789, "Colonia 3", "Estado 3", 33333);

        // banco
        Banco banco = new Banco("Bancolombia", domicilioBanco, "RFCBANCO", "555-5555");

        // clientes
        Cliente cliente1 = new Cliente(1, "Juan Perez", domicilioCliente1, "RFC1", "555-1234", "2000-01-01");
        Cliente cliente2 = new Cliente(2, "Maria Lopez", domicilioCliente2, "RFC2", "555-5678",  "1985-02-02");

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Consultar cliente por número
        Cliente clienteConsultado = banco.consultarCliente(1);
        System.out.println("Cliente consultado por número:");
        System.out.println(clienteConsultado);

        // Buscar cliente por RFC
        Cliente clientePorRFC = banco.buscarClientePorRFC("RFC2");
        System.out.println("\nCliente encontrado por RFC:");
        System.out.println(clientePorRFC);

        // Eliminar cliente por número
        boolean clienteEliminado = banco.eliminarCliente(2);
        System.out.println("\nCliente eliminado? " + (clienteEliminado ? "Sí" : "No"));

        // Obtener todos los clientes ordenados por TreeSet
        TreeSet<Cliente> clientesOrdenados = banco.obtenerClientes();
        System.out.println("\nClientes en el banco (ordenados por TreeSet):");
        for (Cliente cliente : clientesOrdenados) {
            System.out.println(cliente);
        }
    }
}