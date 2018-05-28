/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec15no1;

/**
 *
 * @author Björn
 */
public class SkuggTest {
    
    public int x = 0;
        class NivaEtt {
            public int x = 1;
            void metodNivaEtt(int x) {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("SkuggTest.this.x = " +
                SkuggTest.this.x);
            }
        }
}

