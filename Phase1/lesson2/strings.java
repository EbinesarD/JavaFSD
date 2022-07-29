package lesson2;

public class strings {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("HELLO");
		System.out.println(s2.length());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(1));
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('d','l'));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("\nStringBuffer: ");
		StringBuffer sb = new StringBuffer("String buffer");
		System.out.println(sb.append(" :)"));
		System.out.println(sb.insert(0, '!'));
		System.out.println(sb.replace(0, 7, "%"));
		System.out.println(sb.delete(10,10));
		
		System.out.println("\nString builder: ");
		StringBuilder sbd = new StringBuilder("String builder");
		System.out.println(sbd.reverse());
		
		StringBuffer sbr = new StringBuffer(s1);
		System.out.println("\nStringBuffer: "+sbr);
		StringBuilder sbd1 = new StringBuilder(s1);
		System.out.println("StringBuilder: "+sbd1);
		
	}

}
