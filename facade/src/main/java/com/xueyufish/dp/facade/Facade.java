
package com.xueyufish.dp.facade;

/**
 * @author xueyufish
 */

public class Facade {

    private SubsystemA systemA;

    private SubsystemB systemB;

    private SubsystemC systemC;

    public Facade() {
        systemA = new SubsystemA();
        systemB = new SubsystemB();
        systemC = new SubsystemC();
    }

    public void execute() {
        systemA.execute();
        systemB.execute();
        systemC.execute();
    }
}
