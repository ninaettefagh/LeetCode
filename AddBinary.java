class AddBinary {
    public static String addBinary(String a, String b) {
        String sum = "";
        String nextDig;
        int carry = 0;
        while(a.length() > b.length()) {
            b = "0" + b;
        }
        while(a.length() < b.length()) {
            a = "0" + a;
        }

        for(int i = b.length()-1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == 0) nextDig = "0";
                else {
                    nextDig = "1";
                    carry = 0;
                }
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == 0) {
                    nextDig = "0";
                    carry = 1;
                } else {
                    nextDig = "1";
                }
            } else {
                if (carry == 0) {
                    nextDig = "1";
                } else {
                    nextDig = "0";
                    //carry = 1;
                }
            }
            sum = nextDig + sum;
        }
        if(carry == 1){
            sum = "1" + sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        String solution = addBinary("11", "1");
        System.out.println(solution);
    }
}