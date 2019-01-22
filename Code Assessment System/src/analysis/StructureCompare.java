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
		//���c���
		//�ثe�ĥ� depthFirstComparison �`���u���t��k
		//�i�H�b�����g�O���t��k�A���NdepthFirstComparison
		
		TD1=list1;
		TD2=list2;
		ComparedTD1=new ArrayList<TokenData>();
		ComparedTD2=new ArrayList<TokenData>();
		ComparedTD1WOL=new ArrayList<TokenData>();
		ComparedTD2WOL=new ArrayList<TokenData>();
	}
	
	public void depthFirstComparison()
	{
		//�`���u�����
		//����ArrayList<TokenData>���̧C��level
		//������structure

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
		//������structure
			//�ۦP��
				//���ΥX�L�̪�block
				//������structure
			//�ʤ֪������ι�誺�ɻ�(��Ӥlblock)�A�å[�W�аO(�ʤ� -)
			//���ۦP��
				//��J�U�۪�block�A�å[�W�аO(�S��� ^)
		
		GlobalAlignment GA=new GlobalAlignment(list1,list2);
		ArrayList<TokenData> tempList1=GA.getList1();
		ArrayList<TokenData> tempList2=GA.getList2();
		
		
		for(int i=tempList1.size()-1;i>=0;i--)
		{
			if(SettingToken.hasBlockToken(tempList1.get(i).getName())||SettingToken.hasBlockToken(tempList2.get(i).getName()))
			{
				if(tempList1.get(i).getName().equals(tempList2.get(i).getName()))//���A�����l�ϰ�
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
				else if(tempList1.get(i).getName().endsWith("-"))//tempList1�@��� �ɻ�
				{
					int from=tempList2.get(i).getIndex();
					ArrayList<TokenData> temp1=cutLevel(TD2,from,lvl+1,true,"+");
					tempList2.addAll(i+1,temp1 );
					ArrayList<TokenData> temp2=cutLevel(TD2,from,lvl+1,true,"-");
					tempList1.addAll(i+1,temp2 );
				}
				else if(tempList2.get(i).getName().endsWith("-"))//tempList2�� �ɻ�
				{
					int from=tempList1.get(i).getIndex();
					ArrayList<TokenData> temp1=cutLevel(TD1,from,lvl+1,true,"+");
					tempList1.addAll(i+1, temp1);
					ArrayList<TokenData> temp2=cutLevel(TD1,from,lvl+1,true,"-");
					tempList2.addAll(i+1, temp2);
				}
				else//�S��� ^
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
		//���ΥX���w�d��(beginIndex,level),�i���i�H���󰪪�level(heigherLevel)�M��
		//�W�[�^�Ǫ�ArrayList<TokenData> state���A(+-^)
		
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
