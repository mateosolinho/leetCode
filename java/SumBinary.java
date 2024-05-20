import java.math.BigInteger;

public class SumBinary {
    public String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
    public static void main(String[] args) {
        SumBinary s = new SumBinary();
        s.addBinary("11", "1");
    }
}
