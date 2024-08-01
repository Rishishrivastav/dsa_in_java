//sum of the array
/*import java.util.Scanner;

public class Arrayproblems1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}*/


//max size
/*import java.util.Scanner;

public class Arrayproblems1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int ans = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        for(int i=0; i < size; i++){
            if (array[i] > ans){
                ans=array[i];
            }
            
        }
        System.out.println("The maximum number:"+ans);
    }
} */


//find the value of the array searching
/*import java.util.Scanner;

public class Arrayproblems1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        boolean found=false;
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the searching element:");
        int a=scanner.nextInt();
        for(int i=0 ;i<size ;i++){
            if (a==array[i]){
                found=true;
                break;
            }
            
        }
        if(found){
            System.out.println("element is found :"+a);
        }
        else{
            System.out.println("element is not found :"+a);
        }
   
    }
}*/


//how to assign the value in the array and heap memeory allocation
/*import java.util.Scanner;
public class Arrayproblems1 {


    static void printarray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String args[]) {
        int[] arr=new int[5];
        arr[0]=78;
        arr[1]=64;
        arr[2]=67;
        arr[3]=32;
        arr[4]=28;
        System.out.println("origimal array:");
        printarray(arr);
//copy the the value of array 1;
        //int[] arr_2=arr;
        int[] arr_2=arr.clone();
        System.out.println("copied array:");
        printarray(arr_2);

        arr_2[0]=0;
        arr_2[1]=0;


        System.out.println("original array after changing :");
        printarray(arr);

        System.out.println("copied array after changing:");
        printarray(arr_2);
    }
}*/


//count the occurance of the number
//least occuranse
/*import java.util.Scanner;

public class Arrayproblems1 {

    static int countoccurance(int arr[],int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    //least occurance
    static int leastocccurance(int arr[],int x){
        int lastindex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        boolean found=false;
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("enter the number to find occurance:");
        int x=scanner.nextInt();
        int count=countoccurance(array, x);
        System.out.println("the occurance of the number:"+count);


        System.out.println("enter the number to find occurance:");
        
        int lastindex=leastocccurance(array, x);
        System.out.println("the last index value of occurance element is :"+lastindex);
    }
}*/


//in the given array is find the max and min element of the array
/*import java.util.Arrays;
import java.util.Scanner;
public class Arrayproblems1{


    static void shorting(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++)
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[i]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //max and min value
    static void maxandmin(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("inter the sizer of the array:");
        int size=n.nextInt();
        int[] arr=new int[size];
        
        for(int i=0; i<size; i++){
            arr[i]=n.nextInt(); 
        }
        shorting(arr);
        maxandmin(arr);

    }
}*/


//in a give array how many digits are avaliable in the sum of qual to targets
//reverse of the array
/*import java.util.Scanner;
public class Arrayproblems1{

    static int printsum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    //reverse 
    static void reverseofarray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            
            System.err.print(arr[i]);
        }
    }
    static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;

        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<n;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=a.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=a.nextInt();
        }
        System.out.println("enter the target to the how many sum of the digits:");
        int target=a.nextInt();
        int count=printsum(arr,target);
        System.out.println(count);

        System.out.println("revers of the array:");
        reverseofarray(arr);

        System.out.println("how many times to rotate:");
        int k=a.nextInt();
        rotate(arr, k);
    }
}*/


//prefix
import java.util.Scanner;

class Arrayproblems1 {

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;
    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = a.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = a.nextInt();
        }

        int[] result = prefixSum(arr);

        // Print the prefix sum array
        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < result.length; i++)  {
            System.out.print(result[i] +" ");
        }
    }
}
