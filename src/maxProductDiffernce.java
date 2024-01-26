
public class maxProductDiffernce {
    public static void main(String[] args) {
        System.out.println("Maximum Product Difference LeetCode Problem");
        int nums[]={5,6,2,7,4};
        int n=nums.length;
        int largest=-9999;
        int seclargest=-9999;
        int smallest=9999;
        int secsmallest=9999;
        for (int i = 0; i < n; i++) {
            if (nums[i]>largest) {
            seclargest=largest;
            largest=nums[i];    
            }
            else{
                seclargest=Math.max(seclargest, nums[i]);
            }
            if (nums[i]<smallest) {
            secsmallest=smallest;
            smallest=nums[i];    
            }
            else{
                secsmallest=Math.min(secsmallest, nums[i]);
            }
            
        }
        int prod=(largest*seclargest)-(smallest*secsmallest);
        System.out.println(prod);
    }
}
