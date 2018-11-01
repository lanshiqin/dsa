package com.lanshiqin.stu01;

/**
 * 作业：复杂度分析
 */
public class HomeWork {

    public static void main(String[] args) {

    }

    // 全局变量，大小为 10 的数组 array，长度 len，下标 i。
    int array[] = new int[10];
    int len = 10;
    int i = 0;

    // 往数组中添加一个元素
    void add(int element) {
        if (i >= len) { // 数组空间不够了
            // 重新申请一个 2 倍大小的数组空间
            int new_array[] = new int[len*2];
            // 把原来 array 数组中的数据依次 copy 到 new_array
            for (int j = 0; j < len; ++j) {
                new_array[j] = array[j];
            }
            // new_array 复制给 array，array 现在大小就是 2 倍 len 了
            array = new_array;
            len = 2 * len;
        }
        // 将 element 放到下标为 i 的位置，下标 i 加一
        array[i] = element;
        ++i;
    }

    // 1. 最好情况时间复杂度 O(1) ，数组空间足够,不进入if。
    // 2. 最坏情况时间复杂度 O(n) , 数组空间不足，进入for循环，len其实是个变量，每次空间不足都会增大为2n,忽略常数所以为 O(n)。
    // 3. 平均和均摊时间复杂度都是 O(1), 大多数情况下空间都足够都是 O(1)，少数情况是O（n)，所以平均均摊是 O(1)。

}
