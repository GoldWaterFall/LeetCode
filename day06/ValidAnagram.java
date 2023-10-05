package day06;

public class ValidAnagram {
    /**
     * 字典解法
     * @param s 字符串 s
     * @param t 字符串 t
     * @return 是返回true 不是返回false
     */
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i)-'a']++; //记录字母位置，s里有一个就加一个
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i)-'a']--;
        }

        for (int count:
             record) {
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
