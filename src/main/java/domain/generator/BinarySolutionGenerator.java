package domain.generator;

import domain.solution.BinarySolution;

public class BinarySolutionGenerator<V extends Number> extends AbstractSolutionGenerator<V, BinarySolution<V>> {

    @Override
    protected BinarySolution<V> doGenerate(BinarySolution<V> prev) {
        // there you go
        return null;
    }

    static class BinarySolutionBuilder<V extends Number> extends SolutionBuilder<V, BinarySolution<V>> {
 
    }
}
