import java.util.Scanner;
public class practice{

    static void bubbleshort(int[] arr){
        int n = arr.length;
        for(int i =0 ;i<n ;i++){
            for(int  j =0;j <n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println("The shorted array is :");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
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
            System.out.print(arr[i] +" ");
        }
        bubbleshort(arr);
        a.close();
    }
}