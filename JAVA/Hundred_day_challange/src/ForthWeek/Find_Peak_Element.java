package ForthWeek;

public class Find_Peak_Element {
    public int findPeakElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        int peak=-1;
        if(nums.length==1){
            return 0;
        }
        if(nums[start]<nums[end]){
            return nums[end];
        }else{
            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]>nums[start]){
                    if(nums[mid]>nums[mid+1]){
                        return mid;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{

                }
            }
        }
        return -1;
    }
}
