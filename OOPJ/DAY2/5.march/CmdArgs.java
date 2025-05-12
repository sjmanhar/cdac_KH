class CmdArgs {
   public static void main(String[] args){
     //int i = 10;
	 
	 String s1 = args[0];
	 String s2 = args[1];
	 System.out.println(s1);
	 System.out.println(s2);
	 
	 //wrapper classes int= Integer, float = Float
	 int i = Integer.parseInt(s1);
	 int j = Integer.parseInt(s2);
     System.out.println(s1+s2);
	 System.out.println(i+j);
   }
}
