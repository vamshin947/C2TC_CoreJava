
public class Constructor {
	int id;
	String name;
	int age;
	
	Constructor(int i,String n)
	{
		id = i;
		name = n;
	}
	Constructor(int i, String n,int a)
	{
		id =i;
		name = n;
		age = a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		
		//Constructor Overloading
		Constructor c1 = new Constructor(101, "vikas", 22);
		Constructor c2 = new Constructor(104, "Kiran");
		c1.display();
		c2.display();
	}

}
