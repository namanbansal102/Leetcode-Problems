import java.util.Arrays;
import java.util.Collections;

public class indainCoins {
    public static void main(String[] args) {
        System.out.println("indian Coin Change Problem");
        Integer[] coins={1,2,5,20,50,100,500,2000};
        Arrays.sort(coins,Collections.reverseOrder());
        int amount=1059;
        int notes=0;
        while (amount>0) {
            for (int i = 0; i < coins.length; i++) {
                System.out.println("Coins are:"+coins[i]);
                System.out.println("Amount is:"+amount);
                if (amount>=coins[i]) {
                    amount-=coins[i];
                    notes++;
                    break;
                }
            }
        }
        System.out.println(notes);

    }
}
