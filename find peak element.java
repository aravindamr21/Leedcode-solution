class Solution {
    public int findPeakElement(int[] a) {
        int n = a.length;
        int s = 0, e = n - 1, mid;

        while (s <= e) {
            mid = s + (e - s) / 2;

            if ((mid - 1 < 0 || a[mid - 1] < a[mid]) && (mid + 1 >= n || a[mid + 1] < a[mid])) {
                return mid;  
            } else if (mid - 1 >= 0 && a[mid - 1] > a[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
