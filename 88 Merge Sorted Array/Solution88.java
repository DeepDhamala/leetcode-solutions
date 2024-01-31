import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>(m+n);
        int i=0, j=0;
        while(i<m || j< n) {
            if (i==m && j<nums2.length) {
                list.add(nums2[j]);
                j++;
            }
            if (i<m && i < nums1.length) {
                list.add(nums1[i]);
                i++;
            }
        }
        Collections.sort(list);
        for (int k=0; k<m+n; k++){
            nums1[k] = list.get(k);
        }

    }
}
