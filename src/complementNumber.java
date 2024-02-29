public class complementNumber {
    public static  int getBit(int n,int pos){
        int bitMask=1<<pos;
        if ((bitMask & n)==0) {
           return 0;
        }
        else{
            return 1;
        }
    }
    public static int clearBit(int n,int pos){
        int bitMask=1<<pos;
        int complementBitMask=~bitMask;
        // my bit get at postion 0 and other bit get 1 and get output of 0 with and
        return complementBitMask & n;
    }
    public static  int setBit(int n,int pos){
        // Setting the bit from 0 to 1 and remain 1 as 1
        int bitMask=1<<pos;
        int res=bitMask | n;
        System.out.println("in Set Bit Integer To binary String"+Integer.toBinaryString(res));
        return res;
    }
    public static int updateBit(int n,int pos){
        
        int bitMask=1<<pos;
        if (getBit(n, pos)==1) {
        int complementBitMask=~bitMask;
        return complementBitMask & n;
        }
        int res=bitMask | n;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Complement Number LeetCode Problem");
        int num=1;
        System.out.println(Integer.toBinaryString(num));
        String getBinary=Integer.toBinaryString(num);
        for (int i = 0; i < getBinary.length(); i++) {
            int k=updateBit(num, i);
            System.out.println("In For Loop"+Integer.toBinaryString(k));
            num=k;
        }
        System.out.println(num);
    }
}