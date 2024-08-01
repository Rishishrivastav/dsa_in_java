/*import java.util.Scanner;

public class arrayhacker_rank {
    public static void main(String args[] ) throws Exception {
        // Enter your code here. Read input from STDIN. Print output to STDOUT 
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        
        
        int result1 = Integer.parseInt(str1);
        int result2 = Integer.parseInt(str2);
        
        
        int result = result1 * result2;
        
   
        System.out.println(result);
    }
} */
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        scanner.nextLine(); 

       
        int lotusVotes = 0;
        int handVotes = 0;
        int notaVotes = 0;

        
        for (int i = 0; i < N; i++) {
            String vote = scanner.next();
            if (vote.equals("lotus")) {
                lotusVotes++;
            } else if (vote.equals("hand")) {
                handVotes++;
            } else if (vote.equals("nota")) {
                notaVotes++;
            }
        }

        
        String winnerName;
        int winMargin;

        if (lotusVotes >= handVotes && lotusVotes >= notaVotes) {
            winnerName = "Dr Sanjay Jaiswal";
            winMargin = lotusVotes - Math.max(handVotes, notaVotes);
        } else if (handVotes >= lotusVotes && handVotes >= notaVotes) {
            winnerName = "Madan Tiwari";
            winMargin = handVotes - Math.max(lotusVotes, notaVotes);
        } else {
            winnerName = "NOTA";
            winMargin = notaVotes - Math.max(lotusVotes, handVotes);
        }

        
        System.out.println(winnerName + " " + winMargin);
    }
}
