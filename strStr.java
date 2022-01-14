public class strstr {
    public static int strStr(String haystack, String needle) {

        int lengthHay = haystack.length();
        int lengthNee = needle.length();

        if(lengthNee > lengthHay){
            return -1;
        }

        if(needle.isEmpty()){
            return 0;
        }

        int j = 0;
        for(int i=0; i<lengthHay; i++){
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(i+lengthNee > lengthHay){
                    return -1;
                }
                int size = 0;
                for(int k=0; k<lengthNee; k++){
                    if(haystack.charAt(i+k) != needle.charAt(k)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == lengthNee){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int solution = strStr("mississippi", "issip");
        System.out.println(solution);

    }

}
