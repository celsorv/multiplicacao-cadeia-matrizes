public class TestMatrixOrderOptimization {

    public static void main(String[] args) {

        // A_0: Matriz A 50x20
        // A_1: Matriz B 20x1
        // A_2: Matriz C 1x10
        // A_3: Matriz D 10x100
        int[] dims = { 50, 20, 1, 10, 100 };

        MatrixOrderOptimization optimizer = new MatrixOrderOptimization();
        optimizer.matrixChainOrder(dims);
        optimizer.printOptimalParenthesizations();

        // Saída:
        // A_0 * A_1
        // A_2 * A_3
        // A_0_result * A_3_result
        // -----------------------
        // (A x B) x (C x D)

    }

}
