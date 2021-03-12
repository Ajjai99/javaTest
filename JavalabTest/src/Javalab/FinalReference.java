package Javalab;


public class FinalReference 
{ 
    int rollNo;
    String className;
    String name;
    
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String args[]) 
    { 
        final FinalReference object = new FinalReference();
        object.setName("Ram");
        object.setRollNo(123);
        object.setClassName("MCA");
        
        
        object.setName("Krishan");
        object.setRollNo(222);
        object.setClassName("MCA");
        
        
        System.out.println("Name :" +object.getName());
        System.out.println("Class name :" +object.getClassName());
        System.out.println("RollNo :" +object.getRollNo());
    } 
}