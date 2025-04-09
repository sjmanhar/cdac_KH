class Day2Q4{
	static String rev(String s){
		if (s.length()== 0){
			return "";
		}
		return rev(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		String a= "CDACMumbai";
		String reverse = rev(a);
		System.out.println(reverse);
	}
}