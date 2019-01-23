package domain.solution;

    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.List;

    /**
     *
     * @param <V>
     */
    public abstract class AbstractSolution<V extends Number> implements Solution<V> {

        //not thread safe
        final private List<V> vars;

        public AbstractSolution() {
            vars = new ArrayList<>(32);
        }

        public AbstractSolution(Collection<V> vars) {
            this.vars = new ArrayList<>(vars);
        }

        @Override
        public Integer getNumberOfVariables() {
            return vars.size();
        }

        @Override
        public V getVariable(Integer idx) {
            return vars.get(idx);
        }
    }
