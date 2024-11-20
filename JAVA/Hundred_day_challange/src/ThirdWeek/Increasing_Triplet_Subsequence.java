package ThirdWeek;
//leetcode problem number 334
//Given an integer array nums, return true if there exists a
// triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no
//  such indices exists, return false.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.
//Example 2:
//
//Input: nums = [5,4,3,2,1]
//Output: false
//Explanation: No triplet exists.
//        Example 3:
//
//Input: nums = [2,1,5,0,4,6]
//Output: true
//Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
public class Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third= Integer.MAX_VALUE;
        boolean isTrue=false;


        for (int ele : nums) {
            if (first >= ele) {
                first = ele;
            } else if (second >= ele) {
                second = ele;
            } else {
                third = ele;
                isTrue = true;
                break;
            }
        }
        return isTrue;

    }

    public static void main(String[] args) {
        Increasing_Triplet_Subsequence its=new Increasing_Triplet_Subsequence();
           int[] nums1={1,2,3,4,5 };
        int[] nums2={ 5,4,3,2,1 };
        int[] nums3={ 2,1,5,0,4,6 };
        int [] nums4={20,100,10,18,5,13};
        System.out.println(its.increasingTriplet(nums1));
        System.out.println(its.increasingTriplet(nums2));
        System.out.println(its.increasingTriplet(nums3));
        System.out.println(its.increasingTriplet(nums4));
    }

}
