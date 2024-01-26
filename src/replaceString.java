public class replaceString {
    public static int charToIdx(char c){
        switch (c) {
            case 'Q':
                return 0;
            case 'W':
                return 1;
            case 'E':
                return 2;  
        }
        return 3;
    }
    public static void main(String[] args) {
        System.out.println("Replace String with balanced String leetcode");
        String s="QQWE";
        int n=s.length();
        int required=n/4;
        int freq[]=new int[4];
        
        for (int i = 0; i < n; i++) {
            ++freq[charToIdx(s.charAt(i))];
        }
        // Here my Frequency array is made and it contains all frequencies of letter
        // 2) Determine the ones we need to change
        boolean equals=true;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]!=required) {
                equals=false;
            }
            freq[i]=Math.max(0, freq[i]-required);
        }
        System.out.println();
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i]+" ");
        }
        int start = 0;
        int minLen = n; // Maximum will only ever be N
        
        for(int end = 0; end < n; ++end) {
            char c = s.charAt(end);
            --freq[charToIdx(c)];
            
            while(fulfilled(freq)) {
                minLen = Math.min(end - start + 1, minLen);

                char st = s.charAt(start);
                ++freq[charToIdx(st)];
                ++start;
            }
        }
        
       


    }
}
