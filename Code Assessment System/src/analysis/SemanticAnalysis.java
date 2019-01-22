package analysis;

import java.awt.List;
import java.util.ArrayList;



public class SemanticAnalysis {
	
	
	private ArrayList<String> send2SemanticAnalsis = new ArrayList<String>();//���B�z�L���
	private ArrayList<String> send2SemanticAnalsis_cin = new ArrayList<String>();//���B�z�L���
	private ArrayList<String> send2SemanticAnalsis_declare = new ArrayList<String>();//���B�z�L���	
	private ArrayList<String> send2SemanticAnalsis_sentinel = new ArrayList<String>();//���B�z�L���
	
	private ArrayList<String> for_cin_arraylist = new ArrayList<String>();//�B�z�L
	private ArrayList<String> declare_arraylist = new ArrayList<String>();//�r��B�z�L�N�ܼƴ�����s���}�C
	private ArrayList<String> declare_assignment = new ArrayList<String>();//�x�s�Uassign��
	private ArrayList<String> declare_inital_ToF = new ArrayList<String>();//�x�s�O�_�O��l��
	private ArrayList<String> cut_declare_arraylist = new ArrayList<String>();
	private ArrayList<String> CinIsDeclare = new ArrayList<String>();
	private ArrayList<String> declare = new ArrayList<String>();
	private ArrayList<String> For_ToF = new ArrayList<String>();
	
