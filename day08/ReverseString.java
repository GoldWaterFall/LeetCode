package day08;

public class ReverseString {
    /**
     *直接两头交换
     * @param s 字符串
     */
    public void reverseString(char[] s) {
        int l=0;
        int r = s.length-1;
        while(l<r){
            char temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}
