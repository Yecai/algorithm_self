package data_structures_and_algorithms_in_java.c3_easy_sort;

/**
 */
public class ArrayBub {
    private long[] a; //数组
    private int mElems; //数据个数

    public ArrayBub(int maxSize) {
        a = new long[maxSize];
        mElems = 0;
    }

    public void insert(long i) {
        a[mElems] = i;
        mElems++;
    }

    public void display() {
        for (int j = 0; j < mElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    public void bubbleSort() {
        System.out.println("冒泡排序");
        for(int k = (mElems - 1); k > 1; k--) {
            for(int j = 0; j < k; j++) {
                if (a[j] > a[j+1]) {
                    swap(j, j+1);
                }
            }
        }

    }

    private void swap(int m, int n) {
        long t = a[n];
        a[n] = a[m];
        a[m] = t;
    }

    public void selectionSort() {
        System.out.println("选择排序");
        for (int i = 0; i < (mElems - 1); i++) {
            int min = i;
            for (int j = (i + 1); j < mElems; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    public void insertionSort() {
        System.out.println("插入排序");

    }
}
