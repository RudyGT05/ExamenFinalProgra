package umg.edu.gt.SerieI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SudokuValidatorTest {

    @Test
    public void testSudokuValido() {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuValidator validator = new SudokuValidator();
        assertTrue(validator.isValid(board), "El tablero debería ser válido");
        // Si assertTrue lo cambiamos por assertFalse el test fallará y nos saldrá el menseje
        // El tablero debería ser valido"
    }

    @Test
    public void testSudokuInvalido() {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuValidator validator = new SudokuValidator();
        assertFalse(validator.isValid(board), "El tablero debería ser inválido");
        // Si assertFalse lo cambiamos por assertTrue el test fallará y nos saldrá el menseje
        // El tablero debería ser invalido"
    }
}
