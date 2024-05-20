public class ClimbingStairs {
    public int climbStairs(int n) {
        int f = 0;
        int f1 = 1;
        int fn = 0;
        for (int i = 0; i < n; i++) {
            fn = f + f1;
            f = f1;
            f = fn;
        }
        return fn;
    }
    
    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        c.climbStairs(3);
    }
}
