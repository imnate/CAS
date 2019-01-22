/*  GetSemantics()測試 ; */
package analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import analysis.SemanticAnalysis;

import org.antlr.runtime.tree.BaseTree;

import data.TokenData;



public class GetSlice 
{
	private ArrayList<TokenData> data = new ArrayList<TokenData>();
	private ArrayList<String> data2 = new ArrayList<String>();
	private ArrayList<String> send2SemanticAnalsis = new ArrayList<String>();//(計數型計數器資料)
	private ArrayList<String> send2SemanticAnalsis_sentinel = new ArrayList<String>();//(哨兵型哨兵值資料)
	private ArrayList<String> send2SemanticAnalsis_assignment = new ArrayList<String>();
	private ArrayList<String> send2SemanticAnalsis_cin = new ArrayList<String>();
	private ArrayList<String> send2SemanticAnalsis_declare = new ArrayList<String>();
	private ArrayList<String> function = new ArrayList<String>();//callbyfunction's function
	private ArrayList<String> type = new ArrayList<String>();
	private ArrayList<Integer> While_level = new ArrayList<Integer>();
	private ArrayList<Integer> for_level = new ArrayList<Integer>();
	private ArrayList<Integer> Do_While_level = new ArrayList<Integer>();
	private ArrayList<Integer> ASSIGNMENT = new ArrayList<Integer>();
	private BaseTree mainBlock;
	private BaseTree functionBlock;
	int index=0;
	int varNum = 0;
	int cinNum = 0;
	int coutNum = 0;
	int ifNum = 0;
	int assignNum = 0;
	int forNum = 0;
	int whileNum = 0;
	int doWhileNum = 0;
	int elseNum=0;
	int switchNum=0;
	int jumpNum=0;
	int count_for = 0;//新增
	int count_if = 1;//新增
	int count_declare =0;
	
	String showfront = "";
	//String type;
//	SemanticAnalysis Sa;
	
	
	public GetSlice(BaseTree AST)
	{
				
		mainBlock = FindFunction(AST,"main");//取出 main function 裡面的body
		GetProgramSlice(mainBlock,1);//mainBlock == BODY裡面的東西
		
		System.out.println("*****GetSemantics start*****");
		GetSemantics(mainBlock,1);

		if(function.size()>0)
		{
			//System.out.println("function "+function);
			for(int i =0;i<function.size();i++)
			{
				functionBlock = FindFunction(AST,function.get(i));
				GetProgramSlice(functionBlock,1);	
				GetSemantics(functionBlock,1);
			}
		}
		
		//System.out.println("callcfunction"+function);
		
		System.out.println("@ASSIGNMENT Level: "+ASSIGNMENT);
		System.out.println("@WHILE Level: "+While_level);
//		System.out.println("@DECLARE Level: "+level);
//		System.out.println("@Cin Level: "+level);
		
		System.out.println("*****GetSemantics end*****");

	}
	private BaseTree FindFunction(BaseTree AST,String str)
	{
		//找到指定Funciton的body
		
		BaseTree find = null;
		
		for(int i =0;i<AST.getChildCount();i++)
			/*981444星號 AST.getChildCount() = 3 
			 * PREPROCESSOR	USING_DECLARATION FUNCTION
			 */
		{
		
			if(AST.getChild(i).toString().equals("FUNCTION"))
			{
				BaseTree function=(BaseTree)AST.getChild(i);

				if(function.getChild(0).getChild(0).toString().equals(str))//str == main
				{
					find = (BaseTree)function.getChild(1);//== BODY
					
					break;
				}
			}
		}
		return find;
	}

