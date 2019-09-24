import base.base;;

public class main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // selection();
        // insetion();
        shell();
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
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

    /**
     * 希尔排序
     */
    public static void shell() {
        // len = 16
        Comparable[] a = { "S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };

        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;

        // h = 13
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                System.out.println("*******start*******");
                // 将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]...之中
                for (int j = i; j >= h && base.less(a[j], a[j - h]); j -= h) {
                    base.exch(a, j, j - h);
                    // base.show(a);
                    System.out.println("=======");
                    System.out.println(j);
                    System.out.println(h);
                    System.out.println("=======");
                    System.out.println("");
                }
                System.out.println("*******end*******");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
            h = h / 3;
        }
    }
}