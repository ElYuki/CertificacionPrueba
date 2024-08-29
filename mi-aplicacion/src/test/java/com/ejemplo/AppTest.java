package com.example.myproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    // Método auxiliar para simular la ejecución del juego con una secuencia de letras
    private String jugarAhorcado(String[] entradas) throws Exception {
        AhorcadoSimulado ahorcado = new AhorcadoSimulado();
        return ahorcado.jugar(entradas);
    }

    @Test
    public void pruebaEstandar1() throws Exception {
        String[] entradas = {"I", "N", "T", "E", "L", "I", "G", "E", "N", "C", "I", "A"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Felicidades"));
    }

    @Test
    public void pruebaEstandar2() throws Exception {
        String[] entradas = {"I", "N", "X", "T", "E", "P", "L", "I", "G", "Z", "E", "N", "C", "I", "A"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Felicidades"));
    }

    @Test
    public void pruebaEstandar3() throws Exception {
        String[] entradas = {"X", "Y", "Z", "Q", "W", "R", "U", "O", "P", "M"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Game Over"));
    }

    @Test
    public void pruebaEstandar4() throws Exception {
        String[] entradas = {"I", "N", "T", "X", "E", "L", "Z", "C", "R", "M"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Game Over"));
    }

    @Test
    public void pruebaEstandar5() throws Exception {
        String[] entradas = {"i", "n", "t", "e", "l", "i", "g", "e", "n", "c", "i", "a"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Felicidades"));
    }

    @Test
    public void pruebaBorde1() throws Exception {
        String[] entradas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Game Over"));
    }

    @Test
    public void pruebaBorde2() throws Exception {
        String[] entradas = {"@", "#", "$", "%", "&", "*", "(", ")"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Game Over"));
    }

    @Test
    public void pruebaBorde3() throws Exception {
        String[] entradas = {"I", "I", "N", "N", "T", "T", "E", "E", "L", "L"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Felicidades"));
    }

    @Test
    public void pruebaBorde4() throws Exception {
        String[] entradas = {"IN", "TE", "LL", "IG", "EN", "CIA"};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Felicidades"));
    }

    @Test
    public void pruebaBorde5() throws Exception {
        String[] entradas = {""};
        String resultado = jugarAhorcado(entradas);
        assertTrue(resultado.contains("Game Over"));
    }
}
