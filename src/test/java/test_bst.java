
import com.bst.BST;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class test_bst {

         BST bst;
        @org.junit.jupiter.api.BeforeEach
        void setUp(){
            bst = new BST();
        }
        @org.junit.jupiter.api.AfterEach
        void tearDown(){

        }

         @org.junit.jupiter.api.Test
        void casoPruebaInsert1() throws DepthException {
            bst.insert(-2500,true);
            //bst.insert(0,true);
            //bst.insert(2500,true);
        }
         @org.junit.jupiter.api.Test
          void casoPruebaInsert2() throws DepthException {
            bst.insert(-2499,true);
           // bst.insert(0,true);
           // bst.insert(2499,true);
    }
         @org.junit.jupiter.api.Test
        void casoPruebaInsert3() throws DepthException {
             assertThrows(java.lang.IllegalArgumentException.class, () -> {
                 bst.insert(-2501,true);
             });
            //bst.insert(0,true);
            // assertThrows(java.lang.IllegalArgumentException.class, () -> {
            //     bst.insert(2501,true);
           //  });
        }
            @org.junit.jupiter.api.Test
            void casoPruebaInsert4() throws DepthException {
              //  bst.insert(-2499,true);
                bst.insert(0,true);
              //  bst.insert(2500,true);
            }
        @org.junit.jupiter.api.Test
        void casoPruebaInsert5() throws DepthException {
           // bst.insert(-2499,true);
//bst.insert(0,true);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(2501,true);
            });
        }
        @org.junit.jupiter.api.Test
        void casoPruebaInsert6() throws DepthException {
          //  bst.insert(-2500,true);
           // bst.insert(0,true);
            bst.insert(2500,true);
        }
      /*/ @org.junit.jupiter.api.Test
        void casoPruebaInsert7() throws DepthException {
            bst.insert(-2500,true);
            bst.insert(0,true);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(2501,true);
            });
         }
         /*/

        @org.junit.jupiter.api.Test
        void casoPruebaInsert8() throws DepthException {
         //   assertThrows(java.lang.IllegalArgumentException.class, () -> {
           //     bst.insert(-2501,true);
          //  });
          //  bst.insert(0,true);
            bst.insert(2499,true);

        }
        /*/
        @org.junit.jupiter.api.Test
        void casoPruebaInsert9() throws DepthException {
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(-2501,true);
            });
            bst.insert(0,true);
            bst.insert(2500,true);

        }/*/
        @org.junit.jupiter.api.Test
        void casoPruebaInsert10() throws DepthException {
            for(int i=0;i<50;i++){
                bst.insert(i,true);
            }

        }
        @org.junit.jupiter.api.Test
        void casoPruebaInsert11() throws DepthException {
            for(int i=0;i<49;i++){
                bst.insert(i,true);
            }

        }

        @org.junit.jupiter.api.Test
        void casoPruebaInsert12() throws DepthException {
            for(int i=0;i<51;i++){
                if(i<50) {
                    bst.insert(i, true);
                }
                else{
                    assertThrows(com.exceptions.DepthException.class, () -> {
                        bst.insert(50,true);
                    });
                }
            }

        }
        /*/
        @org.junit.jupiter.api.Test
        void casoPruebaInsert13() throws DepthException {
            bst.insert(-2499,true);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(-2499,true);
            });
        }
        @org.junit.jupiter.api.Test
        void casoPruebaInsert14() throws DepthException {
            bst.insert(0,true);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(0,true);
            });
        }
        @org.junit.jupiter.api.Test
        void casoPruebaInsert15() throws DepthException {
            bst.insert(2499,true);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.insert(2499,true);
            });
        }/*/

        @org.junit.jupiter.api.Test

        void casoPruebaSearch1() throws DepthException {
            bst.insert(-2500,true);
           // bst.insert(0,true);
           // bst.insert(2500,true);

            assertTrue(bst.search(-2500)!=null);
            //assertTrue(bst.search(0)!=null);
            //assertTrue(bst.search(2500)!=null);
        }
        @org.junit.jupiter.api.Test

        void casoPruebaSearch2() throws DepthException {
            bst.insert(-2499,true);
           // bst.insert(0,true);
            //bst.insert(2499,true);

            assertTrue(bst.search(-2499)!=null);
           // assertTrue(bst.search(0)!=null);
           // assertTrue(bst.search(2499)!=null);
        }
        @org.junit.jupiter.api.Test

        void casoPruebaSearch3() throws DepthException {
           // bst.insert(-2499,true);
            bst.insert(0,true);
           // bst.insert(2500,true);

           // assertTrue(bst.search(-2499)!=null);
            assertTrue(bst.search(0)!=null);
           // assertTrue(bst.search(2500)!=null);
        }

        @org.junit.jupiter.api.Test

        void casoPruebaSearch4() throws DepthException {
          //  bst.insert(-2499,true);
          //  bst.insert(0,true);
            bst.insert(2500,true);

           // assertTrue(bst.search(-2499)!=null);
           // assertTrue(bst.search(0)!=null);
            assertTrue(bst.search(2500)!=null);
        }
        @org.junit.jupiter.api.Test

        void casoPruebaSearch5() throws DepthException {
         //   bst.insert(-2500,true);
          //  bst.insert(0,true);
            bst.insert(2499,true);

           // assertTrue(bst.search(-2500)!=null);
          //  assertTrue(bst.search(0)!=null);
            assertTrue(bst.search(2499)!=null);
        }

       /*/ @org.junit.jupiter.api.Test

        void casoPruebaSearch6() throws DepthException {
            bst.insert(-2500,true);
            bst.insert(0,true);
            bst.insert(2501,true);


            assertTrue(bst.search(-2500)!=null);
            assertTrue(bst.search(0)!=null);
            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.search(2501);
            });
        }/*/

        @org.junit.jupiter.api.Test

        void casoPruebaSearch7() throws IllegalArgumentException {

            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.search(-2501);
            });
        }
        @org.junit.jupiter.api.Test

        void casoPruebaSearch8() throws DepthException {

            assertThrows(java.lang.IllegalArgumentException.class, () -> {
                bst.search(2501);
            });
        }
