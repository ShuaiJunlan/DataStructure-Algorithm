//Hints: The algorithm aims to remove all elements from array which equal to val
//and mustn't allocate extra memory spaces, so we should move forward the other elements and
//return the new length of the array.
int removeElement(int* nums, int numsSize, int val) {
    int j = 0;
    for(int i = 0; i < numsSize; i++)
    {
        if(nums[i] != val)
        {
            nums[j++] = nums[i];
        }
    }
    return j;
}
