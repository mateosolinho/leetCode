public class longestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String a = "";
        int pos = 0;
        while (pos < strs[0].length()) {
            char c = strs[0].charAt(pos);
            for (int i = 1; i < strs.length; i++) {
                if ((pos == strs[i].length()) || (strs[i].charAt(pos) != c)) {
                    return a;
                }
            }
            a = a + c;
            pos++;
        }
        return a;
    }

    public static void main(String[] args) {
        longestPrefix l = new longestPrefix();
        String[] strs = { "a" };
        System.out.println(l.longestCommonPrefix(strs));
    }
}