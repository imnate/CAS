package analysis;

import java.util.ArrayList;

import data.TokenData;

public class GlobalAlignment {
	
	private int[][] similarity;
	private int Match = 1;
	private int Mismatch = -1;
	private int GapPenalty = -2;
	
	private int list1len;
	private int list2len;
	
	//return list
	private ArrayList<TokenData> returnList1= new ArrayList<TokenData>();
	private ArrayList<TokenData> returnList2= new ArrayList<TokenData>();
	
	//return list without less
	private ArrayList<TokenData> returnList1WOL= new ArrayList<TokenData>();
	private ArrayList<TokenData> returnList2WOL= new ArrayList<TokenData>();
	
	public GlobalAlignment(ArrayList<TokenData> list1, ArrayList<TokenData> list2)
	{
		//全局比較演算法
		//可參考 DNA GlobalAlignment
		
		list1len=list1.size()+1;
		list2len=list2.size()+1;
		similarity = new int[list1len][list2len];
		
		Align(list1, list2);
		
		rollBack(list1len-1,list2len-1,list1,list2);
		
	}
	
	private void Align(ArrayList<TokenData> list1, ArrayList<TokenData> list2)
	{
		//初始化陣列
		//比較兩資料序列
		
		//對齊
		for(int i=0;i<list1len;i++)
		{
			if(i==0)
			{
				//初始化
				for(int j=0;j<list2len;j++)
				{
					similarity[0][j]=j*GapPenalty;
				}
			}
			else
			{
				similarity[i][0]=i*GapPenalty;//初始化

				for(int j=1;j<list2len;j++)
				{
					if(list1.get(i-1).getName().equals(list2.get(j-1).getName()))
					{
						similarity[i][j]=Max(i,j,true);
					}
					else
					{
						similarity[i][j]=Max(i,j,false);
					}
				}
			}
		}
	}
	
	//尋找左、左上、上三者中最大數值
	private int Max(int i,int j, boolean isMatch)
	{
		int [] temp = new int[3];
		if(isMatch)
			temp[0]=similarity[i-1][j-1]+Match;
		else
			temp[0]=similarity[i-1][j-1]+Mismatch;
		temp[1]=similarity[i-1][j]+GapPenalty;
		temp[2]=similarity[i][j-1]+GapPenalty;
		int max = -1000000000;
		
		for(int k=0;k<3;k++)
		{
			if(max < temp[k])
			{
				max = temp[k];
			}
		}
		return max;
	}

	private void rollBack(int i,int j,ArrayList<TokenData> list1, ArrayList<TokenData> list2)
	{
		//導出比較出來的最佳字串
		System.out.print(i+" ");
		System.out.print(j+" ");
		System.out.println(similarity[i][j]);
		
		if(i==0&&j==0)
		{}
		else if(i>0&&(similarity[i][j]==similarity[i-1][j]+GapPenalty))//list2 less
		{
			rollBack(i-1,j,list1,list2);
			insertMoreTokenData(returnList1,list1.get(i-1));
			insertLessTokenData(returnList2,list1.get(i-1));
			insertMoreTokenData(returnList1WOL,list1.get(i-1));
		}
		else if(i>0&&j>0&&(similarity[i][j]==similarity[i-1][j-1]+Match)&&list1.get(i-1).getName().equals(list2.get(j-1).getName()))//Match
		{
			rollBack(i-1,j-1,list1,list2);
			insertMatchTokenData(returnList1,list1.get(i-1));
			insertMatchTokenData(returnList2,list2.get(j-1));
			insertMatchTokenData(returnList1WOL,list1.get(i-1));
			insertMatchTokenData(returnList2WOL,list2.get(j-1));
		}
		else if(i>0&&j>0&&(similarity[i][j]==similarity[i-1][j-1]+Mismatch))//Mismatch
		{
			rollBack(i-1,j-1,list1,list2);
			insertMismatchTokenData(returnList1,list1.get(i-1));
			insertMismatchTokenData(returnList2,list2.get(j-1));
			insertMismatchTokenData(returnList1WOL,list1.get(i-1));
			insertMismatchTokenData(returnList2WOL,list2.get(j-1));
		}
		else//j>0//list1 less
		{
			rollBack(i,j-1,list1,list2);
			insertLessTokenData(returnList1,list2.get(j-1));
			insertMoreTokenData(returnList2,list2.get(j-1));
			insertMoreTokenData(returnList2WOL,list2.get(j-1));
		}
	}
	
	private void insertMatchTokenData(ArrayList<TokenData> TD,TokenData correspond)
	{
		TokenData match=new TokenData();
		match.setName(correspond.getName());
		match.setLevel(correspond.getLevel());
		match.setIndex(correspond.getIndex());
		TD.add(match);
	}
	
	private void insertMismatchTokenData(ArrayList<TokenData> TD,TokenData correspond)
	{
		TokenData mismatch=new TokenData();
//		mismatch.setLevel(correspond.getLevel();
		mismatch.setName(correspond.getName()+"^");
		mismatch.setLevel(correspond.getLevel());
		mismatch.setIndex(correspond.getIndex());
		TD.add(mismatch);
	}
	
	private void insertMoreTokenData(ArrayList<TokenData> TD,TokenData correspond)
	{
		TokenData more=new TokenData();
//		more.setLevel(correspond.getLevel());
		more.setName(correspond.getName()+"+");
		more.setLevel(correspond.getLevel());
		more.setIndex(correspond.getIndex());
		TD.add(more);
	}
	
	private void insertLessTokenData(ArrayList<TokenData> TD,TokenData correspond)
	{
		TokenData less=new TokenData();
//		empty.setLevel(correspond.getLevel());
		less.setName(correspond.getName()+"-");
		TD.add(less);
	}
	
	public void PrintAns()
	{
		System.out.println("List1 : ");
		for(TokenData td : returnList1)
		{
			System.out.print(td.getName()+" ");
		}
		System.out.println();
		System.out.println("List2 : ");
		for(TokenData td : returnList2)
		{
			System.out.print(td.getName()+" ");
		}
		System.out.println();
		System.out.println("List1 Without Less : ");
		for(TokenData td : returnList1WOL)
		{
			System.out.print(td.getName()+" ");
		}
		System.out.println();
		System.out.println("List2 Without Less : ");
		for(TokenData td : returnList2WOL)
		{
			System.out.print(td.getName()+" ");
		}
		System.out.println();
	}
	
	public void PrintTable()
	{
		for(int i=0;i<list1len;i++)
		{
			for(int j=0;j<list2len;j++)
			{
				System.out.print(similarity[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public ArrayList<TokenData> getList1(){return returnList1;}
	
	public ArrayList<TokenData> getList2(){return returnList2;}
	
	public ArrayList<TokenData> getList1WOL(){return returnList1WOL;}
	
	public ArrayList<TokenData> getList2WOL(){return returnList2WOL;}
}
