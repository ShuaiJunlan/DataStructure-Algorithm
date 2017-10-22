int countBinarySubstrings(char* s) {
    int length = sizeof(s) / sizeof(char);
    if(length < 2)
        return 0;
    int count = 0;
    for(int i = 0; i < length; i++)
    {
        int num_1 = 0;
        int num_0 = 0;
        for(int j = i; j < length; j++)
        {
            num_1++;
            if(s[j] == s[j+1])
                num_1++;
            else
                num_0++;

        }
        if(s[i+1] == s[i])
            continue;
        else

        for(int j = )
    }
}
