public class MedianSolution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] mergedNums = merge(nums1, nums2);
    if(mergedNums.length % 2 ==1){
        return mergedNums[mergedNums.length /2];
    }
    return ((double)mergedNums[mergedNums.length/2] + (double)mergedNums[(mergedNums.length/2) -1]) /2;
  }
  public int[] merge(int[] nums1, int[] nums2) {
    int[] mergedNums = new int[nums1.length + nums2.length];
    
    int i = 0, j = 0, k = 0;
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            mergedNums[k] = nums1[i];
            i++;
        } else {
            mergedNums[k] = nums2[j];
            j++;
        }
        k++;
    }

    while (i < nums1.length) {
        mergedNums[k] = nums1[i];
        i++;
        k++;
    }

    while (j < nums2.length) {
        mergedNums[k] = nums2[j];
        j++;
        k++;
    }

    return mergedNums;
}

}
