public class searchInRange {
    public static void main(String[] args) {

        int[] num = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(inRange(num,11,7,13));
    }

    static boolean inRange(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return false;
        }

        for (int index = start; index <= end; index++) {

            int element = arr[index];
            if (element == target) {
                return true;
            }
        }

        return false;
    }
}
