/**
 * @author xueyufish
 */

public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Coder coder = new Coder();
        Manager manager = new Manager();
        CTO cto = new CTO();

        coder.setNextChain(manager);
        manager.setNextChain(cto);

        System.out.println("CTO problem: ");
        coder.solveTheProblem("CTO");
        System.out.println("----------------------------------------");
        System.out.println("Coder problem: ");
        coder.solveTheProblem("Coder");
        System.out.println("----------------------------------------");
        System.out.println("Manager problem: ");
        coder.solveTheProblem("Manager");
        System.out.println("----------------------------------------");
    }
}
