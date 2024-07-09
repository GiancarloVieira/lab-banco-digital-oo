package com.banco;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
