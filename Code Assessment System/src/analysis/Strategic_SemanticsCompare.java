package analysis;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import antlr.collections.List;
import data.StrategyData;

public class Strategic_SemanticsCompare {
	
	ArrayList<String> a_Strategy = new ArrayList<String>();
	ArrayList<String> a_Times = new ArrayList<String>();
	
	ArrayList<String> b_Strategy = new ArrayList<String>();
	ArrayList<String> b_Times = new ArrayList<String>();
	
	
	
	public Strategic_SemanticsCompare(ArrayList<StrategyData> SD)
	{
		
		ArrayList<String> aSide_Strategy  = new ArrayList<String>();
		ArrayList<String> aSide_Times = new ArrayList<String>();
		ArrayList<String> bSide_Strategy = new ArrayList<String>();
		ArrayList<String> bSide_Times = new ArrayList<String>();
		System.out.println("********�j�鵦���P�y�N�������*********");
		for(int i =0;i<SD.size();i++)
		{
			switch(i)//��Ƽg�J��C�}�C
			{
				case 0://a					
					aSide_Strategy = SD.get(i).Get_Loop_Strategy();
					aSide_Times = SD.get(i).Get_Loop_Times();
				break;
			
				case 1://b
					bSide_Strategy = SD.get(i).Get_Loop_Strategy();
					bSide_Times = SD.get(i).Get_Loop_Times();
				break;
					
			}
		}
		
//		System.out.println("@aSide Strategy" + aSide_Strategy);
//		System.out.println("@aSide Times" + aSide_Times);
//		System.out.println("@bSide Strategy" + bSide_Strategy);
//		System.out.println("@bSide Times" + bSide_Times);
		//A��B�ɮת������񧹵����񦸼�
		//�٧�while\1021521-4.cpp WHILE�j��n�B�z�@�U �ܼƧ�s���D
		main(aSide_Strategy,aSide_Times,bSide_Strategy,bSide_Times);
	}
	public void main(ArrayList<String> a_Strategy_OS,ArrayList<String> a_Times_OS,ArrayList<String> b_Strategy_OS,ArrayList<String> b_Times_OS)
	{
			//�o��n�[�J�@�ӱNIF���Y�_�Ӫ�function
			
			/*���g�L����IF*/
			if(a_Strategy_OS.indexOf("If")!=-1||b_Strategy_OS.indexOf("If")!=-1)
			{
				Find_IF(a_Strategy_OS,b_Strategy_OS,a_Times_OS,b_Times_OS);			
			}
			else
			{
				a_Strategy = a_Strategy_OS;
				a_Times = a_Times_OS;
				b_Strategy = b_Strategy_OS;
				b_Times = b_Times_OS;					
			}
			

			System.out.println("����: a= " + a_Strategy+" b= "+b_Strategy);
			System.out.println("����: a= " + a_Times+" b= "+b_Times);
			
			
			
			
			
		
		
			int set_Short_CompareTime = 0;
			int set_long_CompareTime = 0;//�̫�@�ӭn�γo�Ӹ�
			set_Short_CompareTime = Find_ShortStrategy(a_Strategy,b_Strategy);
			set_long_CompareTime = Find_longStrategy(a_Strategy,b_Strategy);
			ArrayList<Boolean> All_ToF = new ArrayList<Boolean>();
			System.out.println("@a_b Strategy = " +a_Strategy+b_Strategy);
			
			for(int j = 0 ;j<set_long_CompareTime;j++)
			{
				if(j<set_Short_CompareTime)		
				{
					for(int i = j ; i<set_Short_CompareTime;i++)
					{
						if(check_TheSameStrategy(a_Strategy.get(i),b_Strategy.get(i)))
						{
							System.out.println("-------------�����@�� ("+a_Strategy.get(i)+")-------------");				
							if(check_Time_null(a_Times.get(i),b_Times.get(i)))
							{
								All_ToF.add(Normalization_Time(a_Times.get(i),b_Times.get(i),a_Strategy.get(i)));
							}
							else
							{
								All_ToF.add(false);
								System.out.println("-�L�k�������");
							}
							System.out.println("-------------End Analysis ("+a_Strategy.get(i)+")-------------\r\n");		
							
						}
						else
						{
							All_ToF.add(false);
							System.out.println("-------------------�������@��-------------------");				
						}
						break;
					}
				}
				else
				{
					All_ToF.add(false);
					System.out.println("-------------------�L��Ƥ��-------------------");		
				}
			}
			
			
			ArrayList<Boolean> Strategic_True_ArrayList = new ArrayList<Boolean>();
			for(int i =0 ;i<set_long_CompareTime;i++)
			{
				if(i<set_Short_CompareTime)
				{	for(int j = 0;j<set_Short_CompareTime;j++)
					{
						if(a_Strategy.get(i).equals(b_Strategy.get(i)))
						{
							Strategic_True_ArrayList.add(true);
							break;
						}
						else
						{
							Strategic_True_ArrayList.add(false);
							break;
						}
					}
				}
				else
				{
					Strategic_True_ArrayList.add(false);
				}
			}
			
			
			double Strategic_True = 0;
			Strategic_True = count_true(Strategic_True_ArrayList);
			
			double Semantics_Ture=0;
			Semantics_Ture = count_true(All_ToF);
			
			
			double Strategic_Similarity  = Strategic_True/set_long_CompareTime;
			double Semantics_Similarity = Semantics_Ture/All_ToF.size();
			NumberFormat nf  =  NumberFormat.getPercentInstance();
			nf.setMinimumFractionDigits( 2 );
			
			String Strategic_Similarity_str = nf.format(Strategic_Similarity);
			String Semantics_Similarity_str = nf.format(Semantics_Similarity);
			
			System.out.println("\r\n");
			System.out.println("A ����: "+a_Strategy);
			System.out.println("B ����: "+b_Strategy);
			System.out.println("AB�y�N: "+All_ToF);
			System.out.println("�����ۦ���: "+Strategic_Similarity_str);
			System.out.println("�y�N�ۦ���: "+Semantics_Similarity_str);
		
	}
	private void Find_IF(ArrayList<String> a_Strategy_FF,ArrayList<String>b_Strategy_FF,ArrayList<String> a_time_FF,ArrayList<String>b_time_FF)
	{
		ArrayList<Integer> a_IndexOfArray = new  ArrayList<Integer>();
		ArrayList<Integer> b_IndexOfArray = new  ArrayList<Integer>();
		String Short_str = "";
		String Long_str = "";
		Boolean Similarity_IF = false;
		int Short = 0;
		int Long = 0;
		
		if(a_Strategy_FF.size()>1)
		{
			for(int i = 0;i<a_Strategy_FF.size();i++)
			{
				if(a_Strategy_FF.get(i).indexOf("If")!=-1)//�OIF
				{
					int temp = i ;
					for(int j = i+1 ;j<a_Strategy_FF.size();j++)
					{						
						//System.out.println("a index -1 temp = "+temp + " ,j = "+j + " i "+i);
						temp++;	
						if(j==temp&&a_IndexOfArray.indexOf(j)==-1&&a_Strategy_FF.get(j).equals("If"))
						{		
							if(a_IndexOfArray.indexOf(i)==-1)
							{
								a_IndexOfArray.add(i);					
							}
						    a_IndexOfArray.add(j);
						   
						}
						else
						{
							break;
						}
					}
				}
				
			}
		}
		else
		{
			a_IndexOfArray.add(0);
			
			
		}

				
		if(b_Strategy_FF.size()>1)
		{
			for(int i = 0;i<b_Strategy_FF.size();i++)
			{
				if(b_Strategy_FF.get(i).indexOf("If")!=-1)//�OIF
				{
					int temp = i ;
					for(int j = i+1 ;j<b_Strategy_FF.size();j++)
					{						
						//System.out.println("b index -1 temp = "+temp + " ,j = "+j + " i "+i);
						temp++;	
						if(j==temp&&b_IndexOfArray.indexOf(j)==-1&&b_Strategy_FF.get(j).equals("If"))
						{		
							if(b_IndexOfArray.indexOf(i)==-1)
							{
								b_IndexOfArray.add(i);								
							}
						    b_IndexOfArray.add(j);
			    
						}
						else
						{
							break;
						}
					}
				}
				
			}
		}
		else
		{
			b_IndexOfArray.add(0);			
		}

		
		//�o��n�[�J��s�� ���ĦX�b�@�_ �ĦX�����R��
		//�N�̫�B�z��ƫ��V �����ܼ� �צ^�h
		//�o��IF�N�i�H�B�z�P�˪�
			
		
		if(a_IndexOfArray.size()!=b_IndexOfArray.size())
		{
			for(int i = 0 ;i<a_IndexOfArray.size();i++)
			{
				if(b_IndexOfArray.indexOf(i)!=-1)//��즳�s�b
				{
					int atemp = i ;
					int btemp = i;
					String a_tempStr = "";
					String b_tempStr = "";
					for(int j = i+1;j<a_IndexOfArray.size();j++)
					{
						atemp++;
						if(atemp ==a_IndexOfArray.get(j)&&a_IndexOfArray.size()>1)
						{
							a_Strategy_FF.set(a_IndexOfArray.get(j),"");
							a_tempStr = a_IndexOfArray.get(j).toString()+" ";						
							a_IndexOfArray.set(j, null);							
							a_time_FF.set(i,a_time_FF.get(i)+","+a_time_FF.get(j));
							a_time_FF.set(j,"");							
							
						}
						
					}
					for(int k = i+1;k<b_IndexOfArray.size();k++)
					{
						btemp++;
						if(btemp==b_IndexOfArray.get(k)&&b_IndexOfArray.size()>1)
						{
							b_Strategy_FF.set(b_IndexOfArray.get(k),"");
							b_tempStr = b_IndexOfArray.get(k).toString()+" ";						
							b_IndexOfArray.set(k,null);
							b_time_FF.set(i,b_time_FF.get(i)+","+b_time_FF.get(k));
							b_time_FF.set(k,"");
							
						}
						
					}
					
				}
				else
				{
					break;
				}
			}
			
			
			a_Strategy_FF.removeAll(Collections.singleton(""));
		    a_time_FF.removeAll(Collections.singleton(""));
			b_Strategy_FF.removeAll(Collections.singleton(""));
			b_time_FF.removeAll(Collections.singleton(""));
			
			
			a_Strategy = a_Strategy_FF;
			a_Times = a_time_FF;
			b_Strategy = b_Strategy_FF;
			b_Times = b_time_FF;
			
			
		}
		else
		{
			//�Ǧ^��t�榡
			a_Strategy = a_Strategy_FF;
			a_Times = a_time_FF;
			b_Strategy = b_Strategy_FF;
			b_Times = b_time_FF;
		}
	
		
//		System.out.println("A ���� = "+a_Strategy_FF);
//		System.out.println("A ���� = "+a_time_FF);
//		System.out.println("a a_IndexOfArray" + a_IndexOfArray);
//		System.out.println("B ���� = "+b_Strategy_FF);
//		System.out.println("B ���� = "+b_time_FF);
//		System.out.println("b b_IndexOfArray" + b_IndexOfArray);
//		System.out.println("------------------------------------------\r\n");
		
		
		
	
		
		
	}
	private int count_true(ArrayList<Boolean> Boolean_Data)
	{
		int result = 0;
		for(Boolean a:Boolean_Data)
		{
			if(a==true)
			{
				result++;
			}
		}	
		return result;
	}
	private Boolean Normalization_Time(String a_time,String b_time,String Strategy)
	{
		Boolean result = false;
		switch(Strategy)
		{
		
			case "If": //�Ӥ��ΰ���X ��W������X
				System.out.println("--If--");
				result = Nor_If(a_time,b_time);//��stack��@
				break;
			case "Counter Loop":				
				System.out.println(">>>>>Enter Normalization");
				result = Nor_Counter(a_time,b_time);
				System.out.println("---->A�BB �y�N�ۦP  = "+result);
				break;
			case "Sentinel Loop":
				System.out.println(">>>>>�i�J���W��");
				result = Nor_Sentinel(a_time,b_time);
				Nor_Sentinel(a_time,b_time);
				System.out.println("---->A�BB �y�N�ۦP  = "+result);
				break;
		}
		
		return result;
	}
	private Boolean Nor_If(String a_time,String b_time)
	{
		
		ArrayList<String> a_Opreator = new ArrayList<String>(); 
		ArrayList<String> a_Variable_cut = new ArrayList<String>(); 

		ArrayList<String> b_Opreator = new ArrayList<String>();
		ArrayList<String> b_Variable_cut = new ArrayList<String>(); 

		ArrayList<Boolean> a_notNum = new ArrayList<Boolean>();
		ArrayList<Boolean> b_notNum = new ArrayList<Boolean>();
		
		ArrayList<Same_Variable> a_SVArray = new ArrayList<Same_Variable>();
		ArrayList<Same_Variable> b_SVArray = new ArrayList<Same_Variable>();
			
		ArrayList<Integer> a_Same_Var_Weights = new ArrayList<Integer>();
		ArrayList<Integer> b_Same_Var_Weights = new ArrayList<Integer>();
		
		ArrayList<String> a_NorFinished = new ArrayList<String>(); 
		ArrayList<String> b_NorFinished = new ArrayList<String>(); 
		
		String a_Was_Normalization = "";
		String b_Was_Normalization = "";
		
		a_Opreator = Opreator(a_time.replace(" ", "").replace("(", "").replace(")", ""));
		a_Variable_cut = Variable(a_time.replace(" ", "").replace("(", "").replace(")", ""));
		b_Opreator = Opreator(b_time.replace(" ", "").replace("(", "").replace(")", ""));
		b_Variable_cut = Variable(b_time.replace(" ", "").replace("(", "").replace(")", ""));
		a_notNum = Create_IntToF(a_Variable_cut);
		b_notNum = Create_IntToF(b_Variable_cut);
	
		//Find_SameVar(a,b)�i�h�e�n���ˬd�}�C�̭��O���O�@�ӦӤw�@�Ӥ����i�h
		//�o��B�z�n�n�N�ܼƤ@�˪����W�ƥ��W�ƫ�N�i�H����F
		
		
							/*Part A*/
		if(Find_Variable(a_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			a_SVArray = Find_SameVar(Find_Variable(a_notNum),a_Variable_cut);
			//System.out.println("@---�����ܼ� A �� " + Find_SameVar(Find_Variable(a_notNum),a_Variable_cut).size());
			for(int i = 0 ; i<a_SVArray.size();i++)
			{		
				//System.out.println("@---�ˬd�����ܼ� A = " +  a_SVArray.get(i).Get_Var()+" , "+a_SVArray.get(i).Get_SvIA());
							
			}
			
			a_NorFinished = Set_Weights(a_Variable_cut,a_SVArray,a_Same_Var_Weights,a_notNum);

		}
		else
		{
			//System.out.println("@---��ӥH�U�ܼ�A");
			if(a_Variable_cut.size()!=0&&a_Opreator.size()!=0)
			{
				for(int i = 0 ;i<a_Variable_cut.size();i++)
				{
					if(a_notNum.get(i)==false)
					{
						//�m���ܼ�
						a_NorFinished.add("A");
					}
					else
					{
						a_NorFinished.add(a_Variable_cut.get(i));
					}
				}
			}
			else
			{
				a_NorFinished.add("A");				
			}
		}
		
		for(int i = 0 ;i<a_NorFinished.size();i++)
		{
			a_Was_Normalization+= a_NorFinished.get(i);
			if(i<a_Opreator.size())
			{
				for(int o = 0 ; o<a_Opreator.size();o++)
				{
					a_Was_Normalization+= a_Opreator.get(i);
					break;
				}
			}		
		}
		
		
		
		
		
		
		
							/*Part B*/
		if(Find_Variable(b_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			b_SVArray = Find_SameVar(Find_Variable(b_notNum),b_Variable_cut);
			//System.out.println("@---�����ܼ� B �� " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size());
			for(int i = 0 ; i<Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size();i++)
			{
				//System.out.println("@---�ˬd�����ܼ� B = " +  b_SVArray.get(i).Get_Var()+" , "+b_SVArray.get(i).Get_SvIA());
				
			}
			//System.out.println("@--- B = " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut));
			
			b_NorFinished = Set_Weights(b_Variable_cut,b_SVArray,b_Same_Var_Weights,b_notNum);

		
		}
		else
		{
			//System.out.println("@---B����ӥH�U�ܼ� ");
			if(b_Variable_cut.size()!=0&&b_Opreator.size()!=0)
			{
				for(int i = 0 ;i<b_Variable_cut.size();i++)
				{
					if(b_notNum.get(i)==false)
					{
						//�m���ܼ�
						b_NorFinished.add("A");
					}
					else
					{
						b_NorFinished.add(b_Variable_cut.get(i));
					}
				}
			}
			else
			{
				b_NorFinished.add("A");	
				
			}
		}
		for(int i = 0 ;i<b_NorFinished.size();i++)
		{
			b_Was_Normalization+= b_NorFinished.get(i);
			if(i<b_Opreator.size())
			{
				for(int o =0;o<b_Opreator.size();o++)
				{
					b_Was_Normalization+= b_Opreator.get(i);	
					break;
				}
			}		
		}
		
		
		
		
		
	
		System.out.println("***** ***** ***** IF A(����) ***** ***** *****�@�@�@�@ ");
		System.out.println("A �쥻   = "+a_time );
		System.out.println("�g�L�Ƨ�  = "+ a_Variable_cut + " "+a_Opreator);	
		System.out.println("����ܼ�  = " + Find_Variable(a_notNum).size());
		System.out.println("�ܼ�ToF���" + a_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(a_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ a_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+a_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+a_Was_Normalization);
		System.out.println("***** ***** ***** IF B(�k��) ***** ***** *****�@�@�@�@ ");
		System.out.println("B �쥻   = "+b_time );
		System.out.println("�g�L�Ƨ�  = "+ b_Variable_cut + " "+b_Opreator);	
		System.out.println("����ܼ�  = " + Find_Variable(b_notNum).size());
		System.out.println("�ܼ�ToF���" + b_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(b_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ b_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+b_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+b_Was_Normalization);
		
		
		if(Logic_Calculation(a_Was_Normalization,b_Was_Normalization)==true)
		{
			return true;
		}
		return false;
	}
	private Boolean Logic_Calculation(String a ,String b)
	{
		ArrayList<String> a_Var = Var(a);
		ArrayList<Boolean> a_Bool = new ArrayList<Boolean>();
		ArrayList<String> b_Var = Var(b);
		ArrayList<Boolean> b_Bool = new ArrayList<Boolean>();
		ArrayList<String> a_IF_Operator = IF_Operator(a);
		ArrayList<String> b_IF_Operator = IF_Operator(b);
		
		int short_var = 0;
		int long_var = 0 ;
		
		for(int i = 0 ;i<a_Var.size();i++)
		{
			a_Bool.add(false);
			
		}
		for(int i = 0 ;i<b_Var.size();i++)
		{
			b_Bool.add(false);		
		}
		
		
		
		if(a_Var.size()>b_Var.size()||a_Var.size()==a_Var.size())
		{
			for(int i = 0 ;i<a_Var.size();i++)
			{
				if(b_Var.indexOf(a_Var.get(i))!=-1)
				{
					a_Bool.set(i,true);
					b_Bool.set(b_Var.indexOf(a_Var.get(i)),true);
				}
				
			}
		}
		else
		{
			for(int i = 0 ;i<b_Var.size();i++)
			{
				if(a_Var.indexOf(b_Var.get(i))!=-1)
				{
					a_Bool.set(i,true);
					b_Bool.set(a_Var.indexOf(b_Var.get(i)),true);
				}
				
			}
			
			
		}
		
		Boolean a_feedback = false;
		Boolean b_feedback = false;

		System.out.println("\r\n");
		System.out.println("-------------A B �޿�B��-------------");
		System.out.println("�޿�B��  = a: "+a + " b: " + b); 
		System.out.println("�B��l  = a: "+a_IF_Operator + " b: " + b_IF_Operator); 
		System.out.println("���X��� = a: "+a_Bool+" b: "+ b_Bool);
	
		
		if(a_IF_Operator.indexOf("&&")!=-1||a_IF_Operator.indexOf("||")!=-1)
		{
			//��
			a_feedback = And_Or(a_Bool,a_IF_Operator);
		}
		else
		{
			//�S��
			a_feedback = No_And_Or(a_Bool);
		}
		if(b_IF_Operator.indexOf("&&")!=-1||b_IF_Operator.indexOf("||")!=-1)
		{
			//��
			b_feedback = And_Or(b_Bool,b_IF_Operator);
		}
		else
		{
			//�S��
			b_feedback = No_And_Or(b_Bool);
		}
		
		System.out.println("A = "+a_feedback+" b = "+ b_feedback);
		if(a_feedback==true&&b_feedback==true)
		{			
			return true;
		}
		return false;
	}
	private Boolean And_Or(ArrayList<Boolean> data_bool,ArrayList<String> Operator)
	{
		
		
		ArrayList<String> all = new ArrayList<String>();
		
		for(int i = 0 ;i<data_bool.size();i++)
		{
			for(int j = i ;j<Operator.size();j++)
			{
				all.add(data_bool.get(i).toString());
				all.add(Operator.get(j));
				break;
			}
			if(i ==data_bool.size()-1)
			{
				all.add(data_bool.get(i).toString());		
			}
		}
		System.out.println("���g�޿�p�� " + all );
//		System.out.println("\r\n");
				
		for(int i = 0 ;i<all.size();i++)
		{
			if(all.get(i).equals("||"))
			{
				if(all.get(i-1)=="true"&&all.get(i+1)=="true")
				{
					all.set(i-1, "true");
					all.set(i, "");
					all.set(i+1, "");
				}
				else
				{
					all.set(i-1, "fasle");
					all.set(i, "");
					all.set(i+1, "");
				}
			}
		
		}
		
		all.removeAll(Collections.singleton(""));
		System.out.println("�g�L�޿�p�� " + all );
		if(all.indexOf("false")==-1)
		{		
			return true;
		}
		
		return false;
	}
	private Boolean No_And_Or(ArrayList<Boolean> data_bool)
	{
		int chick = 0;
		for(int i = 0;i<data_bool.size();i++)
		{
			if(data_bool.get(i)==true)
			{
				chick++;
			}
		}	
		if(chick == data_bool.size())
		{
			return true;
		}
		return false;
	}
	private ArrayList<String> Var(String data)
	{
		String[] temp = data.split("[||]|[,]|&&");
		ArrayList<String> Result = new  ArrayList<String>();
		for(int i = 0 ;i<temp.length;i++)
		{
			
			if(temp[i].length()>0)
			{
				Result.add(temp[i]);
			}
		}
		return Result;
	}
	private  ArrayList<String> IF_Operator(String data)
	{
		String[] temp = data.replace(" ", "").split("[A-Z]|[a-z]|[0-9]|[%]|[!=]|[==]");
		ArrayList<String> Result = new  ArrayList<String>();
		for(int i = 0 ;i<temp.length;i++)
		{
			
			if(temp[i].length()>0)
			{
				Result.add(temp[i]);
			}
		}
		return Result;
	}
	private Boolean Nor_Counter(String a_time,String b_time)//��ArrayList��@Stack�����k�Ӱ��u������
	{
				

		ArrayList<String> a_Opreator_ordered = new ArrayList<String>(); 
		ArrayList<String> a_Variable_cut = new ArrayList<String>(); 

		ArrayList<String> b_Opreator_ordered = new ArrayList<String>();
		ArrayList<String> b_Variable_cut = new ArrayList<String>(); 

		ArrayList<Boolean> a_notNum = new ArrayList<Boolean>();
		ArrayList<Boolean> b_notNum = new ArrayList<Boolean>();
		
		ArrayList<Same_Variable> a_SVArray = new ArrayList<Same_Variable>();
		ArrayList<Same_Variable> b_SVArray = new ArrayList<Same_Variable>();
			
		ArrayList<Integer> a_Same_Var_Weights = new ArrayList<Integer>();
		ArrayList<Integer> b_Same_Var_Weights = new ArrayList<Integer>();
		
		ArrayList<String> a_NorFinished = new ArrayList<String>(); 
		ArrayList<String> b_NorFinished = new ArrayList<String>(); 
		
		String a_Was_Normalization = "";
		String b_Was_Normalization = "";
		
		a_Opreator_ordered = Opreator(a_time);
		a_Variable_cut = Variable(order_Time(a_time));
		b_Opreator_ordered = Opreator(b_time);
		b_Variable_cut = Variable(order_Time(b_time));
		a_notNum = Create_IntToF(a_Variable_cut);
		b_notNum = Create_IntToF(b_Variable_cut);
	
		//Find_SameVar(a,b)�i�h�e�n���ˬd�}�C�̭��O���O�@�ӦӤw�@�Ӥ����i�h
		//�o��B�z�n�n�N�ܼƤ@�˪����W�ƥ��W�ƫ�N�i�H����F
		
		
							/*Part A*/
		if(Find_Variable(a_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			a_SVArray = Find_SameVar(Find_Variable(a_notNum),a_Variable_cut);
			//System.out.println("@---�����ܼ� A �� " + Find_SameVar(Find_Variable(a_notNum),a_Variable_cut).size());
			for(int i = 0 ; i<a_SVArray.size();i++)
			{		
				//System.out.println("@---�ˬd�����ܼ� A = " +  a_SVArray.get(i).Get_Var()+" , "+a_SVArray.get(i).Get_SvIA());
							
			}
			
			a_NorFinished = Set_Weights(a_Variable_cut,a_SVArray,a_Same_Var_Weights,a_notNum);

		}
		else
		{
			//System.out.println("@---��ӥH�U�ܼ�A");
			if(a_Variable_cut.size()!=0&&a_Opreator_ordered.size()!=0)
			{
				for(int i = 0 ;i<a_Variable_cut.size();i++)
				{
					if(a_notNum.get(i)==false)
					{
						//�m���ܼ�
						a_NorFinished.add("A");
					}
					else
					{
						a_NorFinished.add(a_Variable_cut.get(i));
					}
				}
			}
			else
			{
				a_NorFinished.add("A");				
			}
		}
		
		for(int i = 0 ;i<a_NorFinished.size();i++)
		{
			a_Was_Normalization+= a_NorFinished.get(i);
			if(i<a_Opreator_ordered.size())
			{
				for(int o = 0 ; o<a_Opreator_ordered.size();o++)
				{
					a_Was_Normalization+= a_Opreator_ordered.get(i);
					break;
				}
			}		
		}
		
		
		
		
		
		
		
							/*Part B*/
		if(Find_Variable(b_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			b_SVArray = Find_SameVar(Find_Variable(b_notNum),b_Variable_cut);
			//System.out.println("@---�����ܼ� B �� " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size());
			for(int i = 0 ; i<Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size();i++)
			{
				//System.out.println("@---�ˬd�����ܼ� B = " +  b_SVArray.get(i).Get_Var()+" , "+b_SVArray.get(i).Get_SvIA());
				
			}
			//System.out.println("@--- B = " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut));
			
			b_NorFinished = Set_Weights(b_Variable_cut,b_SVArray,b_Same_Var_Weights,b_notNum);

		
		}
		else
		{
			//System.out.println("@---B����ӥH�U�ܼ� ");
			if(b_Variable_cut.size()!=0&&b_Opreator_ordered.size()!=0)
			{
				for(int i = 0 ;i<b_Variable_cut.size();i++)
				{
					if(b_notNum.get(i)==false)
					{
						//�m���ܼ�
						b_NorFinished.add("A");
					}
					else
					{
						b_NorFinished.add(b_Variable_cut.get(i));
					}
				}
			}
			else
			{
				b_NorFinished.add("A");	
				
			}
		}
		for(int i = 0 ;i<b_NorFinished.size();i++)
		{
			b_Was_Normalization+= b_NorFinished.get(i);
			if(i<b_Opreator_ordered.size())
			{
				for(int o =0;o<b_Opreator_ordered.size();o++)
				{
					b_Was_Normalization+= b_Opreator_ordered.get(i);	
					break;
				}
			}		
		}
		
		
		
		
		
	
		System.out.println("***** ***** ***** A(����) ***** ***** *****�@�@�@�@ ");
		System.out.println("A �쥻   = "+a_time );
		System.out.println("�g�L�Ƨ�  = "+ a_Variable_cut + " "+a_Opreator_ordered);	
		System.out.println("����ܼ�  = " + Find_Variable(a_notNum).size());
		System.out.println("�ܼ�ToF���" + a_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(a_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ a_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+a_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+a_Was_Normalization);
		System.out.println("***** ***** ***** B(�k��) ***** ***** *****�@�@�@�@");
		System.out.println("B �쥻   = "+b_time );
		System.out.println("�g�L�Ƨ�  = "+ b_Variable_cut + " "+b_Opreator_ordered);	
		System.out.println("����ܼ�  = " + Find_Variable(b_notNum).size());
		System.out.println("�ܼ�ToF���" + b_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(b_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ b_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+b_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+b_Was_Normalization);
		
		//Fake_Data();
		if(a_Was_Normalization.equals(b_Was_Normalization))
		{
			return true;
		}
	
		
		
		return false;
	}
	private void Fake_Data()
	{
		ArrayList<String> fakedata = new ArrayList<String>();
		fakedata.add("j");fakedata.add("a");fakedata.add("a");fakedata.add("j");fakedata.add("1");fakedata.add("1");
		ArrayList<Integer> fakeint = new ArrayList<Integer>();
		fakeint.add(0);fakeint.add(1);fakeint.add(2);fakeint.add(3);
		
		for(int i =0;i<Find_SameVar(fakeint,fakedata).size();i++)
		{
			System.out.println("@--- FakeData  SameVar " +
			Find_SameVar(fakeint,fakedata).get(i).Get_Var()+","+
			Find_SameVar(fakeint,fakedata).get(i).Get_SvIA());
		}
			
	}
	private Boolean Nor_Sentinel(String a_time,String b_time)//�o�Ӹ�Nor_Counter �t�O�N�O�S��order_Time()�禡
	{

		ArrayList<String> a_Opreator = new ArrayList<String>(); 
		ArrayList<String> a_Variable_cut = new ArrayList<String>(); 

		ArrayList<String> b_Opreator = new ArrayList<String>();
		ArrayList<String> b_Variable_cut = new ArrayList<String>(); 

		ArrayList<Boolean> a_notNum = new ArrayList<Boolean>();
		ArrayList<Boolean> b_notNum = new ArrayList<Boolean>();
		
		ArrayList<Same_Variable> a_SVArray = new ArrayList<Same_Variable>();
		ArrayList<Same_Variable> b_SVArray = new ArrayList<Same_Variable>();
			
		ArrayList<Integer> a_Same_Var_Weights = new ArrayList<Integer>();
		ArrayList<Integer> b_Same_Var_Weights = new ArrayList<Integer>();
		
		ArrayList<String> a_NorFinished = new ArrayList<String>(); 
		ArrayList<String> b_NorFinished = new ArrayList<String>(); 
		
		String a_Was_Normalization = "";
		String b_Was_Normalization = "";
		
		a_Opreator = Opreator(a_time);
		a_Variable_cut = Variable(a_time);
		b_Opreator = Opreator(b_time);
		b_Variable_cut = Variable(b_time);
		a_notNum = Create_IntToF(a_Variable_cut);
		b_notNum = Create_IntToF(b_Variable_cut);
	
		//Find_SameVar(a,b)�i�h�e�n���ˬd�}�C�̭��O���O�@�ӦӤw�@�Ӥ����i�h
		//�o��B�z�n�n�N�ܼƤ@�˪����W�ƥ��W�ƫ�N�i�H����F
		
		
							/*Part A*/
		if(Find_Variable(a_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			a_SVArray = Find_SameVar(Find_Variable(a_notNum),a_Variable_cut);
			//System.out.println("@---�����ܼ� A �� " + Find_SameVar(Find_Variable(a_notNum),a_Variable_cut).size());
			for(int i = 0 ; i<a_SVArray.size();i++)
			{		
				//System.out.println("@---�ˬd�����ܼ� A = " +  a_SVArray.get(i).Get_Var()+" , "+a_SVArray.get(i).Get_SvIA());
							
			}
			
			a_NorFinished = Set_Weights(a_Variable_cut,a_SVArray,a_Same_Var_Weights,a_notNum);

		}
		else
		{
			//System.out.println("@---��ӥH�U�ܼ�A");
			if(a_Variable_cut.size()!=0&&a_Opreator.size()!=0)
			{
				for(int i = 0 ;i<a_Variable_cut.size();i++)
				{
					if(a_notNum.get(i)==false)
					{
						//�m���ܼ�
						a_NorFinished.add("A");
					}
					else
					{
						a_NorFinished.add(a_Variable_cut.get(i));
					}
				}
			}
			else
			{
				a_NorFinished.add("A");				
			}
		}
		
		for(int i = 0 ;i<a_NorFinished.size();i++)
		{
			a_Was_Normalization+= a_NorFinished.get(i);
			if(i<a_Opreator.size())
			{
				for(int o = 0 ; o<a_Opreator.size();o++)
				{
					a_Was_Normalization+= a_Opreator.get(i);
					break;
				}
			}		
		}
		
		
		
		
		
		
		
							/*Part B*/
		if(Find_Variable(b_notNum).size()>1)//�ˬd�ܼƸ̭����S�������ܼ�
		{
			b_SVArray = Find_SameVar(Find_Variable(b_notNum),b_Variable_cut);
			//System.out.println("@---�����ܼ� B �� " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size());
			for(int i = 0 ; i<Find_SameVar(Find_Variable(b_notNum),b_Variable_cut).size();i++)
			{
				//System.out.println("@---�ˬd�����ܼ� B = " +  b_SVArray.get(i).Get_Var()+" , "+b_SVArray.get(i).Get_SvIA());
				
			}
			//System.out.println("@--- B = " + Find_SameVar(Find_Variable(b_notNum),b_Variable_cut));
			
			b_NorFinished = Set_Weights(b_Variable_cut,b_SVArray,b_Same_Var_Weights,b_notNum);

		
		}
		else
		{
			//System.out.println("@---B����ӥH�U�ܼ� ");
			if(b_Variable_cut.size()!=0&&b_Opreator.size()!=0)
			{
				for(int i = 0 ;i<b_Variable_cut.size();i++)
				{
					if(b_notNum.get(i)==false)
					{
						//�m���ܼ�
						b_NorFinished.add("A");
					}
					else
					{
						b_NorFinished.add(b_Variable_cut.get(i));
					}
				}
			}
			else
			{
				b_NorFinished.add("A");	
				
			}
		}
		for(int i = 0 ;i<b_NorFinished.size();i++)
		{
			b_Was_Normalization+= b_NorFinished.get(i);
			if(i<b_Opreator.size())
			{
				for(int o =0;o<b_Opreator.size();o++)
				{
					b_Was_Normalization+= b_Opreator.get(i);	
					break;
				}
			}		
		}
		
		
		
		
		
	
		System.out.println("***** ***** ***** A(����) ***** ***** *****�@�@�@�@ ");
		System.out.println("A �쥻   = "+a_time );
		System.out.println("�g�L�Ƨ�  = "+ a_Variable_cut + " "+a_Opreator);	
		System.out.println("����ܼ�  = " + Find_Variable(a_notNum).size());
		System.out.println("�ܼ�ToF���" + a_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(a_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ a_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+a_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+a_Was_Normalization);
		System.out.println("***** ***** ***** B(�k��) ***** ***** *****�@�@�@�@ ");
		System.out.println("B �쥻   = "+b_time );
		System.out.println("�g�L�Ƨ�  = "+ b_Variable_cut + " "+b_Opreator);	
		System.out.println("����ܼ�  = " + Find_Variable(b_notNum).size());
		System.out.println("�ܼ�ToF���" + b_notNum);
		System.out.println("�ܼƪ��Index" + Find_Variable(b_notNum));
		System.out.println("�v���]�w(�Ʀr)= "+ b_Same_Var_Weights);
		System.out.println("�N�v�����W�e(�ܼ�)= "+b_NorFinished);
		System.out.println("���W�ƫ᪺���� = "+b_Was_Normalization);
		
		//Fake_Data();
		if(a_Was_Normalization.equals(b_Was_Normalization))
		{
			return true;
		}
	
		
		
		return false;
	}
	private ArrayList<String> Set_Weights(ArrayList<String> Variable_cut,ArrayList<Same_Variable> SVArray,ArrayList<Integer> Same_Var_Weights,ArrayList<Boolean> notNum)
	{
		 ArrayList<String> Nor_Finshed = new ArrayList<String>();
		 String alpha[] = new String[26];
		 for (char c = 65; c <=90; c++)
		 {
		   alpha[c - 65] = String.valueOf(c);
		 }
    
		for(int j=0;j<Variable_cut.size();j++)//�]�w�v����l
		{
			Same_Var_Weights.add(null);
			Nor_Finshed.add("");
		}
		int c = 0;
		for(int j=0;j<Variable_cut.size();j++)
		{
			c++;
			for(int k = 0 ;k<SVArray.size();k++)
			{
				if(Variable_cut.get(j).equals(SVArray.get(k).Get_Var()))
				{	
					
					for(int i =0;i<SVArray.get(k).Get_SvIA().size();i++)//Ū���ۦP�ܼƪ���l
					{
						
						if(Same_Var_Weights.get(SVArray.get(k).Get_SvIA().get(i))==null)
						{
							Same_Var_Weights.set(SVArray.get(k).Get_SvIA().get(i),c);
							Nor_Finshed.set(SVArray.get(k).Get_SvIA().get(i),alpha[c]);
						}
						
					}
					
				}
				
			}
			if(notNum.get(j)==false&&Same_Var_Weights.get(j)==null)
			{								
				Same_Var_Weights.set(j,c);		
				Nor_Finshed.set(j,alpha[c]);	
			}
			else if(notNum.get(j)==true&&Same_Var_Weights.get(j)==null)
			{
				Same_Var_Weights.set(j,999); //�M���Ʀr�Y�i
				Nor_Finshed.set(j,Variable_cut.get(j)); //�M���Ʀr�Y�i
	
			}
		 }
		return 	Nor_Finshed;
	}
	private ArrayList<Same_Variable> Find_SameVar(ArrayList<Integer> Find_Variable,ArrayList<String> Variable_cut)
	{
		//��Ӧ��߰}�C�̭��n�O��ӥH�W
		ArrayList<Same_Variable> SVA = new ArrayList<Same_Variable>();
		
		
		String temp = "";
		for(int j = 0;j<Find_Variable.size();j++)//
		{
			temp = Variable_cut.get(Find_Variable.get(j));
			for(int i = j+1;i<Find_Variable.size();i++)
			{			
				//System.out.println("Debug " + temp + "�� "+Variable_cut.get(Find_Variable.get(i)));
				if(temp.equals(Variable_cut.get(Find_Variable.get(i))))
				{
//				  System.out.println("Debug Temp "+temp+" IF " +Variable_cut.get(Find_Variable.get(i)));
				  //System.out.println(Variable_cut.get(Find_Variable.get(j))+" �� " + temp + "�� "+Variable_cut.get(Find_Variable.get(i)) 
	              //					+ "   id = j:" + Find_Variable.get(j)+",i:" + Find_Variable.get(i));
	
				  ArrayList<Integer> Temp_Num  = new ArrayList<Integer>(); 
				  Temp_Num.add(Find_Variable.get(j));
				  Temp_Num.add(Find_Variable.get(i));
				  Same_Variable SV = new Same_Variable();
				  SV.Set_Var(temp);
				  SV.Set_SvIA(Temp_Num);
				  SVA.add(SV);				 
				  
	
			   }
				
			}						
		}
		 
		 
		return SVA;	
	}
	private ArrayList<Integer> Find_Variable(ArrayList<Boolean> data)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0 ; i<data.size();i++)
		{
			if(data.get(i).equals(false))
			{
				result.add(i);
			}			
		}
		return result;
	}
	private ArrayList<Boolean> Create_IntToF(ArrayList<String> data)
	{
		ArrayList<Boolean> result = new ArrayList<Boolean>();
		for(int i =0;i<data.size();i++)
		{
			result.add(isInteger(data.get(i)));
		}
		return result;
	}
	private String order_Time(String data)//���Ǿ�z  2*i ->i*2
	{
		ArrayList<String> Word_number_List = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> Opreator_List = new ArrayList<String>();
		String result = "";
		String[] Word_number = data.replace(" ", "").split("[-|+|*|/]");
		String[] Opreator = data.replace(" ", "").split("[A-Z]|[a-z]|[0-9]");		
		for(String a :Word_number)
		{
			Word_number_List.add(a);
		}
		for(String b :Opreator)
		{
			if(b.length()>0)
			{
				Opreator_List.add(b);
			}
		}		
		for(int i =0;i<Opreator_List.size();i++)
		{
			
			if(Opreator_List.get(i).equals("*"))//�o�����ӭn�[�J�ˬd�U�@�ӹB��Ÿ��O���O*���p�G�O���ܭn�[�J���
			{			
//				System.out.println("@----�i*" + i+" - "+ data);
				switch(Type_tryPasrseInt(Word_number_List.get(i),Word_number_List.get(i+1)))
				{
					case 0: //��ӳ��O�Ʀr
						temp.add(Word_number_List.get(i));
						temp.add(Word_number_List.get(i+1));
						Collections.sort(temp);//is work
//						System.out.println("@��ӳ��O�Ʀr " + temp);
						result += temp.get(0)+Opreator_List.get(i)+temp.get(1);
						break;
					case 1: //��ӳ��O�ܼ�
						temp.add(Word_number_List.get(i));
						temp.add(Word_number_List.get(i+1));						
						Collections.sort(temp);//is work
//						System.out.println("@��ӳ��O�ܼ� " + temp);
						result += temp.get(0)+Opreator_List.get(i)+temp.get(1);
						
						break;
					case 2: //����O�ܼƥk��O�Ʀr
//						System.out.println("@����OV�k��ON");						
//						System.out.println("@!-----���T"+Word_number_List.get(i)+Opreator_List.get(i)+Word_number_List.get(i+1));			
						result += Word_number_List.get(i)+Opreator_List.get(i)+Word_number_List.get(i+1);
						
						break;
					case 3: //�k��O�ܼƥ���O�Ʀr									
						result += Word_number_List.get(i+1)+Opreator_List.get(i)+Word_number_List.get(i);
//						System.out.println("@����ON�k��OV");	
//						System.out.println("@!-----��"+result);
						break;
					case 4: //Error
						System.out.println("@Error");
						break;
				}

			}
			else//�O+ - /
			{
				if(i!=Opreator_List.size()-1&&Opreator_List.get(i+1).equals("*"))//���O�̫�@��
				{
					result += Opreator_List.get(i);
				}
				else //�̫�@��
				{
					if(result.equals(""))
					{
						result +=Word_number_List.get(i+1)+Opreator_List.get(i)+Word_number_List.get(i);
					}
					else
					{
						result +=Opreator_List.get(i)+Word_number_List.get(i+1);
					}
				}
			}
		}
		
		//System.out.println("@----Word_number" + Word_number_List);
		//System.out.println("@----Opreator" + Opreator_List);
        //System.out.println("@----result  " +result);
		return result;
	}
	private int Type_tryPasrseInt(String L,String R)
	{			
		if(isInteger(L)==true&&isInteger(R)==true)
		{		
			return 0;
		}
		else if(isInteger(L)!=true&&isInteger(R)!=true)
		{
			return 1;
		}
		else if(isInteger(L)!=true&&isInteger(R)==true)
		{
			return 2;
		}
		else if(isInteger(L)==true&&isInteger(R)!=true)
		{
			return 3;
		}
		else
		{	
			return 4;
		}
	}
	public static boolean isInteger(String value) 
	{
	  try
	  {
		 Integer.parseInt(value);
		 return true;
	  }
	  catch(NumberFormatException e) 
	  {
	     return false;
	  }
	}
	private boolean check_Time_null(String a ,String b)
	{
		if(a.length()==0||b.length()==0||a.equals("�m���ܼƥ���")||b.equals("�m���ܼƥ���"))
			return false;		
		else
			return true;
	}
	private ArrayList<String> Variable(String data)
	{
		ArrayList<String> result = new ArrayList<String>();
		String[] cut = data.replace(" ", "").split("[*]|[+]|[-]|[/]|[%]|[==]|[!=]|[||]|[,]|&&");
		for(String a:cut)
		{
			if(a.length()>0)
			{
				result.add(a);
			}
		}
		return result;
	}
	private ArrayList<String> Opreator(String data)
	{
		ArrayList<String> result = new ArrayList<String>();
		String[] cut = data.replace(" ", "").split("[A-Z]|[a-z]|[0-9]");
		for(String a:cut)
		{
			if(a.length()>0)
			{
			 result.add(a);
			}
		}
		return result;
	}
	private int Find_ShortStrategy(ArrayList<String> aSize,ArrayList<String> bSizr)
	{
		//System.out.println("@�P�_�����}�C�j�p a = " + aSize + " b = " + bSizr);		
		if(aSize.size() < bSizr.size())
		{
			return aSize.size();			
		}
		else if(aSize.size() == bSizr.size())
		{
			return aSize.size();
		}
		else
		{
			return bSizr.size();	
		}
		
	}
	private int Find_longStrategy(ArrayList<String> aSize,ArrayList<String> bSizr)
	{
		System.out.println("@�P�_�����}�C�j�p a = " + aSize + " b = " + bSizr);		
		if(aSize.size() > bSizr.size())
		{
			return aSize.size();			
		}
		else if(aSize.size() == bSizr.size())
		{
			return aSize.size();
		}
		else
		{
			return bSizr.size();	
		}
		
	}
	private boolean check_TheSameStrategy(String a_Strategy,String b_Strategy)
	{
		if(a_Strategy.equals(b_Strategy))
			return true;
		else
			return false;
	}
	private class Same_Variable
	{
		private String Var ;
		private ArrayList<Integer> Same_varInArray;	
		public void Set_SvIA(ArrayList<Integer> data)
		{			
			Same_varInArray = data;
		}		
		public void Set_Var(String data)
		{			
			Var = data;
		}		
		public String Get_Var()
		{
			return Var;
		}
		public ArrayList<Integer> Get_SvIA()
		{
			return Same_varInArray;
		}
		
	
		
	}
	
}
