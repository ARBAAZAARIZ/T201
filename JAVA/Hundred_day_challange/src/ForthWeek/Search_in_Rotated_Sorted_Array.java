package ForthWeek;

public class Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[start]<=nums[mid] ) {
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<nums[mid] && target >=nums[end]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array sinrsa=new Search_in_Rotated_Sorted_Array();
        int []nums={4,5,6,7,0,1,2};
        System.out.println(sinrsa.search(nums, 1));
    }
}
