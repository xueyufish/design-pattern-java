/**
 * @author xueyufish
 */

public class Manager implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
        this.nextChain = higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if (levelOfProblem.equals("Manager")) {
            System.out.println("Manager has solved the problem!");
        } else {
            System.out
                .println("This problem is above Manager seniority. You are being transferred to the higher rank...");
            nextChain.solveTheProblem(levelOfProblem);
        }
    }
}
