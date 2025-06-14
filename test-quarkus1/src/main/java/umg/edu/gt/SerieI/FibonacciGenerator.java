package umg.edu.gt.SerieI;

import java.util.ArrayList;
import java.util.List;


public class FibonacciGenerator {


    public List<Integer> generate(int[] signature, int n) {
        List<Integer> result = new ArrayList<>();

        if (n == 0) return result;

        if (n >= 1) result.add(signature[0]);
        if (n >= 2) result.add(signature[1]);

        for (int i = 2; i < n; i++) {
            int next = result.get(i - 1) + result.get(i - 2);
            result.add(next);
        }

        return result;
    }
}
