package analysis;

import java.awt.List;
import java.util.ArrayList;



public class SemanticAnalysis {
	
	
	private ArrayList<String> send2SemanticAnalsis = new ArrayList<String>();//未處理過資料
	private ArrayList<String> send2SemanticAnalsis_cin = new ArrayList<String>();//未處理過資料
	private ArrayList<String> send2SemanticAnalsis_declare = new ArrayList<String>();//未處理過資料	
	private ArrayList<String> send2SemanticAnalsis_sentinel = new ArrayList<String>();//未處理過資料
	
	private ArrayList<String> for_cin_arraylist = new ArrayList<String>();//處理過
	private ArrayList<String> declare_arraylist = new ArrayList<String>();//字串處理過將變數提取後存的陣列
	private ArrayList<String> declare_assignment = new ArrayList<String>();//儲存各assign值
	private ArrayList<String> declare_inital_ToF = new ArrayList<String>();//儲存是否是初始值
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
		System.out.println("有Jump迴圈 = "+send2SemanticAnalsis_sentinel);
		System.out.println("迴圈種類 = "+type);
		System.out.println("要素 =　" + this.send2SemanticAnalsis);
		System.out.println("宣告 =　" + declare_times);
		CountLoopTime(type,this.send2SemanticAnalsis,declare);//新 (迴圈分類機制)
		System.out.println("迴圈策略 = "+LoopStrategy);
		System.out.println("迴圈語意 = "+LoopTimes);
		System.out.println("------------------------------------------");
		Set_Loop_type(type);
		Set_Loop_Strategy(LoopStrategy);
		Set_Loop_Times(No_Chinese_Loop_times);
		//System.out.println("進入資料 : "+this.send2SemanticAnalsis);
	}
	private void CountLoopTime(ArrayList<String> type,ArrayList<String> data,ArrayList<String> declare)//new 
	{
		
		
		ArrayList<String> Date = new ArrayList<String>();
		Date = data;
		declare();//宣告變數偵測機制
		cin();//CIN變數偵測機制
		int tatol=0;
		for(int i =0 ;i<type.size();i++)//如果有發現資料錯誤可能是Date陣列的資料近來有問題 被remove掉了
		{
			switch(type.get(i))
			{
				case "While" :
					// 2/15如果要加入置換變數 流程式 先檢查她是不是有Need2ChangeVar(運算符號)有再進去置換 先用檢查While ToF(新增)來檢查變數 在置換 Change_Varable
					String While_time = "";
					try
					{
						System.out.println("抓哨兵值 = "+type.get(i) +type.get(i+1)+Date.get(tatol+1)+Date.get(tatol));
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+1),"",Date.get(tatol),""))
						{				
							case "break":
								While_time = sentinel_Condition_Detect(Date.get(tatol+1));
								No_Chinese_Loop_times.add(While_time.replace("次", ""));
								LoopTimes.add("While : 哨兵條件("+While_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;
							case "!=":
								While_time = sentinel_Condition_Detect(Date.get(tatol));
								No_Chinese_Loop_times.add(While_time.replace("次", ""));
								LoopTimes.add("While : 哨兵條件("+While_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;
							case "false":
								While_time = While_loop(Date.get(tatol));
								No_Chinese_Loop_times.add(While_time.replace("次", ""));
								LoopTimes.add("While 次數 : "+While_time);//計數型	
								LoopStrategy.add("Counter Loop");
								break;
						}

					}
					catch(Exception e)
					{
						While_time = While_loop(Date.get(tatol));
						No_Chinese_Loop_times.add(While_time.replace("次", ""));
						LoopTimes.add("While 次數 : "+While_time);//計數型		
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
								No_Chinese_Loop_times.add(DoWhile_time.replace("次", ""));
								LoopTimes.add("While : 哨兵條件("+DoWhile_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;
							case "!=":
								DoWhile_time = sentinel_Condition_Detect(Date.get(tatol));
								No_Chinese_Loop_times.add(DoWhile_time.replace("次", ""));
								LoopTimes.add("While : 哨兵條件("+DoWhile_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;
							case "false":
								DoWhile_time = While_loop(Date.get(tatol));
								No_Chinese_Loop_times.add(DoWhile_time.replace("次", ""));
								LoopTimes.add("While 次數 : "+DoWhile_time);//計數型	
								LoopStrategy.add("Counter Loop");
								break;
						}	
						
					}
					catch(Exception e)
					{
						DoWhile_time = While_loop(Date.get((tatol+1)));
						No_Chinese_Loop_times.add(DoWhile_time.replace("次", ""));
						LoopTimes.add("Do_While 次數 : "+DoWhile_time);//計數型
						LoopStrategy.add("Counter Loop");
					}	
					//System.out.println("Do_while起始 "+(tatol+1));
					tatol = tatol+2;
					break;					
				case "For_declare":	//for的次數偵測只對有初始條件 終止條件 跟 變化條件 三個滿足才能偵測 否則會error	
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
								LoopTimes.add("For : 哨兵條件("+For_declare_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;					
							case "false":
								For_declare_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
								No_Chinese_Loop_times.add(For_declare_time);
								LoopTimes.add("For 次數 : "+For_declare_time);//計數型
								LoopStrategy.add("Counter Loop");
								break;
						}	

					}
					catch(Exception e)
					{
						For_declare_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
						No_Chinese_Loop_times.add(For_declare_time);
						LoopTimes.add("For 次數 : "+For_declare_time);//計數型
						LoopStrategy.add("Counter Loop");
					}
					//System.out.println("For_declare起始 "+tatol);
					tatol = tatol+3;
					break;
				case "For_inital":	//for的次數偵測只對有初始條件 終止條件 跟 變化條件 三個滿足才能偵測 否則會error
					//System.out.println("For_declare "+Date.get(tatol+3));
					String For_inital_time = "";
					try
					{
						
						switch(Check_sentinel(type.get(i) ,type.get(i+1),Date.get(tatol+3),Date.get(tatol),Date.get(tatol+1),Date.get(tatol+2)))
						{
							case "break":
								For_inital_time = sentinel_Condition_Detect(Date.get(tatol+3));
								No_Chinese_Loop_times.add(For_inital_time);
								LoopTimes.add("For : 哨兵條件("+For_inital_time+")");//哨兵偵測
								LoopStrategy.add("Sentinel Loop");
								break;					
							case "false":
								For_inital_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_declare");
								No_Chinese_Loop_times.add(For_inital_time);
								LoopTimes.add("For 次數 : "+For_inital_time);//計數型
								LoopStrategy.add("Counter Loop");
								break;
						}

					}
					catch(Exception e)
					{
						For_inital_time = For_loop(Date.get(tatol),Date.get((tatol+1)),Date.get((tatol+2)),"For_inital");
						No_Chinese_Loop_times.add(For_inital_time);
						LoopTimes.add("For 次數 : "+For_inital_time);//計數型
						LoopStrategy.add("Counter Loop");
					}

					//System.out.println("For_ini起始 "+tatol);
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
		//System.out.println("哨兵條件 "+condition);
		return condition;
	}
	private String Check_sentinel(String type0 ,String type1,String if_condition,String inital,String condtition,String step)
	{
		//System.out.println("Debug 1 "+type0+" 抓If "+type0+" condition "+if_condition+" inital"+inital+" condtition"+condtition+" step"+step);
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
				
		if(For_type.equals("For_declare"))//有int
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
				//System.out.println("左,右 :"+First_array.get(0)+","+First_array.get(1));
				Right =First_array.get(1);
				if(Need2ChangeVar(First_array.get(1))==true)//作置換變數的確認
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
				VarUsingInFor(First_array.get(0));//更新ToF表
				
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
					 VarUsingInFor(Second_array.get(0));//更新ToF表 (Left,Right)
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
					 
					 try//嘗試初始值的assign是不是數字
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
					 catch(NumberFormatException e)//轉數字 失敗 代表為變數
					 {
						 return Right;
					 }
					 
				}
				else if(Second_array.get(2).equals("<="))
				{
					 VarUsingInFor(Second_array.get(0));//更新ToF表 (Left,Right)
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
					 try//嘗試初始值的assign是不是數字
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
					 catch(NumberFormatException e)//轉數字 失敗 代表為變數
					 {
						 return Right;
					 }
					 
				}
				
				break;
		}
		
		
		
