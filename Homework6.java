package HomeWork6;

import java.util.Arrays;


public class Homework6 {


    public static void main(String[] Args){


        String team1 = "Political";
        System.out.println("Frags bet automatically for the team " + team1);
        int[] fragsTeam1 = new int [5];
        for (int i = 0; i< fragsTeam1.length; i++){
            fragsTeam1[i]=(int) (0+Math.random()*100);
            System.out.println(fragsTeam1[i] + " ");
        }

        int teamResult1 = Arrays.stream(fragsTeam1).sum();
        System.out.println(teamResult1 + " sum of team frags " + team1);
        int teamAverage1 = Arrays.stream(fragsTeam1).sum()/ fragsTeam1.length;
        System.out.println(teamAverage1 + " command average " + team1);

        String team2 = "Hooligans";
        System.out.println("Frags bet automatically for the team " + team2);
        int[] fragsTeam2 = new int [5];
        for (int i = 0; i< fragsTeam2.length; i++){
            fragsTeam2[i]=(int) (0+Math.random()*100);
            System.out.println(fragsTeam2[i] + " ");
        }

        int teamResult2 = Arrays.stream(fragsTeam2).sum();
        System.out.println(teamResult2 + " sum of team frags " + team2);
        int teamAverage2 = Arrays.stream(fragsTeam2).sum()/ fragsTeam1.length;
        System.out.println(teamAverage2 + " command average " + team2);

        if(teamAverage1>teamAverage2){
            System.out.println("win "+ team1 + " scored " + teamResult1 + " point " );
        } else if (teamAverage1 ==teamAverage2) {
            System.out.println(" friendship won ");

        } else
            System.out.println("win "+ team2 + " scored " + teamResult2 + " point ");
    }
}
