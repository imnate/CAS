package data;

public class TokenData
{
	private String tokenName="";
	private int level=0;
	private int size = 1;
	private int width=1;
	private int x = 0;
	private int y =0;
	private int index=0;
	private String showName="";

	
	
	public int getIndex()
	{
		return index;
	}
	
	public void setIndex(int num)
	{
		this.index=num;
	}
	
	public String getName()
	{
		return tokenName;
	}
	
	public void setName(String name)
	{
		this.tokenName = name;
	
	}
	/////ด๚ธี/////
	
	public String get_name()
	{
		return showName;	
	}
	
	public	void set_name(String GS_name)
	{
		this.showName = GS_name;	
	}
	
	/////ด๚ธี/////
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public int getWidth()
	{
		return width;
	}
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;		
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
}
