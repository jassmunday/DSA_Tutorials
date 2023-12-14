public class floorOfaNumber {
    static int binarySearch(int[] piles, int h) {
        int start = 0;
        int end = piles.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (h < piles[mid]) {
                end = mid - 1;
            } else if (h > piles[mid]) {
                start = mid + 1;
            } else {
                h = piles[mid];
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {

    }
}
