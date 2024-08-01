/*import java.util.Scanner;
public class string {

    static String rev(String s,int idx){
        if (idx == s.length()){
            return "";
        }
        String smallans = rev(s , idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string :");
        String a=obj.nextLine();

        System.out.println("the reverrse of the array is :");
        String ans=rev(a ,0);
        System.out.println(ans);

        if(ans.equals(a)){
            System.out.println("this the palindrom "+ a);
        }
        else{
            System.out.println("this is not palindrom");
        }
    }
    
}*/
//print all the sub the of the string
/*import java.util.ArrayList;
import java.util.Scanner;

public class string {

    static ArrayList<String> getSubsequences(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSubsequences(s.substring(1));

        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string to find all possible subsets of the substring:");
        String s = obj.nextLine();
        ArrayList<String> ans = getSubsequences(s);
        for (String ss : ans) {
            System.out.print(ss +" ");
        }
    }
}*/

// in the given integr print all the subset sum of the given integer
/*import java.util.Scanner;
public class string{

    static void subsetsum(int[] a,int n,int idx,int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        subsetsum(a, n, idx+1, sum+a[idx]);
        subsetsum(a ,n, idx+1, sum);
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the integer to fint all posible subset sum");
        for(int i =0 ; i< n ;i++){
            a[i]=obj.nextInt();
        }
        System.out.println("The given sub_set_sum:");
        subsetsum(a, n, 0, 0);
        
    }
}*/

//in the path go from start to end using the difference between one stone to 
//anothe one to direct two step get the minimam cost of the path
/*mport java.util.Scanner;

public class string {

    static int best(int[] h, int n, int idx) {
        if (idx == n - 1) return 0;
        if (idx == n - 2) return Math.abs(h[idx] - h[idx + 1]);

        int op1 = Math.abs(h[idx] - h[idx + 1]) + best(h, n, idx + 1);
        int op2 = Math.abs(h[idx] - h[idx + 2]) + best(h, n, idx + 2);

        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the integers to find all possible subset sum:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("The Minimum path of the array from source to destination:");
        int result = best(a, n, 0);
        System.out.println(result);
    }
}
*/
