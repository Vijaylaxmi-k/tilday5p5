//example for abstraction
// reuse PF & HRA and enforce SA & DA methods

package package4;
public abstract class Salary
{
	public int PF(int basic)
	{
		return 12*basic/100;
	}
	public int HRA(int basic)
	{
		return 40*basic/100;
	}
	public abstract int SA();
	public abstract int DA();	
	
}
class MicrosoftSalary extends Salary
{

	@Override
	public int SA() 
	{	
		return 30000;
	}
	@Override
	public int DA() 
	{	
		return 2500;
	}
//	public int PF(int basic){return 12*basic/100;}
//	public int HRA(int basic){return 40*basic/100;}
//	public int SA(){return 30000;}
//	public int DA(){return 2500;}
}
class cogSalary extends Salary
{
//	public int PF(int basic){return 12*basic/100;}
//	public int HRA(int basic){return 40*basic/100;}
	@Override
	public int SA()
	{
	     return 10000; 	
	}
	@Override
	public int DA()
	{
		return 1500;
	}
	
}
class Infosys extends Salary
{
//	public int PF(int basic){return 12*basic/100;}
//	public int HRA(int basic){return 40*basic/100;}
	@Override
	public int SA()
	{
	     return 30000; 	
	}
	@Override
	public int DA()
	{
		return 2500;
	}
}