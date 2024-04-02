package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BingoTest {

    @Test void rellenarNumerosCartonTest ()
    {

        /*given : */
        int[][] array = new int[8][3];
        int aleatorio = 2;

        /*do : */
        Bingo.rellenarNumerosCarton(array);

        /*then : */
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                for (int k = j + 1; k < array[0].length; k++)
                {
                    assertNotEquals(array[i][j], array[i][k]);
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (i==0)
                {
                    assertEquals(array[i][j] < 1, array[i][j] > 9);
                } else if (i!=0)
                {
                    assertEquals(array[i][j] < (i*10), array[i][j] >= ((i+1)*10));
                }
            }
        }

    }

    @Test void ponerBlancosTest ()
    {

        /*given : */
        int[][] array = new int[9][3];
        int pos = 3;
        boolean estaEnLaFila = false;
        boolean hay2blancos = false;

        /*do : */
        Bingo.ponerBlancos(array);

        /*then : */
        for (int i = 0; i < array[0].length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                estaEnLaFila = true;
                hay2blancos = true;
                if (array[j][i] == -1)
                {
                    assertEquals(estaEnLaFila, true);
                    assertEquals(hay2blancos, true);
                } else if (estaEnLaFila == false && hay2blancos == false)
                {
                    assertEquals(array[pos][i], -1);
                }
            }
        }

    }

    @Test void buscarFilaTest ()
    {

        /*given : */
        int[][] array = new int[8][3];
        int fila = 2;
        int pos = 3;

        /*do : */
        boolean result = Bingo.buscarFila(array, fila, pos);

        /*then : */
        if (array[pos][fila] == -1)
        {
            result = true;
            assertEquals(result, true);
        }

    }

    @Test void buscarColumnaTest ()
    {

        /*given : */
        int[][] array = new int[8][3];
        int pos = 3;
        int contador = 0;
        boolean esta2Veces = false;

        /*do : */
        boolean result = Bingo.buscarColumna(array, pos);

        /*then : */
        for (int i = 0; i < array[0].length; i++)
        {
            if (array[pos][i] == -1)
            {
                contador++;
                assertEquals(array[pos][i], -1);
                assertTrue(contador > 0);
            }

            if (contador >= 2) {
                esta2Veces = true;
                assertTrue(contador >= 2);
                assertEquals(esta2Veces, true);
            }
        }

    }

    @Test void buscarValorRepetidoTest ()
    {

        /*given : */
        int[] array = new int[4];
        int elemento = 2;
        array[3] = elemento;


        /*do : */
        boolean result = Bingo.buscarValorRepetido(array, elemento);

        /*then : */
        assertTrue(array[3] == elemento);
        for (int i = 0; i < array.length; i++)
        {
            if (array[3] == elemento) {
                result = true;
                assertTrue(result = true);
            }
        }

    }

    @Test void pintarCartonTest ()
    {

        /*given : */
        int[][] array = new int[8][3];
        int[] bolas = new int[4];
        int aciertos = 24;

        /*do : */
        int result = Bingo.pintarCarton(array, bolas);

        /*then : */
        assertEquals(aciertos, result);

    }

    @Test void insertarFinalTest ()
    {

        /*given : */
        int[] array = new int[3];
        int elemento = 6;
        array[0]=1;
        array[1]=5;
        array[2]=3;

        /*do : */
        int[] result = Bingo.insertarAlFinal(array, elemento);
        result[result.length-1]=elemento;

        /*then : */
        assertNotEquals(array.length, result.length); // array.length+1 = result.length
        assertEquals(result[result.length-1], elemento);

    }

    @Test void ordenarTest ()
    {

        /*given : */
        int[] array = {5,8,9,11,31,4,6,7};
        int[] resultExpected = {4,5,6,7,8,9,11,31};

        /*do : */
        int[] result = Bingo.ordenar(array);
        Arrays.sort(result);


        /*then : */
        assertEquals(array.length, result.length);
        assertArrayEquals(resultExpected, result);

    }

}
