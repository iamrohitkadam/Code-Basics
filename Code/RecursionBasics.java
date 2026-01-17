public class RecursionBasics {
    //Problem 1
    public static void OrderDec(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        OrderDec(n-1);
        return;
    }

    //Problem 2
    public static void OrderInc(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        OrderInc(n-1);
        System.out.print(n+" ");
        return;
    }

    //Problem 3
    public static int Factorial(int n){
        if (n==0) {
            return 1;
        }
        int f = n * Factorial(n-1);
        return f;
    }

    //Problem 4
    public static int SumofNat(int n){
        if (n==1) {
            return 1;
        }
        int sum = 0;
        sum = n + SumofNat(n-1);
        return sum;
    }

    //Problem 5
    public static int FunFib(int n){
        if (n==0 || n==1){
            return n;
        }
        int fib = 0;
        fib = FunFib(n-1) + FunFib(n-2);
        return fib;
    }

    //Problem 6
    public static boolean isSorted(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }

        if (arr[i] > arr[i+1]){
            return false;
        }
        else {
            return isSorted(arr, i+1);
        }
    }

    //Problem 7
    public static int FirstOcc(int arr[],int i,int key){
        if (i==arr.length-1) {
            return -1; 
        }

        if (arr[i] == key) {
            return i;
        }
        else{
            return FirstOcc(arr,i+1, key);
        }
    }

    //Problem 8
    public static int LastOcc(int arr[],int i,int key){
        if (i == arr.length) {
            return -1;
        }

        int isFound = LastOcc(arr, i+1, key);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }


    //Problem 9
    public static int power(int x,int n){
        if (n==1) {
            return x;
        } 
        return x * power(x, n-1);
    }


    //Problem 10
    //Optimized
    public static int optimizedpower(int x, int n){
        if (n==0) {
            return 1;
            
        }
         int halfPower = optimizedpower(x, n/2);
         int halfPowerSqr = halfPower * halfPower;

         if (n % 2 != 0) {
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    //Problem 11
    public static int TilingProblem(int n){
        //Base Case
        if (n==0 || n==1) {
            return 1;
        }

        //For Vertical Choice
        System.out.println("ver "+n);
        int nm1 = TilingProblem(n-1);
        System.out.println("v "+n);
        System.out.println(nm1);
        System.out.println();

        //For Horizontal Choice 
        System.out.println("Hor "+ n);
        int nm2 = TilingProblem(n-2);
        System.out.println("H "+n);
        System.out.println(nm2);
        System.out.println();

        int TotWays = nm1 + nm2;
        System.out.println(TotWays);
        System.out.println();
        return TotWays;
    }

    // Problem 12
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        
        //kaam
        char currChar = str.charAt(idx);
        System.out.println(currChar);
        System.out.println();

        boolean mapcurr = map[currChar -'a'];
        int minus = currChar - 'a';
        System.out.println(minus);
        System.out.println(mapcurr);

        if (map[currChar -'a'] == true) {
            System.out.println("if " + mapcurr);

            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }

    //Problem 13
    public static int FriendsPairing(int n){
        if (n==1|| n==2) {
            return n;
        }

        return FriendsPairing(n-1) + (n-1) * FriendsPairing(n-2);
    }

    //Problem 14
    public static void printBinStrings(int n,int lastplace,String str){
        if (n==0) {
            System.out.println(str);
            return;
        }

        //kaam  
        printBinStrings(n-1, 0, str+"0");

        if (lastplace == 0) {
            printBinStrings(n-1, 1, str+"1");
            
        }
    }

    //Practice Questions
    //1
    public static void allOccurences(int arr[],int i,int key){
        if(i==arr.length){
            return;
        }

        if (arr[i]==key) {
            System.out.print(i+" ");
        }
            allOccurences(arr, i+1, key);
    }

    //2
    static String digits[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        public static void DigitsToString(int number) {
            if (number == 0) {
                return;
            }

            int lastdigit = number%10;
            DigitsToString(number/10);
            System.out.print(digits[lastdigit]+" ");
        }

        //3
        //Length Of String
        public static int LenghtOfString(String str){
            if (str.length()==0) {
                return 0;
            }

            System.out.println(str.substring(1)+1);
            System.out.println();
            return LenghtOfString(str.substring(1))+1;

        }

        //4
        //Substring Count
        public static int CountSubstr(String str,int i,int j,int n){
            if (n==1) {
                return 1;
            }
            if (n<=0) {
                return 0;
            }

            int res = CountSubstr(str, i+1, j, n-1) +
                        CountSubstr(str, i, j-1, n-1) -
                        CountSubstr(str, i+1, j-1, n-2);

            if (str.charAt(i) == str.charAt(j)) {
                res++;
            }
            return res;
        }
    

    public static void main(String[] args) {
        // int n = 7;
        //Problem 1
        //Decreasing order 
        //OrderDec(n);

        //Problem 2
        //Increasing order
        // OrderInc(n);

        //Problem 3
        //Factorial
        // System.out.println(Factorial(n));

        //Problem 4
        //Sum of n natural num
        // System.out.println(SumofNat(n));

        //Problem 5 
        //Fibonacci series
        // System.out.println(FunFib(n));

        //Problem 6
        //Array Sorted or Not
        // int arr[] = {1,2,3,4,5,5};
        // if (isSorted(arr,0)) {
        //     System.out.println("Array is sorted");            
        // }
        // else{
        //     System.out.println("Array is unsorted");
        // }

        //Problem 7
        //First occurence in array
        // int key = 5;
        // if (FirstOcc(arr, 0, key)==-1) {
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("key is at index "+FirstOcc(arr, 0, key));
        // }

        //Problem 8
        //Last occurence in array
        // int i = arr.length-1;
        // if (LastOcc(arr, 0, key)==-1) {
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("key is at index "+LastOcc(arr, 0, key));
        // }

        //Problem 9
        //x^n
        // System.out.println(power(2, 4));
        
        //Problem 10
        //Optimized
        // System.out.println(optimizedpower(2, 10));

        //Problem 11
        //Tiling Problem
        System.out.println(TilingProblem(4) + " Ways");

        //Problem 12
        //Remove Duplicates
        // String str = "appnnacollege"; 
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        //Problem 13
        //FriendsPairing
        // System.out.println(FriendsPairing(3));

        //Problem 14
        //Print Binary String without consecutive ones
        // printBinStrings(3, 0, "");

        //Practice Questions
        //1
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // int key = 2;
        // allOccurences(arr,0,key);

        //2
        // DigitsToString(1947);

        //3
        //Lenth of String
        // String str = "abcab";
        // int n = str.length();
        // System.out.println(CountSubstr(str,0,n-1,n));
    }
}