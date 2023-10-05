
public class PrimoTernario {
	
	public static boolean isEven (int number) {
//		return number % 2 == 0;
		return (number % 2 == 0 ) ? true : false ;
	}
	
	public static void main(String[] args) {
		CatchData cd = new CatchData();
		int number = cd.catchInt();
		
		System.out.println(isEven(number));
	}

}
