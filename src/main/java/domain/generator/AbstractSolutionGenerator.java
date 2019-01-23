package domain.generator;

import domain.solution.Solution;

/**
 * @param <V>
 * @param <S>
 */
public abstract class AbstractSolutionGenerator<V extends Number, S extends Solution<V>> implements NextSolutionGenerator<V> {

    protected SolutionBuilder<V, S> solutionBuilder;
    private StopCondition stopCondition;

    @Override
    public Solution<V> generate(Solution<V> prev) {
        return doGenerate((S) prev);
    }

    protected abstract S doGenerate(S prev);

    @Override
    public void setSolutionBuilder(SolutionBuilder sob) {
        this.solutionBuilder = sob;
    }

    @Override
    public Solution<V> improve(Solution<V> initialSolution) {
        stopCondition.setInitialSolution(initialSolution);
        Solution nextSolution = initialSolution;
        do {
            nextSolution = generate(nextSolution);
        } while (!stopCondition.isStopConditionReached());
        return nextSolution;
    }
}
