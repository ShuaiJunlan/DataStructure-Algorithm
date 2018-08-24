int countBinarySubstrings(char* s) {
    int length = 0;
    //  get the length
    for(; s[length] != '\0'; length++);

    if(length < 2)
        return 0;
    int count = 0;

    int num_1 = 1;
    int num_0 = 1;
    int j = 0;
    for(; j < length - 1; j++)
    {
        if(s[j] == s[j+1])
            num_0++;
        else
            break;
    }
    for(int i = j + 1; i < length;)
    {
        int k = i;
        for(; k < length - 1; k++)
        {
            if(s[k] == s[k+1])
                num_1++;
            else
                break;
        }
        count = count + (num_0 < num_1 ? num_0 : num_1);
        i = i + num_1;
        num_0 = num_1;
        num_1 = 1;
    }
    return count;
}
