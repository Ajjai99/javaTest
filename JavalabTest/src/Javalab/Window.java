package Javalab;

class Door 

{
	int door_cost= 8000;
	public void door_Cost()
	
	{
		System.out.println("Door cost :" + door_cost);
		
	
	}
	
}

class Window  extends Door
{
	int window_cost = 9000;
    public void  window_Cost()

	{
		System.out.println("window cost :" + window_cost);
		
	
	}
} 

class House extends Window
{
	/*int door_cost= 8000;
	int window_cost = 9000;
	int builtup_area = 1000;
	int approx_cost_per_sqft = 100;*/
	
	int door_result , window_result;
	
	public static void areaofconstruction(int builtup_area, int approx_cost_per_sqft )
	{
		int Total_area;
		Total_area = builtup_area *approx_cost_per_sqft;
		System.out.println("Total_area:"+ Total_area);
		
		
	}
	
	public static void main(String[] args) 
	{
		
		int builtup_area = 1000;
		int approx_cost_per_sqft = 100;
		 Door d1 = new Door();
		 Window w1 = new Window();
		 d1.door_Cost ();
		 w1.window_Cost();
	//	 House s1 = new House();
		 areaofconstruction(builtup_area  ,approx_cost_per_sqft);
		
	}
}

