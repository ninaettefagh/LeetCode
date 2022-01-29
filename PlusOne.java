
class PlusOne {
    public static int[] plusOne(int[] digits) {
        int digit = digits.length - 1;
        if(digits[digit] != 9) {
            digits[digit] ++;
            return digits;
        }
        while (digits[digit] == 9) {
            digits[digit] = 0;
            digit = digit - 1;

            if (digit < 0) {
                int[] newDig = new int[digits.length + 1];
                newDig[0] = 1;
                System.arraycopy(digits, 0, newDig, 1, digits.length);
                return newDig;
            }
            if(digits[digit] != 9){
                digits[digit] ++;
                break;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[2];

        nums[0] = 8;
        nums[1] = 9;

        int[] solution = plusOne(nums);
        System.out.println(solution);
    }
}