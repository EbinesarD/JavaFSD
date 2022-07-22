package lesson3;

public class encapsulation {
	private int rollno;
	private String name;
	private int mark;
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "encapsulation [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	public static void main(String[] args) {
		encapsulation e = new encapsulation();
		e.setRollno(1);
		e.setName("A");
		e.setMark(80);
		System.out.println(e.toString());
		System.out.println("RollNo: "+e.getRollno()+"\t "+"Name: "+e.getName()+"\t "+"Mark: "+e.getMark());
	}
}
