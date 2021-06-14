//Encapsualtion
class emplo
{
	private int empno;
	public void setEmpno(int empno)//set empno
	{
		this.empno=empno;
	}
	int getEmpno()
	{
		return empno;//get Empno
	}
}

class Encapsulation
{
	public static void main(String [] args)
	{
	emplo e=new emplo();
	e.setEmpno(256);
	int result=e.getEmpno();
	System.out.println(result);
	}
}