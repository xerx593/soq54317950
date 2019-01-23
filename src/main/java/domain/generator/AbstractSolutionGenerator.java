package domain.generator;

import domain.solution.Solution;

/**
 * @param <V>
 * @param <S>
 */
public abstract class AbstractSolutionGenerator<V extends Number, S extends Solution<V>> implements NextSolutionGenerator<V, S> {

    protected SolutionBuilder<V, S> solutionBuilder;

    @Override
    public S generate(S prev) {
        return doGenerate((S) prev);
    }

    protected abstract S doGenerate(S prev);

    @Override
    public void setSolutionBuilder(SolutionBuilder sob) {
        this.solutionBuilder = sob;
    }

    @Override
    public S improve(S initialSolution, StopCondition<V, S> stopCondition) {
        stopCondition.setInitialSolution(initialSolution);
        S nextSolution = initialSolution;
        do {
            nextSolution = generate(nextSolution);
        } while (!stopCondition.isStopConditionReached());
        return nextSolution;
    }
}
