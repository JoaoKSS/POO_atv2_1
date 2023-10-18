/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.meupacote2;

/**
 *
 * @author joaok
 */
public class Util {

    public static int obterDigito(long numero, int posicao) {
        return (int) ((numero / (long) Math.pow(10, posicao - 1)) % 10);
    }

    public static boolean validarCpf(long cpf) {
        return validarCpf(String.valueOf(cpf));
    }

    public static boolean validarCpf(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11) {
            return false;
        }

        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = cpf.charAt(i) - '0';
        }

        boolean todosDigitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (digitos[i] != digitos[0]) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += digitos[i] * (10 - i);
        }
        int primeiroDigitoVerificador = (soma * 10) % 11;
        if (primeiroDigitoVerificador == 10) {
            primeiroDigitoVerificador = 0;
        }
        if (primeiroDigitoVerificador != digitos[9]) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += digitos[i] * (11 - i);
        }
        int segundoDigitoVerificador = (soma * 10) % 11;
        if (segundoDigitoVerificador == 10) {
            segundoDigitoVerificador = 0;
        }
        if (segundoDigitoVerificador != digitos[10]) {
            return false;
        }

        return true;
    }
}
