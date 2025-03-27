
class FinalDemo2{
	public static void main(String...args){
		
		final StringBuilder sb = new StringBuilder("cdac");
		//sb- immutable reference, objects
		System.out.println(sb);

        sb.append(" juhu kharghar");
		System.out.println(sb);
		sb = new StringBuilder("helloo");//error: cannot assign a value to final variable sb
	}
	
}//important: why immutable? can we assign 2 value to a rfernce 