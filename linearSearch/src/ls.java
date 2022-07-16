public class ls {

    public static void main(String[] args) {

        int num[] = {76, 43, 23, -6, 99, 23, 8, 21};
        int target = 8;
        int ans = linearSearch(num,target);

        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int element : arr) {

            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
