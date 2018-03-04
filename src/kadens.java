import java.util.Scanner;

public class kadens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[];
        int n = in.nextInt();
        int l = 0, r = 0, suml = 0, sumr = 0;
        while (n > 0) {
            int size = in.nextInt();
            arr = new int[size];
            l = 0;
            r = size - 1;
            while (size > 0) {
                arr[l++] = in.nextInt();
                size--;
            }
            size = arr.length;
            l = 0;
            suml = 0;
            sumr = 0;
            while (size > 0 && l<=r) {
                suml += arr[l++];
                sumr += arr[r--];
                if (suml == sumr) {
                    System.out.println(l + 1);
                    break;
                }
                size--;
            }
            n--;
        }
    }
}
