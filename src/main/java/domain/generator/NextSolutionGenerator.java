package domain.generator;

import domain.solution.Solution;

/**
 *
 * @param <V>
 * @param <S>
 */
public interface NextSolutionGenerator<V extends Number, S extends Solution<V>> {

    S generate(S prev);

    S improve(S initialSolution, StopCondition<V,S> stopCondition);

    void setSolutionBuilder(SolutionBuilder sob);

    static class SolutionBuilder<V extends Number, S extends Solution<V>> {

    }
}
