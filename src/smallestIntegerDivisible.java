import java.util.HashSet;

public class smallestIntegerDivisible {
    public static int smallestRepunitDivByK(int k) {
        int n=1;
        int R=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; ; i++) {
            R = n % k;                      // find remainder
            if(R == 0) return i;            // if R == 0, we found the required n, returns it
			if(set.contains(R)) return -1;    // seen again? no n exists, so return -1
            set.add(R);                // mark as seen
            n = R * 10 + 1; 
        }
    }
    public static void main(String[] args) {
        System.out.println("Smallest Integer Divisible by k leetcode Problem");
        System.out.println(smallestRepunitDivByK(17));
    }
}
