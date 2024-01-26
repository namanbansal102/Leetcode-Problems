public class getMatrixZero {
    public static void main(String[] args) {
        System.out.println("Get Matrix Zero Problem LeetCode");
        int matrix[][]={{0,0,2,0},{3,4,5,2},{1,3,1,5}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    // Traversing The Columns and Making it to -1
                    for (int i2 = 0; i2 < matrix.length; i2++) {
                        if(matrix[i2][j]==0){
                            System.out.println("Founded Column have value equal to j"+i2+" "+j);
                            continue;
                        };
                        if(i2==i)continue;
                        matrix[i2][j]=-1;
                    }
                    // Traversing The Rows and making it to -1
                    for (int j2 = 0; j2 < matrix[0].length; j2++) {
                        if(matrix[i][j2]==0)continue;
                        if(j2==j)continue;
                        matrix[i][j2]=-1;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==-1) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