//		System.out.println("1."+First_array);
//		System.out.println("2."+Second_array);
//		System.out.println("3."+Third_array);
		return "置換變數失敗";		
	}
	private String For_assignment_RootStructure(String Var)//目前無法判斷 宣告不是在迴圈裡面的值 解決辦法就是先掃過一變for的初始值 = 之後更新 declare
	{
		
		String Temp="";
		//System.out.println("1.測試root進入資料 :"+ Var);
		//各初始值為 = declare_assignment 
		//宣告變數為 = declare
		for(int i =0;i<declare.size();i++)
		{
			if(declare.get(i).equals(Var))
			{
				if(CinIsDeclare.get(i).equals("False")&&declare_assignment.get(i)!="Null")//不是cin
				{
					Temp = declare_assignment.get(i);
					//System.out.println("2.temp測試root進入資料 :"+ Temp);
					try//將他試著轉換成數字
					{
						Integer.parseInt(Temp);
						//System.out.println("3.測試root轉型成功");
						Temp = Var;
					}
					catch(NumberFormatException e)
					{
						For_assignment_RootStructure(Temp);
					}					
				}
				else //是cin
				{
					Temp = Var;					
				}
				//找到變數
				
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
			
				
		
		   //bug VarUsingInFor new 不會更新後面的變數
			int count = 0;
			for(int u = 0;u <declare.size();u++)//大
			{	
			  for(int k=0;k<all.size();k++)//小
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
			//更新
			Update_For_ToF(For_ToF,VarUsingInFor); 
			//For_ToF = VarUsingInFor;
//			System.out.println("@抓Bug : old = " + For_ToF + " new = "+ VarUsingInFor);
//			System.out.println("@declare : "+declare);
//			System.out.println("@all : "+all);
			System.out.println("使用在For ="+For_ToF);	
			System.out.println("------------------------------------------");

		
	}
	private void Update_For_ToF(ArrayList<String> old_ToF,ArrayList<String> new_ToF)//更新表
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
		//System.out.println("更新 "+new_data+old_ToF.size());
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
		
//		暫無用到 將+-*/提取出來
//		for(int i=0;i<rigster_var.size();i++)
//		{
//			if(i==0)
//			{
//				opreator = opreator.replace(rigster_var.get(i), "");
//			}
//			opreator = opreator.replace(rigster_var.get(i), " ");//用空白區分
//		}
//		split_opreator = opreator.split(" ");		
//		for(String a:split_opreator)
//		{
//			rigster_Operator.add(a);
//		}
		
		//比對有問題 要改
		//rigster_var == word
		//此取代方法是利用將舊的資料找到裡面的條件不是cin 和 不是 for裡面的 變數 而且有 初始化值得取代
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

		
		System.out.println("已分割 = "+rigster_var);
		System.out.println("運算元 = "+rigster_Operator);
		System.out.println("未取代完 = "+Changed_output);
		
		if(Changed_output.size()>0)
		{
			String out = Changed_output.get(Changed_output.size()-1);
			return out;
		}
		else
		{
			return "偵測有誤(請檢察Change_Varable函式)";
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
		//這邊要更新一下 宣告變數 初始值
	
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
			condition_var.add(a);//運算符號已被切掉			
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
						 if(declare_assignment.get(i)!="Null")//菱形1051507-2.cpp & 1053333-0.cpp BUG
						 {
							int assign = Integer.valueOf(declare_assignment.get(i));
							
							if(assign==0)
							{
								return condition_var.get(1)+" 次";
							}
							else if(assign >0)
							{
								return condition_var.get(1)+" - "+declare_assignment.get(i)+" 次";
							}
							
						 }
					}
				}				
			}
			
		}
		if(Buffer_operator.equals(">"))
		{
			//System.out.println("@ >  operator :"+Buffer_operator);
			//嘗試找左邊的變數是否為 整數 還是 有assignment	
			try 
			{ //為 整數 
				int ConVey_Right = Integer.valueOf(condition_var.get(1));
				if(ConVey_Right==0)//0
				{
					return condition_var.get(0)+" 次";
				}
				else if(ConVey_Right>0)
				{
					return condition_var.get(0)+" - "+ condition_var.get(1) +" 次";
				}
				
			}
			catch(NumberFormatException e)
			{ //有assignment
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
									return condition_var.get(0)+" 次";
								}
								else if(assign>0)
								{
									return condition_var.get(0)+" - "+ declare_assignment.get(i) +" 次";
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
					return condition_var.get(1)+" + 1 次";
				}
				else if(ConVey_Left==1)
				{
					return condition_var.get(1)+" 次";					
				}
				else if(ConVey_Left>1)
				{
					return condition_var.get(1)+" - "+(ConVey_Left-1)+" 次";	
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
									return condition_var.get(1)+" + 1 次";
								}
								else if(assign==1)
								{
									return condition_var.get(1)+" 次";					
								}
								else if(assign>1)
								{
									return condition_var.get(1)+" - "+(assign-1)+" 次";	
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
					return condition_var.get(0)+" + 1 次";
				}
				else if(ConVey_Right==1)
				{
					return condition_var.get(0)+" 次";					
				}
				else if(ConVey_Right>1)
				{
					return condition_var.get(0)+" - "+(ConVey_Right-1)+" 次";	
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
									return condition_var.get(0)+" + 1 次";
								}
								else if(assign==1)
								{
									return condition_var.get(0)+" 次";					
								}
								else if(assign>1)
								{
									return condition_var.get(0)+" - "+(assign-1)+" 次";	
								}
								
							}
						}
					}
				}
			}
		}	
		
		
		//System.out.println("測試資料:"+condition_var+"operator :"+Buffer_operator);
	
		return "";
		
	}
	
	private void declare()
	{		
		/*主要處理declare 將他分割
		 */
//		System.out.println("declare_times :"+declare_times);
//		System.out.println("declare SA = "+send2SemanticAnalsis_declare);
		ArrayList<String> da_array = new ArrayList<String>();
		
		
		for(int j =0;j<declare_times;j++)//處理有int的declare
		{
			//去頭去尾
			declare_arraylist.add(send2SemanticAnalsis_declare.get(j).replace("int","").replace("char", "").replace(";", "").replace(" ", ""));			
			System.out.println("@declare = "+send2SemanticAnalsis_declare);
			String[] split_delcares = 	declare_arraylist.get(j).replace(" ", "").split(",");
			for(String split_delcare:split_delcares)
			{
				
				cut_declare_arraylist.add(split_delcare);//將處理好跟分割好的存到cut_declare_arraylist
														 //目的就是把黏在一起宣告的變數拆開				
			}
						
		}
				
		for(int i =0;i<cut_declare_arraylist.size();i++)
		{
			
			if(cut_declare_arraylist.get(i).indexOf("=") != -1)
			{	
//				System.out.println("有assign : "+cut_declare_arraylist.get(i));
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
		
		
		System.out.println("宣告次數 = "+declare_times +" 次");
		System.out.println("宣告變數有 = "+cut_declare_arraylist.size()+" 個");
		System.out.println("宣告變數有 = "+declare_arraylist);
		System.out.println("是否有初始 = "+declare_inital_ToF);
		System.out.println("宣告變數為 = "+declare);
		System.out.println("各初始值為 = "+declare_assignment);
		
		
		
	}	
	private void cin()//目前已經提取出來了DECLARE接下來是將變數判斷是否為CIN變數
	{

		for(int i =0;i<send2SemanticAnalsis_cin.size();i++)	
		{
		
			String split_cin = send2SemanticAnalsis_cin.get(i).replace("cin>>","").replace(" ", "");	
			for_cin_arraylist.add(split_cin);
		}
//		System.out.println("cin "+for_cin_arraylist);
		
		/*判斷是不是cin 變數
		 * 下面雙層FOR寫法 只要有兩個Cin就要改的跟196行附近 判斷For迴圈是否是變數使用
		 * 要有一個count防止他抓到TRUE不會跳出迴圈去找下一個
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
		System.out.println("是否為Cin = " + CinIsDeclare+"\n"+"cin = "+for_cin_arraylist );
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
	
	
	
	public ArrayList<String> LoopTimes()//傳出迴圈次數 GCF出口 輸出變成畫圖方法就是將他丟到LoopTime ArrayList裡面 GP.java那理會call他將裡面String拿出來畫
	{
		return LoopTimes;		
	}
	
}
	
