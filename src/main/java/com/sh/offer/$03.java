package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:12 2017/1/17.
 *
 * 已知二维数组@matrix，行数为@rows，列数为@columns，找出目标数@number，
 *  存在返回@true，不存在返回@false
 */
public class $03
{
    /**
     * 算法实现在已知数组（满足：每一行从左到右逐渐递增，每一列从上到下逐渐递增）中找出目标数@target：
     *  先取出数组中最右上角的那个数@res，
     *  比较res与target的大小，
     *  若res=target，则直接执行result=true，退出循环
     *  若res>target，说明res所在列的所有数都大于target，因此执行--columns，
     *  若res<target，说明res所在行的所有数都小于target，因此执行++rows，
     *  退出循环的条件为：row<rows && columns>0
     *  最后返回结果
     * @param matrix    二维数组
     * @param rows      行数
     * @param columns   列数
     * @param number    待查找的目标数
     * @return  返回结果，存在返回@true，不存在返回@false
     */
    public static boolean find(int[][] matrix, int rows, int columns, int number)
    {
        boolean result = false;                                 //  返回结果变量
        if (matrix.length != 0 && rows > 0 && columns > 0)      //  判断是否是一个二维数组
        {
            --columns;
            int row = 0;
            while (row < rows && columns >= 0)
            {
                if (matrix[row][columns] == number)
                {
                    result = true;
                    break;
                } else if (matrix[row][columns] > number)
                    --columns;
                else                                    //  matrix[row][columns] < number
                    ++row;
            }
        }
        return result;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args)
    {
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean c = find(a, 4, 4, 0);
        System.out.println(c);
    }
}
