package com.sh.offer.$20;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:22 2017/2/17.
 */
public class $20
{
    public static void printMatrixInCircle(int[][] numbers, int columns, int rows, int start)
    {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;
        //  从左到右打印一行
        for (int i = 0; i < columns - 2 * start; i++)
        {
            System.out.println(numbers[start][start + i] + " ");
        }
        if (start < endY)
        {
            //  从上到下打印一列
            for (int i = 1; i < rows - 2 * start; i++)
            {
                System.out.println(numbers[start + i][columns - start - 1] + " ");
            }
        }

        if (start < endX && start < endY)
        {
            //  从右到左打印一行
            for (int i = columns - start - 2; i > start - 1; i--)
            {
                System.out.println(numbers[rows - start - 1][i] + " ");
            }
        }

        if (start < endX && start < endY - 1)
        {
            //  从下到上打印一行
            for (int i = rows - start - 2; i > start - 1; i--)
            {
                System.out.println(numbers[i][start] + " ");
            }
        }
    }

    public static void printMatrixClockwisely(int[][] numbers, int columns, int rows)
    {
        if (numbers == null || columns <= 0 || rows <= 0)
            return;
        int start = 0;
        while (columns > 2 * start && rows > 2 * start)
        {
            printMatrixInCircle(numbers, columns, rows, start);
            start++;
        }
    }

    public static void main(String[] args)
    {
//        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] numbers = {{1}};
        int[][] numbers = {{1, 2, 3}};
        printMatrixClockwisely(numbers, 3, 1);

    }
}
