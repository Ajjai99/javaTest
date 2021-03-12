package Javalab;

class Wipro1
{
	public void WiproTech()
	
	{
		System.out.println("Wipro tech is not executed..");
	}
	
	public void WiproInfo()
	
	{
		System.out.println("Wipro infotech is not executed..");
	}
	
	public void WiproBPO()
	{
		System.out.println("Wipro BPO is not executed");
	}
	
}

class WiproTechnologies extends Wipro1
{
   public void wiproTech()
	
	{
		System.out.println("Wipro tech is  executed..");
	}
}

class WiproInfotech extends Wipro1
{
    public void wiproInfo()
	
	{
		System.out.println("Wipro infotech is  executed..");
	}
	
}

class Wipro_BPO extends Wipro1
{
	public void wiproBPO()
	
	{
		System.out.println("Wipro BPO is executed");
	}
}

 class WiproArray

{
	 public void wiproArr()
	 {
		 
	    String[] company =  {"WiproTech", "WiproInfotech", "Wipro_BPO"};
	    for(int i =0 ; i<company.length ; i++)
	    {
	    	System.out.print(company[i] + " ");
	    }
	    	
	  }
	  
}

	

public class Wipro {
	
	public static void main(String[] args) 
	{
		WiproTechnologies t1 = new WiproTechnologies();
		WiproInfotech f1 = new WiproInfotech();
		Wipro_BPO b1 = new Wipro_BPO();
		WiproArray a1 = new WiproArray();
		t1.wiproTech();
		f1.wiproInfo();
		b1.wiproBPO();
		a1.wiproArr();
		
	}
	

}
