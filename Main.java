package org.example;

public class Main {
    public static void main(String[] args) {
        String string = "AfiadaSilvABarbosa";
        int contador = 0;

        //Varrer cada caractere na String
        for (int i = 0; i < string.length(); i++) {
            char caractere = string.charAt(i);
            //Verificando se o caractere é "a" ou "A"
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        //Caso a foi encontrada
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na String");
        } else {
            System.out.println("A letra 'a' nao foi encontrada na String");
        }
    }
}