	private void GetProgramSlice(BaseTree AST,int level)
	{
		
		for(int i=0;i<AST.getChildCount();i++)
		{
			if(CheckToken(AST.getChild(i).toString()))
			{
				data.add(new TokenData());
							
				TokenData td = data.get(data.size()-1);//td 等於datd(arraylist大小-1)
				
				td.setName(AST.getChild(i).toString());
				
				td.setLevel(level);//level就是層 
				
				td.setIndex(index);
				
				index++;
				
				if(AST.getChild(i).toString().equals("JUMP"))
				{
					//分辨jump的類型
					String jumpStyle = AST.getChild(i).getChild(0).toString().toLowerCase();
					System.out.println(jumpStyle);
					System.out.println("Jump "+ AST.getChild(i));
					String type;
					switch(jumpStyle)
					{
					case "break":
						type="(B)";
						break;
					case "continue":
						type="(C)";
						break;
					default://goto
						type="(G)";
					}
					td.setName(td.getName()+type);
				}
				GetProgramSlice((BaseTree)AST.getChild(i),level+1);
			}
		}
	}
	public void GetSemantics(BaseTree AST,int level)
	{

		/*將BaseTree轉換成TokenData
		 * 進來的AST樹 被萃取了 剩下main function裡面的 BODY
		 */
		
		String cin = "";
		if(AST.toString().equals("CIN"))
		{
			
			for(int i=0;i<AST.getChildCount();i++)
			{
			
			cin +=AST.getChild(i); 			
			}
			send2SemanticAnalsis_cin.add(cin);
			
		}
		
		String assignment = "";
		if(AST.toString().equals("ASSIGNMENT"))
		{
			ASSIGNMENT.add(level-1);
			
			for(int i=0;i<AST.getChildCount();i++)
			{
				assignment+=AST.getChild(i); 
			}
			//System.out.println("Assign = "+assignment);
			send2SemanticAnalsis_assignment.add(assignment);
			findCallFunctionbyAssigment(assignment);
		}
		
		
		
		
		String declare ="";
		
		if(AST.toString().equals("DECLARE"))
		{
			
			count_declare++;
			for(int i =0;i<AST.getChildCount();i++)
			{				
				declare +=AST.getChild(i);
			}
			send2SemanticAnalsis_declare.add(declare);		
		}
		
		if(AST.toString().equals("FOR"))
		{
			
			String for_inital ="";
			String for_declare = "";
			String for_condition ="";
			String for_step = "";
			
			String For_IF_condition = "";
			String For_jump = "";
			
			
			
			for(int i = 0;i<AST.getChildCount();i++)
			{	
				//System.out.println("For  :"+AST.getChild(i));
				if(AST.getChild(i).toString().equals("FORINITAL"))
				{
					BaseTree Fini = (BaseTree)AST.getChild(i);
					
					for(int k =0;k<Fini.getChildCount();k++)
					{
						//有些不是在for裡面 宣告 所以不會有declare 所以要有inital
						
						if(Fini.getChild(k).toString().equals("DECLARE"))
						{
							
							for(int u =0;u<Fini.getChild(k).getChildCount();u++)
							{
								BaseTree For_Declare = (BaseTree)Fini.getChild(k).getChild(u);
								for_declare+=For_Declare+" ";	
								
							}
													
						}
						else
							{
								for_inital+=Fini.getChild(k)+" ";
								
							}

					}
									 
				}
				if(AST.getChild(i).toString().equals("CONDITION"))
				{
					BaseTree Fcondition = (BaseTree)AST.getChild(i);
					for(int z = 0;z<Fcondition.getChildCount();z++)
					{
						for_condition+=Fcondition.getChild(z)+" ";
					}

				}
				if(AST.getChild(i).toString().equals("STEP"))
				{
					BaseTree Fstep = (BaseTree)AST.getChild(i);
					for(int x = 0;x<Fstep.getChildCount();x++)
					{	
						for_step+=Fstep.getChild(x)+" ";					
					}

				}
				if(AST.getChild(i).toString().equals("IF"))
				{
					BaseTree For_IF= (BaseTree)AST.getChild(i);
					//System.out.println("for if"+ For_IF.getChildCount());
					for(int j =0 ;j<For_IF.getChildCount();j++)
					{
						if(For_IF.getChild(j).toString().equals("CONDITION"))
						{
							BaseTree For_IF_condiotn= (BaseTree)For_IF.getChild(j);
							for(int k = 0 ;k<For_IF_condiotn.getChildCount();k++)
							{
								//System.out.println("for con"+For_IF_condiotn.getChild(k));	
								For_IF_condition+=For_IF_condiotn.getChild(k);
							}
							
						}
						if(For_IF.getChild(j).toString().equals("JUMP"))
						{
							BaseTree For_IF_jump = (BaseTree)For_IF.getChild(j);
							for(int n =0;n<For_IF_jump.getChildCount();n++)
							{
								//System.out.println("for jump"+For_IF_jump.getChild(n));
								For_jump+=For_IF_jump.getChild(n);
							}
							
						}
					}
					
				}
			}
			
			if(for_declare!="")
			{		
				
				count_for++;//測試用的count
				showfront =" Declare :"+for_declare.replace(";", "")+", Condtion :"+for_condition+", Step :"+for_step+"\n";			
//				System.out.println(for_all);	
//				tdtest.set_name(for_all);
//				System.out.println("tdtest"+tdtest.get_name());
				data2.add(showfront);
				//System.out.println(data2.get(data2.size()-1));
				send2SemanticAnalsis.add(for_declare.replace(";", ""));
				send2SemanticAnalsis.add(for_condition);
				send2SemanticAnalsis.add(for_step);
				type.add("For_declare");
				if(For_IF_condition.length()>0||For_jump.length()>0)
				{
					send2SemanticAnalsis_sentinel.add("For_declare If");
					send2SemanticAnalsis_sentinel.add(For_IF_condition);
					send2SemanticAnalsis_sentinel.add(For_jump);
				}
			}
			else
			{
				count_for++;
				showfront =" Inital :"+for_inital.replace(";", "") +", Condtion :"+for_condition+", Step :"+for_step+"\n";
//				tdtest.set_name(for_all);
//				System.out.println("tdtest"+tdtest.get_name());
				data2.add(showfront);
				System.out.println(data2.get(data2.size()-1));
				send2SemanticAnalsis.add(for_inital.replace(";", ""));
				send2SemanticAnalsis.add(for_condition);
				send2SemanticAnalsis.add(for_step);
				type.add("For_inital");
				if(For_IF_condition.length()>0||For_jump.length()>0)
				{
					send2SemanticAnalsis_sentinel.add("For_inital If");
					send2SemanticAnalsis_sentinel.add(For_IF_condition);
					send2SemanticAnalsis_sentinel.add(For_jump);
				}
			}
			
						
		}
		
		if(AST.toString().equals("IF"))/*993351範本*/
		{
			String if_condition = "";
			String if_Jump = "";
			for(int i =0;i<AST.getChildCount();i++)
			{
				BaseTree IFchild = (BaseTree) AST.getChild(i);
				//System.out.println("IF child : "+IFchild.toString());
				if(IFchild.toString().equals("CONDITION"))
				{
					for(int j =0 ;j<IFchild.getChildCount();j++)
					 {
						BaseTree IFcondition = (BaseTree) IFchild.getChild(j);
						if_condition+=IFcondition+" ";
					 }
					//System.out.println("IF CONDITION : "+if_condition);
					showfront =if_condition+"\n";
					count_if++;//測試計算if次數
				}
				if(IFchild.toString().equals("JUMP"))
				{
					for(int k =0 ;k<IFchild.getChildCount();k++)
					 {
						BaseTree IFJump = (BaseTree) IFchild.getChild(k);
						if_Jump =IFJump.toString();
					 }
					//showfront=if_Jump;
					//System.out.println("IF JUMP : "+if_Jump);
				}
			}
			//System.out.println("showfront = "+showfront);
			data2.add(showfront);
			type.add("If");
			send2SemanticAnalsis.add(if_condition);
			
		}
			
		if(AST.toString().equals("WHILE"))
		{
			String while_condition ="";
			
			While_level.add(level-1);
			for(int i =0;i<AST.getChildCount();i++)
			{
				BaseTree WHILEchild = (BaseTree) AST.getChild(i);
				//System.out.println("WHILE : "+WHILEchild.toString());
				if(WHILEchild.toString().equals("CONDITION"))
				{
					for(int j =0 ;j<WHILEchild.getChildCount();j++)
					 {
						BaseTree WHILEcondition = (BaseTree) WHILEchild.getChild(j);
						while_condition+=WHILEcondition+" ";
					 }
					//System.out.println("WHILE CONDITION : "+while_condition);
					showfront="while : "+while_condition+"\n";
					data2.add(showfront);
					send2SemanticAnalsis.add(while_condition);
					
					type.add("While");
				}
				if(WHILEchild.toString().equals("IF"))
				{
					String While_If_condition = "";
					String While_If_jump = "";
					
					
					for(int k=0;k<WHILEchild.getChildCount();k++)
					{
						//System.out.println("WHILE IF: "+WHILEchild.getChild(k).toString());
						BaseTree WHILE_If = (BaseTree) WHILEchild.getChild(k);
											
						if(WHILE_If.toString().equals("CONDITION"))
						{
							for(int m =0 ;m<WHILE_If.getChildCount();m++)
							{
								System.out.println("WHILE IF_conditon: "+WHILE_If.getChild(m).toString());
								While_If_condition+=WHILE_If.getChild(m).toString();
							}
							
						}
						if(WHILE_If.toString().equals("JUMP"))
						{
							for(int n =0 ;n<WHILE_If.getChildCount();n++)
							{
								//System.out.println("WHILE IF_Jump: "+WHILE_If.getChild(n).toString());
								While_If_jump+=WHILE_If.getChild(n).toString();
							}
							
						}
					}
					
					send2SemanticAnalsis_sentinel.add("While If");
					send2SemanticAnalsis_sentinel.add(While_If_condition);
					send2SemanticAnalsis_sentinel.add(While_If_jump);
					
				}
				
			}
			
		}
		if(AST.toString().equals("DOWHILE"))//DOWHILE裡面要可以抓到DO裡面的WHILE遞增遞減部分 
		{
			String dowhile_assignment = "";
			String dowhile_condition = "";
			
			for(int i =0;i<AST.getChildCount();i++)
			{
				BaseTree DOWHILEchild = (BaseTree) AST.getChild(i);
				System.out.println("DO_all : "+DOWHILEchild.toString());
				if(DOWHILEchild.toString().equals("ASSIGNMENT"))
				{
					for(int j=0;j<DOWHILEchild.getChildCount();j++)
					{
						BaseTree DOWHILEassignment = (BaseTree) DOWHILEchild.getChild(j);
						dowhile_assignment+=DOWHILEassignment+" ";						
//						System.out.println("DO : "+DOWHILEassignment);
					}
					//System.out.println("Do_W_Assign = "+dowhile_assignment);
					
				}
				if(DOWHILEchild.toString().equals("IF"))
				{
					String Do_While_If_condition = "";
					String Do_While_If_jump="";
							
					for(int k=0;k<DOWHILEchild.getChildCount();k++)
					{
						BaseTree DOWHILEchildIF = (BaseTree) DOWHILEchild.getChild(k);
						if(DOWHILEchildIF.toString().equals("CONDITION"))//if condition
						{
							for(int m=0;m<DOWHILEchildIF.getChildCount();m++)
							{
								System.out.println("DO-IF condition "+DOWHILEchildIF.getChild(m).toString());
								Do_While_If_condition+=DOWHILEchildIF.getChild(m).toString();
							}
						}
						if(DOWHILEchildIF.toString().equals("JUMP"))
						{
							for(int n=0;n<DOWHILEchildIF.getChildCount();n++)
							{
								System.out.println("DO-IF jump "+DOWHILEchildIF.getChild(n).toString());
								Do_While_If_jump+=DOWHILEchildIF.getChild(n).toString();
							}
							//System.out.println("DO-IF jump: "+DOWHILEchildIF.getChild(k).toString());
						}
						//System.out.println("DO-IF : "+DOWHILEchildIF.toString());
					}
					send2SemanticAnalsis_sentinel.add("DoWhile If");
					send2SemanticAnalsis_sentinel.add(Do_While_If_condition);
					send2SemanticAnalsis_sentinel.add(Do_While_If_jump);
				}
				if(DOWHILEchild.toString().equals("CONDITION"))
				{
					for(int j=0;j<DOWHILEchild.getChildCount();j++)
					{
						BaseTree DOWHILEcondition = (BaseTree) DOWHILEchild.getChild(j);
						dowhile_condition+=DOWHILEcondition+" ";
					}

					
				}
				
			}
//			System.out.println("DO : "+dowhile_assignment);
			showfront = "Do :"+dowhile_assignment+"\n"+"WHILE: "+ dowhile_condition+"\n";
			data2.add(showfront);
			send2SemanticAnalsis.add(dowhile_assignment);
			send2SemanticAnalsis.add(dowhile_condition);
			type.add("DoWhile");					
		}
		
		
		for(int i=0;i<AST.getChildCount();i++)
		{			
			GetSemantics((BaseTree)AST.getChild(i),level+1);
		}
		
	}
	private void findCallFunctionbyAssigment(String assignment)//彌補時廷當初沒有找到callfunction的問題 
	{
				
			if(assignment.indexOf("(")!=-1||assignment.indexOf(")")!=-1)
			{
				if(assignment.indexOf("=")==-1&&assignment.indexOf("-")==-1&&assignment.indexOf("srand")==-1&&assignment.indexOf("unexpected:")==-1)
				{
					int cut = assignment.indexOf("(");
					
					function.add(assignment.substring(0,cut));
					System.out.println("function "+function);
				}
			}
		
	}
	private Boolean CheckToken(String s)
	{
		//計算特定Token的數量
		
		switch(s)
		{
		case "DECLARE" :
			varNum++;
			return true;
		case "CIN" :
			cinNum++;
			return true;
		case "COUT" :
			coutNum++;
			return true;			
		case "WHILE" :
			whileNum++;
			return true;
		case "DOWHILE" :
			doWhileNum++;
			return true;
		case "ASSIGNMENT" :
			assignNum++;
			return true;
		case "IF" :
			ifNum++;
			return true;
		case "FOR" :
			forNum++;
			return true;	
		case "SWITCH" :	
			switchNum++;
			return true;
		case "ELSE" :	
			elseNum++;
			return true;
		case "JUMP" :
			jumpNum++;
			return true;
		case "ROOT":
		case "PREPROCESSOR":
		case "USING_DECLARATION":
		case "FUNCTION":
		case "FUNCTIONNAME":
		case "BODY" :
		case "SYSTEM" :
		case "RETURN" :
		case "STARTBLOCK" :
		case "ENDBLOCK" :
		case "CONDITION" :
			return true;
		}
		
		return false;		
	}
	
