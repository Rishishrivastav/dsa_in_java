/*import java.util.Scanner;
public class dsa_recursio {
    static void printincreasing(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
    static void printdecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.println(1);
        printdecreasing(n-1);
    }
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        int smaller=factorial(n-1);
        int ans=smaller * n;
        return ans;
    }

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
       
    }
    public static void main(String args[]){
        System.out.println("ENTER THE VALUE :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        System.out.println("increasing orde:");
        printincreasing(n);

        System.out.println("decreasing order:");
        printdecreasing(n);

        System.out.println("the factorial of the number:");
        int result=factorial(n);
        System.out.println(result);

        System.out.println("the fibonachi sequence is :");
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    
}*/

//sum of digits
/*import java.util.Scanner;
public class dsa_recursio{

    static int sumofdigts(int n){
        if(n>=0 && n<=9)return n;
        return sumofdigts(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=obj.nextInt();
        int result=sumofdigts(n);
        System.out.println(result);
    }
}
*/

//multiplication table/ serirs sum / greatest commomn division
/*import java.util.Scanner;
public class dsa_recursio{

    static void multiplcationtable(int p,int q){
        if(q == 0){
            return;
        }
        multiplcationtable(p,q-1);
        System.out.println(p*q);
    }

    static int seriessum(int p){
        if(p == 0)return p;
        if(p%2==0){
            return seriessum(p-1)-p;
        }
        else{
        return seriessum(p-1)+p;
        }
    }

    //greatest commen division
    static int gcd(int x , int y){
        while(x % y !=0){
            int rem =x % y;
            x= y;
            y=rem;
        }
        return y;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Number To Find Multiplication Table:");
        int p=obj.nextInt();
        int q=obj.nextInt();
        multiplcationtable(p,q);

        System.out.println("the sum series sum:");
        int result=seriessum(p);
        System.out.println(result);

        System.out.println("the greatest commen division of the two number:");
        int results=gcd(p,q);
        System.out.println(results);

    }
}*/

import java.util.ArrayList;
import java.util.Scanner;
public class dsa_recursio{

    static void printarray(int[] a,int n){
        if(n == a.length){
            return;
        }
        System.out.print(a[n]+" ");
        printarray(a, n+1);
    }

    static int sumofthearray(int[] a, int n) {
        if (n == a.length) return 0;
        int smallans = sumofthearray(a, n + 1);
        return smallans + a[n];
    }

    static ArrayList<Integer> allindex(int[] a, int n, int x, int idx) {
        if (idx >= n) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (a[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer> Smallans = allindex(a, n, x, idx + 1);  // Corrected function name
        ans.addAll(Smallans);
        return ans;
    }
    
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n =obj.nextInt();
        int[] a=new int[n];

        System.out.println("Enter the Array element:");
        for (int i=0;i<+n;i++){
            a[i]=obj.nextInt();
        }

        System.out.println("printing the array:");
        printarray(a, 0);

        System.out.println("\nThe sum of the array:");
        int ans = sumofthearray(a, 0); // Start the recursion with n = 0
        System.out.println(ans);


        System.out.println("Enter the target to find index no:");
        int target = obj.nextInt();
        ArrayList<Integer> result = allindex(a, n, target, 0);
        for (Integer i : result) {
            System.out.print(i);
        }

    }
}