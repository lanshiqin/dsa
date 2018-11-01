package com.lanshiqin.stu01;


public class TimeStu {

    public static void main(String[] args) {
        System.out.println("时间复杂度");
    }

    /**
     * 在一个无需数组array中找到变量x所在的位置
     * n 表示数组的长度
     * @param array 数组
     * @param n 位置
     * @param x 变量
     * @return 变量所在位置
     */
    int find1 (int[] array, int n, int x){
        int i = 0;
        int pos = -1;
        // 时间复杂度为 O(n)
        for (;i<n;i++){
            if (array[i]==x){
                pos = i;
            }
        }
        return pos;
    }

    int find2 (int[] array, int n, int x){
        int i = 0;
        int pos = -1;
        // 最好情况时间复杂度 O(1)
        // 最坏情况时间负债度 O(n)
        for (; i<n;i++){
            if (array[i]==x){
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    int n = 1000;
    int[] array = new int[n];
    int count = 0;

    /**
     * 这段代码实现了一个往数组中插入数据的功能。
     * 当数组满了之后,也就是代码中的 count == array.length 时，我们用 for 循环遍历数组求和，并清空数组。
     * 将求和之后的 sum 值放到数组的第一个位置，然后再将新的数据插入，但是如果数组一开始就有空闲的空间，则直接将数据插入。
     * @param val 要插入的数据
     */
    void insert(int val){
        if (count== array.length){
            int sum = 0;

            for (int i=0; i< array.length; i++){
                sum = sum + array[i];
                array[i] = 0;
            }
            array[0] = sum;
            count = 1;
        }
        array[count] = val;
        count++;
    }

}
