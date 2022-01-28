class Solution {
    public static int lengthOfLastWord(final String s) {
        final int length = s.length();
        int lastLen = 0;
        Boolean firstChar = false;
        for (int i = length - 1; i >= 0; i--) {
            final String subS = s.substring(i, i + 1);
            if (!subS.equals(" ")) {
                lastLen++;
                firstChar = true;
            } else if (firstChar) {
                break;
            } 
        }
        return lastLen;
    }
}
