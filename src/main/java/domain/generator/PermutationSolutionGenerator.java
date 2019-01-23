package domain.generator;

import domain.solution.PermutationSolution;

public class PermutationSolutionGenerator<V extends Number> extends AbstractSolutionGenerator<V, PermutationSolution<V>> {

    @Override
    protected PermutationSolution<V> doGenerate(PermutationSolution<V> prev) {
        // you go here:
        return null;
        //
    }

    static class PermutationSolutionBuilder<V extends Number> extends SolutionBuilder<V, PermutationSolution<V>> {

    }
}
