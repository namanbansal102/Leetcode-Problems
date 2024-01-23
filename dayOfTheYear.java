public class dayOfTheYear {
    public static void main(String[] args) {
        System.out.println("Days of The Year LeetCode Problem");
        String date="2019-02-10";
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String arr[]=date.split("-");
        int year=0;
        int month=0;
        int day=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                int num=(int)(arr[i].charAt(j)-'0');
                if (i==0) {
                    
                    year=year*10+num;
                }
                else if (i==1) {
                    month=month*10+num;
                    System.out.println("Value of month is:"+month);
                    
                }
                else{
                    day=day*10+num;
                }
            }
        }
        System.out.println("year"+year);
        System.out.println("month"+month);
        System.out.println("day"+day);
        if ((year%4==0 && year%100!=0) || year%400==0) {
            days[2]=days[2]+1;
        }
        int tDays=0;
        for (int i = 0; i <month; i++) {
            tDays+=days[i];
        }
        System.out.println(tDays+day);

    }
}
