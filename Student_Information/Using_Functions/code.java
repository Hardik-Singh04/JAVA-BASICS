class Student
{
	int roll;
	String name,university,branch;
	void set(int a,String b,String c,String d)
	{
		roll=a;
		name=b;
		university=c;
		branch=d;
	}
	void display()
	{
		System.out.println("Name :"+name);
	 	System.out.println("Roll Number:"+roll);
		System.out.println("University:"+university);
		System.out.println("Branch:"+branch);	
	}
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.set(1,"Hardik","GEHU","CSE");
		obj.display();
	}
}
