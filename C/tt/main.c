#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
double findKthValue(int* A, int aStart, int aSize, int* B, int bStart, int bSize, int k);
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int L = (nums1Size + nums2Size + 1) >> 1;
    int R = (nums1Size + nums2Size + 2) >> 1;
    //printf("L:%d ; R:%d \n", L, R);
    return (findKthValue(nums1, 0, nums1Size, nums2, 0, nums2Size, L)+ findKthValue(nums1, 0, nums1Size, nums2, 0, nums2Size, R)) / 2.0;
}
double findKthValue(int* A, int aStart, int aSize, int* B, int bStart, int bSize, int k){
    if(aStart > aSize - 1) return *(B + bStart + k - 1);
    if(bStart > bSize - 1) return *(A + aStart + k - 1);
    if(k == 1) return *(A + aStart) < *(B + bStart) ? *(A + aStart) : *(B + bStart);
    int aMid = INT_MAX , bMid = INT_MAX ;

    if(aStart + k/2 - 1 < aSize) aMid = *(A + aStart + k/2 - 1);
    if(bStart + k/2 - 1 < bSize) bMid = *(B + bStart + k/2 - 1);
    if(aMid < bMid)
        return findKthValue(A, aStart + k/2, aSize, B, bStart, bSize, k - k/2);
    else
        return findKthValue(A, aStart, aSize, B, bStart + k/2, bSize, k - k/2);
}

int main()
{
    int nums1[] = {1};
    int nums2[] = {2};
    printf("%f \n", findMedianSortedArrays(nums1, 1, nums2, 1));
    return 0;
}

