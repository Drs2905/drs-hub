class ExceptionDemo
{
	public static void main(String args[])

	{
	String name= args[0];
	
	int marks1=Integer.parseInt(args[1]);
	int marks2=Integer.parseInt(args[2]);
	int marks3=Integer.parseInt(args[3]);
	int marks4=Integer.parseInt(args[4]);
	int marks5=Integer.parseInt(args[5]);
	

	try
	{
	if(marks1<0 || marks1>100){
	throw new NumberFormatException("marks1");
	}
	if(marks2<0 || marks2>100){
	throw new NumberFormatException("marks2");
	}
	if(marks3<0 || marks3>100){
	throw new NumberFormatException("marks3");
	}
	if(marks4<0 || marks4>100){
	throw new NumberFormatException("marks4");
	}
	if(marks5<0 || marks5>100){
	throw new NumberFormatException("marks5");
	}	
	}catch(NumberFormatException e){
		e.printStackTrace();
		}

	System.out.println("Name of Student : "+name);
	System.out.println("marks of first subject : "+marks1);
	System.out.println("marks of second subject : "+marks2);
	System.out.println("marks of third subject : "+marks3);
	System.out.println("marks of fourth subject : "+marks4);
	System.out.println("marks of fifth subject: "+marks5);
	}
}

class NumberFormatException extends IllegalArgumentException{
public NumberFormatException(String number){
	super(number);
	}
}