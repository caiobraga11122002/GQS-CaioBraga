
package com.mycompany.projetovalidapalindromo;
import java.text.Normalizer;

public class ValidaPalindromo {
    
        public static boolean ehPalindromo(String frase) {
        if (frase == null || frase.isBlank()) return false;

        // Remove acentos
        String semAcentos = Normalizer.normalize(frase, Normalizer.Form.NFD)
                                       .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        // Remove tudo que não for letra ou número e deixa tudo minúsculo
        String limpa = semAcentos.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Inverte a string
        String invertida = new StringBuilder(limpa).reverse().toString();

        // Compara a original com a invertida
        return limpa.equals(invertida);
}
}