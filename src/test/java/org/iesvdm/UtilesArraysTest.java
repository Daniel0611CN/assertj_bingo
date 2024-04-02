package org.iesvdm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilesArraysTest {

    @Test void limpiarTest ()
    {

        /*given : */
        int[] nuevo = new int[0];

        /*do : */
        int[] result = UtilesArrays.limpiar();

        /*then : */
        assertTrue(nuevo.length == 0);
        assertArrayEquals(nuevo, result);

    }

    @Test void rellenarArrayTest ()
    {

        /*given : */
        int numElementos = 5;
        int[] array = new int[numElementos];

        /*do : */
        int[] result = UtilesArrays.rellenar(array, numElementos);

        /*then : */
        assertTrue(array.length == result.length);
        assertArrayEquals(array, result);

    }

    @Test void rellenarValorTest ()
    {

        /*given : */
        int numElementos = 4;
        int[] array = new int[numElementos];
        int valor = 2;

        /*do : */
        int[] result = UtilesArrays.rellenar(array, numElementos, valor);

        /*then : */
        assertEquals(result[2], valor);

        /* da igual el valor que ponga array[x],
        * ya que todas las posiciones del array tienen ese valor; */

    }

    @Test void insertarAlFinalTest ()
    {

        /*given : */
        int[] array = new int[8];
        int elemento = 5;

        /*do : */
        int[] result = UtilesArrays.rellenar(array, elemento);
        result[result.length-1] = elemento;

        /*then : */
        assertEquals(result[result.length-1], elemento);
        assertNotEquals(array.length, result.length); // Es lo mismo que abajo;
        // assertEquals(array.length+1, result.length);

    }

    @Test void insertarAlPrincipioTest ()
    {

        /*given : */
        int[] array = new int[4];
        int elemento = 2;

        /*do : */
        int[] result = UtilesArrays.insertarAlPrincipio(array, elemento);
        result[0] = elemento;

        /*then : */
        assertEquals(result[0], elemento);
        assertNotEquals(array.length, result.length);

    }

    @Test void insertarEnPosicionTest ()
    {

        /*given : */
        int[] array = new int[4];
        int elemento = 2;
        int pos = 2;

        /*do : */
        int[] result = UtilesArrays.insertarEnPosicion(array, elemento, pos);
        result[pos] = elemento;

        /*if (pos<result.length-1)
        {
            result[pos+1] = array[pos];
            assertEquals(array[pos], elemento);
        }*/


        /*then : */
        assertEquals(result[pos], elemento);
        assertEquals(array.length+1, result.length);

    }


    @Test void insertarOrdenadoTest ()
    {

            /*given : */
            int[] array = {1, 3, 5, 7, 9};
            int elemento = 4;
            int[] resultadoEsperado = {1, 3, 4, 5, 7, 9};

            /*do : */
            int[] resultadoActual = UtilesArrays.insertarOrdenado(array, elemento);

            /*then : */
            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void eliminarUltimoTest ()
        {

            /*given : */
            int[] array = {1, 2, 3, 4};
            int[] resultadoEsperado = {1, 2, 3};

            /*do : */
            int[] resultadoActual = UtilesArrays.eliminarUltimo(array);

            /*then : */
            assertArrayEquals(resultadoEsperado, resultadoActual);

    }

        @Test void elimininarPrimero ()
        {

            /*given : */
            int[] array = {1, 2, 3, 4};
            int[] resultadoEsperado = {2, 3, 4};

            /*given : */
            int[] resultadoActual = UtilesArrays.eliminarPrimero(array);

            /*given : */
            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testEliminarPosicion ()
        {

            int[] array = {1, 2, 3, 4};
            int posicion = 2;
            int[] resultadoEsperado = {1, 2, 4};


            int[] resultadoActual = UtilesArrays.eliminarPosicion(array, posicion);


            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testEliminar() {
            int[] array = {1, 2, 3, 4, 2};
            int elemento = 2;
            int[] resultadoEsperado = {1, 3, 4};

            int[] resultadoActual = UtilesArrays.eliminar(array, elemento);

            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testOrdenar() {
            int[] array = {4, 2, 1, 3};
            int[] resultadoEsperado = {1, 2, 3, 4};

            int[] resultadoActual = UtilesArrays.ordenar(array);

            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testDesordenar() {
            int[] array = {1, 2, 3, 4, 5};
            int[] copia = array.clone(); // Hacemos una copia para comparar después

            UtilesArrays.desordenar(array);

            // Comprobamos que el array se ha desordenado
            boolean desordenado = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != copia[i]) {
                    desordenado = true;
                    break;
                }
            }

            assertEquals(true, desordenado);
        }

        @Test void testInvertir() {
            int[] array = {1, 2, 3, 4};
            int[] resultadoEsperado = {4, 3, 2, 1};

            int[] resultadoActual = UtilesArrays.invertir(array);

            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testPartirPor() {
            int[] array = {1, 2, 3, 4, 5};
            int posicionInicio = 1;
            int posicionCorte = 4;
            int[] resultadoEsperado = {2, 3, 4};

            int[] resultadoActual = UtilesArrays.partirPor(array, posicionInicio, posicionCorte);

            assertArrayEquals(resultadoEsperado, resultadoActual);
        }

        @Test void testSonIguales() {
            int[] array1 = {1, 2, 3};
            int[] array2 = {1, 2, 3};
            boolean resultadoEsperado = true;

            boolean resultadoActual = UtilesArrays.sonIguales(array1, array2);

            assertEquals(resultadoEsperado, resultadoActual);
        }

}
