package day01;

public class RemovElement {
    /**
     * 暴力解法
     * @param nums 一个数组
     * @param val 一个值
     * @return 移除后数组的新长度
     */
    public int removeElement1(int[] nums, int val) {
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i]==val){  // 发现需要移除的元素，就将数组集体向前移动一位
                for (int j = i+1; j < len; j++) {
                    nums[j-1]=nums[j];
                }
                i--;//因为下标i以后的数值都向前移动了一位，所以i也向前移动一位
                len--;// 此时数组的大小-1
            }
        }
        return len;
    }

    /**
     *快慢指针
     * 快指针：寻找新数组的元素 ，新数组就是不含有目标元素的数组
     * 慢指针：指向更新 新数组下标的位置
     * @param nums 一个数组
     * @param val 一个值
     * @return 移除后数组的新长度
     */
    public int removeElement2(int[] nums, int val) {
        int slowIndex=0;
        for (int fastIndex=0; fastIndex <nums.length ; fastIndex++) {
            if(fastIndex!=val){
                nums[slowIndex]=nums[fastIndex]; // 将当前快指针指向的元素复制到慢指针指向的位置
                slowIndex++; // 增加慢指针的索引，以指向下一个位置
            }
        }
        return slowIndex;
    }

    /**
     *相向双指针
     * @param nums 一个数组
     * @param val 一个值
     * @return 移除后数组的新长度
     */
    public int removeElement3(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while(right >= 0 && nums[right] == val) right--;
        while(left <= right) {
            if(nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }
            left++;
            while(right >= 0 && nums[right] == val) right--;
        }
        return left;
    }

}
