package com.mycompany.projetovalidapalindromo;

public class Main {

    public static void main(String[] args) {
        
        String palavra = "OVO";
        String palavra2 = "Caio";
        
        boolean Resultado = ValidaPalindromo.ehPalindromo(palavra);
        boolean Resultado2 = ValidaPalindromo.ehPalindromo(palavra2);
      
        System.out.println(Resultado);
        System.out.println(Resultado2);

    }
    
    
}
