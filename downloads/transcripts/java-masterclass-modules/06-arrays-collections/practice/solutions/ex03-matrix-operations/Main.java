public class Main {
    static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) throw new IllegalArgumentException("invalid matrix");
        int columns = matrix[0].length;
        for (int[] row : matrix) if (row == null || row.length != columns) throw new IllegalArgumentException("matrix must be rectangular");
        int[][] out = new int[columns][matrix.length];
        for (int r = 0; r < matrix.length; r++) for (int c = 0; c < columns; c++) out[c][r] = matrix[r][c];
        return out;
    }
}
