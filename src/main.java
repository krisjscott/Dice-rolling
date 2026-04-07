import java.util.Random;
import java.util.Scanner;

class Main {
    public static String getDiceFace(int value) {
        return switch (value) {
            case 1 -> "+-------+\n|       |\n|   o   |\n|       |\n+-------+";
            case 2 -> "+-------+\n| o     |\n|       |\n|     o |\n+-------+";
            case 3 -> "+-------+\n| o     |\n|   o   |\n|     o |\n+-------+";
            case 4 -> "+-------+\n| o   o |\n|       |\n| o   o |\n+-------+";
            case 5 -> "+-------+\n| o   o |\n|   o   |\n| o   o |\n+-------+";
            case 6 -> "+-------+\n| o   o |\n| o   o |\n| o   o |\n+-------+";
            default -> "Invalid roll";
        };
    }
    public static void main(String[] args){
        //DECLARE VARIABLE
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num_of_dice;
        int total = 0;

        System.out.print("Enter the number of dice you want to roll: ");
        num_of_dice = sc.nextInt();//GET NUMBER OF DICE FROM THE USER

        if(num_of_dice > 0){//CHECK IF NUMBER IS GREATER 0
            for(int i = 0; i< num_of_dice;i++){
                //ROLL ALL THE DICE
                int random_num = random.nextInt(1,7);
                System.out.println("You rolled " + random_num);
                //DISPLAY ASCII OF DICE
                System.out.println(getDiceFace(random_num));
                //GET THE TOTAL
                total+=random_num;


            }
            System.out.println("Total sum of dice's rolled is: " + total);
       }

        else {
            System.out.println("Number of dice should be greater than 0!!!");
        }
        sc.close();
    }
}
