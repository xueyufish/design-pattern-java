/**
 * @author xueyufish
 */

public interface Chain {

	void setNextChain(Chain higherLevel);

	void solveTheProblem(String levelOfProblem);
}
