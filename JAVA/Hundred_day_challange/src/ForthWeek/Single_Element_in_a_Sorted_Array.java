package ForthWeek;

public class Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate(int[] nums){
        if(nums.length==1){
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }else{
            int start=0;
            int end=nums.length-1;
            while (start<=end){
                int mid=(start+end)/2;
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                    return nums[mid];
                } else if (mid % 2 != 0) {
                    if(nums[mid]==nums[mid-1]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }else {
                    if(nums[mid]==nums[mid+1]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }

        }


        return -1;
    }
    public static void main(String[] args) {
        Single_Element_in_a_Sorted_Array se=new Single_Element_in_a_Sorted_Array();
//        int []num={1,1,2,3,3,4,4,8,8};
        int []num={3,3,7,7,10,11,11};
        System.out.println(se.singleNonDuplicate(num));
    }
}
