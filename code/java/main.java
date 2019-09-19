import base.base;;

public class main {
    public static void main (String[] args) {
        Comparable[] arr = { 1, 9, 4, 2, 4, 7, 2, 3, 5, 2 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0){
                    temp = (int)arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        base.show(arr);
    }
}