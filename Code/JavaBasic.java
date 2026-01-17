// public class JavaBasic{

//     public static int factorial(int n) {
//         int f = 1;

//         for(int i = 1;i<=n;i++){
        
//             f = f * i;
//         }
//         return f;
//     }

//     public static int BC(int n,int r) {
//         int BC = factorial(n)/(factorial(r)*factorial(n-r));
//         return BC;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(BC(5,2));
//     }
// }
// public class JavaBasic{


//     public static Boolean PrimeNonPrime(int n) {

//         if (n==2){
//             return true;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++){
//             if (n % i == 0) {
//                 return false;
//             } 
//         }
//         return true;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(PrimeNonPrime(7));
//     }
// }

public class JavaBasic{


    public static Boolean PrimeNonPrime(int n) {
        
        if (n==2){
            return true;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            } 
        }
        return true;
        
    }

    public static void PrimeRange(int n) {
        for (int i = 2 ; i<=n; i++){
            if (PrimeNonPrime(i)){
                System.out.println(i);
            }
            
        }
        
    }

    public static void main(String[] args) {
        PrimeRange(7);
    }
}