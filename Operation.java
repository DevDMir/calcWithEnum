public enum Operation {
    ADD("+"){
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUB("-"){
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MUL("*"){
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIV("/"){
        public int apply(int a, int b) {
            if (b == 0) throw new ArithmeticException("Деление на ноль невозможно.");
            return a / b;
        }
    };
    private final String sim;
    Operation(String sim) {
        this.sim = sim;
    }
    public abstract int apply(int a, int b);
    public static Operation getOperation(String sim) throws Exception {
        for (Operation op : Operation.values()) {
            if (op.sim.equals(sim)) {
                return op;
            }
        }
        throw new Exception("Ошибка: " + sim);
    }
}
