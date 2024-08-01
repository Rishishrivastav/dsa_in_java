//first pattern:1
/*import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number first no:");
        int a=n.nextInt();
        System.out.println("enter the number first no:");
        int b=n.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println("("+i+","+j+")");

            }
            
            System.out.println();
        }
    }
}*/

//problem:2
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = n.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

//problem:3
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = n.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(i==1||i==rows||j==1||j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/


//problem:4
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
       
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/


//poattern:5
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
       
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//pattern:6
import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
      

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//pattern:7
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = n.nextInt();
      

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= columns; j++) {
                System.out.print(j);
            }
            for(int k=1;k<i;k++){
                System.out.print(k);
            }
           
            System.out.println();
        }
    }
}*/

//pattern:8
/*import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = n.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

//pattern:9
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = n.nextInt();
      

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
           
            System.out.println();
        }
    }
}*/

//pattern:10
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        
      

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
           
            System.out.println();
        }
    }
}*/
//pattern:11
/*import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = n.nextInt();
        

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k=i;k<=rows;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/








