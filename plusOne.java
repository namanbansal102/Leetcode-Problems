public class plusOne {
    public static void main(String[] args) {
        System.out.println("Plus One LeetCode Problem");
        int digits[]={1,2,3};
        int n=digits.length;
        int newdigits[]=new int[n+1];
        int k=n-1;

        int carry=1;
        for (int i = n-1; i>=0; i--) {
            if (carry==0) {
                break;
            }
            int num=digits[i];
            num+=carry;
            if (num>9) {
                carry=1;
                digits[i]=num%10;
            }else{
                digits[i]=num;
                carry=0;
            }
        }
        System.out.println("Value of Carry is"+carry);
        for (int i = n; i>0; i--) {
            if(k<0)break;
          newdigits[i]=digits[k]; 
          k--; 
        } 
        if (carry==1) {
            newdigits[0]=1;
        }
        for (int i = 0; i < newdigits.length; i++) {
            System.out.print(newdigits[i]+" ");
        }
        

    }
}
