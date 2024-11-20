package ThirdWeek;

public class Maximum_Ascending_Subarray_Sum {


    public int maxAscendingSum(int[] nums) {

        int idxPointr = 0;
        int sum = 0;
        int maxSum = 0;
        if (nums.length > 1) {
            while (idxPointr < nums.length - 1) {
                if (nums[idxPointr] < nums[idxPointr + 1]) {
                    sum = sum + nums[idxPointr];                                    // {5,5,6,6,6,9,1,2} =15
                } else if (nums[idxPointr] > nums[idxPointr + 1]) {
                    sum = sum + nums[idxPointr];
                    maxSum = Math.max(maxSum, sum);
                    sum = 0;
                }else{

                    sum = sum + nums[idxPointr];
                    maxSum = Math.max(maxSum, sum);
                    sum=0;

                }
                idxPointr++;

            }
            if (nums[nums.length - 2] < nums[nums.length - 1]) {
                sum = sum + nums[nums.length - 1];
                maxSum = Math.max(maxSum, sum);
            } else if (nums[nums.length - 2] > nums[nums.length - 1]) {
                sum=0;
                sum = sum + nums[nums.length - 1];
                maxSum = Math.max(maxSum, sum);
            }
            else{
                sum=0;
                sum = sum + nums[idxPointr];
                maxSum = Math.max(maxSum, sum);
            }

            return maxSum;
        } else {
            return nums[nums.length - 1];
        }

    }
    public int maxAscending(int []nums){
        int sum=nums[nums.length-1];
        int max=nums[nums.length-1];
        for( int i=nums.length-2;i>=0;i--){
            if( nums[i+1] > nums [i] ){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum_Ascending_Subarray_Sum mas=new Maximum_Ascending_Subarray_Sum();
        int nums1[]={3,6,10,1,8,9,9,8,9};
        int []nums2={5,5,6,6,6,9,1,2};
        int []nums={6};
        System.out.println(mas.maxAscendingSum(nums1));
        System.out.println(mas.maxAscendingSum(nums2));
        System.out.println("-----------------------------------------------------------");
        System.out.println(mas.maxAscending(nums1));
        System.out.println(mas.maxAscending(nums));
    }
}