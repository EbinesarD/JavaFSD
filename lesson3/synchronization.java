package lesson3;

class Sender {
	void send(String msg) {
		System.out.println("Sending msg...: "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Error while sending: "+e);
		}
		
		System.out.println("Message Sent Successfully");
	}
}
class User extends Thread {
	
	String name;
	String msg;
	Sender sender;
	public User(String name,String msg, Sender sender) {
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	public void run() {
		System.out.println(name + " wants to send message : "+msg);
	    synchronized(sender) {
	    	sender.send(msg);
	    }
	}
}
public class synchronization {
	public static void main(String[] args) {
		Sender sender = new  Sender();
		User t1= new User("Vimal", "Hello Good morning....!", sender);
		User t2= new User("Aakash","Hii!! how  are you?",sender);
		t1.start();
		t2.start();
	}
}
