package bankingapplication.com;

public class User {
	private String username;
	private String pwd;
	private long phoneNo;
	
	User(String username,String pwd,long phoneNo)
	{
		this.username=username;
		this.pwd=pwd;
		this.phoneNo=phoneNo;
		
	}
	public String getusername()
	{
		return username;
		
	}
	public String getpwd()
	{
		return pwd;
	}
	public long getphoneNo()
	{
		return phoneNo;
	}
	public void setusername(String usernmae)
	{
		this.username=usernmae;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
		
	}
	public void setphoneNo(long phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	

}
