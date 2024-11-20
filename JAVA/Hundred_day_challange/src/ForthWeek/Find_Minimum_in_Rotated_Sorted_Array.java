package ForthWeek;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int... nums) {
        int start=0;
        int end= nums.length-1;
        if(nums.length==1){
            return nums[0];
        } else if (nums[start]<nums[end]) {
            return nums[0];
        } else if (nums.length==2) {
            if(nums[start]<nums[end]){
                return nums[0];
            }else {
                return nums[1];
            }
        } else {
            while(start<=end){
                int mid=(start+end)/2;
                if (mid!=1 && nums[mid-1]>nums[mid]) {
                    return nums[mid];
                } else if (mid!=nums.length && nums[mid]>nums[mid+1]) {
                    return nums[mid+1];
                } else if (nums[start]<nums[mid]) {
                    start=mid+1;
                }else{
                    end=mid+1;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Find_Minimum_in_Rotated_Sorted_Array fm=new Find_Minimum_in_Rotated_Sorted_Array();
        System.out.println(fm.findMin(3,1,2));
    }
}
