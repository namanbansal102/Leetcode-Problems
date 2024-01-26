import java.lang.reflect.Array;
import java.util.Arrays;

public class buyTwoChoco {
    public static void main(String[] args) {
        System.out.println("Buy Two Chocolates Problem");
        int prices[]={3,2,3};
        Arrays.sort(prices);
        int money=3;
        if (prices[0]+prices[1]<=money) {
            System.out.println(money-prices[0]-prices[1]);
        }
        else{
            System.out.println("No DEbt");
        }
    }
}
