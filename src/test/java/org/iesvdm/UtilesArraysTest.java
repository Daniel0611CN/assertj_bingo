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

    @Test void insertarEnPosicionTest3 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest4 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest5 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest6 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest7 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest8 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }

    @Test void insertarEnPosicionTest9 ()
    {

        /*given : */


        /*do : */


        /*then : */


    }






}
