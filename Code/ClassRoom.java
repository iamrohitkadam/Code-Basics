import java.util.*;
public class ClassRoom {


    public static void swap(ArrayList<Integer> list,int idx1,int idx2){

        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }

    // public static Boolean PairSumOne(ArrayList<Integer> list,int target){
    //     int sum = 0;
    //     for (int i = 0;i<list.size()-1;i++){
    //         for(int j = i+1; j < list.size()-1;j++){ 
    //             if (list.get(i) + list.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static Boolean PairSumOne(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;

        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp++;
            }else{
                rp--;
            }
            
        }
        return false;
    }

    public static Boolean pairSumTwo(ArrayList<Integer> list,int target){
        int bp = -1;
        int n = list.size();
        for(int i = 0; i< n-1;i++){
            if (list.get(i) > list.get(i+1)) {
                bp = i;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp != rp) {
            //case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }else{
                rp = (n+rp-1) % n;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(9);
        list.add(10);
        int target = 16;

        //Brute force
        System.out.println(pairSumTwo(list, target));

        // System.out.println(list);

        // int max = Integer.MIN_VALUE;

        // for(int i = 0;i<list.size();i++){
        //     if (list.get(i) > max) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        // int idx1 = 1;
        // int idx2 = 3;
        // swap(list, idx1, idx2);

        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // //Descending
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);


        //Multi Dimensional ArrayList

        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();

        // list1.add(2); list1.add(4);

        // list2.add(5); list2.add(7);


        // mainlist.add(list1);
        // mainlist.add(list2);

        // System.out.println(mainlist);

        // for(int i=0;i<mainlist.size();i++){
        //     ArrayList<Integer> currlist = mainlist.get(i);
        //     for(int j = 0; j<currlist.size();j++){
        //         System.out.print(currlist.get(j));
        //     }

        //     System.out.println();
        // }


        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1;i<=5;i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // for(int i =0;i<mainList.size();i++){
        //     ArrayList<Integer> currlist = mainList.get(i);
        //     for(int j=0;j<currlist.size();j++){
        //         System.out.print(currlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }


 
    }
}
