/**
 * Return an array of arrays of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selectSort(int* nums, int numsSize);
int** threeSum(int* nums, int numsSize, int* returnSize) {
    int ** returnValue = (int **)malloc(sizeof(void*) * 10 * numsSize);
    int memblock = 1;

    *returnSize = 0;
    //int** returnValue = (int**)malloc(sizeof(int) * (*returnSize));
    //int returnValue[3][3];
    nums = selectSort(nums, numsSize);
    for(int i = 0; i < numsSize; i++)
    {
        if(i != 0 && nums[i] == nums[i-1])
        {
            continue;
        }

        int lo = i + 1, li = numsSize - 1;

        while(lo < li)
        {
            int num = nums[lo] + nums[li];
            if(nums[i] + num == 0)
            {
                int *data = (int*)malloc(3 * sizeof(int));
                data[0] = nums[i];
                data[1] = nums[lo];
                data[2] = nums[li];
                returnValue[*returnSize] = data;
                free(data);
                *returnSize += 1;
                //  check the memory space and if not enough, remalloc memory
                if (*returnSize >= 10 * numsSize * memblock)
                {
                    // memory enough
                    memblock += 1;
                    returnValue = (int **)realloc(returnValue, sizeof(void*) * 10 * numsSize * memblock);
                }

                while(lo < li && nums[lo+1] == nums[lo])
                {
                    lo++;
                }
                while(lo < li && nums[li-1] == nums[li])
                {
                    li--;
                }
                lo++;
                li--;
            }
            else if(num + nums[i] < 0)
            {
                lo++;
            }
            else
            {
                li--;
            }
        }

    }
    return returnValue;
}
int* selectSort(int* nums, int numSize)
{
    for(int i = 0; i < numSize; i++)
    {
        int index = i;
        for(int j = numSize - 1; j > i; j--)
        {
            if(nums[j] < nums[index])
            {
                index = j;
            }
        }
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
    return nums;
}
