import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //DECLARE VARIABLE
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num_of_dice;
        int total = 0;

        System.out.print("Enter the number of dice you want to roll: ");
        num_of_dice = sc.nextInt();

        if(num_of_dice > 0){
            for(int i = 0; i< num_of_dice;i++){
                int random_num = random.nextInt(1,7);
                System.out.println("You rolled " + random_num);
                total+=random_num;
            }
            System.out.println("Total sum of dice's rolled is: " + total);
       }

        else {
            System.out.println("Number of dice should be greater than 0!!!");
        }
        //GET NUMBER OF DICE FROM THE USER
        //CHECK IF NUMBER IS GREATER 0
        //ROLL ALL THE DICE
        //GET THE TOTAL
        //DISPLAY ASCII OF DICE
        sc.close();
    }
}
