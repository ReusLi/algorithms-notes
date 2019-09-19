import base.base;;

public class main {
    public static void main (String[] args) {
        quikeSort();
        // selection();
    }

    /**
     * 插入排序
     */
    public static void selection() {
        Comparable[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        int N = arr.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && base.less(arr[j], arr[j-1]); j--) {
                base.exch(arr, j, j-1);
            }
        }
        base.show(arr);
    }

    /**
     * 快速排序
     */
    public static void quikeSort() {
        Comparable[] arr = { 1, 9, 4, 2, 4, 7, 2, 3, 5, 2 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (base.less(arr[j], arr[i])){
                    temp = (int)arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        base.show(arr);
    }
}