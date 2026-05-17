class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int n=0;
        int[] arr=new int[nums.length*2];
        arr[n]=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                arr[n++]=count;
                count=0;
            }
        }
        arr[n]=count;
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}