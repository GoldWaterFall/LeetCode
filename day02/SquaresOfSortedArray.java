package day02;


import java.util.Arrays;

public class SquaresOfSortedArray {
    /**
     * 暴力解法，平方后排序
     * @param nums 非递减顺序 排序的整数数组 nums
     * @return 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序
     */
    public int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }

    /**
     * 双指针法
     *有序数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间
     * @param nums 非递减顺序 排序的整数数组 nums
     * @return 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序
     */
    public int[] sortedSquares2(int[] nums) {
       int right = nums.length-1;
       int left =0;
       int[] result = new int[nums.length];
       int index = result.length-1;
       while(left<=right){
           if(nums[left]*nums[left]>nums[right]*nums[right]){
               result[index--]=nums[left]*nums[left];
               left++;
           }else {
               result[index--]=nums[right]*nums[right];
               right--;
           }
       }
       return result;
    }
}
