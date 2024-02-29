public class crawlerFolder {
    public static void main(String[] args) {
        System.out.println("Crawler Folder LeetCode Problem");
        String logs[]={"./","../","./"};
        int depth=0;
        for (String log : logs) {
            if (log.equals("./")) {
                // Remain in Current Position
            }
            else if (log.equals("../") && depth>=0) {
                depth--;
            }
            else{
                depth++;
                System.out.println("condition for and depth value log="+log+" "+depth);
            }
        }
        System.out.println(depth);
    }
}
