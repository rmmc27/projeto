package projeto;

public class principal {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }
}

