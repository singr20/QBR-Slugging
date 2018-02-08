import java.util.*;
public class ItsFolesBowls
{
    public ItsFolesBowls(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Player 1: ");
        String player1 = sc.nextLine();
        System.out.println("Enter " + player1 + "'s Number of Completions");
        int comp1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Number of Passing Attempts");
        int att1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Passing Yards");
        int yds1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Number of Touchdown Passes");
        int td1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player1 + "'s Number of Interceptions");
        int int1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter Player 2: ");
        String player2 = sc.nextLine();
        System.out.println("Enter " + player2 + "'s Number of Completions");
        int comp2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Number of Passing Attempts");
        int att2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Passing Yards");
        int yds2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Number of Touchdown Passes");
        int td2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + player2 + "'s Number of Interceptions");
        int int2 = Integer.parseInt(sc.nextLine());
        
        int[] p1array = {comp1,att1,yds1,td1,int1};
        int[] p2array = {comp2,att2,yds2,td2,int2};
        
        System.out.println(player1 + "'s Passer Rating:" + getData(p1array));
        System.out.println(player2 + "'s Passer Rating:" + getData(p2array));
    
    }
    public static int getData (int[] array){
        double a = ((double)array[0]/array[1] - .3) * 5.0;
        if(a > 2.375){
            a = 2.375;
        }
        if(a < 0)
            a = 0;
        double b = ((double)array[2]/array[1] - 3)*.25;
        if(b > 2.375){
            b = 2.375;
        }
        if(b < 0)
            b = 0;
        double c = ((double)array[3]/array[1])*20;
        if(c > 2.375){
            c = 2.375;
        }
        if(c < 0)
            c = 0;
        double d = 2.375 - ((double)array[4]/array[1] * 25);
        if(d > 2.375){
            d = 2.375;
        }
        if(d < 0)
            d = 0;
        
        double passerRating = ((a+b+c+d)/6)*100;
          
        return (int)passerRating;
    }
}
