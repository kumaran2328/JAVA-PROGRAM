// Assignment 2 set 1
// Addition of floating points using inheritance
class one{
    float s=9.3f;
    
}
public class two extends one{
    float b=28.42f;
    public static void main(String args[]){
        two o=new two();
        
        System.out.println(o.s+o.b);
        
    }
}
output
37.72
// Addition of floating numbers using abstract class
abstract class Sum{  
	  abstract void add();  
	}  
	  	 public class MyClass extends Sum{  
	void add()
      {
          float s=7.21f,d=7.7f;
          System.out.println(s+d);
          
      }  
	  
	public static void main(String args[]){  
	 Sum obj = new MyClass();  
	 obj.add();  
	 }  
}  

ouput
14.91

// Adiition of floating numbers using interface
interface Sum{  
	void add();  
	}  
	  
	public class MyClass implements Sum{  
	public void add(){
	    float s=999.7f, t=55.22f;
	    System.out.println(s+t);
	    
	}  
	  
	public static void main(String args[]){  
	MyClass obj = new MyClass();  
	obj.add();  
	 }  
	}
 output
 1054.92
