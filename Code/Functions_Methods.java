import java.util.Scanner;

public class Functions_Methods {
    

    public static int Factorial(int n){
        int fac = 1;

        for (int i=1;i<=n;i++){
            fac = fac * i;
        }
        return fac;


    }


    public static int Binomial_Coeff(int n, int r){

        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int bc = fact_n / (fact_r*fact_nmr);

        return bc;
    }

    public static void binTodec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int dec = 0;

        while(BinNum>0){
            int LastDigit = BinNum % 10;
            dec += LastDigit * Math.pow(2, pow);
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal of" + myNum + " = " + dec);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int bin = 0;

        while(n > 0){
            int rem = n % 2;
            bin += rem * Math.pow(10, pow);
            
            pow++;
            n = n / 2;
        }
        System.out.println("Binary Number of "+ myNum +" is "+bin);
    }

    public static double avg(double a, double b, double c){
        double avg =(a+b+c)/3;
        return avg;
    }

    public static boolean isEven(int n){
        // boolean num;
        if (n%2 == 0){
            return true;
        }
        else{
            return false;
        }
        // return boolean;
    }

    public static int palindrome(int n){
        int LastDigit;
        int rev=0;
        while(n>0){
        LastDigit = n % 10;
        rev = (rev*10) + LastDigit;
        n = n/10;
        }
        return rev;
    }
    public static int Sum(int n){
        int LastDigit;
        int Sum = 0;

        while (n>0){
            LastDigit = n % 10;
            Sum += LastDigit;
            n = n/10;
        }
        return Sum;
    }

    public static void main(String[] args) {
        // System.out.println(Factorial(3)); 
        //System.out.println(Binomial_Coeff(5, 2));
        //binTodec(101);
        //decToBin(7);
        //Practice Questions
        //1
        Scanner sc = new Scanner(System.in);
        // double x = sc.nextDouble();
        // double y = sc.nextDouble();
        // double z = sc.nextDouble();
        // System.out.println("Average is " + avg(x,y,z));
        //2
        System.out.println("Enter a Number :");
        int x = sc.nextInt();
        // if(isEven(x)){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
        //3
        // if (palindrome(x)==x){
        //     System.out.println(x + " is palindrome");
        // }
        // else{
        //     System.out.println(x + " is Not Palindrome");
        // }
        //4
        System.out.println("Sum of " + x + " is " + Sum(x));
    }
    
}
