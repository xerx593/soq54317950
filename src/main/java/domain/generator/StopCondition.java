package domain.generator;

import domain.solution.Solution;

public interface StopCondition<V extends Number, S extends Solution> {

    boolean isStopConditionReached();

    void setInitialSolution(S init);

}
