public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        LengthLastWord l = new LengthLastWord();
        System.out.println(l.lengthOfLastWord("   fly me   to   the moon  "));
    }
}