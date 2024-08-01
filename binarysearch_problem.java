//enter the shorted array find the how many time rotet the array
/*import java.util.Scanner;
public class binarysearch_problem {

    static int findrotation(int[] a){
        int n = a.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = (st + end) /2;
            if(a[mid] <=a[n-1]){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The SIZE Fo The Aaary:");
        int  n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] = obj.nextInt();
        }

        System.out.println("The No Of Rotation:");
        int result = findrotation(a);
        System.out.println(result);

    }
    
}*/


//in the rotated array find the index no using bimary sharch algorithm
/*import java.util.Scanner;
public class binarysearch_problem {

    static int search(int[] a, int target){
        int st =0;
        int end = a.length -1;
        while(st <= end){
            int mid =st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[mid] < a[end]){
                if(target >a[mid] && target <= a[end]){
                    st =mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target >=a[st] && target < a[mid]){
                    end =mid-1;
                }else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The SIZE Fo The Aaary:");
        int  n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] = obj.nextInt();
        }
        System.out.println("Enter the targe to search:");
        int target=obj.nextInt();
        int result= search(a,target);
        System.out.println(result);

    }
}*/
//Hacker rank problem 

import java.util.*;
import java.io.*;



class binarysearch_problem{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




