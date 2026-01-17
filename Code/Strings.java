
public class Strings {

    public static Boolean Palindrome(String str) {
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
        
    }


    public static float getShortestPath(String str) {
        int x=0,y=0;
        for(int i = 0; i<str.length();i++){
            char dir = str.charAt(i);
            //S
            if (dir == 'S'){
                y--;
            }
            //N
            else if(dir == 'N'){
                y++;
            }
            //W
            else if(dir == 'W'){
                x--;
            }
            //E
            else{
                x++;
            }

        }
        
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);

    }

    public static String subString(String str,int si,int ei) {
        String str1 = new String();
        for (int i = si; i<ei;i++){
            str1 += str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        //Palindrome**
        // String str = "racecar";
        // System.out.println(Palindrome(str));

        //ShortestPath**
        // String str = "WNEENESENNN";
        // System.out.println(getShortestPath(str));

        //SubString**
        String str = "HelloWorld";
        System.out.println(str.substring(3,6));

    }
}
