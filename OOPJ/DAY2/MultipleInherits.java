interface Printer{
	default void print();
}
//interface computer extends--<incomplete>
interface Scanner{
	void scan();
}

class Computer implements Printer, Scanner{
	public void print(){
		System.out.println("printter method");
	}
}
class MultipleInherits{
	public static void main(String...args){
		Computer c = new Computer();
		c.print();
		c.scan();
	}
}