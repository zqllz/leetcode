public class of069 {

    public static void main(String[] args) {
        System.out.println(new of069().peakIndexInMountainArray(new int[]{0,1,0}));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length;
        int mid;
        while (i < j) {
            mid = (i + j) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                j = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                i = mid;
            }
        }
        return 0;
    }
}
