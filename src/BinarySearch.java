/**
 * @Author: luohx
 * @Description: 二分法查找  要求：数组中元素是顺序的，没有重复数据  主要思想：对序列进行递归或循环查找  使用场景：数据量较大  时间复杂度：O（logn）
 * @Date: 2020/8/12 11:00
 * @Version: 1.0
 */
public class BinarySearch {

    /**
     * while循环方式
     */
    public static int circulateSearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (val == arr[mid]) {
                return mid;
            }
            if (val > arr[mid]) {
                low = mid + 1;
            }
            if (val < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 递归方式
     */
    public static int recursionSearch(int[] arr, int start, int end, int val) {
        int mid = (start + end) / 2;
        int index = -1;
        if (start < end) {
            if (arr[mid] == val) {
                index = mid;
            } else if (val < arr[mid]) {
                index = recursionSearch(arr, start, mid - 1, val);
            } else if (val > arr[mid]) {
                index = recursionSearch(arr, mid + 1, end, val);
            }
        }
        return index;
    }

}
