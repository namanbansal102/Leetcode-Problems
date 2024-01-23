public class lemonadeChange {
    public static void main(String[] args) {
        System.out.println("LemonadeChange LeetCode Problem");
        int bills[]={5,5,10,10,5,20,5,10,5,5};
        int fives=0;
        int tens=0;
        int twenty=0;
        for (int note : bills) {
            if (note==5) {
                fives++;
            }
            if (note==10) {
                if (fives!=0) {
                    fives--;
                }
                else{
                    System.out.println("Finally five........="+fives);
                System.out.println("Finally tens............="+tens);
                System.out.println("Finally twenty..........="+twenty);
                    System.out.println("No Five Dollar change");
                    break;
                }
                tens++;
            }
            if (note==20) {
                if (tens!=0 && fives>=1) {
                    tens--;
                    fives-=1;
                }
                else if (tens==0 && fives>=3) {
                    fives-=3;
                }
                else{
                    System.out.println("No 20 Dollar Exchange");
                    break;
                }
                twenty++;
            }
        }
        System.out.println("Finally five="+fives);
        System.out.println("Finally tens="+tens);
        System.out.println("Finally twenty="+twenty);
    }
}
