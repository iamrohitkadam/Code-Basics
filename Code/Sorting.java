public class Sorting {

    public static void BubbleSort(int Num[]) 
    {
        int n = Num.length;
        for (int i=0; i < n-1; i++)
        {
            for (int j = 0; j < n-1-i; j++)
            {
                if (Num[j] > Num[j+1])
                {
                    int temp = Num[j];
                    Num[j] = Num[j+1];
                    Num[j+1] = temp;
                }
            }
        }   
    }

    public static void SelectionSort(int Num[]) {
        int n = Num.length;
        for(int i = 0; i<n-1; i++){
            int minPos = i; 
            for(int j = i+1; j<n; j++){
                if(Num[j] < Num[minPos]){
                    minPos = j;

                }
            }
            //swap
            int temp = Num[minPos];
            Num[minPos] = Num[i];
            Num[i] = temp;
        }
        
    }

    public static void InsertionSort(int Num[]) {
        for(int i = 1; i<Num.length; i++){
            int curr = Num[i];
            int prev = i - 1;
            //Finding out correct position to insert
            while(prev>=0 && Num[prev] > curr){
                Num[prev + 1] = Num[prev];
                prev--;
            }
            Num[prev + 1] = curr;
        }
        
    }

    public static void PrintArr(int Num[]) 
    {
        for(int i = 0; i<Num.length; i++)
        {
            System.out.print(Num[i] + " ");
        }    
    }
    public static void main(String[] args) {
        int num[] = {5,4,1,3,2};
        InsertionSort(num);
        PrintArr(num);
    }
}


