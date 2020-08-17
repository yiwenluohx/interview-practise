/**
 * @Author: luohx
 * @Description: 归并排序和快排
 * @Date: 2020/8/13 10:09
 * @Version: 1.0
 */
public class Sort {

    /**
     * 归并排序时间复杂度：O(n*lgn)
     */
    public static void mergeSort(int[] a, int start, int end) {
        if (start == end) return;
        int middle = (start + end) / 2;
        mergeSort(a, start, middle);
        mergeSort(a, middle + 1, end);
        merge(a, start, end, middle);
    }

    private static void merge(int[] a, int start, int end, int middle) {
        int[] temp = new int[end - start + 1];
        int i = start, j = middle + 1, k = 0;
        while (i <= middle && j <= end) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = a[i++];
        }

        while (j <= end) {
            temp[k++] = a[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            a[start + x] = temp[x];
        }
    }


    /**
     * 快速排序的时间复杂度：O(n*lgn)
     */
    public static void quickSort(int[] a, int start, int end) {
        int baseNum = a[start];
        int i = start, j = end, midNum;
        while (i <= j) {
            while (a[i] < baseNum && i < end) {
                i++;
            }
            while (a[j] > baseNum && j > start) {
                j--;
            }
            if (i <= j) {
                midNum = a[i];
                a[i] = a[j];
                a[j] = midNum;
                i++;
                j--;
            }
        }
        if (start < j) {
            quickSort(a, start, j);
        }
        if (i < end) {
            quickSort(a, i, end);
        }
    }

    /**
     * 合并两个有序集合
     */
    public static int[] mergeArr(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k++] = a[i++];
            } else if (a[i] == b[j]) {
                res[k++] = a[i++];
                res[k++] = b[j++];
            } else {
                res[k++] = b[j++];
            }
        }
        while (i < a.length) {
            res[k++] = a[i++];
        }
        while (j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }

}
