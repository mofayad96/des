import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Welcome to our game");
            System.out.println("Please Enter a number between 0 and 20");
            int num=scanner.nextInt();
            int randnum=(int)(Math.random()*20);

            if(num==randnum)
            {
                System.out.println("congrats you win");
            }else System.out.println("you lose the random number is "+randnum+" good luck next time");


    }
}
