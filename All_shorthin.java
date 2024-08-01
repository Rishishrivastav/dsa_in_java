//1. Bubble short
/*import java.util.Scanner;
public class All_shorthin {

    static void bubbleshort(int[] a){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String aygs[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        System.out.println("Eenter the Array element:");
        for(int i=0; i< n; i++){
            a[i]=obj.nextInt();
        }


        bubbleshort(a);
        System.out.println("Bubble short:");
        for(int i=0; i< n;i++){
            System.out.print(a[i] +" ");
        }
    }
    
}*/

//2. Selection short
/*import java.util.Scanner;
public class All_shorthin {

    static void selection(int[] a){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            int min_index=i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
    }
 public static void main(String aygs[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        System.out.println("Eenter the Array element:");
        for(int i=0; i< n; i++){
            a[i]=obj.nextInt();
        }

        System.out.println("selection short:");
        selection(a);
        for(int i=0; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }
}*/

//3. inserction short
/*import java.util.Scanner;
public class All_shorthin{
     
    static void inserction_short(int[] a){
        int n=a.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=obj.nextInt();
        int[] a=new int[n];
        System.out.println("Eenter the Array element:");
        for(int i=0; i< n; i++){
            a[i]=obj.nextInt();
        }

        System.out.println("Inserction short:");
        inserction_short(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i] +" ");
        }
    }
}*/

//4. string shorting
/*import java.util.Scanner;

public class All_shorthin {

    static void shortstring(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};

        // Call the shortstring method to sort the array
        shortstring(fruits);

        // Print the sorted array
        for (String val : fruits) {
            System.out.print(val + " ");
        }
    }
}
*/

//5. mearge short
/*import java.util.Scanner;

public class All_shorthin {

    static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;

        for (i = 0; i < n1; i++) left[i] = a[l + i];
        for (j = 0; j < n2; j++) right[j] = a[mid + 1 + j];

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < n1) {
            a[k++] = left[i++];
        }
        while (j < n2) {
            a[k++] = right[j++];
        }
    }

    static void mergeshort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeshort(a, l, mid);
            mergeshort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("Merge short:");
        mergeshort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
*/

//6. quick short
/*import java.util.Scanner;
public class All_shorthin{

    static void swap(int[] a,int x,int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
    static int partition(int[] a,int st,int end){
        int pivot =a[st];
        int cnt =0;
        for(int i=st+1;i<=end;i++){
            if(a[i]<=pivot)cnt++;
        }
        int pivotidx =st +cnt;
        swap(a, st,pivotidx);

        return pivotidx;
    }
    static void quickshort(int[] a, int st, int end) { // Corrected method name to quickshort
        if (st >= end) return;
        int pi = partition(a, st, end);
        quickshort(a, st, pi - 1);
        quickshort(a, pi + 1, end);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        System.out.println("after shortin:");
        display(a);
        System.out.println();

        System.out.println("before shortin:");
        quickshort(a, 0, n-1);
        display(a);
}
}*/

//7. count short
/*import java.util.Scanner;
public class All_shorthin{

    
    static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
    static void countshort(int[] a,int place){
        int n=a.length;
        int[] output =new int [n];
        int[] count =new int[10];
        for(int i=0; i< n; i++){
            count[(a[i]/place)%10]++;
        }
        for(int i=1; i<count.length; i++){
            count[i] += count[i - 1];
        }
        for(int i=n-1;i>=0; i--){
            int idx= count[(a[i]/place)%10]-1;
            output[idx] =a[i];
            count[(a[i]/place)%10]--;
        }
        for(int i=0; i<n;i++){
            a[i] =output[i];
        }
    }
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("after shortin:");
        display(a);
        System.out.println();

        System.out.println("before shorting:");
        countshort(a, 1);
        display(a);
    }
}*/

//8. radix short
/*import java.util.Scanner;

public class All_shorthin {

    static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void countshort(int[] a, int place) {
        int n = a.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(a[i] / place) % 10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(a[i] / place) % 10] - 1;
            output[idx] = a[i];
            count[(a[i] / place) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    static void radixshort(int[] a) {
        int max = findMax(a);
        for (int place = 1; max / place > 0; place *= 10)
            countshort(a, place);
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("Before sorting:");
        display(a);

        radixshort(a);

        System.out.println("After sorting:");
        display(a);
    }
}*/


//9. bucketshot
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class All_shorthin {

    static void display(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void bucketshort(float[] a) {
        int n = a.length;
        ArrayList<Float>[] buckets = new ArrayList[n];

        // Initialize each bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Find the maximum value in the array
        float maxVal = a[0];
        for (float value : a) {
            maxVal = Math.max(maxVal, value);
        }

        // Add elements to the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) ((a[i] / maxVal) * (n - 1));
            buckets[bucketIndex].add(a[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the sorted buckets back into the original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float num : buckets[i]) {
                a[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = obj.nextInt();
        float[] a = new float[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextFloat();
        }

        System.out.println("Before sorting:");
        display(a);

        bucketshort(a);

        System.out.println("After sorting:");
        display(a);
    }
}
