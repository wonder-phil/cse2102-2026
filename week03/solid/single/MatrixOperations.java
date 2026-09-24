public class MatrixOperations {


    public int[][] matrixProduct(int[][] left, int[][] right, int n)  {
        int[][] matrixProduct  = new int[n][n];

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                int sumOfDotProducts = 0;
                for (int k=0; k < n; k++) {
                    sumOfDotProducts += left[i][k] * right[k][j];
                }
                matrixProduct[i][j] = sumOfDotProducts;
            }
        }

        return matrixProduct;
    }

    public boolean testProduct_3_by_3() {
        int n = 3;
        int[][] left = {{1,0,0}, {0,1,0}, {0,0,1}};
        int[][] right = {{9,8,7}, {6,5,4}, {3,2,1}};

        int[][] matrixProduct = new int[n][n];

        matrixProduct = matrixProduct(left,right,n);

        boolean result = true;

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                if (matrixProduct[i][j] != right[i][j]) {
                    result = false;
                }
            }

        }
        
        return result;
    }


    public static void main(String[] args) {

        MatrixOperations mo = new MatrixOperations();

        if (mo.testProduct_3_by_3()) {
            System.out.println("Works");
        } else {
            System.out.println("Fails");
        }


    }

}