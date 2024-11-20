package ForthWeek;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start<=end){
           int mid=(start+end)/2;
           if(nums[mid]==target){
               ans[0]=mid;
               end=mid-1;
           } else if (target<nums[mid]) {
               end=mid-1;
           }
           else{
               start=mid+1;
           }
        }
        start=0;
        end= nums.length -1 ;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

            return ans;

    }
    public static void main(String[] args) {
        int []nums={5,7,7,8,8,10};
        int target=8;
        Find_First_and_Last_Position_of_Element_in_Sorted_Array sr=new
                Find_First_and_Last_Position_of_Element_in_Sorted_Array();

        System.out.println(Arrays.toString(sr.searchRange(nums, target)));
    }
}
