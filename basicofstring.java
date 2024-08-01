
import java.util.*;
public class basicofstring {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str = "Hello World";
        char ch = str.charAt(8);
        System.out.println(ch);
        System.out.println(str.indexOf('W'));
        String gtr =" Rishi";
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("Wo"));
        System.out.println(str.endsWith("ld"));
        String s3=str.concat(gtr);
        System.out.println(s3);


        //what is the output of the string
        for(int i=0;i<gtr.length()-1;i++){
            for(int j=i+1; j<gtr.length();j++){
            System.out.print(gtr.substring(i,j)+" ");
            }
        }




    }
    
}
