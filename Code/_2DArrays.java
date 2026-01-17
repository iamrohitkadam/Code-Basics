
public class _2DArrays {

    public static void SpiralMatrix(int Matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = Matrix.length-1;
        int EndCol = Matrix[0].length-1;

        while (StartRow <= EndRow && StartCol<=EndCol){
            //top
            for(int i=StartCol;i<=EndCol;i++){
                System.out.print(Matrix[StartRow][i] + " ");
            }

            //right
            for(int j=StartRow+1;j<=EndCol;j++){
                System.out.print(Matrix[j][EndCol]+" ");
            }

            //bottom
            for(int i = EndCol-1; i>=StartCol; i--){
                if(StartRow == EndRow){
                    break;
                }
                System.out.print(Matrix[EndRow][i]+ " " );
            }

            //left
            for(int j= EndRow-1; j>=StartRow+1; j--){
                if(StartCol == EndCol){
                    break;
                }
                System.out.print(Matrix[j][StartCol]+" ");
            }

            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
        System.out.println();
        
    }


    public static int Diagonal(int Matrix[][]) {
        int sum = 0;
        int n = Matrix.length;
        //Method 1 O(n2)
        // for(int i=0; i<n;i++){
        //     for(int j=0; j<n; j++){
        //         //PD
        //         if(i == j){
        //             sum += Matrix[i][j];
        //         }
        //         //SD
        //         else if(i+j == n-1){       // 1)0+3 = 4-1  2)1+2 = 4-1   3)2+2 = 4-2....
        //             sum += Matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        //Method 2 O(n)
        for(int i=0; i<n;i++){
            //PD
            sum += Matrix[i][i];
            //SD
            if(i!=n-i-1){
                sum += Matrix[i][n-i-1];    //i+j = n-1
                                            //j   = n-i-1 
            }
        }
        return sum;
    }

    
    public static boolean StairCaseSearch(int Matrix[][],int key) {
        // int n = Matrix.length;
        // int row = 0, col = n-1;

        // while(row < n && col >= 0){
        //     if(key == Matrix[row][col]){
        //         System.out.println("Found at (" +row+ "," +col+")");
        //         return true;
        //     }
        //     else if(key < Matrix[row][col]){
        //         col--;
        //     }
        //     else {
        //         row++;
        //     }
        // }
        // System.out.println("Not Found");
        // return false;

        int n = Matrix.length;
        int row = n-1, col = 0;

        while(col < n && row >= 0){
            if(key == Matrix[row][col]){
                System.out.println("Found at (" +row+ "," +col+")");
                return true;
            }
            else if(key < Matrix[row][col]){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Not Found");
        return false;
        
        
    }



    //**Practice Questions

    public static int Q1(int Matrix[][],int key) {
        int count = 0;
        for (int i=0; i<Matrix.length;i++){
            for (int j=0; j<Matrix[0].length; j++){
                if (Matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
        
    }

    public static int Q2(int Matrix[][]) {
        int sum = 0;
        // for (int i=0; i<Matrix.length;i++){
        //     if (i == 1){
        //         for (int j=0; j<Matrix[0].length; j++){
        //             sum+= Matrix[i][j];
        //         }
        //     }
        // }

        for (int i=0; i<Matrix.length;i++){
           sum += Matrix[1][i];
        }
        return sum;
        
    }

    public static void Q3(int Matrix[][]) {
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                
            }
        }
    }
    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        
        // SpiralMatrix(matrix);

        //System.out.println(Diagonal(matrix));

        // int matrix[][]={{10,20,30,40},
        //                 {15,25,35,45},
        //                 {27,29,37,48},
        //                 {32,33,39,50}};
        // int key = 37;
        // System.out.println(StairCaseSearch(matrix,key));


        //**Practice Questions
        // int matrix[][]={{4,7,8},{8,8,7}};
        // System.out.println(Q1(matrix,7));

        // int matrix[][]= {{1,4,9},{11,4,3},{2,2,3} };
        // System.out.println(Q2(matrix));

        // int matrix[][]= {{1,4,9},{11,4,3}};
        // System.out.println(Q3(matrix));

    }

}
