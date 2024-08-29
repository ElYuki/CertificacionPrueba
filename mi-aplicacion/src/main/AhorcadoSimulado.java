package com.example.myproject;

public class AhorcadoSimulado {

    public String jugar(String[] entradas) throws Exception {
        String palabraSecreta = "INTELIGENCIA";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        int entradaIndex = 0;
        while (!palabraAdivinada && intentos < intentosMax && entradaIndex < entradas.length) {
            char letra = Character.toUpperCase(entradas[entradaIndex++].charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                resultado.append("¡Incorrecto! Te quedan ").append(intentosMax - intentos).append(" intentos.\n");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                resultado.append("¡Felicidades! Has adivinado la palabra secreta: ").append(palabraSecreta).append("\n");
            }
        }

        if (!palabraAdivinada) {
            resultado.append("¡Que pena te haz quedado sin intentos! Game Over\n");
        }

        return resultado.toString();
    }
}