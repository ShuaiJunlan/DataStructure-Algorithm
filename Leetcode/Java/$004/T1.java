package $004;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:13 2017/10/13.
 */
class T1 {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m = num1.length, n = num2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        if (l == r){
            return getKth(num1, num2, 0 ,0, num1.length, num2.length, l);
        }else {
            return (getKth(num1, num2, 0 ,0, num1.length, num2.length, l) + getKth(num1, num2, 0 ,0, num1.length, num2.length, r)) / 2.0;
        }
    }

    public int getKth(int[] num1, int[] num2, int start1, int start2, int len1, int len2, int k){
         if (len1 > len2){
             return getKth(num2, num1, start2, start1, len2, len1, k);
         }
         if (len1 == 0){
             return num2[start2+k-1];
         }
         if (k == 1){
             return Math.min(num1[start1], num2[start2]);
         }
         int a = Math.min(k>>1, len1);
         int b = k - a;
         if (num1[start1+a-1] < num2[start2+b-1]){
             return getKth(num1, num2, start1 + a, start2, len1 - a, len2, k - a);
         }else if (num1[start1+a-1] > num2[start2+b-1]){
             return getKth(num1, num2, start1, start2+b, len1, len2 - b, k - b);
         }else {
             return num1[start1+a-1];
         }
    }
    public static void main(String[] args) {
        T1 solution = new T1();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,3};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
