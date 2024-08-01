/*import java.util.Scanner;

public class All_Searching {

    static int linearsrarch(int[] a, int target) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] == target) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = obj.nextInt();
        System.out.println("Enter the array elements:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        System.out.println("Enter the searching element:");
        int target = obj.nextInt();

        int result = linearsrarch(a, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}*/

//2. Binary search
import java.util.Scanner;
public class All_Searching{

    static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st = 0;
        int end = n-1;
        while( st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;
            }
            else if(target < a[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        
        return false;
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the Array Element:");
        for(int i=0; i<n; i++){
            a[i] = obj.nextInt();
        }
        System.out.println("Enter the target:");
        int target = obj.nextInt();
        
        boolean result = binarySearch(a, target);
        if(result){
            System.out.println(" element is found ");
        }else{
            System.out.println("Element is not found:");
        }

    } 
}
