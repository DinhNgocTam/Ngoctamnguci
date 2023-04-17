import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double playerAccount = 5000000;
        Scanner sc = new Scanner(System.in);
        //NumberFormat numf = NumberFormat.getInstance());
        int choice;
        double bet;
        do{
            System.out.println("--------------Menu--------------");
            System.out.println("Press 1: Continue to play ");
            System.out.println("Press any case to exit");
            System.out.print("Your choice: ");
            
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("*** Start ***");
                System.out.println("***Your account: " + playerAccount + "\nMoney you want to bet: ");
                do{
                    bet = sc.nextDouble();
                }while(bet <=0 || bet > playerAccount);
                
                int chooseTaiXiu;
                do{
                    System.out.println("Choose 1 is Tai | Choose 2 is Xiu");
                    chooseTaiXiu = sc.nextInt();
                }while(chooseTaiXiu != 1 && chooseTaiXiu != 2 );

                //Tung xuc xac

                Random dice1 = new Random();
                Random dice2 = new Random();
                Random dice3 = new Random();

                int result1 = dice1.nextInt(6)+1;
                int result2 = dice2.nextInt(6)+1;
                int result3 = dice3.nextInt(6)+1;
                int sum = result1 + result2 + result3;

                //Tinh toan ket qua

                System.out.println("****Result: " + result1 + " and " + result2 + " and " + result3);

                if(sum == 3 || sum == 18){
                    System.out.println("****Sum = " + sum +". So your lose your money");
                    playerAccount -= bet; // tru tien sau khi dat cuoc
                    System.out.println("Your account have " + playerAccount + "$");
                }else if(sum >= 4 && sum <= 10){ // Xuc xac ra xiu
                    System.out.println("****Sum is " + sum + ". So result is Xiu");
                    if(chooseTaiXiu == 1){
                        playerAccount -= bet; // tru tien sau khi dat cuoc
                        System.out.println("You choose Tai so you lost your money :(" + "\nMoney in your account is " + playerAccount);
                    }else{
                        playerAccount += bet; //cong tien khi thang cuoc
                        System.out.println("Congratulation. You win " + bet + "$" + "Your account have " + playerAccount);
                    }
                }else{ // Xuc xac ra tai
                    System.out.println("****Sum is " + sum + ". So result is Tai");
                    if(chooseTaiXiu == 2){
                        playerAccount -= bet; // tru tien sau khi dat cuoc
                        System.out.println("You choose Xiu so you lost your money :(" + "\nMoney in your account is " + playerAccount);
                    }else{
                        playerAccount += bet; //cong tien khi thang cuoc
                        System.out.println("Congratulation. You win " + bet + "$" + "\nYour account have " + playerAccount);
                    }
                }
            }
        }while(choice == 1);
        System.out.println("Thanks for play this game");
    }
}
