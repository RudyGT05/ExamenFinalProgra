package umg.edu.gt.SerieI;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {

    @Test
    public void testFibonacci_0_1_con_9() {
        FibonacciGenerator generator = new FibonacciGenerator();
        List<Integer> result = generator.generate(new int[]{0, 1}, 9);
        List<Integer> esperado = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21);
        assertEquals(esperado, result);
        //Si cambiamos algun valor de la lista esperado, el test nos dará error porque la lista esperado tiene que
        //ser igual al resultado
    }

    @Test
    public void testFibonacci_2_3_con_5() {
        FibonacciGenerator generator = new FibonacciGenerator();
        List<Integer> result = generator.generate(new int[]{2, 3}, 5);
        List<Integer> esperado = List.of(2, 3, 5, 8, 13);
        assertEquals(esperado, result);
        //Si cambiamos algun valor de la lista esperado, el test nos dará error porque la lista esperado tiene que
        //ser igual al resultado
    }

    @Test
    public void testFibonacci_n_igual_a_0() {
        FibonacciGenerator generator = new FibonacciGenerator();
        List<Integer> result = generator.generate(new int[]{5, 7}, 0);
        assertTrue(result.isEmpty(), "La lista debería estar vacía si n == 0");
        //Este test dará error si la lista no está vacia.
    }
}
