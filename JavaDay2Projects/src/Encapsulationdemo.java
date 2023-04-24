
public class Encapsulationdemo {

	public static void main(String[] args) {
		
		Account acc  = new Account();
		acc.setacc_no(214555744L);
		acc.setName("Vishnu");
		acc.setemail("abc@gmail.com");
		acc.setAmount(500.000f);
		System.out.println(acc.getacc_no()+" "+acc.getName()+" "+acc.getemail()+" "+acc.getAmount());

	}

}
