public class patterns {


    public static void Hollow_Rectangle(int r, int c){
        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        for (int i = 1; i <= n; i++){       //For Rows
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    public static void inverted_half_pyramid_Num(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_Numtwo(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n){
        //1st Half
        for (int i=1; i<=n; i++){
            //stars on L.H.S
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars on R.H.S
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for (int i=n; i>=1; i--){
            //stars on L.H.S
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars on R.H.S
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();        }
    }

    public static void Solid_Rhombus(int n){
        for (int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            //Spaces on L.H.S
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Hollow_rectangle
            for(int j=1; j<=n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int n){
        //1st Half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Hollow_Rectangle(4,8);
        inverted_rotated_half_pyramid(7);
        // inverted_half_pyramid_Num(7);
        // inverted_half_pyramid_Numtwo(6);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterFly(4);
        // Solid_Rhombus(5);
        // Hollow_Rhombus(5);
        // Diamond(4);
    }
}
