package umg.edu.gt.SerieI;

import java.util.HashSet;
import java.util.Set;


public class SudokuValidator {


    public boolean isValid(char[][] board) {
        // Validar filas y columnas
        for (int i = 0; i < 9; i++) {
            Set<Character> fila = new HashSet<>();
            Set<Character> columna = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char celdaFila = board[i][j];
                char celdaCol = board[j][i];

                if (celdaFila != '.') {
                    if (fila.contains(celdaFila)) return false;
                    fila.add(celdaFila);
                }

                if (celdaCol != '.') {
                    if (columna.contains(celdaCol)) return false;
                    columna.add(celdaCol);
                }
            }
        }

        // Validar subcuadros 3x3
        for (int bloqueFila = 0; bloqueFila < 9; bloqueFila += 3) {
            for (int bloqueCol = 0; bloqueCol < 9; bloqueCol += 3) {
                Set<Character> subcuadro = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char valor = board[bloqueFila + i][bloqueCol + j];
                        if (valor != '.') {
                            if (subcuadro.contains(valor)) return false;
                            subcuadro.add(valor);
                        }
                    }
                }
            }
        }

        return true;
    }
}
