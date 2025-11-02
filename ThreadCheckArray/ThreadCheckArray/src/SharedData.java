import java.util.ArrayList;

public class SharedData 
//hiii
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final Integer b;
	
	public SharedData(ArrayList<Integer> array2, Integer b) {
		
		this.array = array2;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public Integer getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
