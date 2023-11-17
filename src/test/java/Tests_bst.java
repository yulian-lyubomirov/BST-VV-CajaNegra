

import com.bst.BST;
import com.bst.Node;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Tests_bst {

    BST bst;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bst = new BST();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive1() throws DepthException {
        bst.insert(-2500, true);
        assertTrue(bst.search(-2500) != null);

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive2() throws DepthException {
        bst.insert(-2499, true);
        assertTrue(bst.search(-2499) != null);

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive3() throws DepthException {
        bst.insert(0, true);
        assertTrue(bst.search(0) != null);

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive4() throws DepthException {
        bst.insert(2498, true);
        assertTrue(bst.search(2498) != null);

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive5() throws DepthException {
        bst.insert(2499, true);
        assertTrue(bst.search(2499) != null);

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive6() throws DepthException {
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(-2501, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive7() throws DepthException {
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(2500, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive8() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2500, true);
        assertTrue(bst.search(-2500) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive9() throws DepthException {
        for (int i = 1; i < 50; i++) {

            bst.insert(-i, true);


        }
        bst.insert(0, true);
        assertTrue(bst.search(0) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive10() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2499, true);
        assertTrue(bst.search(-2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive11() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2498, true);
        assertTrue(bst.search(2498) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive12() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2499, true);
        assertTrue(bst.search(2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive13() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(-2501, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive14() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(2500, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive15() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2500, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive16() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2499, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive17() throws DepthException {
        for (int i = 1; i < 51; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(0, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive18() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2498, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive19() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2499, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive20() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2501, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive21() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2500, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive22() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2500, true);
        assertTrue(bst.search(-2500) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive23() throws DepthException {
        for (int i = 1; i < 50; i++) {

            bst.insert(-i, true);


        }
        bst.insert(0, true);
        assertTrue(bst.search(0) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive24() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2499, true);
        assertTrue(bst.search(-2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive25() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2498, true);
        assertTrue(bst.search(2498) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive26() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2499, true);
        assertTrue(bst.search(2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive27() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(-2501, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive28() throws DepthException {
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(2500, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive29() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2500, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive30() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2499, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive31() throws DepthException {
        for (int i = 1; i < 51; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(0, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive32() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2498, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive33() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2499, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive34() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(-2501, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive35() throws DepthException {
        for (int i = 0; i < 50; i++) {

            bst.insert(-i, true);


        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(2500, true);
        });

    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive36() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2500, true);
        assertTrue(bst.search(-2500) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive37() throws DepthException {
        for (int i = 1; i < 25; i++) {

            bst.insert(-i, true);


        }
        bst.insert(0, true);
        assertTrue(bst.search(0) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive38() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        bst.insert(-2499, true);
        assertTrue(bst.search(-2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive39() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2498, true);
        assertTrue(bst.search(2498) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive40() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        bst.insert(2499, true);
        assertTrue(bst.search(2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive41() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(-2501, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive42() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(-i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(2500, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive43() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        bst.insert(-2500, true);
        assertTrue(bst.search(-2500) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive44() throws DepthException {
        for (int i = 1; i < 25; i++) {

            bst.insert(i, true);


        }
        bst.insert(0, true);
        assertTrue(bst.search(0) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive45() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        bst.insert(-2499, true);
        assertTrue(bst.search(-2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive46() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        bst.insert(2498, true);
        assertTrue(bst.search(2498) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive47() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        bst.insert(2499, true);
        assertTrue(bst.search(2499) != null);
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive48() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(-2501, true);
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertRecursive49() throws DepthException {
        for (int i = 0; i < 25; i++) {

            bst.insert(i, true);


        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(2500, true);
        });
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource(delimiter = '-', value = {
            "1 - 1- [0]",
            "1-2-[0, 1]",
            "1-25-[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]",
            "1-49-[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48]",
            "1-50-[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49]",
            "2-2-[1]",
            "2-25-[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]",
            "2-49-[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48]",
            "2-50-[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49]",
            "25-25-[24]",
            "25-49-[24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48]",
            "25-50-[24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49]",
            "49-49-[48]",
            "49-50-[48,49]"


    }


    )
    void casosPruebaPrintBetweenLevel(int nivel1, int nivel2, String print) throws DepthException, BetweenLevelException {
        for (int i = 0; i < nivel2; i++) {
            bst.insert(i, true);
        }
        assertEquals(print, bst.printBetweenLevel(nivel1, nivel2).toString());
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource(delimiter = '-', value = {
            "0 - 0",
            "0-1",
            "0-2",
            "0-25",
            "0-49",
            "0-50",
            "0-51",
            "51-0",
            "51-1",
            "51-2",
            "51-25",
            "51-49",
            "51-50",
            "51-51",
            "1-0",
            "1-51",
            "2-1",
            "2-51",
            "25-0",
            "25-1",
            "25-2",
            "25-51",
            "49-0",
            "49-1",
            "49-2",
            "49-25",
            "49-51",
            "50-0",
            "50-1",
            "50-2",
            "50-25",
            "50-49",
            "50-51"


                    }


    )
    void casosPruebaPrintBetweenLevelExcepciones(int nivel1, int nivel2) throws BetweenLevelException, DepthException {

      /*/  if(print.equals("depth")){
            for(int i=0;i<nivel2;i++){
                if(i<nivel2) {
                    bst.insert(i, true);
                }
            else {
                    assertThrows(com.exceptions.DepthException.class, () -> {
                        bst.insert(nivel2, true);
                    });
                }
            }
        }

       else if(print.equals("betweenLevel")) {
            assertThrows(com.exceptions.BetweenLevelException.class, () -> {
                bst.printBetweenLevel(nivel1, nivel2);
            });
        }
        else{

        }/*/
        if(nivel1<1 || nivel1>50 || nivel2<1 || nivel2 >50) {
            assertThrows(com.exceptions.BetweenLevelException.class, () -> {
                bst.printBetweenLevel(nivel1, nivel2);
            });
        }
        else{
            for(int i = 0;i<Math.max(nivel1,nivel2);i++){
                bst.insert(i,true);
            }
            assertThrows(com.exceptions.BetweenLevelException.class, () -> {
                bst.printBetweenLevel(nivel1, nivel2);
            });
        }


    }

    @Test
    void casoPruebagetSubTreeNodoNulo(){
        try {
            // Ejecutar la función que debería lanzar la excepción
            bst.getSubTree(null);

            // Si llegamos aquí, la excepción no fue lanzada, la prueba falla
            fail("Se esperaba una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Verificar el mensaje de la excepción
            assertEquals("El nodo no puede ser null", e.getMessage());
        }
    }
    @Test
    void casoPruebagetSubTreeNodoValido() throws DepthException {
        for(int i=0;i<6;i++){
            bst.insert(i,true);

        }
        assertEquals("[3, 4, 5]",bst.getSubTree(bst.search(3)).toList().toString());
    }
    @Test
    void casoPruebagetSubTreeNodoNoValido() throws DepthException {
        for(int i=0;i<6;i++){
            bst.insert(i,true);

        }
        Node nodeTest= new Node(5);
        try {
            // Ejecutar la función que debería lanzar la excepción
            bst.getSubTree(bst.search(2).getLeftChild());

            // Si llegamos aquí, la excepción no fue lanzada, la prueba falla
            fail("Se esperaba una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Verificar el mensaje de la excepción
            assertEquals("El nodo debe pertenecer al arbol", e.getMessage());
        }
    }
    @Test
    void casoPruebagetSubTreeNodoSinHojas() throws DepthException {
        bst.insert(1,true);
        assertEquals("[1]",bst.getSubTree(bst.search(1)).toList().toString());

    }
    @ParameterizedTest
    @CsvSource(delimiter = '|',value={
            "-2500|0|0",
            "-2499|0|0",
            "0|0|0",
            "2498|0|0",
            "2499|0|0",
            "-2500|48|-1",
            "-2499|48|-1",
            "0|48|-1",
            "2498|48|-1",
            "2499|48|-1",
            "-2500|49|-1",
            "-2499|49|-1",
            "0|49|-1",
            "2498|49|-1",
            "2499|49|-1",
            "-2500|25|-1",
            "-2499|25|-1",
            "0|25|-1",
            "2498|25|-1",
            "2499|25|-1",
            "-2500|49|-1",
            "-2499|49|-1",
            "0|49|-1",
            "2498|49|-1",
            "2499|49|-1",
            "-2500|48|1",
            "-2499|48|1",
            "0|48|1",
            "2498|48|1",
            "2499|48|1",
            "-2500|49|1",
            "-2499|49|1",
            "0|49|1",
            "2498|49|1",
            "2499|49|1",
            "-2500|25|1",
            "-2499|25|1",
            "0|25|1",
            "2498|25|1",
            "2499|25|1",
            "-2500|49|1",
            "-2499|49|1",
            "0|49|1",
            "2498|49|1",
            "2499|49|1",

    })
    void casosPruebaInsertIterativoValidos(int valor,int nivel,int sentido) throws DepthException {
        for(int i=1;i<=nivel;i++){
            bst.insert(i*sentido,false);
        }
        Node test = new  Node<>(valor);
        bst.insert(valor,false);
        assertTrue(bst.search(valor)!=null);
    }
    @ParameterizedTest
    @CsvSource(delimiter='|',value={
            "-2500|-1",
            "-2499|-1",
            "0|-1",
            "2498|-1",
            "2499|-1",
            "-2500|1",
            "-2499|1",
            "0|1",
            "2498|1",
            "2499|1",


    })
    void casosPruebaInsertIterativoNoValidosDepth(int valor, int sentido)  throws DepthException{
        for(int i=1;i<=50;i++){
            bst.insert(i*sentido,false);
        }
        assertThrows(com.exceptions.DepthException.class, () -> {
            bst.insert(valor, false); //deberia de dar error y no lo da para algunos valores
        });
    }

    @ParameterizedTest
    @CsvSource(delimiter='|',value={

            "-2501|0|0",
            "-2501|48|-1",
            "-2501|49|-1",
            "-2501|50|-1",
            "2500|0|0",
            "2500|48|1",
            "2500|49|1",
            "2500|48|50",

    })
    void casosPruebaInsertIterativoNoValidosIllegalArgument(int valor,int nivel,int sentido)  throws DepthException{
        for(int i=1;i<=nivel;i++){
            bst.insert(i*sentido,false);
        }
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            bst.insert(valor, false); //deberia de dar error y no lo da para algunos valores
        });
    }
}
