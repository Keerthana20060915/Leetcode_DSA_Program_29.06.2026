class Solution {
    public void rotate(int[] nums, int k) {
        int numslength = nums.length;
        k %= numslength;
        int[] num = new int[k];
        int index = 0;
        if(numslength < k){
            System.out.print("Invalid");
        }
        for(int i=numslength-k; i < numslength; i++)
        {
            num[index] = nums[i];
            index++;
        }
        int[] arr = new int[numslength];
        int arrindex = 0,i,j;
        for(i =0; i<num.length;i++)
        {
            arr[arrindex] = num[i];
            arrindex++;

        }
        for(j=0;j<nums.length-k;j++)
        {
            arr[arrindex] = nums[j];
            arrindex++;

        }
        for(int l = 0;l<arr.length;l++)
        {
            nums[l] = arr[l];
        }
        
    }
}
