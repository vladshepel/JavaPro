package HomeWork;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] Args) {






        Scanner scanner = new Scanner(System.in);
        System.out.println( "Guess the number from 1 to 10" );
        int a=(int)Math.floor(Math.random()*10);
        int attemp =3 ;

        while(attemp>0){
            int f = scanner.nextInt();

            if(f == a)  {
                System.out.println("You win"); break;
            }
            else {
                System.out.println("Attempts left:"+ attemp);
            }
            attemp--;


        }






    }


    }
