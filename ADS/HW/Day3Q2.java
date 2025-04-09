class Day3Q2{
	static int search(int arr[], int x){
		int n = arr.length;
		for(int i= 0; i<n; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}
	 public static void main(String[] args) {
		 int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        
      //int x1 = 110; //index: 6
	  int x1 = 175; //index: -1
		int index = search(arr, x1);
		System.out.println("index: " + index);
	 }
}