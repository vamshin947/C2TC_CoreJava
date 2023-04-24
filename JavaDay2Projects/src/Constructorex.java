
public class Constructorex {
	int id;
	String name;
	
	Constructorex(int i, String n){
		id =i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		//Parameterized constructors
		Constructorex c1 = new Constructorex(101,"abhilash");
		Constructorex c2 = new Constructorex(102,"abhi");
		c1.display();
		c2.display();
	}

}
