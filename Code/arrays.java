public class arrays{
 
    public static int BinarySearch(int arrayName[],int key) {
        
        int start = 0;
        int end = arrayName.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if (arrayName[mid] == key){
                return mid;
            }

            if (arrayName[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }



    public static void Reverse(int Num[]) {
        int first = 0, last = Num.length - 1;

        while(first < last){

            int temp = Num[last];
            Num[last] = Num[first];
            Num[first] = temp;

            first++;
            last--;
        }
    }


    public static void Pairs(int Num[]) {
        int tp = 0;
        //Outer loop
        for (int i =0; i<Num.length; i++){
            for (int j = i+1; j<Num.length; j++){    //Inner loop
                System.out.print("(" +Num[i]+ "," +Num[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are :" + tp);
        
        
    }

    public static void SubArrays(int Num[]) {
        int ts = 0;
        for(int i = 0; i<Num.length; i++){
            // int start = i;
            for(int j=i; j<Num.length; j++){
                // int end = j;
                int sum = 0;
                    for(int k=i; k<=j; k++){
                        System.out.print(Num[k] + " ");
                        sum+=Num[k];
                    }
                    System.out.println();
                    ts++;
                    System.out.println("Sum is"+sum);
                }
                System.out.println();
            }
            System.out.println("Total Subarrays are :"+ts);
        }

        public static void SubArrayss(int num[]){

            int max = Integer.MIN_VALUE;

            int prefix[] = new int [num.length];
            prefix[0] = num[0];

            //for prefix array
            for(int i=1;i<=num.length;i++){
                prefix[i]=prefix[i-1]+num[i];
            }

            System.out.println("prefix : " + prefix);

            for(int i=0;i<=num.length-1;i++){
                for(int j=i;j<=num.length-1;j++){
                    int sum = 0;
                    sum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                    
                    System.out.println();
                    System.out.println("sum is " + sum);
                    if(max < sum){
                        max = sum;
                    }
                }
                System.out.println();
            }
            System.out.println("max is" + max);
        }


        public static void MaxSubArraysBruteForce(int Num[]) {
            int sum = 0;
            int MaxSum = Integer.MIN_VALUE;

            for(int i = 0; i<Num.length; i++){
                for(int j=i; j<Num.length; j++){
                    sum = 0;
                    for(int k=i; k<=j; k++){
                        sum+=Num[k];
                    }
                    if (MaxSum < sum)
                    {
                        MaxSum = sum;
                    }
                    System.out.println("Sum is"+sum);
                }
                System.out.println();
            }
            System.out.println("MaxSum is :"+MaxSum);
        }


        public static void MaxSubArraysSumPrefix(int Num[]) {
        
            int sum = 0;
            int MaxSum = Integer.MIN_VALUE;
            int Prefix[] = new int [Num.length];

            Prefix[0] = Num[0];
            //For Prefix Array
            for (int i=1; i<Num.length; i++){
                Prefix[i] = Prefix[i-1] + Num[i]; 
            }
            for(int element: Prefix){
            System.out.println(element);
            }

            for(int i = 0; i<Num.length; i++){
                int start = i;
                for(int j=i; j<Num.length; j++){
                    int end = j;
                    sum = start == 0 ? Prefix[end] :  Prefix[end] - Prefix[start - 1];

                    if (MaxSum < sum){
                        MaxSum = sum;
                    }
                   // System.out.println("Sum is"+sum);
                }
                System.out.println();
            }
            System.out.println("MaxSum is :"+MaxSum);
            
        }


        public static void MaxSubArraysKadane(int Num[]) 
        {
            int sum = 0;
            int MaxSum = Integer.MIN_VALUE;

            for (int i =0; i<Num.length; i++)
            {
                //IN Case of Printing Only Positive Numbers
                // if(sum < 0)
                // {
                //     sum = 0;
                // }
                
                //In the Case of Printing All Numbers
                sum = 0;
                sum = sum + Num[i];
                MaxSum = Math.max(MaxSum, sum);
                
            }
            System.out.println("Max Sum is: "+MaxSum);
            
        }


        public static int TrappingRainwater(int Num[]) {
            int n = Num.length;

            //left max boundary
            int LeftMax[] = new int[n];
            LeftMax[0] = Num[0];
            for(int i=1; i<n; i++)
            {
                LeftMax[i]=Math.max(Num[i], LeftMax[i-1]);
            }
            //Right max boundary
            int RightMax[] = new int[n];
            RightMax[n-1] = Num[n-1];
            for(int i=n-2; i>=0; i--)
            {
                RightMax[i]=Math.max(Num[i], RightMax[i+1]);
            }

            //loop
            int trappedWater = 0;
            for(int i = 0; i<n; i++)
            {
                //water level = min(left boun,right boun)
                int WaterLevel = Math.min(LeftMax[i],RightMax[i]);
                 //Trapped water = Water level - height
                trappedWater += WaterLevel - Num[i];
            }
            return trappedWater;
        }


        private static int Stocks(int Num[]) 
        {
            int n = Num.length;
            int buyStock = Integer.MAX_VALUE;
            int MaxProfit = 0;
            for(int i = 0; i < n;i++)
            {
                if(buyStock < Num[i])
                {
                    int profit = Num[i] - buyStock;
                    MaxProfit = Math.max(MaxProfit, profit);
                }
                else
                {
                    buyStock = Num[i];
                }
            }
            return MaxProfit;   
        }
    public static void main(String[] args) {
        int num[] ={7,1,5,3,6,4};
        //Binary Search**
        // int index = BinarySearch(num,10);
        // System.out.println("The number is at index :" + index);
        
        //Reverse**
        // Reverse(num);
        // for(int i = 0; i <num.length; i++){
        //     System.out.print(num[i]+" ");
        // }
        // System.out.println();

        //Pairs**
        //Pairs(num);

        //SubArrays**
        // SubArrayss(num);  //extra
        // SubArrays(num);

        //MaxSubArraysBruteForce**
        // MaxSubArraysBruteForce(num);
        // Time Complexity n3

        //MaxSubArraysSumPrefix**
        MaxSubArraysSumPrefix(num);

        //MaxSubArraysKadane's**
        // int num[] ={-2,-3,4,1,-2,1,5,-3};
        //MaxSubArraysKadane(num);
        //T.C. = On

        //Trapping RainWater **
        // System.out.println(TrappingRainwater(num));

        //Buy and Sell Stock **
        // System.out.println(Stocks(num));
    }
}