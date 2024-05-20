public class Sqrt {
    public int mySqrt(int x) {
       int r = (int) Math.sqrt(x);
        return r;
    }

    public static void main(String[] args) {
        Sqrt m = new Sqrt();
        m.mySqrt(4);
    }
}
