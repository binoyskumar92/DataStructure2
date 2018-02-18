public class Sort012 {
    public static void main(String[] args) {
        int a[] = {0, 2, 1, 1, 2,2, 0, 0, 1};
        int l = 0, r = a.length - 1, mid = 0, temp = 0;
        while (mid <= r) {
            switch (a[mid]) {
                case 0: {
                    temp = a[l];
                    a[l] = a[mid];
                    a[mid] = temp;
                    mid++;
                    l++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[r];
                    a[r] = temp;
                    r--;
                    break;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
