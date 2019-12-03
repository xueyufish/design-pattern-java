/**
 * @author xueyufish
 */

public class Coder implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
		nextChain = higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if ("Coder".equals(levelOfProblem)) {
            System.out.println("Coder has solved the problem!");
        } else {
            System.out
                .println("This problem is above coder seniority. You are being transferred to the higher rank...");
            nextChain.solveTheProblem(levelOfProblem);
        }
    }
}
