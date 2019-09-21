package wangyi.solution4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private int sum = 0;
    private Map<Integer, Integer> map = new HashMap<>();

    public int help(int[] array) {
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        mergeSort(array, 0, array.length - 1);
        return sum;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int p1 = l, p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= r) {
            if (arr[p1] <= arr[p2]) {
                help[i++] = arr[p1++];
            } else {
                for (int tt = p1; tt <= mid; tt++) {
                    sum += Math.abs(map.get(arr[p2]) - map.get(arr[tt]));
                }
                help[i++] = arr[p2++];
            }

        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        if (help.length >= 0) System.arraycopy(help, 0, arr, l, help.length);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.help(arr));
    }
}
