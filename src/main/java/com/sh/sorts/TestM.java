package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 */
public class TestM
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{23,34,56,78,34,23,78,56,21};
        SortTemplate sortTemplate = new SelectionSort();
        sortTemplate.sort(a);
        sortTemplate.showResult(a);

        sortTemplate = new InsertionSort();
        sortTemplate.sort(a);
        sortTemplate.showResult(a);

        sortTemplate = new ShellSort();
        sortTemplate.sort(a);
        sortTemplate.showResult(a);


        sortTemplate = new MergeSort();
        sortTemplate.sort(a);
        sortTemplate.showResult(a);


        sortTemplate = new QuickSort();
        sortTemplate.sort(a);
        sortTemplate.showResult(a);

    }
}