/*/
        @org.junit.jupiter.api.Test
        void casoPruebaPrintBetweenLevels1() throws DepthException, BetweenLevelException {
            bst.insert(0,true);
            bst.insert(-2499,true);
            bst.insert(2499,true);

            // Verifica que la salida sea la esperada
            assertEquals("[0, -2499, 2499]", bst.printBetweenLevel(1,2).toString());

        }
        @org.junit.jupiter.api.Test
        void casoPruebaPrintBetweenLevels2() throws DepthException, BetweenLevelException {
            bst.insert(0,true);
            bst.insert(-2499,true);
            bst.insert(2500,true);

            // Verifica que la salida sea la esperada
            assertEquals("[0, -2499, 2500]", bst.printBetweenLevel(1,2).toString());

        }
        @org.junit.jupiter.api.Test
        void casoPruebaPrintBetweenLevels3() throws DepthException, BetweenLevelException {
            bst.insert(0,true);
            bst.insert(-2500,true);
            bst.insert(2499,true);

            // Verifica que la salida sea la esperada
            assertEquals("[0, -2500, 2499]", bst.printBetweenLevel(1,2).toString());

        }/*/
        @org.junit.jupiter.api.Test
        void casoPruebaPrintBetweenLevels4() throws DepthException, BetweenLevelException {
            for(int i=0;i<51;i++){
                if(i<50) {
                    bst.insert(i, true);
                }

            }
            // Verifica que la salida sea la esperada
            assertEquals("[0, 1]", bst.printBetweenLevel(1,2).toString());

        }
    @org.junit.jupiter.api.Test
    void casoPruebaPrintBetweenLevels5() throws DepthException, BetweenLevelException {
        for (int i = 0; i < 51; i++) {
            if (i < 50) {
                int valor = (int) ((int)i*(Math. pow(-1, i)));
                bst.insert((valor), true);
            }

        }
        String resultado = "";
        for (int j = 0; j < 25; j++) {

            resultado += bst.search(-j);
            resultado += bst.search(j+1);
        }
        // Verifica que la salida sea la esperada
        assertEquals(resultado.toString(), bst.printBetweenLevel(1, 25).toString());

    }
    @org.junit.jupiter.api.Test
    void casoPruebaPrintBetweenLevels6() throws DepthException, BetweenLevelException {
        for (int i = 0; i < 50; i++) {
                bst.insert(i, true);

        }
        String resultado = "[";
        for (int j = 0; j < 25; j++) {
            if(j<24)
            resultado += bst.search(j).getContent()+", ";
            else{
                resultado += bst.search(j).getContent();
            }

        }
        // Verifica que la salida sea la esperada
        assertEquals(resultado+']', bst.printBetweenLevel(1, 25).toString());

    }
    @org.junit.jupiter.api.Test
    void casoPruebaPrintBetweenLevels7() throws DepthException, BetweenLevelException {
        for (int i = 0; i < 50; i++) {
                bst.insert(i, true);

        }

        String resultado = "[";
        for (int j = 0; j < 50; j++) {
            if(j<49)
                resultado += bst.search(j).getContent()+", ";
            else{
                resultado += bst.search(j).getContent();
            }

        }
        // Verifica que la salida sea la esperada
        assertEquals(resultado+']', bst.printBetweenLevel(1, 50).toString());

    }

    }

