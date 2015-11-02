package leetcode.mediantwosortedarrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length+nums2.length; 
        int medianIndex=(totalLength)/2;
        int i=0, j=medianIndex;
        int lowerBound=0, higherBound= Math.min(medianIndex,nums1.length);

        while (true) {
            i=lowerBound+(higherBound-lowerBound)/2;
            j=medianIndex-i;
            if (get(nums1,i)>=get(nums2,j-1)) {
                if (get(nums2,j)>=get(nums1,i-1)) break;
                else higherBound=i-1;
            }
            else lowerBound=i+1;
        }
        if ((totalLength)%2==1) return Math.min(get(nums1,i),get(nums2,j)); //odd length
        return (double)(Math.min(get(nums1,i),get(nums2,j))+Math.max(get(nums1,i-1),get(nums2,j-1)))/2; //even length
    }
    private int get(int[] nums, int index) {
        if (index<0){ 
        	return Integer.MIN_VALUE;
        }
        if (index>=nums.length){
        	return Integer.MAX_VALUE;
        }
        return nums[index];
    }
    
    public static void main(String[] args){
    	MedianofTwoSortedArrays mta = new MedianofTwoSortedArrays();
    	System.out.println(mta.findMedianSortedArrays(new int[]{1,2,3,6,7,9,9}, new int[]{4,5}));
    }
}
