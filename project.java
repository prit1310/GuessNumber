import java.util.*;

class project{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber=0;

        do {
            System.out.println("Guess the number(1-100)");
            userNumber = s1.nextInt();

            if(userNumber == myNumber){
                System.out.println("wouhhhhh......CORRECT!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too short");
            }
        }while (userNumber > 0);

        System.out.print("Guess number is:");
        System.out.println(myNumber);
    }

}