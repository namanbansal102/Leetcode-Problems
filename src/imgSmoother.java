public class imgSmoother {
    public static void main(String[] args) {
        System.out.println("Image Smoother LeetCode Problem");
        int img[][]={{100,200,100},
                     {200,50,200},
                     {100,200,100}};
        int n=img.length;
        for (int i = 0; i < img.length; i++) {
            int avg=0;
            for (int j = 0; j < img.length; j++) {
                int pCol=j-1;
                int nCol=j+1;
                int pRow=i-1;
                int nRow=i+1;
                
                // For Adjacent Elements
                avg+=img[i][j];
                // +
                // img[i][pCol]+img[i][nCol]+
                // // For upper Elments
                // img[pRow][pCol]+img[pRow][j]+img[pRow][nCol]+
                // // For Lower Elements
                // img[nRow][pCol]+img[nRow][j]+img[nRow][nCol];

                if (pCol>=0 && pRow>=0 && nRow<=n-1) {
                    avg+=img[i][pCol]+img[pRow][pCol]+img[nRow][pCol]+img[pRow][j]+img[nRow][j];
                }
                if (nCol<=n-1 && pRow>=0 && nRow<=n-1) {
                    avg+=img[i][nCol]+img[pRow][nCol]+img[nRow][nCol];
                    
                }
            }
        }

    }
}
