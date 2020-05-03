//public class MainCLass {
//
//    public static void main(String[] args) {
//
//        linearSearch(5,5,5);
//
//    }
//
//
//    public static boolean linearSearch(int A[], int length, int item) {
//        for (int i = 0; i < length; ++i)
//            if (item == A[i])
//                return true;                // Item is found in array A
//        return false;                        // Item is not found in array A
//    }
//
//    public void look(){
//
//        int[] array = new int[6];
//        array[0] = 3;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 4;
//        array[4] = 6;
//        array[5] = 5;
//
//        int temp;
//        for (int i = 0; i < array.length; i++) {
//            if (i != array.length - 1) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//        }
//
//
//        for (int item : array
//        ) {
//            System.out.println(item);
//
//        }
//
//    }
//
//
//}
