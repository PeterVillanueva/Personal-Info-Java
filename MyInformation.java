class Personalinfo{
	
	private String Name;
	private int Age;
	private String Hobby;
	private String Course;
	
	public String getName()
	{return Name;}
	
	public int getAge()
	{return Age;}
	
	public String getHobby()
	{return Hobby;}
	
	public String getCourse()
	{return Course;}
	
	
	public void setName(String newValue) {Name=newValue;
	}
	public void setAge(int newValue) {Age=newValue;
	}
	public void setHobby(String newValue) {Hobby=newValue;
	}
	public void setCourse(String newValue) {Course=newValue;}}

	public class MyInformation{
		public static void main(String args[])
		{Personalinfo obj= new Personalinfo();
		obj.setName("Peter Villanueva");
		obj.setAge(18);
		obj.setHobby("Coding and Listening to Music");
		obj.setCourse("BS INFORMATION TECHNOLOGY");
		System.out.println("Name:" + obj.getName());
		System.out.println("Age:" + obj.getAge()); 
		System.out.println("Hobby:" + obj.getHobby());
		System.out.println("Course:"+ obj.getCourse());
		}
		}

