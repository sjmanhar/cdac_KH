class Day3Q1{
	static void dups(int arr[], int n){
		int count[] = new int[n];
		
		for(int i=0;i<n; i++){
			count[arr[i]]++;
		}
		boolean itsdups = false;
		
		for(int i=0; i<n; i++){
			if(count[i]>1){
				System.out.print(i + " ");
				itsdups = true;
			}
		}
		if (!itsdups) {
            System.out.print("-1");
        }
		
    }
	public static void main(String[] args) {
        int arr1[] = {0, 3, 1, 2}; 
        int n1 = arr1.length; 
        dups(arr1, n1); //-1
        
        System.out.println(); 
        
        int arr2[] = {2, 3, 1, 2, 3};
        int n2 = arr2.length;
        dups(arr2, n2); //2 3

		
	}
}