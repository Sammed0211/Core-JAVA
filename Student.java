
public class Student {
	 int id;
	 String name;
	 int age;
	 Student(int i,String n)
	 {
		id = i;
		name = n;
	 }
	  Student(int i, String n,int a)
	  {
		id = i;
		name = n;
		age = a;
	  }
	  void display() {
		  System.out.println("ID of Student : "+id+","+"Name of Student : "+name+","+"Age of Student : "+age);
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			{
				Student s1 = new Student(16,"Ram",42);
				Student s2 = new Student (17,"Ratan",27);
				s1.display();
				s2.display();
			}
		}

}

