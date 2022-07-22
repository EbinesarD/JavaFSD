package lesson3;

public class customExceptions {
	static void check(int age) throws AgeNotValidExecption {
		
		if(age<18)
			throw new AgeNotValidExecption("User Can not Vote Before 18");
		else
			System.out.println("User can Vote");
		
	}
	public static void main(String[] args) {
		try {
			check(16);
			} 
		catch (AgeNotValidExecption e) {
			System.out.println(e);
            }
		finally{
			System.out.println("End of the program");
			}
	}
}
