public class CheckSortedArray {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7};
        int[] ar2 = {1, 2, 3, 4, 8, 5, 6, 7};

        System.out.println(checkSorted(ar1, 0, ar1.length-1));
        System.out.println(checkSorted(ar2, 0, ar2.length-1));
    }

    private static boolean checkSorted(int[] ar, int index, int end) {
        if(index < end) {
            if(ar[index] <= ar[end]) {
                return checkSorted(ar, index+1, end);
            } else {
                return false;
            }
        }
        return true;
    }
}
