public class min {
    public static void main(String[] args) {

        int[] arr = {2, 6, 7, 3, 10, 9, 8, -1, -256, -78, 200};
        System.out.println(min(arr));

    }

    static int min(int[] arr) {
        int ans = arr[0];

        // returns the minimum value in the array
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}