package Javalab;

class Student1
{
	String name = "Ram";
	int rollno = 21;
	
}

class Exam extends Student1
{
	//System.out.println("Student name:" + name);
    //System.out.println("Student rollnumber" + rollno);
   public int total_mark()
   {
	   System.out.println("Student name: " + name);
	   System.out.println("Student rollnumber: " + rollno);
	   int totalmark = 0;
	   int marks[] = {78,98,85};
	   for(int i = 0 ; i< marks.length;i++)
	   {
		   totalmark+= marks[i];
		   System.out.println("Mark for"+" "+ i + " : "+ marks[i]);
	   }
	 //  System.out.println("Student name:" + name);
	 // System.out.println("Student rollnumber" + rollno);
	  // System.out.println("Totalmark:"+ marks[]);
	   return totalmark;
   }
   
  
	
}

class StudentResult extends Exam
{
	int result;
	public void func()
	{
		result= total_mark();
		System.out.println("Totalmark result: "+ result);
		
	}
	
	public static void main(String[] args)
	{
		
		StudentResult r1 = new StudentResult();
		r1.func();
		
	}
	
	
	
}