	public ArrayList<TokenData> getData()
	{
		return this.data;
	}
	
	public Map<String,Integer> getTokenCount()
	{
		//取得每個Token的統計數量
		
		
				
		Map<String,Integer> list=new HashMap<String,Integer>();
		
		list.put("VARIABLE", varNum);
		list.put("CIN", cinNum);
		list.put("COUT", coutNum);
		list.put("IF", ifNum);
		list.put("ASSIGNMENT", assignNum);
		list.put("FOR", forNum);
		list.put("WHILE", whileNum);
		list.put("DOWHILE", doWhileNum);
		list.put("ELSE", elseNum);
		list.put("SWITCH", switchNum);
		list.put("JUMP", jumpNum);
		
		return list;
		
	}
	
	public BaseTree getMainBlock()
	{
		return mainBlock;
	}
	public ArrayList<String> Show()
	{
		return data2;
	}
	private void Testarraylist()
	{
		for(int u=0;u<=data2.size()-1;u++)//測試data2裡面的資料
		{
			
			System.out.println("data2.get(u) : "+data2.get(u));
		}
	}
	public ArrayList<String> type()
	{
		return type;		
	}
	public ArrayList<String> send2SemanticAnalsis_assignment()
	{
		return send2SemanticAnalsis_assignment;	
	}
	public ArrayList<String> sned2SemanticAnalsis_cin()
	{
		return send2SemanticAnalsis_cin;	
	}
	public ArrayList<String> send2SemanticAnalsis()
	{		
		return send2SemanticAnalsis;
	}
	public int count_for()
	{
		return count_for;
	}
	public ArrayList<String> send2SemanticAnalsis_declare()
	{
		return send2SemanticAnalsis_declare;
		
	}
	public ArrayList<String> send2SemanticAnalsis_sentinel()
	{
		return send2SemanticAnalsis_sentinel;
	}
	public int count_declare()
	{
		return count_declare;		
	}
}
