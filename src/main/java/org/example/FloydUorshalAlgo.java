package org.example;

public class FloydUorshalAlgo {
    static final int INF = Integer.MAX_VALUE;
    public static void floydUorshalMethod(int[][] matrix){
        int [][] matrixWeight = new int[matrix.length][matrix.length];
        int [][] indexMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++){
                matrixWeight[i][j] = matrix[i][j];
                if(i==j){
                    indexMatrix[i][j] = 0;
                }
                else {
                    indexMatrix[i][j] = j+1;
                }
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i == j) continue;
                    int sum = (matrixWeight[i][k] == INF || matrixWeight[k][j] == INF) ? INF : (matrixWeight[i][k] + matrixWeight[k][j]);
                    if (matrixWeight[i][j] > sum) {
                        matrixWeight[i][j] = sum;
                        indexMatrix[i][j] = k+1;
                    }
                }
            }
        }
        System.out.println("matrixWeight:");
        printArray(matrixWeight);
        System.out.println("\nindexMatrix:");
        printArray(indexMatrix);
    }
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==INF){
                    System.out.print("INF ");
                }
                else {
                    System.out.print(matrix[i][j]+ " ");
                }
            }
            System.out.println("");
        }
    }
}
