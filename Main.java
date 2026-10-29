import java.util.*;
public class Main {
public static void main(String[] args) {
        int[] a = {38, 9, 45, 35, 40, 53, 46, 48};
        Arrays.sort(a);
        int lo = 0, hi = a.length - 1, found = -1;
        while (lo <= hi) {
        int mid = (lo + hi) / 2;
        if (a[mid] == 38) {
                found = mid;
                break;
        } else if (a[mid] < 38) {
                lo = mid + 1;
        } else {
                hi = mid - 1;
        }
        }
        System.out.println(found);
}
}