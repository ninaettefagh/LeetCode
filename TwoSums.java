class Solution{
    public static int[] twoSums(int[] nums, int target){
        int[] retValue = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            int findNum = target - nums[i];
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] == findNum) {
                    retValue[0] = i;
                    retValue[1] = j;
                    return retValue;
                }
            }
        }
        return retValue;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 2;
        int target = 6;
        int[] solution = twoSums(nums, target);
        System.out.println("[" + solution[0] + "," + solution[1] + "]");
        return;
    }
}