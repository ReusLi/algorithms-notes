import base.base;;

public class main {
    public static void main(String[] args) {
        selection();
        // insetion();
    }

    /**
     * 插入排序
     */
    public static void insetion() {
        Comparable[] arr = { "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };
        int N = arr.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && base.less(arr[j], arr[j - 1]); j--) {
                base.exch(arr, j, j - 1);
            }
        }
        base.show(arr);
    }

    /**
     * 选择排序
     */
    public static void selection() {
        Comparable[] arr = { 1, 9, 4, 2, 4, 7, 2, 3, 5, 2 };

        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (base.less(arr[j], arr[min]))
                    min = j;
            }
            base.exch(arr, i, min);
        }

        base.show(arr);
    }
}