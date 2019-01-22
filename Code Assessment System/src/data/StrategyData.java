package data;

import java.util.*;
import java.awt.List;
import java.util.ArrayList;

public class StrategyData {
	
	
	private ArrayList<String> Loop_Type;
	private ArrayList<String> Loop_Strategy;
	private ArrayList<String> Loop_Times;
	
	public void Set_Loop_Type(ArrayList<String> Type)
	{			
		Loop_Type = Type;
	}
	public void Set_Loop_Strategy(ArrayList<String> Strategy)
	{
		Loop_Strategy = Strategy;
	}
	public void Set_Loop_Times(ArrayList<String> Times)
	{
		Loop_Times = Times;		
	}
	public ArrayList<String> Get_Loop_Type()
	{
		return Loop_Type;
	}
	public ArrayList<String> Get_Loop_Strategy()
	{
		return Loop_Strategy;
	}
	public ArrayList<String> Get_Loop_Times()
	{
		return Loop_Times;
	}
	
}
