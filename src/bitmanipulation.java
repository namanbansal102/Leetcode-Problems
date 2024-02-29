public class bitmanipulation {
    public static  int getBit(int n,int pos){
        int bitMask=1<<pos;
        if ((bitMask & n)==0) {
           return 0;
        }
        else{
            return 1;
        }
    }
    public static  int setBit(int n,int pos){
        // Setting the bit from 0 to 1 and remain 1 as 1
        int bitMask=1<<pos;
        int res=bitMask | n;
        return res;
    }
    public static int clearBit(int n,int pos){
        int bitMask=1<<pos;
        int complementBitMask=~bitMask;
        // my bit get at postion 0 and other bit get 1 and get output of 0 with and
        return complementBitMask & n;
    }
    public static int updateBit(int n,int pos,int what){
        if (what==1) {
            return setBit(n, pos);
        }
        return clearBit(n, pos);
    }
    public static void main(String[] args) {
        System.out.println("Bit Manipulation Java");
        System.out.println("Get Bit Function");
        int n=5;
        int pos=1;
       int setBitRes=updateBit(n, pos,1);
       System.out.println(setBitRes);
        System.out.println("Set Bit Function");
    }
}
