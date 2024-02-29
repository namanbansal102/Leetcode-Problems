public class specialElements {
    public static void main(String[] args) {
        System.out.println("Special Elements With Element Greater Than Equal to x");
        int nums[]={0,4,3,0,4};
        int count=0;
        for (int i = 0; i < 100; i++) {
            count=0;
            for (int j = 0; j < nums.length; j++) {
                if (i>=nums[j]) {
                    count++;
                }
            }
            if (i==count) {
                System.out.println();
                break;
            }
        }
        System.out.println("The Value of Count is:"+count);
    }
}
