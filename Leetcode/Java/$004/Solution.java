package $004;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 22:07 2017/10/11.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || (nums1.length == 0 && nums2.length == 0))
            return 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 + length2;
        if (length1 == 0) {
            if ((length2 & 1) == 0)
                return (nums2[length2 >> 1] + nums2[(length2 >> 1) - 1]) / 2.0;
            else
                return nums2[length2 >> 1];
        }
        if (length2 == 0) {
            if ((length1 & 1) == 0)
                return (nums1[length1 >> 1] + nums1[(length1 >> 1) - 1]) / 2.0;
            else
                return nums1[length1 >> 1];
        }
        if ((nums1[0] <= nums1[length1 - 1] && nums2[0] <= nums2[length2 - 1]) || (nums1[0] >= nums1[length1 - 1] && nums2[0] >= nums2[length2 - 1])) {
            return getMidValueByOne(nums1, nums2);
        } else {
            return getMidValueByTwo(nums1, nums2);
        }
    }

    public double getMidValueByOne(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 + length2;
        if (nums1[0] <= nums1[length1 - 1] && nums2[0] <= nums2[length2 - 1]) {
            if ((length & 1) == 0) {
                int i = 0, j = 0;
                int temp = 0, temp1;
                while ((i + j) != length >> 1) {
                    if (i == length1) {
                        temp = nums2[j];
                        j++;
                    } else if (j == length2) {
                        temp = nums1[i];
                        i++;
                    } else if (nums1[i] <= nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                if (i == length1)
                    temp1 = nums2[j];
                else if (j == length2)
                    temp1 = nums1[i];
                else
                    temp1 = nums1[i] < nums2[j] ? nums1[i] : nums2[j];

                return (temp + temp1) / 2.0;
            } else {
                int i = 0, j = 0;
                int temp = 0;
                while ((i + j) != (length >> 1) + 1) {
                    if (i == length1) {
                        temp = nums2[j];
                        j++;
                    } else if (j == length2) {
                        temp = nums1[i];
                        i++;
                    } else if (nums1[i] <= nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                return temp;
            }
        } else {
            if ((length & 1) == 0) {
                int i = 0, j = 0;
                int temp = 0, temp1;
                while ((i + j) != length >> 1) {
                    if (i == length1) {
                        temp = nums2[j];
                        j++;
                    } else if (j == length2) {
                        temp = nums1[i];
                        i++;
                    } else if (nums1[i] >= nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                if (i == length1)
                    temp1 = nums2[j];
                else if (j == length2)
                    temp1 = nums1[i];
                else
                    temp1 = nums1[i] > nums2[j] ? nums1[i] : nums2[j];

                return (temp + temp1) / 2.0;
            } else {
                int i = 0, j = 0;
                int temp = 0;
                while ((i + j) != (length >> 1) + 1) {
                    if (i == length1) {
                        temp = nums2[j];
                        j++;
                    } else if (j == length2) {
                        temp = nums1[i];
                        i++;
                    } else if (nums1[i] >= nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                return temp;
            }
        }

    }

    public double getMidValueByTwo(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        if (nums1[0] > nums1[length1 - 1] && nums2[0] < nums2[length2 - 1]) {
            int num[] = nums1;
            nums1 = nums2;
            nums2 = num;
        }
        length1 = nums1.length;
        length2 = nums2.length;
        int length = length1 + length2;
        if ((length & 1) == 0) {
            int i = 0, j = length2 - 1;
            int temp = 0, temp1;
            while ((i + length2 - j - 1) != length >> 1) {
                if (i == length1) {
                    temp = nums2[j];
                    j--;
                } else if (j == -1) {
                    temp = nums1[i];
                    i++;
                } else if (nums1[i] <= nums2[j]) {
                    temp = nums1[i];
                    i++;

                } else {
                    temp = nums2[j];
                    j--;
                }
            }
            if (i == length1)
                temp1 = nums2[j];
            else if (j == -1)
                temp1 = nums1[i];
            else
                temp1 = nums1[i] < nums2[j] ? nums1[i] : nums2[j];
            return (temp + temp1) / 2.0;
        } else {
            int i = 0, j = length2 - 1;
            int temp = 0;
            while ((i + (length2 - j - 1)) != (length >> 1) + 1) {
                if (i == length1) {
                    temp = nums2[j];
                    j--;
                } else if (j == length2) {
                    temp = nums1[i];
                    i++;
                } else if (nums1[i] <= nums2[j]) {
                    temp = nums1[i];
                    i++;
                } else {
                    temp = nums2[j];
                    j--;
                }
            }
            return temp;
        }
    }

    public double findMedianSortedArrays1(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }

    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) return B[bStart + k - 1];
        if (bStart > B.length - 1) return A[aStart + k - 1];
        if (k == 1) return Math.min(A[aStart], B[bStart]);

        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < A.length) aMid = A[aStart + k / 2 - 1];
        if (bStart + k / 2 - 1 < B.length) bMid = B[bStart + k / 2 - 1];

        if (aMid < bMid)
            return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check: aRight + bLeft
        else
            return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check: bRight + aLeft
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        /*
        int nums1_1[] = {1};
        int nums1_2[] = {2};
        System.out.println(solution.findMedianSortedArrays(nums1_2, nums1_1));
        System.out.println(solution.findMedianSortedArrays(nums1_1, nums1_2));

        int nums2_1[] = {1,2,5,7};
        int nums2_2[] = {2,3,6,8};
        System.out.println(solution.findMedianSortedArrays(nums2_2, nums2_1));
        System.out.println(solution.findMedianSortedArrays(nums2_1, nums2_2));

        int nums4_1[] = {7,5,2,1};
        int nums4_2[] = {8,6,3,2};
        System.out.println(solution.findMedianSortedArrays(nums4_2, nums4_1));
        System.out.println(solution.findMedianSortedArrays(nums4_1, nums4_2));
        */

        int nums3_1[] = {1, 2, 4, 6, 8};
        int nums3_2[] = {8, 6, 3, 2};
        System.out.println(solution.findMedianSortedArrays(nums3_2, nums3_1));
        System.out.println(solution.findMedianSortedArrays(nums3_1, nums3_2));


//    }
    }
}
