package domain.generator;

import domain.solution.Solution;

/**
 *
 * @param <V>
 */
public interface NextSolutionGenerator<V extends Number> {

    Solution<V> generate(Solution<V> prev);

    Solution<V> improve(Solution<V> initialSolution);

    void setSolutionBuilder(SolutionBuilder sob);

    static class SolutionBuilder<V extends Number, S extends Solution<V>> {

    }
}
