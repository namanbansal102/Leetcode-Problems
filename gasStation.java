public class gasStation {
    public static void main(String[] args) {
        System.out.println("Gas Station Leetcode Problem");
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int n=gas.length;
        int temp=0;
        int index=0;
        int total=0;
        for (int i = 0; i < n; i++) {
            int diff=gas[i]-cost[i];
            System.out.println("Value of dif is:"+diff);
            total+=diff;
            System.out.println("Value of Total Fuel is:"+total);
            temp+=diff;
            System.out.println("Value of Temp is:"+temp);
            if (temp<0) {

                System.out.println("Value of temp is zero for index="+index);
                index=i+1;
                System.out.println("Value of temp then increase to index="+index);
                temp=0;
            }
        }
        System.out.println(total>0?index:-1);

        
    }
    
}
