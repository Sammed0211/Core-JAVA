public class Encapsulation {
	private long Aadhar;
 	private String EmpName;
	private int EmpAge;
	public long getEmpAadhar()
	{
		return Aadhar;
	}
	public String getEmpName()
	{
	    return EmpName; 
	}
	public int getEmpAge()
	{
		return EmpAge;
	}
	public void setEmpAge(int newValue)
	{
	    EmpAge = newValue;
	}
	public void setEmpName(String newName)
	{
	    EmpName = newName;
	
	}
	public void setEmpAadhar(long newValue)
	{
		 Aadhar = newValue;
	}
	}
	 class EncapTest
	{
	public static void main (String[]args)
	{
	Encapsulation obj1 = new Encapsulation();
	Encapsulation obj2 = new Encapsulation();
	obj1.setEmpName("Ramu");
	obj1.setEmpAge(26);
	obj1.setEmpAadhar(122212221222L);
	obj2.setEmpName("Ganesh");
	obj2.setEmpAge(22);
	obj2.setEmpAadhar(444444444444L);
	
	System.out.println("Employee Name: "  + obj1.getEmpName());
	System.out.println("Employee Aadhar: " + obj1.getEmpAadhar());
	System.out.println("Employee Age: " + obj1.getEmpAge());
	System.out.println("Employee Name: "  + obj2.getEmpName());
	System.out.println("Employee Aadhar: " + obj2.getEmpAadhar());
	System.out.println("Employee Age: " + obj2.getEmpAge());
	}
	
	
}