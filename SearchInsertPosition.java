class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int mid = (size)/2;
        if(target <= nums[0]){
            return 0;
        } else if(target == nums[mid]){
            return mid;
        }else if(target < nums[mid]){
            for(int i=0; i<mid; i++){
                if(target >= nums[i] && target < nums[i+1]){
                    if(target != nums[i]){
                        i++;
                    }
                    return i;
                }
            }
        } else{
            for(int j=mid; j<size; j++){
                if(j == size-1){
                    if(target == nums[j]){
                        return j;
                    } else break;
                }
                if(target >= nums[j] && target < nums[j+1]){
                    if(target != nums[j]){
                        j++;
                    }
                    return j;
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;

        int target = 5;
        int solution = searchInsert(nums, target);
        System.out.println(solution);
    }
}