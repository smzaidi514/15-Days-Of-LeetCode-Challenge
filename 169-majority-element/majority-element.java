class Solution {
    public int majorityElement(int[] nums) {
        //Using Boyer- Moore Voting Algorithm
        int count =0; 
        int candidate = 0;

        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1:-1;
        }
        return candidate;
    }
}