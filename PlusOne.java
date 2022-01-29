class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int sizeAfter = 0;
        if (nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[sizeAfter] = nums[i];
                sizeAfter++;
            }
        }

        for(int j=0; j<sizeAfter; j++) {
            System.out.println("NUMS[J] " + nums[j]);
            System.out.println("J VAL " + j );
        }

        return sizeAfter;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];


        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        int target = 1;
        int solution = removeElement(nums, target);
        System.out.println(solution);
    }
}