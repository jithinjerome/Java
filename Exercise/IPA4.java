//TCS IPA Solutions

package b1.Exercise;

import java.util.Arrays;
import java.util.Scanner;

class Players{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Players(int id, String name, int iccRank,int matchesPlayed,int runsScored){
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed =matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getIccRank(){
        return iccRank;
    }
    public int getMatchesPlayed(){
        return matchesPlayed;
    }
    public int getRunsScored(){
        return runsScored;
    }


}



public class IPA4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Players[] players = new Players[4];

        for(int i=0;i<4;i++){
            System.out.println("Enter the ID: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String b = sc.nextLine();
            System.out.println("Enter the ICC Rank: ");
            int c = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Matches Played: ");
            int d = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Runs Scored: ");
            int e = sc.nextInt();

            players[i] = new Players(a,b,c,d,e);
        }

        int target = sc.nextInt();

        double[] result = averageOfRuns(players, target);
        for(double res:result){
            if(res >= 80 && res <= 100){
                System.out.println("Grade A");
            }
            else if(res >= 50 && res <= 80){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }
        }

    }

    private static double[] averageOfRuns(Players[] players, int target) {

        double[] averageRuns = new double[0];

        for(Players plr: players){
            if(plr.getMatchesPlayed()>=target){
                averageRuns = Arrays.copyOf(averageRuns,averageRuns.length+1);
                averageRuns[averageRuns.length-1] = (double)(plr.getRunsScored()/plr.getMatchesPlayed());

            }
        }
        return averageRuns;

    }


}
