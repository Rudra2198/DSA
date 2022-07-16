public class bs {
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,17,20,21,22,23,24,25,33,36,45,56,67,78,89,90};
        int target = 23;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //returns index and will return -1 if target is not found
    static int binarySearch(int[] arr, int target){

        int start = 0, end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
