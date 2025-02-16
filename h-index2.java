class Solution {
    // Time Complexity:O(logn)
    // Space Complexity:O(1)
    public int hIndex(int[] citations) {
        if (citations.length ==0)
       return 0; 
        int res = 0;
        int len = citations.length;
    //    for (int i =len-1;i >= 0 ;i--){
    //     int noOfPapers = len - i;
    //     if (citations[i] >= noOfPapers){
    //         res = Math.max (res,noOfPapers);
    //     }
    //    }
    int l = 0;
    int h = len-1;
    while (l<=h){
        int mid = l+(h-l)/2;
        if (citations[mid]>= len-mid){
            h = mid-1;
        } else{ 
            l = mid+1;
        } 
    }
       return len-l;
        }
}
