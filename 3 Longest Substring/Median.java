import java.util.ArrayList;

class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> aL= new ArrayList<>();
        int n = nums1.length+nums2.length;
        int total=0;
        int i =0;
      
        while(i<nums1.length){
        
                aL.add(nums1[i]);
        }
            i++;
           
        i=0; 
        while(i<nums2.length){
 

               aL.add(nums2[i]);
 
        }   
        i=0;
        while(i<aL.size()){
            total += aL.get(i);
        }
          int isOdd = (n+1)/2;
          double median;
          if((n+1)%2!=0){
            median = (aL.get(isOdd-1)+aL.get(isOdd));
          }
          else{
             median = aL.get(isOdd);
          }
          
             

        return median;

    }
}