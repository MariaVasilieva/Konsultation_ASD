package org.example;

public class Main {
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [][] matrix = {
                {0,INF,3,INF,2},
                {-2,0,4,INF,INF},
                {INF,-5,0,INF,INF},
                {3,1,-1,0,9},
                {INF,7,INF, INF,0}
        };
        FloydUorshalAlgo.floydUorshalMethod(matrix);
    }
}