import java.util.Arrays;

public class CodingPractices {

     public static void Reverse(int num){
        int rev = 0;
        while(num != 0 ){
        int ld = num % 10;
        rev = rev * 10 + ld;
        num = num/10;
        
        }
        System.out.println(rev);
        
    }

    public static String reverseString(String str){
        int n = str.length();
        String rev = "";

        while(n >0){
            rev += str.charAt(n-1);
            n--;
        }
        return rev;
    }

    public static void stringPalindrome(String str){

        String str1 = reverseString(str);
        if (str1.equals(str)) {
            System.out.println("Palinrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }


    public static void CountNum(int num){
        int count = 0;
        while (num == 0) {
            num = num/10;
            if (num != 0) {
                count++;
            }else{
                break;
            }
        }

System.out.println(count);    }



public static void checkEvenOdd(int num){
    int countEven = 0;
    int countOdd = 0;
    while (num!=0) {
        int lg = num%10;
        if (lg % 2 == 0) {
            countEven++;
        }else{
            countOdd++;
        }
        num /= 10;
    }
    System.out.println(countEven+" "+countOdd);
}

public static int binarySearchUsingRecursion(int[] arr,int left,int right,int target){
            int n=arr.length;
            int mid = left +(right - left)/2;
    if(arr[mid] == target){
        return mid;
    }
        while (n>0) {
            if (target < arr[mid]) {
                binarySearchUsingRecursion(arr, left, mid-1, target);
            }else{
                binarySearchUsingRecursion(arr,mid+1,right,target);

            }
        }
        return mid;
}


public static void isPrime(int num){
    
    for(int i = 1;i <= 9 ; i++){
        if (num % num == 0 && num % 1 == 0) {
            System.out.println("Prime");
            break;
        }else{
            System.out.println("Not Prime");
            break;
        }
    }
}


public static int rangeSum(int[] nums, int n, int left, int right) {
    int[] ans = new int[n*(n+1)/2];
    System.out.println(nums);
    System.out.println(ans);
    int count = n;
    for(int i = 0;i<n-2;i++){
        for(int j = i+1;j<n-1;j++){
            nums[count] = nums[i] + nums[j];
            count++;
        }
    }
    System.out.println(ans[0]);

    Arrays.sort(ans);
    System.out.println(ans);
    int sum = 0;
    for(int i = left-1;i<right-1;i++){
        sum += ans[i];
    }
    return sum;
}

public static void countCharOccurrence(String str,char ch){
    int count = 0;
    for(int i = 0;i<str.length();i++){
        if (str.charAt(i) == ch) {
            count++;
        }
    }
    System.out.println("Count of " + ch + "is " + count);
}

public static void avgFromArray(int[] arr){
    int sum = 0;
    for(int i = 0;i<arr.length;i++){
        sum += arr[i]; 
    }
    System.out.println(sum/arr.length);
}


public static int strStr(String haystack, String needle) {
    StringBuilder sb = new StringBuilder("sad");
    for(int i = 0; i<haystack.length()-1; i++){
        for(int j = 0;j<haystack.length();j++){
            sb.append(haystack.charAt(j));
            sb.toString();
            // System.out.println(sb);
            System.out.println(sb.equals(needle));
            if(sb.equals(needle)){
                return i;
            }
            
        }
        sb.setLength(0);
    }
    return -1;
}


public void method(){
    System.out.print("Hello");
}
    public static void main(String[] args) {
        CodingPractices cp = new CodingPractices();
        cp.method();
        // Reverse(54321);
        // reverseString("Aditya");
        // stringPalindrome("noon");
        // CountNum(12345);
        // checkEvenOdd(123456);
        int[] arr = {1,2,3,4,5};
        // int ans = binarySearchUsingRecursion(arr,0,4,3);
        // System.out.println(ans);

        // isPrime(5);
        // int[] nums = {1,2,3,4};
        // System.out.println(nums);
        // rangeSum(nums,4,1,5);
        // countCharOccurrence("aaabbcdfrgaa",'a');
        // avgFromArray(arr);

        System.out.println(strStr("sadbutsad", "sad"));

    }
}

