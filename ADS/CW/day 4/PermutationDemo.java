class PermutationDemo{
	static void display(String str,String res){
		if(str.length() == 0){
			System.out.println(res+"");
			return;
		}
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			display(ros,res+ch);
			
		}
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		//Permutations: 6 different ways= 3!
		//Time complexity = O(n!)
		display(s,"");
		//
		
			
		
		
		
	}
}
/*
ABCD
ABDC
ACBD
ACDB
ADBC
ADCB
BACD
BADC
BCAD
BCDA
BDAC
BDCA
CABD
CADB
CBAD
CBDA
CDAB
CDBA
DABC
DACB
DBAC
DBCA
DCAB
DCBA
*/