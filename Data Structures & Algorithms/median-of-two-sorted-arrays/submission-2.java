class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int[] merged = new int[len1 + len2];
        // imp
        System.arraycopy(nums1, 0, merged, 0 , len1);
        System.arraycopy(nums2, 0 , merged, len1, len2);

        Arrays.sort(merged);

        //[1,3] and [2,4] -> [3,4,2,4]; -> [2,3,4,4]

        //median -> %2 ==0 -> , even 
        //median

        if(merged.length % 2 == 0)
        {
           return (merged[merged.length /2 -1] + merged[merged.length/2]) / 2.0;
        } 
        else{
            return merged[merged.length/2];
        }
    }
}
