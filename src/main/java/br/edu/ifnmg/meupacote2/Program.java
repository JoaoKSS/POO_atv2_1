/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.meupacote2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaok
 */
public class Program {

    public static void main(String[] args) {
        List<String> cpfs = new ArrayList<>();
        cpfs.add("14230703058");
        cpfs.add("142.307.030-58");
        cpfs.add("230703058");
        cpfs.add("002.307.030-58");

        for (String cpf : cpfs) {
            boolean valido = Util.validarCpf(cpf);
            System.out.println("CPF: " + cpf);
            System.out.println("Resposta: " + (valido ? "Valido\n" : "Invalido\n"));
        }
    }
}
