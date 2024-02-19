import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class integerToRoman {
    public static void main(String[] args) {
        System.out.println("Integer To Roman LeetCode Problem ");

        StringBuilder sb=new StringBuilder();
        
        int num=3;
        while (num>0) {
            if (num>=4 && num<5) {
                sb.append("IV");
                num-=4;
            }
            else if (num>=9 && num<10) {
                sb.append("XI");
                num-=9;
            }
            else if (num>=40 && num<50) {
                sb.append("XL");
                num-=40;
            }
            else if (num>=90 && num<100) {
                sb.append("XC");
                num-=90;
            }
            else if (num>=400 && num<500) {
                sb.append("CD");
                num-=400;
            }
            else if (num>=900 && num<1000) {
                sb.append("CM");
                num-=900;
                }
                else if (num>=1000) {
                    sb.append('M');
                    num-=1000;
                }
                else if (num>=500) {
                    sb.append('D');
                    num-=500;
                }
                else if (num>=100) {
                    sb.append('C');
                    num-=100;
                }
                else if (num>=50) {
                    sb.append('L');
                    num-=50;
                }
                else if (num>=10) {
                    sb.append('X');
                    num-=10;
                }
                else if (num>=5) {
                    sb.append('V');
                    num-=5;
                }
                else if (num>=1) {
                    sb.append('I');
                    num-=1;
                }
            }
            System.out.println(sb.toString());
        }
    }

