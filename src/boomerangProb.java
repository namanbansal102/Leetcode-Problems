public class boomerangProb {
    public static int calcSide(int side1){

        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Valid Boomerang Problem in Java");
        int points[][]={{1,1},{2,2},{3,3}};
        //            (x1,y1),(x2,y2),(x3,y3) 
        //Firstly We have to find Three Sides
        int x1=points[0][0];
        int y1=points[0][1];
        int x2=points[1][0];
        int y2=points[1][1];
        int x3=points[2][0];
        int y3=points[2][1];
       int dx1=(x2-x1);
       int dy1=(y2-y1);
       int dx2=(x3-x2);
       int dy2=(y3-y2);
       if (dx1*dy2!=dx2*dy1) {
        System.out.println("It is a Valid Traingle");
       }
       else{
        System.out.println("Not a Valid Triangle");
       }
    }
}
