package analysis;

import java.util.ArrayList;
import data.TokenData;

public class StructureCompare {
	
	private ArrayList<TokenData> TD1;
	private ArrayList<TokenData> TD2;
	private ArrayList<TokenData> ComparedTD1;
	private ArrayList<TokenData> ComparedTD2;
	private ArrayList<TokenData> ComparedTD1WOL;
	private ArrayList<TokenData> ComparedTD2WOL;
	private ArrayList<TokenData> temp1=null;
	private ArrayList<TokenData> temp2=null;
	
	public StructureCompare(ArrayList<TokenData> list1, ArrayList<TokenData> list2)
	{
		//結構比較
		//目前採用 depthFirstComparison 深度優先演算法
		//可以在此撰寫別的演算法，取代depthFirstComparison
		
		TD1=list1;
		TD2=list2;
		ComparedTD1=new ArrayList<TokenData>();
		ComparedTD2=new ArrayList<TokenData>();
		ComparedTD1WOL=new ArrayList<TokenData>();
		ComparedTD2WOL=new ArrayList<TokenData>();
	}
	
	public void depthFirstComparison()
	{
		//深度優先比較
		//找兩個ArrayList<TokenData>中最低的level
		//比較兩個structure

		ComparedTD1=cutLevel(TD1,-1,1,false,"");
		ComparedTD2=cutLevel(TD2,-1,1,false,"");
		compareTwoStructure(ComparedTD1,ComparedTD2,1,1);
		ComparedTD1=temp1;
		ComparedTD2=temp2;
		generateLessList(ComparedTD1,ComparedTD1WOL);
		generateLessList(ComparedTD2,ComparedTD2WOL);
	}
	
	private int findMaxLevel(ArrayList<TokenData> list)
	{
		int maxLevel=0;
		for(TokenData temp : list)
		{
			if(temp.getLevel()>maxLevel)
				maxLevel=temp.getLevel();
		}
		return maxLevel;
	}
	
	private void compareTwoStructure(ArrayList<TokenData> list1, ArrayList<TokenData> list2,int lvl,int tp)
	{
		//比較兩個structure
			//相同時
				//切割出他們的block
				//比較兩個structure
			//缺少的直接用對方的補齊(整個子block)，並加上標記(缺少 -)
			//不相同時
				//填入各自的block，並加上標記(沒對到 ^)
		
		GlobalAlignment GA=new GlobalAlignment(list1,list2);
		ArrayList<TokenData> tempList1=GA.getList1();
		ArrayList<TokenData> tempList2=GA.getList2();
		
		
		for(int i=tempList1.size()-1;i>=0;i--)
		{
			if(SettingToken.hasBlockToken(tempList1.get(i).getName())||SettingToken.hasBlockToken(tempList2.get(i).getName()))
			{
				if(tempList1.get(i).getName().equals(tempList2.get(i).getName()))//對到，比較其子區域
				{
					int from=tempList1.get(i).getIndex();
					ArrayList<TokenData> list1Cut=cutLevel(TD1,from,lvl+1,false,"");
					from=tempList2.get(i).getIndex();
					ArrayList<TokenData> list2Cut=cutLevel(TD2,from,lvl+1,false,"");
					
					compareTwoStructure(list1Cut, list2Cut,lvl+1,tp+1);
					
					if(temp1==null&&temp2==null)
					{
						tempList1.addAll(i+1,list1Cut);
						tempList2.addAll(i+1,list2Cut);
					}
					else
					{
						tempList1.addAll(i+1,temp1);
						tempList2.addAll(i+1,temp2);
					}
				}
				else if(tempList1.get(i).getName().endsWith("-"))//tempList1一邊少 補齊
				{
					int from=tempList2.get(i).getIndex();
					ArrayList<TokenData> temp1=cutLevel(TD2,from,lvl+1,true,"+");
					tempList2.addAll(i+1,temp1 );
					ArrayList<TokenData> temp2=cutLevel(TD2,from,lvl+1,true,"-");
					tempList1.addAll(i+1,temp2 );
				}
				else if(tempList2.get(i).getName().endsWith("-"))//tempList2少 補齊
				{
					int from=tempList1.get(i).getIndex();
					ArrayList<TokenData> temp1=cutLevel(TD1,from,lvl+1,true,"+");
					tempList1.addAll(i+1, temp1);
					ArrayList<TokenData> temp2=cutLevel(TD1,from,lvl+1,true,"-");
					tempList2.addAll(i+1, temp2);
				}
				else//沒對到 ^
				{
					if(SettingToken.hasBlockToken(tempList1.get(i).getName()))
					{
						int from=tempList1.get(i).getIndex();
						ArrayList<TokenData> temp=cutLevel(TD1,from,lvl+1,true,"^");
						tempList1.addAll(i+1, temp);
					}
					if(SettingToken.hasBlockToken(tempList2.get(i).getName()))
					{
						int from=tempList2.get(i).getIndex();
						ArrayList<TokenData> temp=cutLevel(TD2,from,lvl+1,true,"^");
						tempList2.addAll(i+1, temp);
					}
				}
			}
		}
		temp1=tempList1;
		temp2=tempList2;
	}
	
	private ArrayList<TokenData> cutLevel(ArrayList<TokenData> TD, int beginIndex, int level,boolean heigherLevel,String state)
	{
		//切割出指定範圍(beginIndex,level),可不可以往更高的level(heigherLevel)尋找
		//增加回傳的ArrayList<TokenData> state狀態(+-^)
		
		ArrayList<TokenData> temp=new ArrayList<TokenData>();
		boolean start=false;
		if(heigherLevel)
		{
			TokenData td;
			for(int index=beginIndex+1;index<TD.size();index++)
			{
				if(TD.get(index).getLevel()>=level)
				{
					td=new TokenData();
					td.setName(TD.get(index).getName()+state);
					td.setIndex(TD.get(index).getIndex());
					td.setLevel(TD.get(index).getLevel());
					temp.add(td);
					start=true;
				}
				else
				{
					if(start)
					{
						break;
					}
					else
					{
						System.out.println("Something wrong!! index= "+index);
						
						continue;
					}
				}
			}
		}
		else
		{
			TokenData td;
			for(int index=beginIndex+1;index<TD.size();index++)
			{
				if(TD.get(index).getLevel()==level)
				{
					td=new TokenData();
					td.setName(TD.get(index).getName()+state);
					td.setIndex(TD.get(index).getIndex());
					td.setLevel(TD.get(index).getLevel());
					temp.add(td);
					start=true;
				}
				else if(TD.get(index).getLevel()>level)
				{
					continue;
				}
				else
				{
					if(start)
					{
						break;
					}
					else
					{
						System.out.println("Something wrong!! index= "+index);
						
						continue;
					}
				}
			}
		}
		return temp;
	}
	
	private void generateLessList(ArrayList<TokenData> list,ArrayList<TokenData> listWOL)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().endsWith("-"))
			{}
			else
			{
				TokenData td=new TokenData();
				td.setName(list.get(i).getName());
				td.setLevel(list.get(i).getLevel());
				listWOL.add(td);
			}
		}
	}
	
	public ArrayList<TokenData> getComparedList1(){return ComparedTD1;}
	
	public ArrayList<TokenData> getComparedList2(){return ComparedTD2;}
	
	public ArrayList<TokenData> getComparedList1WOL(){return ComparedTD1WOL;}
	
	public ArrayList<TokenData> getComparedList2WOL(){return ComparedTD2WOL;}
}
