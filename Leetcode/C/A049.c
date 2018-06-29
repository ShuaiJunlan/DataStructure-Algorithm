/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *columnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
char*** groupAnagrams(char** strs, int strsSize, int** columnSizes, int* returnSize) {

}
// The string sort algorithm is only suitable for lower-case string.
char* strSort(char* str)
{
    int count[26] = {0};
    int length = strlen(str);
    for(int i = 0; i < length; i++)
    {
        count[str[i]-'a']++;
    }
    int p = 0;
    char* result = (char*)malloc(length);
    for(int j = 0; j < 26; j++)
    {
        for(int k = 0; k < count[j]; k++)
        {
            result[p++] = (char)(j+'a');
        }
    }
    return result;
}
