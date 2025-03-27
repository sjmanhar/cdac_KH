class StrDemo{
	public static void main(String...args){
		//method 1: constants defined
		String s1 = "ABC";//STRING LITERAL
		String s2 = "ABC";
		String s3 = "ABCD";//STRING LITERAL
		String s4 = "ABCD";
		// will compatr refernce content, not object content (values)
		System.out.println((s1==s2)); // true
		System.out.println((s3==s4)); // true
		System.out.println((s1==s4)); // false 
         //method2:  alocated dynamic memory
        String s5 = new String("ABC");		
        String s6 = new String("ABCD");		
		System.out.println((s5==s6)); // false 
		System.out.println((s3==s6)); // false 
		//.equals (): comaprring values of refrence
		System.out.println((s1.equals(s5))); // true 
		System.out.println((s5.equals(s6))); // true 
		
		System.out.println("------------");

		String s7 = new String("ABC");
		System.out.println(s1); //ABC
		
		s1.concat("XYZ");
		System.out.println(s1);//ABC :not updated until it is assigned.
		
		s1 = s1.concat("XYZ");
		System.out.println(s1);//ABCXYZ
		
		s2 = s1.concat("XYZ");
		System.out.println(s2);//ABCXYZ



	}
}       