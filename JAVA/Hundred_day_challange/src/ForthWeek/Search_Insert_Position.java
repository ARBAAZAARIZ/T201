package ForthWeek;

public class Search_Insert_Position {

    public int searchInsert(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target > nums[mid] && mid!=nums.length-1){
                if(target < nums[mid+1]){
                    return mid+1;
                }
                else{
                    start=mid+1;
                }
            }else if(mid==nums.length-1){
                return nums.length;
            }else if(target<nums[mid] && mid!=0){
                if(target>nums[mid-1]){
                    return mid;
                }
                else{
                    end=mid-1;
                }
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Search_Insert_Position si=new Search_Insert_Position();
        int nums[]={1,3,5,6};
        System.out.println(si.searchInsert(nums, 7));

    }
}
