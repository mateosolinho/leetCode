public class RomanToInteger {
    public int romanToInt(String s) {
        int num = 0;
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;

                    break;
                case 'X':
                    num = 10;

                    break;
                case 'L':
                    num = 50;

                    break;
                case 'C':
                    num = 100;

                    break;
                case 'D':
                    num = 500;

                    break;
                case 'M':
                    num = 1000;

                    break;
            }
            res += num;
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        r.romanToInt("MMVI");
    }
}
