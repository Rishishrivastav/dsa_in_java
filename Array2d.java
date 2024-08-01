//two method to print transpose of the matrix
/* 
import java.util.Scanner;
public class Array2d {

static void printarray(int[][] arr,int r, int c){
    int m = String.valueOf(arr[r - 1][c - 1]).length() + 1;
    for(int i=0 ;i<r ;i++){
            for(int j=0; j<c; j++){
                System.out.printf("%" + m + "d ", arr[i][j]);
            }
            System.err.println();
        }

}
static void transpose(int[][] arr, int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = i + 1; j < c; j++) {
            // Swap arr[i][j] and arr[j][i]
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
}
 
//static int[][] transpose(int[][] arr,int r,int c){
//    int[][] trans=new int[c][r];
//    for(int i=0;i<r;i++){
//        for(int j=0;j<c;j++){
//            trans[j][i]=arr[i][j];
        }
//    }
//    return trans;
//}


    public static void main(String args[]){
        System.out.println("enter the size of array row and columns:");
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        int c=a.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0 ;i<r ;i++){
            for(int j=-0; j<c; j++){
                arr[i][j]=a.nextInt();
            }
        }
        printarray(arr,r,c);
        System.out.println("transpode of the matrix:");
        int[][]3
        tranposematrix=transpose(arr,r,c);
        printarray(tranposematrix,r,c);

        System.out.println("transpose of the matrix:");
        transpose(arr,r,c);
        printarray(arr,r,c);
        
    }
    
}*/

/*import java.util.Scanner;

public class Array2d {

    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int[][] pascalTriangle = pascal(n);
        System.out.println("Pascal Triangle:");

        printmatrix(pascalTriangle);
    }
}*/


//spiral of the matrix
/*import java.util.Scanner;

public class Array2d {

    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printspiral(int[][] arr, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int topelements = 0;

        while (topelements < r * c) {

            // toprow ->leftcol to rightcol
            for (int j = leftcol; j <= rightcol && topelements < r * c; j++) {
                System.out.print(arr[toprow][j] + " ");
                topelements++;
            }
            toprow++;

            // rightcol ->toprow to bottom
            for (int i = toprow; i <= bottomrow && topelements < r * c; i++) {
                System.out.print(arr[i][rightcol] + " ");
                topelements++;
            }
            rightcol--;

            // bottomrow ->rightcol to leftcol
            for (int j = rightcol; j >= leftcol && topelements < r * c; j--) {
                System.out.print(arr[bottomrow][j] + " ");
                topelements++;
            }
            bottomrow--;

            // leftcol ->bottom to toprow
            for (int i = bottomrow; i >= toprow && topelements < r * c; i--) {
                System.out.print(arr[i][leftcol] + " ");
                topelements++;
            }
            leftcol++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        // Input the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printmatrix(matrix);

        System.out.println("Spiral Order:");
        printspiral(matrix, rows, columns);
    }
}
*/






//second method
import java.util.Scanner;

public class Array2d {

    //first method 
    static int findsum(int[][] arr,int l1, int r1,int l2, int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static void findprefixsummatrix(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

    }

    //second method
    static int findsum2(int[][] arr,int l1, int r1,int l2, int r2){
        int sum=0;
        findprefixsummatrix(arr);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=arr[i][r2]-arr[i][r1-1];
            }
            else{
                sum+=arr[i][r2];
            }
        }

        return sum;
    }
    //calculate row wise and column wise sum
  // corrected third method
// corrected third method
static void findprefixsummatrix3(int[][] arr) {
    int r = arr.length;
    int c = arr[0].length;

    // update row-wise prefix sum
    for (int i = 0; i < r; i++) {
        for (int j = 1; j < c; j++) {
            arr[i][j] += arr[i][j - 1];
        }
    }

    // update column-wise prefix sum
    for (int j = 0; j < c; j++) {
        for (int i = 1; i < r; i++) {
            arr[i][j] += arr[i - 1][j];
        }
    }
}


    //third method 
    static int findsum3(int[][] arr,int l1, int r1,int l2, int r2){
        int ans=0,sum=0,up=0,left=0,leftup=0;
        findprefixsummatrix3(arr);

        sum=arr[l2][r2];
        if(r1>=1){
        left=arr[l2][r1-1];
        }
        if(l1>=1){
        up=arr[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
        leftup=arr[l1-1][r1-1];
        }

        ans=sum-up-left+leftup;


        return ans;
    }

     public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int r = a.nextInt();
        System.out.println("Enter the column size:");
        int c = a.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = a.nextInt();
            }
        }
        System.out.println("Enter the row and column values to find prefix sum");
        int l1 = a.nextInt();
        int r1 = a.nextInt();
        int l2 = a.nextInt();
        int r2 = a.nextInt();

        System.out.println("rectangle sum"+findsum(arr,l1,r1,l2,r2));
        System.out.println("rectangle sum"+findsum2(arr,l1,r1,l2,r2));
        System.out.println("rectangle sum"+findsum3(arr,l1,r1,l2,r2));

}
}










































































































































































































































