import java.util.Scanner;
public class Practie{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = a.nextInt();
        System.out.println("enter the array element:");
        int[] arr = new int[n]; 
        for(int i=-0 ;i<n; i++){
            arr[i] = a.nextInt();
        }
        System.out.println("The give array is:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}