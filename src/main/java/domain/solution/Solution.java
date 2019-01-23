package domain.solution;

/**
 * @param <V> type of getVariable, extends java.lang.Number
 */
public interface Solution<V extends Number> {

    Integer getNumberOfVariables();

    V getVariable(Integer idx);
}
