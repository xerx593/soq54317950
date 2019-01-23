package domain.generator;

import domain.solution.Solution;

/**
 * @param <V>
 * @param <S>
 */
public abstract class AbstractSolutionGenerator<V extends Number, S extends Solution<V>> implements NextSolutionGenerator<V> {

    protected SolutionBuilder<V, S> solutionBuilder;
    
    @Override
    public Solution<V> generate(Solution<V> prev) {
        return doGenerate((S) prev);
    }

    protected abstract S doGenerate(S prev);

    @Override
    public void setSolutionBuilder(SolutionBuilder sob) {
        this.solutionBuilder = sob;
    }
}
