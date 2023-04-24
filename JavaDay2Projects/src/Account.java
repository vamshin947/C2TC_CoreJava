
public class Account {
	private long acc_no;
	private String name, email;
	private float Amount;
	
	public long getacc_no() {
		return acc_no;
	}
	
	public void setacc_no(long acc_no)
	{
		this.acc_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public float getAmount() {
		return Amount;
	}
	
	public void setAmount(float Amount) {
		this.Amount = Amount;
	}
}