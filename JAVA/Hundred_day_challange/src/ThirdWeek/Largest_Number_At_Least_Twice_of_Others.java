package ThirdWeek;

//      Leetcode problem number : 747
public class Largest_Number_At_Least_Twice_of_Others {

    public int dominantIndex(int[] nums) {
            int idx=-1;
            int max=-1;
            int secMax=-1;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
                idx=i;
            } else if (nums[i]>secMax) {
                secMax=nums[i];
            }
        }
        System.out.println(" Max : " + max);
        System.out.println( " SecMax : " + secMax);
        if(secMax * 2 <= max){
            return idx;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Largest_Number_At_Least_Twice_of_Others   ln=new Largest_Number_At_Least_Twice_of_Others();
        int nums[]={3,6,1,0,9,23};
        System.out.println(ln.dominantIndex(nums));

    }
}
