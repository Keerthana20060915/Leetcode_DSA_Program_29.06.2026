class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr3 = new int[m+n];
        int index = 0,i =0, j =0;
        while(i<m && j<n)
        {
            if(nums1[i] > nums2[j])
            {
                arr3[index] = nums2[j];
                index++;
                j++;
            }
            else
            {
                arr3[index] = nums1[i];
                index++;
                i++;
            }
        }
        while(j<n)
        {
            arr3[index] = nums2[j];
                index++;
                j++;
        }
        while(i<m)
        {
            arr3[index] = nums1[i];
                index++;
                i++;
        }
        for(int k = 0; k < m + n; k++)
        {
            nums1[k] = arr3[k];
        }
        
    }
}