	private int for_times;
	private int declare_times;
	private  ArrayList<String> LoopTimes = new ArrayList<String>();
	private  ArrayList<String> LoopStrategy = new ArrayList<String>();
	private ArrayList<String> No_Chinese_Loop_times= new ArrayList<String>();
	
	
	public SemanticAnalysis(ArrayList<String> type,ArrayList<String> cin,ArrayList<String> data,int get_times,ArrayList<String> declare,int declare_times,ArrayList<String> assign,ArrayList<String> sentinel){
	
		this.send2SemanticAnalsis = data;
		this.send2SemanticAnalsis_cin = cin;
		this.for_times = get_times;
		this.send2SemanticAnalsis_declare = declare;
		this.declare_times = declare_times;
		this.send2SemanticAnalsis_sentinel = sentinel;
		System.out.println("type "+type+"cin "+cin+"data "+data);
		System.out.println("declare"+declare+"assign"+assign+"sentinel"+sentinel);
		for(int i=0;i<sentinel.size();i++)
		{
		   // System.out.println(i+"type = "+type+" Sa get = "+data.get(i));			
		}
		for(int j =0;j<cin.size();j++)
		{	
			//System.out.println("\r\n"+"Cin = "+cin.get(j));
		}
		System.out.println("��Jump�j�� = "+send2SemanticAnalsis_sentinel);
		System.out.println("�j����� = "+type);
		System.out.println("�n�� =�@" + this.send2SemanticAnalsis);
		System.out.println("�ŧi =�@" + declare_times);
		CountLoopTime(type,this.send2SemanticAnalsis,declare);//�s (�j���������)
		System.out.println("�j�鵦�� = "+LoopStrategy);
		System.out.println("�j��y�N = "+LoopTimes);
		System.out.println("------------------------------------------");
		Set_Loop_type(type);
		Set_Loop_Strategy(LoopStrategy);
		Set_Loop_Times(No_Chinese_Loop_times);
		//System.out.println("�i�J��� : "+this.send2SemanticAnalsis);
	}
	private void CountLoopTime(ArrayList<String> type,ArrayList<String> data,ArrayList<String> declare)//new 
	{
		
		
		ArrayList<String> Date = new ArrayList<String>();
		Date = data;
		declare();//�ŧi�ܼư�������
		cin();//CIN�ܼư�������
		int tatol=0;
		for(int i =0 ;i<type.size();i++)//�p�G���o�{��ƿ��~�i��ODate�}�C����ƪ�Ӧ����D �Qremove���F
		{
			switch(type.get(i))
			{
				case "While" :
					// 2/15�p�G�n�[�J�m���ܼ� �y�{�� ���ˬd�o�O���O��Need2ChangeVar(�B��Ÿ�)���A�i�h�m�� �����ˬdWhile ToF(�s�W)���ˬd�ܼ� �b�m�� Change_Varable
					String While_time = "";
					try
					{
						System.out.println("���L�� = "+type.get(i) +type.get(i+1)+Date.get(tatol+1)+Date.get(tatol));
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+1),"",Date.get(tatol),""))
						{				
							case "break":
								While_time = sentinel_Condition_Detect(Date.get(tatol+1));
								No_Chinese_Loop_times.add(While_time.replace("��", ""));
								LoopTimes.add("While : ��L����("+While_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;
							case "!=":
								While_time = sentinel_Condition_Detect(Date.get(tatol));
								No_Chinese_Loop_times.add(While_time.replace("��", ""));
								LoopTimes.add("While : ��L����("+While_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;
							case "false":
								While_time = While_loop(Date.get(tatol));
								No_Chinese_Loop_times.add(While_time.replace("��", ""));
								LoopTimes.add("While ���� : "+While_time);//�p�ƫ�	
								LoopStrategy.add("Counter Loop");
								break;
						}

					}
					catch(Exception e)
					{
						While_time = While_loop(Date.get(tatol));
						No_Chinese_Loop_times.add(While_time.replace("��", ""));
						LoopTimes.add("While ���� : "+While_time);//�p�ƫ�		
						LoopStrategy.add("Counter Loop");
						
					}
					
					tatol++;
					break;
				case "DoWhile":
					String DoWhile_time ="";
					try
					{
						
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+2),"",Date.get(tatol),""))
						{
							case "break":
								DoWhile_time = sentinel_Condition_Detect(Date.get(tatol+1));
								No_Chinese_Loop_times.add(DoWhile_time.replace("��", ""));
								LoopTimes.add("While : ��L����("+DoWhile_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;
							case "!=":
								DoWhile_time = sentinel_Condition_Detect(Date.get(tatol));
								No_Chinese_Loop_times.add(DoWhile_time.replace("��", ""));
								LoopTimes.add("While : ��L����("+DoWhile_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;
							case "false":
								DoWhile_time = While_loop(Date.get(tatol));
								No_Chinese_Loop_times.add(DoWhile_time.replace("��", ""));
								LoopTimes.add("While ���� : "+DoWhile_time);//�p�ƫ�	
								LoopStrategy.add("Counter Loop");
								break;
						}	
						
					}
					catch(Exception e)
					{
						DoWhile_time = While_loop(Date.get((tatol+1)));
						No_Chinese_Loop_times.add(DoWhile_time.replace("��", ""));
						LoopTimes.add("Do_While ���� : "+DoWhile_time);//�p�ƫ�
						LoopStrategy.add("Counter Loop");
					}	
					//System.out.println("Do_while�_�l "+(tatol+1));
					tatol = tatol+2;
					break;					
				case "For_declare":	//for�����ư����u�靈��l���� �פ���� �� �ܤƱ��� �T�Ӻ����~�఻�� �_�h�|error	
					//System.out.println("For_declare "+Date.get(tatol+3));
					String For_declare_time = "";
					try
					{
						//System.out.println("For_declare "+(tatol+1));
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+3),Date.get(tatol),Date.get(tatol+1),Date.get(tatol+2)))
						{
							case "break":
								For_declare_time = sentinel_Condition_Detect(Date.get(tatol+3));
								No_Chinese_Loop_times.add(For_declare_time);
								LoopTimes.add("For : ��L����("+For_declare_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;					
							case "false":
								For_declare_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
								No_Chinese_Loop_times.add(For_declare_time);
								LoopTimes.add("For ���� : "+For_declare_time);//�p�ƫ�
								LoopStrategy.add("Counter Loop");
								break;
						}	

					}
					catch(Exception e)
					{
						For_declare_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
						No_Chinese_Loop_times.add(For_declare_time);
						LoopTimes.add("For ���� : "+For_declare_time);//�p�ƫ�
						LoopStrategy.add("Counter Loop");
					}
					//System.out.println("For_declare�_�l "+tatol);
					tatol = tatol+3;
					break;
				case "For_inital":	//for�����ư����u�靈��l���� �פ���� �� �ܤƱ��� �T�Ӻ����~�఻�� �_�h�|error
					//System.out.println("For_declare "+Date.get(tatol+3));
					String For_inital_time = "";
					try
					{
						
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+3),Date.get(tatol),Date.get(tatol+1),Date.get(tatol+2)))
						{
							case "break":
								For_inital_time = sentinel_Condition_Detect(Date.get(tatol+3));
								No_Chinese_Loop_times.add(For_inital_time);
								LoopTimes.add("For : ��L����("+For_inital_time+")");//��L����
								LoopStrategy.add("Sentinel Loop");
								break;					
							case "false":
								For_inital_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
								No_Chinese_Loop_times.add(For_inital_time);
								LoopTimes.add("For ���� : "+For_inital_time);//�p�ƫ�
								LoopStrategy.add("Counter Loop");
								break;
						}

					}
					catch(Exception e)
					{
						For_inital_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_inital");
						No_Chinese_Loop_times.add(For_inital_time);
						LoopTimes.add("For ���� : "+For_inital_time);//�p�ƫ�
						LoopStrategy.add("Counter Loop");
					}

					//System.out.println("For_ini�_�l "+tatol);
					tatol = tatol+3;
					break;
				case "If":					
					LoopStrategy.add("If");
					No_Chinese_Loop_times.add(Date.get(tatol));
					tatol++;
			}
			
		}
		
		
	}
	private String sentinel_Condition_Detect(String condition)
	{
		String this_condition = condition.replace(" ", "");
		//System.out.println("��L���� "+condition);
		return condition;
	}
	private String Check_sentinel(String type0 ,String type1,String if_condition,String inital,String condtition,String step)
	{
		//System.out.println("Debug 1 "+type0+" ��If "+type0+" condition "+if_condition+" inital"+inital+" condtition"+condtition+" step"+step);
		if(type1.toString().equals("If"))
		{			
			String sentinel_type = type0+" "+type1;
			for(int j =0;j<send2SemanticAnalsis_sentinel.size();j++)
			{			
				if(sentinel_type.equals(send2SemanticAnalsis_sentinel.get(j))
				&&if_condition.replace(" ", "").equals(send2SemanticAnalsis_sentinel.get(j+1))
				&&send2SemanticAnalsis_sentinel.get(j+2).equals("break"))
				{
					return "break";
				}
				else if(condtition.indexOf("!=")!=-1)
				{
					return "!=";						
				}
			}			
		}	
		else if(condtition.indexOf("!=")!=-1)
		{
			return "!=";						
		}
		return "false";		
	}
	private String For_loop(String initial_value,String final_value,String step_value,String For_type)
	{
		String[] For_first = null;
		String For_first_operator = initial_value.replace(" ", "").replace(";", "").replaceAll("[a-z]","").replaceAll("[A-Z]","").replaceAll("[0-9]","");
		String[] For_second = final_value.replace(" ", "").replace(";", "").split(">=|<=|<|>");
		String For_second_operator = final_value.replace(" ", "").replace(";", "").replaceAll("[a-z]","").replaceAll("[A-Z]","").replaceAll("[0-9]","");
		String For_third = step_value.replace(" ", "").replace(";", "");
		ArrayList<String> First_array = new ArrayList<String>();
		ArrayList<String> Second_array = new ArrayList<String>();
		ArrayList<String> Third_array = new ArrayList<String>();
		String Left="";
		String Right ="";
				
		if(For_type.equals("For_declare"))//��int
		{
			For_first = initial_value.replace("int", "").replace("char", "").replace(" ", "").replace(";", "").split(">=|<=|<|>|=");
		}
		else
		{
			For_first = initial_value.replace(" ", "").replace(";", "").split(">=|<=|<|>|=");
		}
		
		for(String f:For_first)
		{
			First_array.add(f);	
		}
		for(String s:For_second)
		{
			Second_array.add(s);
		}
			
	    For_first_operator = For_first_operator.replace("+","").replace("-", "").replace("*", "").replace("/", "");
	    For_second_operator = For_second_operator.replace("+","").replace("-", "").replace("*", "").replace("/", "");
		First_array.add(For_first_operator);
		Second_array.add(For_second_operator);	
		
		Third_array.add(For_third.replaceAll("[a-z]","").replaceAll("[A-Z]","").replaceAll("[0-9]",""));
		
		//VarUsingInFor(First_array,Second_array);
		
		switch(Third_array.get(0))
		{
		
		case "--":
			if(Second_array.get(2).equals(">"))
			{
				VarUsingInFor(First_array.get(0));	
				//System.out.println("��,�k :"+First_array.get(0)+","+First_array.get(1));
				Right =First_array.get(1);
				if(Need2ChangeVar(First_array.get(1))==true)//�@�m���ܼƪ��T�{
				{
					Right = Change_Varable(First_array.get(1));
				}				
				if(Second_array.get(1).equals("0"))
				{
					Right = For_assignment_RootStructure(Right) +" -1";
					return Right;
				}
				try
				 {
					if(Integer.parseInt(Second_array.get(1))>1)
					{						
						Right = For_assignment_RootStructure(Right)+" - "+(Integer.parseInt(Second_array.get(1))-1);
						return Right;
					}
					else
					{
						return Right;
					}
				 }
				catch(NumberFormatException e)
				 {
					return Right;
				 }
								
			}
			else if(Second_array.get(2).equals(">="))
			{
				VarUsingInFor(First_array.get(0));//��sToF��
				
				Right =First_array.get(1);
				if(Need2ChangeVar(First_array.get(1))==true)
				{
					Right = Change_Varable(First_array.get(1));
				}				
				if(Second_array.get(1).equals("0"))
				{
					Right = For_assignment_RootStructure(Right) +" +1";
					return Right;
				}
				if(Second_array.get(1).equals("1"))
				{
					return Right;
				}
				try
				 {
					if(Integer.parseInt(Second_array.get(1))>1)
					{
						Right = For_assignment_RootStructure(Right)+" - "+(Integer.parseInt(Second_array.get(1))+1);
						return Right;
					}
					else
					{
						return Right;
					}
				 }
				catch(NumberFormatException e)
				 {
					return Right;
				 }
				
			}
				break;
		case "++":
				
				if(Second_array.get(2).equals("<"))
				{
					 VarUsingInFor(Second_array.get(0));//��sToF�� (Left,Right)
					 Right = Second_array.get(1);
					 if(Need2ChangeVar(Second_array.get(1))==true)
					 {
						 Right = Change_Varable(Second_array.get(1));
					 }
					 if(First_array.get(1).equals("0"))
					 {
						 Right = For_assignment_RootStructure(Right);
						 return Right;
					 }
					 else if(First_array.get(1).equals("1"))
					 {
						 Right = For_assignment_RootStructure(Right) +" -1";
						 return Right;
					 }
					 
					 try//���ժ�l�Ȫ�assign�O���O�Ʀr
					 {
						 if(Integer.parseInt(First_array.get(1))>1)
						 {
							Right = For_assignment_RootStructure(Right)+" - "+(Integer.parseInt(First_array.get(1))-1);
							return Right;
						 }
						 else
						 {
							return Right;
						 }
					 }
					 catch(NumberFormatException e)//��Ʀr ���� �N���ܼ�
					 {
						 return Right;
					 }
					 
				}
				else if(Second_array.get(2).equals("<="))
				{
					 VarUsingInFor(Second_array.get(0));//��sToF�� (Left,Right)
					 Right = Second_array.get(1);
					 if(Need2ChangeVar(Second_array.get(1))==true)
					 {
						 Right = Change_Varable(Second_array.get(1));
					 }
					 if(First_array.get(1).equals("0"))//0
					 {
						 Right = For_assignment_RootStructure(Right)+" +1";
						 return Right;
					 }
					 try//���ժ�l�Ȫ�assign�O���O�Ʀr
					 {
						 if(Integer.parseInt(First_array.get(1))>1)
						 {
							Right = For_assignment_RootStructure(Right)+" - "+(Integer.parseInt(First_array.get(1))-1);
							return Right;
						 }
						 else
						 {
								return Right;
						 }
					 }
					 catch(NumberFormatException e)//��Ʀr ���� �N���ܼ�
					 {
						 return Right;
					 }
					 
				}
				
				break;
		}
		
		
		
//		System.out.println("1."+First_array);
//		System.out.println("2."+Second_array);
//		System.out.println("3."+Third_array);
		return "�m���ܼƥ���";		
	}
	private String For_assignment_RootStructure(String Var)//�ثe�L�k�P�_ �ŧi���O�b�j��̭����� �ѨM��k�N�O�����L�@��for����l�� = �����s declare
	{
		
		String Temp="";
		//System.out.println("1.����root�i�J��� :"+ Var);
		//�U��l�Ȭ� = declare_assignment 
		//�ŧi�ܼƬ� = declare
		for(int i =0;i<declare.size();i++)
		{
			if(declare.get(i).equals(Var))
			{
				if(CinIsDeclare.get(i).equals("False")&&declare_assignment.get(i)!="Null")//���Ocin
				{
					Temp = declare_assignment.get(i);
					//System.out.println("2.temp����root�i�J��� :"+ Temp);
					try//�N�L�յ��ഫ���Ʀr
					{
						Integer.parseInt(Temp);
						//System.out.println("3.����root�૬���\");
						Temp = Var;
					}
					catch(NumberFormatException e)
					{
						For_assignment_RootStructure(Temp);
					}					
				}
				else //�Ocin
				{
					Temp = Var;					
				}
				//����ܼ�
				
			}
			
			
		}
		if(Temp.length()==0) return Var;		
		else return Temp;
		
	}
	private void VarUsingInFor(String intial)
	{
		
			ArrayList<String> all = new ArrayList<String>();
			ArrayList<String> VarUsingInFor = new ArrayList<String>();
			all.add(intial);
			
				
		
		   //bug VarUsingInFor new ���|��s�᭱���ܼ�
			int count = 0;
			for(int u = 0;u <declare.size();u++)//�j
			{	
			  for(int k=0;k<all.size();k++)//�p
			  {				
					
					if(all.get(k).replace(" ", "").equals(declare.get(u).replace(" ", "")))
					{
						VarUsingInFor.add("True");
						break;
					}
					else
					{
						if((k) == all.size()-1)
						{
						 VarUsingInFor.add("False");
						 break;
						}	
						continue;
					}					
								
			  }			
			}
			//��s
			Update_For_ToF(For_ToF,VarUsingInFor); 
			//For_ToF = VarUsingInFor;
//			System.out.println("@��Bug : old = " + For_ToF + " new = "+ VarUsingInFor);
//			System.out.println("@declare : "+declare);
//			System.out.println("@all : "+all);
			System.out.println("�ϥΦbFor ="+For_ToF);	
			System.out.println("------------------------------------------");

		
	}
	private void Update_For_ToF(ArrayList<String> old_ToF,ArrayList<String> new_ToF)//��s��
	{
		ArrayList<String> new_data= new ArrayList<String>();
		
		if(old_ToF.size()==0)
		{
			For_ToF = new_ToF;
		}
		else
		{
			
			for(int i =0;i<old_ToF.size();i++)
			{
				if(old_ToF.get(i).toString()=="True"||new_ToF.get(i).toString()=="True")
				{
					new_data.add("True");
				}
				else if(old_ToF.get(i).toString()=="True"&&new_ToF.get(i).toString()=="False")
				{
					new_data.add("True");
				}
				else if(old_ToF.get(i).toString()=="False"&&new_ToF.get(i).toString()=="True")
				{
					new_data.add("True");
				}
				else if(old_ToF.get(i).toString()=="False"&&new_ToF.get(i).toString()=="False")
				{
					new_data.add("False");
				}
			}
			For_ToF.clear();
			For_ToF = new_data;
			
		}
		//System.out.println("��s "+new_data+old_ToF.size());
	}
	private String Change_Varable(String Change)
	{
		ArrayList<String> rigster_var = new ArrayList<String>();
		ArrayList<String> rigster_Operator = new ArrayList<String>();
		ArrayList<String> Changed_output = new ArrayList<String>();
		ArrayList<String> var = new ArrayList<String>();
		String[] split_C = Change.split("[*]|[+]|[-]|[/]");
		String[] split_opreator = null;
		String opreator = Change;
		String output = "";
		int count = 0;
		for(String a:split_C)
		{
			rigster_var.add(a);
		}
		
//		�ȵL�Ψ� �N+-*/�����X��
//		for(int i=0;i<rigster_var.size();i++)
//		{
//			if(i==0)
//			{
//				opreator = opreator.replace(rigster_var.get(i), "");
//			}
//			opreator = opreator.replace(rigster_var.get(i), " ");//�ΪťհϤ�
//		}
//		split_opreator = opreator.split(" ");		
//		for(String a:split_opreator)
//		{
//			rigster_Operator.add(a);
//		}
		
		//��靈���D �n��
		//rigster_var == word
		//�����N��k�O�Q�αN�ª���Ƨ��̭������󤣬Ocin �M ���O for�̭��� �ܼ� �ӥB�� ��l�ƭȱo���N
		Changed_output.add(Change);
			for(int j =0 ;j<rigster_var.size();j++)
			{
				for(int k=0;k<declare.size();k++)
				{
					if(count!=rigster_var.size())
					{
						if(rigster_var.get(j).equals(declare.get(k)))
						{
							count = j;
							if(CinIsDeclare.get(k).equals("False")&&For_ToF.get(k).equals("False"))
							{
								if(declare_assignment.get(k)!="Null")
								{
									if(Changed_output.size()!=0)
									{
										Changed_output.add(Changed_output.get(Changed_output.size()-1).replace(rigster_var.get(j),declare_assignment.get(k)));
										output = Changed_output.get(Changed_output.size()-1);
										
									}
									else
									{
										//Change ==For_Complete_structure
										output=Change.replace(rigster_var.get(j),declare_assignment.get(k));
									}
									Changed_output.add(output);
									count++;
								}
								else if(declare_assignment.get(k)=="Null")
								{
									output=Changed_output.get(Changed_output.size()-1).replace(rigster_var.get(j),declare.get(k));
									Changed_output.add(output);
								}
							}
							
						}
					}
					
				}
			}

		
		System.out.println("�w���� = "+rigster_var);
		System.out.println("�B�⤸ = "+rigster_Operator);
		System.out.println("�����N�� = "+Changed_output);
		
		if(Changed_output.size()>0)
		{
			String out = Changed_output.get(Changed_output.size()-1);
			return out;
		}
		else
		{
			return "�������~(���˹�Change_Varable�禡)";
		}
		
	}
	private Boolean Need2ChangeVar(String Var)
	{
		if(Var.indexOf("/")!=-1||Var.indexOf("*")!=-1||Var.indexOf("-")!=-1||Var.indexOf("+")!=-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	private String While_loop(String condition)
	{
		//�o��n��s�@�U �ŧi�ܼ� ��l��
	
		//System.out.println("@ <  condition :"+condition);
		String Buffer_operator = "";
		ArrayList<String> condition_var = new ArrayList<String>();
		ArrayList<String> operator = new ArrayList<String>();
		String[] cut =null;
				
		Buffer_operator = condition.replace(" ", "").replaceAll("[a-z]","").replaceAll("[A-Z]","").replaceAll("[0-9]","").replace("+","").replace("-","").replace("*","").replace("/","");	
		//System.out.println("@ <  Buffer_operator.replace :"+Buffer_operator);
		for(int i =0;i<3;i++)
		{
		   cut = condition.replace(" ", "").split(">=|<=|<|>");
		 		   
		}
		for(String a:cut)
		{
			condition_var.add(a);//�B��Ÿ��w�Q����			
		}
		//System.out.println("@ <  Buffer_operator :"+Buffer_operator);
		
		if(Buffer_operator.equals("<"))
		{		
			//System.out.println("@ <  operator :"+Buffer_operator);
			for(int i =0;i<declare.size();i++)
			{		
				if(declare.get(i).equals(condition_var.get(0)))
				{					
					if(declare_inital_ToF.get(i).equals("True"))
					{
						 if(declare_assignment.get(i)!="Null")//�٧�1051507-2.cpp & 1053333-0.cpp BUG
						 {
							int assign = Integer.valueOf(declare_assignment.get(i));
							
							if(assign==0)
							{
								return condition_var.get(1)+" ��";
							}
							else if(assign >0)
							{
								return condition_var.get(1)+" - "+declare_assignment.get(i)+" ��";
							}
							
						 }
					}
				}				
			}
			
		}
		if(Buffer_operator.equals(">"))
		{
			//System.out.println("@ >  operator :"+Buffer_operator);
			//���է䥪�䪺�ܼƬO�_�� ��� �٬O ��assignment	
			try 
			{ //�� ��� 
				int ConVey_Right = Integer.valueOf(condition_var.get(1));
				if(ConVey_Right==0)//0
				{
					return condition_var.get(0)+" ��";
				}
				else if(ConVey_Right>0)
				{
					return condition_var.get(0)+" - "+ condition_var.get(1) +" ��";
				}
				
			}
			catch(NumberFormatException e)
			{ //��assignment
				for(int i =0;i<declare.size();i++)
				{
					if(condition_var.get(1).equals(declare.get(i)))
					{
						if(declare_inital_ToF.get(i).equals("True"))
						{
							if(declare_assignment.get(i)!="Null")
							{
								int assign = Integer.valueOf(declare_assignment.get(i));
								if(assign==0)
								{
									return condition_var.get(0)+" ��";
								}
								else if(assign>0)
								{
									return condition_var.get(0)+" - "+ declare_assignment.get(i) +" ��";
								}
							}
						}
					}
				}
			}
		}
		if(Buffer_operator.equals("<="))
		{
			//System.out.println("@ <=  operator :"+Buffer_operator);
			try 
			{
				int ConVey_Left = Integer.valueOf(condition_var.get(0));
				if(ConVey_Left==0)
				{
					return condition_var.get(1)+" + 1 ��";
				}
				else if(ConVey_Left==1)
				{
					return condition_var.get(1)+" ��";					
				}
				else if(ConVey_Left>1)
				{
					return condition_var.get(1)+" - "+(ConVey_Left-1)+" ��";	
				}
			
			}
			catch(NumberFormatException e)
			{
				for(int i =0;i<declare.size();i++)
				{
					if(condition_var.get(0).equals(declare.get(i)))
					{
						if(declare_inital_ToF.get(i).equals("True"))
						{
							if(declare_assignment.get(i)!="Null")
							{
								int assign = Integer.valueOf(declare_assignment.get(i));
								//System.out.println("@ <=  assign :"+assign + " declare.get " +declare.get(i));
								if(assign==0)
								{
									return condition_var.get(1)+" + 1 ��";
								}
								else if(assign==1)
								{
									return condition_var.get(1)+" ��";					
								}
								else if(assign>1)
								{
									return condition_var.get(1)+" - "+(assign-1)+" ��";	
								}
								
							}
						}
					}
				}
			}
		}		
		if(Buffer_operator.equals(">="))
		{
			//System.out.println("@ <=  operator :"+Buffer_operator);
			try 
			{
				int ConVey_Right = Integer.valueOf(condition_var.get(1));
				if(ConVey_Right==0)
				{
					return condition_var.get(0)+" + 1 ��";
				}
				else if(ConVey_Right==1)
				{
					return condition_var.get(0)+" ��";					
				}
				else if(ConVey_Right>1)
				{
					return condition_var.get(0)+" - "+(ConVey_Right-1)+" ��";	
				}
			
			}
			catch(NumberFormatException e)
			{
				for(int i =0;i<declare.size();i++)
				{
					if(condition_var.get(1).equals(declare.get(i)))
					{
						if(declare_inital_ToF.get(i).equals("True"))
						{
							if(declare_assignment.get(i)!="Null")
							{
								int assign = Integer.valueOf(declare_assignment.get(i));
								if(assign==0)
								{
									return condition_var.get(0)+" + 1 ��";
								}
								else if(assign==1)
								{
									return condition_var.get(0)+" ��";					
								}
								else if(assign>1)
								{
									return condition_var.get(0)+" - "+(assign-1)+" ��";	
								}
								
							}
						}
					}
				}
			}
		}	
		
		
		//System.out.println("���ո��:"+condition_var+"operator :"+Buffer_operator);
	
		return "";
		
	}
	
	private void declare()
	{		
		/*�D�n�B�zdeclare �N�L����
		 */
//		System.out.println("declare_times :"+declare_times);
//		System.out.println("declare SA = "+send2SemanticAnalsis_declare);
		ArrayList<String> da_array = new ArrayList<String>();
		
		
		for(int j =0;j<declare_times;j++)//�B�z��int��declare
		{
			//�h�Y�h��
			declare_arraylist.add(send2SemanticAnalsis_declare.get(j).replace("int","").replace("char", "").replace(";", "").replace(" ", ""));			
			System.out.println("@declare = "+send2SemanticAnalsis_declare);
			String[] split_delcares = 	declare_arraylist.get(j).replace(" ", "").split(",");
			for(String split_delcare:split_delcares)
			{
				
				cut_declare_arraylist.add(split_delcare);//�N�B�z�n����Φn���s��cut_declare_arraylist
														 //�ت��N�O���H�b�@�_�ŧi���ܼƩ�}				
			}
						
		}
				
		for(int i =0;i<cut_declare_arraylist.size();i++)
		{
			
			if(cut_declare_arraylist.get(i).indexOf("=") != -1)
			{	
//				System.out.println("��assign : "+cut_declare_arraylist.get(i));
				declare_inital_ToF.add("True");
				
				String da = cut_declare_arraylist.get(i);
				String[] da_split = da.split("=");
				
				for(int j=0;j<da_split.length;j++)
				{
					
					da_array.add(da_split[j]);
					if(((j*1)+1)%2==0)
					{
						declare_assignment.add(da_split[j]);						
					}
					else
					{
						declare.add(da_split[j]);
					}
				
				}
				
			}
			else
			{
				declare.add(cut_declare_arraylist.get(i));
				declare_inital_ToF.add("False");
				declare_assignment.add("Null");
			}
			
		}
		
		
		System.out.println("�ŧi���� = "+declare_times +" ��");
		System.out.println("�ŧi�ܼƦ� = "+cut_declare_arraylist.size()+" ��");
		System.out.println("�ŧi�ܼƦ� = "+declare_arraylist);
		System.out.println("�O�_����l = "+declare_inital_ToF);
		System.out.println("�ŧi�ܼƬ� = "+declare);
		System.out.println("�U��l�Ȭ� = "+declare_assignment);
		
		
		
	}	
	private void cin()//�ثe�w�g�����X�ӤFDECLARE���U�ӬO�N�ܼƧP�_�O�_��CIN�ܼ�
	{

		for(int i =0;i<send2SemanticAnalsis_cin.size();i++)	
		{
		
			String split_cin = send2SemanticAnalsis_cin.get(i).replace("cin>>","").replace(" ", "");	
			for_cin_arraylist.add(split_cin);
		}
//		System.out.println("cin "+for_cin_arraylist);
		
		/*�P�_�O���Ocin �ܼ�
		 * �U�����hFOR�g�k �u�n�����Cin�N�n�諸��196����� �P�_For�j��O�_�O�ܼƨϥ�
		 * �n���@��count����L���TRUE���|���X�j��h��U�@��
		 * */	
		//System.out.println("for_cin_arraylist: "+for_cin_arraylist+"declare: "+declare);
		for(int j=0;j<declare.size();j++)
		{
			for(int k =0 ;k<for_cin_arraylist.size();k++)
			{
				if(declare.get(j).equals(for_cin_arraylist.get(k)))
				{
					CinIsDeclare.add("True");
					break;
				}
				else if(k==for_cin_arraylist.size()-1)
				{
					CinIsDeclare.add("False");
					break;
				}		
			}
			
		}			
		System.out.println("�O�_��Cin = " + CinIsDeclare+"\n"+"cin = "+for_cin_arraylist );
		System.out.println("*********************************************");
//		System.out.println("cin "+for_cin_arraylist);
	}
	private ArrayList<String> Sa_Set_Loop_type;
	private ArrayList<String> Sa_Set_Loop_Strategy;
	private ArrayList<String> Sa_Set_Loop_Times;
	private void Set_Loop_type(ArrayList<String> input)
	{		
		Sa_Set_Loop_type = input;
	}
	private void Set_Loop_Strategy(ArrayList<String> input)
	{		
		Sa_Set_Loop_Strategy = input;
	}
	private void Set_Loop_Times(ArrayList<String> input)
	{		
		Sa_Set_Loop_Times = input;
	}
	
	public ArrayList<String> Sa_Get_Loop_type()
	{
		return Sa_Set_Loop_type;
	}
	public ArrayList<String> Sa_Get_Loop_Strategy()
	{
		return Sa_Set_Loop_Strategy;
	}
	public ArrayList<String> Sa_Get_Loop_Times()
	{
		return Sa_Set_Loop_Times;
	}
	
	
	
	public ArrayList<String> LoopTimes()//�ǥX�j�馸�� GCF�X�f ��X�ܦ��e�Ϥ�k�N�O�N�L���LoopTime ArrayList�̭� GP.java���z�|call�L�N�̭�String���X�ӵe
	{
		return LoopTimes;		
	}
	
}
	
