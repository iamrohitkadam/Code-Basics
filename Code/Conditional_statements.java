import java.util.*;

public class Conditional_statements {

    public static void main(String[] args) {
    //Practice Questions
//1
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if(num>=0){
        //     System.out.println(num + " is positive");
        // }
        // else{
        //     System.out.println(num + " is Negative");
        // }

//2
        // double temp = 103.5;

        // if(temp>100){
        //     System.out.println("You have a fever");
        // }
        // else{
        //     System.out.println("You don't have a fever");
        // }

//3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input num between 1 - 7");
        // int num = sc.nextInt();

        // switch(num){
        //     case 1 : 
        //     System.out.println("Monday");
        //     break;
        //     case 2 : 
        //     System.out.println("Tuesday");
        //     break;
        //     case 3 :
        //     System.out.println("wed");
        //     break;
        //     case 4 :
        //     System.out.println("thur");
        //     break;
        //     case 5 :
        //     System.out.println("friday");
        //     break;
        //     case 6 :
        //     System.out.println("sat");
        //     break;
        //     case 7 :
        //     System.out.println("sun");
        //     break;
        //     default:
        //     System.out.println("invalid input");
        // }

//5
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            if (year%4==0){
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " is Not a Leap year");
            }
    }
}

