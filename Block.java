package staticKeyword;

public class Block {

	{
		System.out.println("This is no ststic Block");
	}
	
	static {
		
		System.out.println("This is static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hellow static block");
		Block b = new Block();
	}
}
