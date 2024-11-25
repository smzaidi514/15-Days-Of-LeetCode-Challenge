public class Solution{
    public static void main(String []args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);

        System.out.println("Unique Elements: " + k);
        System.out.println("Array after removing duplicates: " );
        for (int i = 0; i < k  ; i++){
            System.out.print(nums[i] + ",");
        }
    }
public static int removeDuplicates(int [] nums){
    int length = nums.length;
    int uniqueNum = 0;
    for (int i=0; i< length; i++){
        if(nums[i] != nums[uniqueNum]){
            uniqueNum++;
            nums[uniqueNum] = nums[i];
        }
    }
    return uniqueNum + 1;
}
}