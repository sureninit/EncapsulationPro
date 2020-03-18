
public class Custumers {
	private String fname;
	private int accountnumber;
	public String getName() {
		return fname;
	}
	//encapsulation

	public void setName(String name) {
		this.fname = name;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	
	
	public void details() {
		
		System.out.println("Details of custumers:"+" "+"name: "+fname+" accountnumber: "+accountnumber);
		
	}
	

}
