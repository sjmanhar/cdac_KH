class Day3Q3{
	static void rearrange(int arr[], int n) {
        int left = 0, right = n - 1;
        
        while (left <= right) {
            // If left is negative, move forward
            if (arr[left] < 0) {
                left++;
            }
            // If right is positive, move backward
            else if (arr[right] >= 0) {
                right--;
            }
            // Swap when left is positive and right is negative
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;//-12 -6 -13 -5 -3 -7 5 6 11

        rearrange(arr, n);

        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}