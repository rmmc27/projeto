package teste;

import org.junit.jupiter.api.Test;

import projeto.principal;

import static org.junit.jupiter.api.Assertions.*;

public class teste {
    private principal calculadora = new principal();

    @Test
    public void testSoma() {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    public void testSubtrai() {
        assertEquals(1, calculadora.subtrai(3, 2));
    }

    @Test
    public void testMultiplica() {
        assertEquals(6, calculadora.multiplica(2, 3));
    }

    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(1, 0));
        assertEquals(2, calculadora.divide(4, 2));
    }
}

