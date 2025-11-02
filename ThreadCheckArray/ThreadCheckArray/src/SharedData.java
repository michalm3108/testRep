import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final Integer b;
	
	 /**
     * Creates a new SharedData object
     */
	public SharedData(ArrayList<Integer> array2, Integer b) {
		this.array = array2;
		this.b = b;
	}

	/**
     * return win array
     */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
     *sets win array
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
     * return integer list
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
     * return constant value b
     */
	public Integer getB() 
	{
		return b;
	}

	/**
     * return flag state
     */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
     * flag sets flag state
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
