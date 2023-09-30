package day01;

import java.util.Scanner;

public class BinarySearch {
    /**
     * 左闭右闭情况
     *
     * @param nums   一个 n 个元素有序的（升序）整型数组
     * @param target 目标值 target
     * @return 目标值存在返回下标，否则返回 -1
     */
    public static int searchCloseRight(int[] nums, int target) {
        //边界判断，如果target在边界外了，直接不存在返回-1
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;//左闭右闭
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                //如果中间元素小于target,左侧边界到mid+1处
                left = mid + 1;
            } else if (nums[mid] > target) {
                //如果中间元素大于target,右侧边界到mid-1处
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 左闭右开情况
     *
     * @param nums   一个 n 个元素有序的（升序）整型数组
     * @param target 目标值 target
     * @return 目标值存在返回下标，否则返回 -1
     */
    public static int searchOpenRight(int[] nums, int target) {
        //边界判断，如果target在边界外了，直接不存在返回-1
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length;//左闭右开
        //right取不到，是小于不是小于等于
        while (left <right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                //如果中间元素小于target,左侧边界到mid+1处
                left = mid + 1;
            } else if (nums[mid] > target) {
                //如果中间元素大于target,右侧边界到mid-1处
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i]=i;
        }
        System.out.println(searchCloseRight(arr,5));
        System.out.println(searchOpenRight(arr,5));
    }
}
