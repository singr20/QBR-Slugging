import java.util.*;
public class Slugging
{
    public Slugging(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Player 1: ");
        String player1 = sc.nextLine();
        System.out.println("Enter " + player1 + "'s At Bats");
        int ab1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Hits");
        int hits1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Doubles");
        int doubles1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Triples");
        int triples1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Home Runs");
        int hr1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter Player 2: ");
        String player2 = sc.nextLine();
        System.out.println("Enter " + player2 + "'s At Bats");
        int ab2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Hits");
        int hits2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Doubles");
        int doubles2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Triples");
        int triples2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Home Runs");
        int hr2 = Integer.parseInt(sc.nextLine());
        
        int[] p1array = {ab1,hits1,doubles1,triples1,hr1};
        int[] p2array = {ab2,hits2,doubles2,triples2,hr2};
        
        System.out.println(player1 + "'s Slugging Percentage:" + getData(p1array));
        System.out.println(player2 + "'s Slugging Percentage:" + getData(p2array));
    
    }
    public static double getData (int[] array){
        double totalBases = array[1] + (2 * array[2]) + (3 * array[3]) + (4 * array[4]);
        double sP = totalBases/array[0];
        
        return sP;
    }
}
