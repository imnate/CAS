package analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




import java.util.Map;

import data.TokenData;


public class SettingToken 
{
	private List<List<Integer>> index = new ArrayList<>();//每個level一個List
	private ArrayList<TokenData> data;//初始化的輸入資料
	private List<List<Integer>> lines=new ArrayList<>();//linetype 1:normal 2:shift 3:return,pointA,pointB,stringWord 1:True 2:False
	
	private boolean countFlog = false;
	private boolean endFlog = false; 
	
	private int offsetX=110;
	private int offsetY=70;
	
	private int maxLevel=0;
	static ArrayList<String> TokenLevel = new ArrayList<String>();
	/**
	 * 補齊虛擬ELSE(繪圖所需)，
	 * 計算Token的寬度與高度，
	 * 計算Token應放置位置，
	 * 計算連線的資訊
	 * @param list
	*/
	public SettingToken(ArrayList<TokenData> list)
	{
//		System.out.println("SettingToken Start!!");
		
		this.data = list;
		
		//這前面是以前學長寫的 補足if else的結構
		conutLevelIndex();
		
		while(true)
		{
			checkElse();
			
			if(countFlog)
			{
				conutLevelIndex();
				countFlog = false;
			}
			
			if(endFlog)
			{
				break;
			}
		}
		////////////////////////////////
		
		maxLevel=index.size();
		
		setSize();		
		
		setLocation();

		setLine();
		
		//print();
		
//		System.out.println("SettingToken End!!");
	}
	
	
	public static void indexCorrection(ArrayList<TokenData> TD)
	{
		//設定Index
		
		for(int i=0;i<TD.size();i++)
		{
			TD.get(i).setIndex(i);
		}
	}
	
	public static void levelCorrection(ArrayList<TokenData> TD)
	{
		//設定Level
		
		int level = 1;
		ArrayList<String> token=new ArrayList<String>();
		for(int i=0;i<TD.size();i++)
		{
			TD.get(i).setLevel(level);
			if(hasBlockToken(TD.get(i).getName()))
			{
				token.add(TD.get(i).getName());
				level++;
			}
			if(level!=1&&TD.get(i).getName().startsWith("ENDBLOCK"))
			{
				if(token.get(token.size()-1).startsWith("DOWHILE"))
				{
					if(TD.get(i+1).getName().startsWith("CONDITION"))//Dowhile 後置 condition
					{
						i++;
						TD.get(i).setLevel(level);
					}
					level--;
					token.remove(token.size()-1);
				}
				else if(token.get(token.size()-1).startsWith("IF"))
				{
					if(TD.get(i+1).getName().startsWith("ELSE"))
					{
					}
					else
					{
						level--;
						token.remove(token.size()-1);//IF
					}
				}
				else if(token.get(token.size()-1).startsWith("ELSE"))
				{
					level-=2;
					token.remove(token.size()-1);//ELSE
					token.remove(token.size()-1);//IF
				}
				else
				{
					level--;
					token.remove(token.size()-1);
				}
			}
		}
	}
	
	public static void showTokenDataDetail(ArrayList<TokenData> list,boolean showPosition)
	{
		//顯示TokenData的資訊
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getIndex()+" ");
			//TokenLevel.add(list.get(i).getIndex()+" ");
			for(int j=0;j<list.get(i).getLevel();j++)
			System.out.print("\t");
			//TokenLevel.add("\t");
			System.out.print(list.get(i).getLevel()+" ");	
			TokenLevel.add(list.get(i).getLevel()+" ");
			if(showPosition)
			{
				System.out.print(list.get(i).getSize()+" ");
				System.out.print(list.get(i).getWidth()+" ");
				System.out.print(list.get(i).getX()+" ");
				System.out.print(list.get(i).getY()+" ");
				TokenLevel.add(list.get(i).getSize()+" ");
				TokenLevel.add(list.get(i).getWidth()+" ");
				TokenLevel.add(list.get(i).getX()+" ");
				TokenLevel.add(list.get(i).getY()+" ");				
			}
			if(list.get(i).getName()=="IF")
			{
				System.out.println(list.get(i).getName()+"("+")");	
				TokenLevel.add(list.get(i).getName()+"("+")");
			}
			System.out.println(list.get(i).getName());
			TokenLevel.add(list.get(i).getName());
		}
	}
	public static ArrayList<String> out_TokenLevel()
	{
		
		return TokenLevel;
	}
	
	private void conutLevelIndex()
	{
		index.clear();
		
		TokenData td;
		
		int maxLevel = 0;
		
		//找出maxlevel 也就是index
		for(int i = 0; i < data.size(); i++)
		{			
			td = data.get(i);
			
			data.get(i).setIndex(i);
			
			if(td.getLevel() > maxLevel)
			{
				maxLevel = td.getLevel();
				
			}	
			
		}
		//一個level一個List<Integer>
		//將相同Level存在同一index中
		//這邊不是一個非常好的做法
		for(int j = 1; j <= maxLevel; j++)
		{
			List<Integer> listIndex = new ArrayList<>();
			for(int i = 0; i < data.size(); i++)
			{
				td = data.get(i);
				if(td.getLevel()==j)
				{
					listIndex.add(i);
				}
			}			
//			System.out.print("listIndex : "+listIndex);
			index.add(listIndex);//總共有幾個token他們index是多少 分別在第幾個level
		}
	}

	private void checkElse()
	{
		TokenData td1;
		for(int i=0;i<index.size();i++)
		{
			for(int j=0;j<index.get(i).size();j++)
			{
				td1=data.get(index.get(i).get(j));
				if(td1.getName().startsWith("IF"))
				{
					int level=td1.getLevel();

					if(i+1<index.size())
					{
						for(int k=0;k<index.get(i+1).size();k++)
						{
							if(index.get(i+1).get(k)>index.get(i).get(j)&&index.get(i+1).get(k)<index.get(i).get(j+1))
							{
								if(data.get(index.get(i+1).get(k)).getName().startsWith("ENDBLOCK"))
								{
									if(k+1<index.get(i+1).size())
									{
										if(data.get(index.get(i+1).get(k+1)).getName().startsWith("ELSE"))
										{
											//有else在後面
											continue;
										}
										else
										{
											//應該不會出現
											createVirtualElse(index.get(i+1).get(k)+1,level+1);
											countFlog = true;
											break;
										}
									}
									else
									{
										createVirtualElse(index.get(i+1).get(k)+1,level+1);
										countFlog = true;
										break;
									}
								}
							}
						}
					}
					else
					{
						System.out.println("error");
					}
				}
			}
			if(countFlog)
			{
				break;
			}
		}
		if(!countFlog)
		{
			endFlog = true;
		}
		
	}
	
	private void createVirtualElse(int insertIndex,int level)
	{
		TokenData tdVirtualElse = new TokenData();
		TokenData tdVirtualStrat = new TokenData();
		TokenData tdVirtualEnd = new TokenData();
		
		tdVirtualElse.setName("ELSE*");
		tdVirtualElse.setLevel(level);
		
		tdVirtualStrat.setName("STARTBLOCK*");
		tdVirtualStrat.setLevel(level+1);
		
		tdVirtualEnd.setName("ENDBLOCK*");
		tdVirtualEnd.setLevel(level+1);
		
		data.add(insertIndex, tdVirtualElse);
		data.add(insertIndex+1, tdVirtualStrat);
		data.add(insertIndex+2, tdVirtualEnd);

		System.out.println("Virtual Else Created!!");
	}
	
	private void setSize()
	{
		//設定TokenData的寬高
		
		//switch 還沒寫
		int size=0;
		int width=0;
		int maxSize=0;
		int maxWidth=1;
		boolean isInBlock=false;
		
		//System.out.println("\tsetSize STart!!");

		for(int i=index.size()-1;i>0;i--)
		{
			
			for(int j=index.get(i).size()-1;j>=0;j--)
			{
				String name = data.get(index.get(i).get(j)).getName();
				if(isInBlock)
				{
					//在block裡面
					if(name.startsWith("STARTBLOCK"))
					{
						maxSize++;
						
						if(maxSize<size)
						{
							maxSize=size;
						}
						
						maxWidth=maxWidth+width;
						
						//放入父結點
						for(int k=index.get(i-1).size()-1;k>=0;k--)
						{
							if(data.get(index.get(i-1).get(k)).getIndex()<data.get(index.get(i).get(j)).getIndex())
							{
								if(hasBlockToken(data.get(index.get(i-1).get(k)).getName()))
								{
									if(hasConditionToken(data.get(index.get(i-1).get(k)).getName()))
									{
										data.get(index.get(i-1).get(k)).setWidth(maxWidth);
										data.get(index.get(i-1).get(k)).setSize(maxSize+1+1);//Condition 多加一
									}
									else
									{
										data.get(index.get(i-1).get(k)).setWidth(maxWidth);
										data.get(index.get(i-1).get(k)).setSize(maxSize+1);
									}
									
									break;
								}
							}
						}
						
						/*Initialize*/
						size=0;
						width=0;
						maxSize=0;
						maxWidth=1;
						isInBlock=false;
					}
					else if(hasBlockToken(name))
					{
						maxSize+=data.get(index.get(i).get(j)).getSize();
						if(maxWidth<data.get(index.get(i).get(j)).getWidth())
						{
							maxWidth=data.get(index.get(i).get(j)).getWidth();
						}
					}
					else
					{
						maxSize++;
					}
				}
				else if(name.startsWith("ENDBLOCK"))
				{
					isInBlock=true;
					maxSize++;
				}
				else
				{
					if(name.startsWith("ELSE"))
					{
						if(j-1>=0)
						{
							size=data.get(index.get(i).get(j)).getSize();
							width=data.get(index.get(i).get(j)).getWidth();
						}
					}
				}
			}
		}
		//System.out.println("\tsetSize End!!");
	}
	
	private void setLocation()
	{
		//設定每個Token在圖型中的定位
		int X=50;
		int Y=20;
		int sizeY=1;
		boolean inBlock=false;
		
		//System.out.println("\tsetLocation STart!!");
		
		for(int i=0;i<index.size();i++)
		{
			for(int j=0;j<index.get(i).size();j++)
			{
				if(data.get(index.get(i).get(j)).getName().startsWith("ELSE"))
				{
					//X 需要 shift
					//switch 與此相似
					for(int k=j-2;k>=0;k--)
					{
						if(data.get(index.get(i).get(k)).getName().startsWith("STARTBLOCK"))
						{
							int di=data.get(index.get(i).get(k)).getIndex();
							for(int l=index.get(i-1).size()-1;l>=0;l--)
							{
								if(data.get(index.get(i-1).get(l)).getIndex()<di)
								{
									X=data.get(index.get(i-1).get(l)).getX()+(data.get(index.get(i-1).get(l)).getWidth()-data.get(index.get(i).get(j)).getWidth())*offsetX;
									break;
								}
							}
							Y=data.get(index.get(i).get(k)).getY();
							break;
						}
					}
				}
				else if(data.get(index.get(i).get(j)).getName().startsWith("STARTBLOCK"))
				{
					int di=data.get(index.get(i).get(j)).getIndex();
					if(i>0)
					{
						for(int k=index.get(i-1).size()-1;k>=0;k--)
						{
							if(data.get(index.get(i-1).get(k)).getIndex()<di)
							{
								if(isPreCondition(data.get(index.get(i-1).get(k)).getName()))
								{
									X=data.get(index.get(i).get(j-1)).getX();
									Y=data.get(index.get(i).get(j-1)).getY()+offsetY;
								}
								else
								{
									X=data.get(index.get(i-1).get(k)).getX();
									Y=data.get(index.get(i-1).get(k)).getY()+offsetY;
								}
								inBlock=true;
								break;
							}
						}
					}
					else
					{
						inBlock=true;
					}
				}
				else if(data.get(index.get(i).get(j)).getName().startsWith("CONDITION"))
				{
					int di=data.get(index.get(i).get(j)).getIndex();
					if(i>0)
					{
						for(int k=index.get(i-1).size()-1;k>=0;k--)
						{
							if(data.get(index.get(i-1).get(k)).getIndex()<di)
							{
								if(isPreCondition(data.get(index.get(i-1).get(k)).getName()))
								{
									X=data.get(index.get(i-1).get(k)).getX();
									Y=data.get(index.get(i-1).get(k)).getY()+offsetY;
								}
								else if(isPostCondition(data.get(index.get(i-1).get(k)).getName()))
								{
									X=data.get(index.get(i).get(j-1)).getX();
									Y=data.get(index.get(i).get(j-1)).getY()+offsetY;
								}
								else
								{
									//ERROR
								}
								
								break;
							}
						}
					}
					else
					{
						//ERROR
					}
				}
				else if(inBlock)
				{
					Y=Y+sizeY*offsetY;
					if(data.get(index.get(i).get(j)).getName().startsWith("ENDBLOCK"))
					{
						inBlock=false;
					}
				}
				else
				{
					continue;
				}
				data.get(index.get(i).get(j)).setX(X);
				data.get(index.get(i).get(j)).setY(Y);
				sizeY=data.get(index.get(i).get(j)).getSize();
			}
		}
		//System.out.println("\tsetLocation End!!");
	}
	
	private void setLine()
	{
		//設定所有的連線
		//改用Stack可能可以寫得更有效率
		
		//lines 資訊
		//pointA
		//pointB
		//line type 1:normal 2:shift 3:deshift 4:return 5:fororwhileFalse 6:jump
		//string Word 0:null 1:True 2:False
		
		boolean inIF=false;
		boolean inELSE=false;
		boolean inFORorWHILE=false;
		boolean inDOWHILE=false;
		int parent=0;
		List<Integer> oneLine;
		
		//System.out.println("\tsetLine STart!!");
		
		for(int i=0;i<index.size();i++)
		{
			for(int j=0;j<index.get(i).size();j++)
			{
				if(data.get(index.get(i).get(j)).getX()!=0)
				{
					oneLine=new ArrayList<>();
					
					if(data.get(index.get(i).get(j)).getName().startsWith("ENDBLOCK"))
					{
						if(i!=0)
						{
							oneLine.add(index.get(i).get(j));
							//找後面
							if(inIF)
							{
								for(int k=0;k<index.get(i-1).size();k++)
								{
									if(index.get(i).get(j)<index.get(i-1).get(k))
									{
										oneLine.add(index.get(i-1).get(k));
										break;
									}
								}
								oneLine.add(1);
								oneLine.add(0);
								
								inIF=false;
							}
							else if(inELSE)
							{
								for(int k=0;k<index.get(i-2).size();k++)
								{
									if(index.get(i).get(j)<index.get(i-2).get(k))
									{
										oneLine.add(index.get(i-2).get(k));
										break;
									}
								}
								oneLine.add(3);
								oneLine.add(0);
								inELSE=false;
							}
							else if(inFORorWHILE)
							{
								oneLine.add(parent);
								oneLine.add(4);
								oneLine.add(0);
								//畫 ENDBLOCK->FOR or WHILE
								inFORorWHILE=false;
							}
							else if(inDOWHILE)
							{
								//連CONDITION
								oneLine.add(index.get(i).get(j+1));
								oneLine.add(1);
								oneLine.add(0);
							}
							else
							{
								for(int k=0;k<index.get(i-1).size();k++)
								{
									if(index.get(i).get(j)<index.get(i-1).get(k))
									{
										oneLine.add(index.get(i-1).get(k));
										break;
									}
								}
								oneLine.add(1);
								oneLine.add(0);
							}
						}
						else
						{
							continue;
						}
					}
					else if(data.get(index.get(i).get(j)).getName().startsWith("STARTBLOCK"))
					{
						if(i!=0)
						{
							//連接前一個
							//找前面
							if(inIF)
							{}
							else if(inFORorWHILE)
							{}
							else
							{
								for(int k=index.get(i-1).size()-1;k>=0;k--)
								{
									if(index.get(i).get(j)>index.get(i-1).get(k))
									{
										oneLine.add(index.get(i-1).get(k));
										
										if(data.get(index.get(i-1).get(k)).getName().startsWith("ELSE"))
										{
											inELSE=true;
										}
										else if(data.get(index.get(i-1).get(k)).getName().startsWith("DOWHILE"))
										{
											parent=data.get(index.get(i).get(j)).getIndex();
											inDOWHILE=true;
										}
										break;
									}
								}
								oneLine.add(index.get(i).get(j));
								oneLine.add(1);
								oneLine.add(0);

								lines.add(oneLine);
								
								//連接下一個
								oneLine=new ArrayList<>();
							}
						}
						//連接下一個
						oneLine.add(index.get(i).get(j));
						oneLine.add(index.get(i).get(j+1));
						oneLine.add(1);
						oneLine.add(0);
					}
					else if(data.get(index.get(i).get(j)).getName().startsWith("CONDITION"))
					{
						if(inDOWHILE)
						{
							//迴圈線，true線
							oneLine.add(index.get(i).get(j));
							oneLine.add(parent);
							oneLine.add(4);
							oneLine.add(1);
							
							lines.add(oneLine);
							
							//false線
							oneLine=new ArrayList<>();
							oneLine.add(index.get(i).get(j));
							for(int k=0;k<index.get(i-1).size();k++)
							{
								if(index.get(i).get(j)<index.get(i-1).get(k))
								{
									oneLine.add(index.get(i-1).get(k));
									break;
								}
							}
							oneLine.add(1);
							oneLine.add(2);
							inDOWHILE=false;
						}
						else
						{
							//連接前一個
							//找前面
							for(int k=index.get(i-1).size()-1;k>=0;k--)
							{
								if(index.get(i).get(j)>index.get(i-1).get(k))
								{
									oneLine.add(index.get(i-1).get(k));
									oneLine.add(index.get(i).get(j));
									oneLine.add(1);
									oneLine.add(0);
									
									
									if(data.get(index.get(i-1).get(k)).getName().startsWith("IF"))
									{
										lines.add(oneLine);
										
										//True線
										oneLine=new ArrayList<>();
										oneLine.add(index.get(i).get(j));
										oneLine.add(index.get(i).get(j+1));
										oneLine.add(1);
										oneLine.add(1);
										
										inIF=true;
									}
									else if(data.get(index.get(i-1).get(k)).getName().startsWith("FOR")||data.get(index.get(i-1).get(k)).getName().startsWith("WHILE"))
									{
										parent=data.get(index.get(i).get(j)).getIndex();
																				
										lines.add(oneLine);
										
										//True線
										oneLine=new ArrayList<>();
										oneLine.add(index.get(i).get(j));
										oneLine.add(index.get(i).get(j+1));
										oneLine.add(1);
										oneLine.add(1);
										
										lines.add(oneLine);
										
										//false線
										oneLine=new ArrayList<>();
										oneLine.add(index.get(i).get(j));
										for(int l=0;l<index.get(i-1).size();l++)
										{
											if(index.get(i).get(j)<index.get(i-1).get(l))
											{
												oneLine.add(index.get(i-1).get(l));
												break;
											}
										}
										oneLine.add(5);
										oneLine.add(2);
										
										inFORorWHILE=true;
									}
									else
									{
										//ERROR
									}
									break;
								}
							}
						}
					}
					else if(data.get(index.get(i).get(j)).getName().startsWith("ELSE"))
					{
						for(int k=j-1;k>=0;k--)
						{
							if(data.get(index.get(i).get(k)).getName().startsWith("CONDITION"))
							{
								oneLine.add(index.get(i).get(k));
								break;
							}
						}
						oneLine.add(index.get(i).get(j));
						oneLine.add(2);
						oneLine.add(2);
					}
					else if(data.get(index.get(i).get(j)).getName().startsWith("JUMP"))
					{
						//g:goto c: countine b:break
						//goto 沒寫
						String jumpStyle=data.get(index.get(i).get(j)).getName().substring(data.get(index.get(i).get(j)).getName().indexOf("(")+1, data.get(index.get(i).get(j)).getName().indexOf(")"));
						oneLine.add(index.get(i).get(j));
						boolean found=false;
						if(jumpStyle.equals("B"))
						{
							for(int k=i-1;k>=0;k--)
							{
								for(int l=index.get(k).size()-1;l>=0;l--)
									if(index.get(k).get(l)<index.get(i).get(j))
									{
										if(isLoopToken(data.get(index.get(k).get(l)).getName()))
										{
											oneLine.add(index.get(k).get(l+1));
											oneLine.add(6);
											oneLine.add(0);
											found=true;
										}
										break;
									}
								if(found)
									break;
							}
						}
						else if(jumpStyle.equals("C"))
						{
							for(int k=i-1;k>=0;k--)
							{
								for(int l=index.get(k).size()-1;l>=0;l--)
									if(index.get(k).get(l)<index.get(i).get(j))
									{
										if(isLoopToken(data.get(index.get(k).get(l)).getName()))
										{
											for(int m=0;m<index.get(k+1).size();m++)
												if(index.get(k).get(l)<index.get(k+1).get(m))
												{
													oneLine.add(index.get(k+1).get(m));
													oneLine.add(6);
													oneLine.add(0);
													found=true;
													break;
												}
										}
										break;
									}
								if(found)
									break;
							}
						}
						else if(jumpStyle.equals("G"))
						{
							oneLine.add(index.get(i).get(j+1));
							oneLine.add(1);
							oneLine.add(0);
						}
						else
						{
							System.out.println("Error");
							//Error
						}
					}
					else if(data.get(index.get(i).get(j)).getSize()==1)
					{
						//一般token
						oneLine.add(index.get(i).get(j));
						oneLine.add(index.get(i).get(j+1));
						oneLine.add(1);
						oneLine.add(0);
					}
					else if(hasConditionToken(data.get(index.get(i).get(j)).getName()))
					{
						continue;
					}
					else
					{
						System.out.println("Something Exception(Error) in index "+index.get(i).get(j)+" : "+data.get(index.get(i).get(j)).getName());
						//特殊token(dowhile)
						//等待startblock來連接
						continue;
					}
				
					lines.add(oneLine);
				}
			}
		}
		//System.out.println("\tsetLine END!!");
	}

	public static String removeState(String str)
	{
		String reStr=null;
		if(str.endsWith("+"))
		{
			reStr=str.substring(0, str.length()-1);
		}
		else if(str.endsWith("-"))
		{
			reStr=str.substring(0, str.length()-1);
		}
		else if(str.endsWith("^"))
		{
			reStr=str.substring(0, str.length()-1);
		}
		else if(str.endsWith("*"))
		{
			reStr=str.substring(0, str.length()-1);
		}
		else
		{
			reStr=str;
		}
			
		return reStr;
	}
	
	public static boolean isToken(String s)
	{
		String temp=removeState(s);
		switch(temp)
		{
		case "DECLARE" :
		case "CIN" :
		case "COUT" :			
		case "WHILE" :
		case "DOWHILE" :
		case "ASSIGNMENT" :
		case "IF" :
		case "FOR" :	
		case "SWITCH" :
		case "ELSE" :
		case "JUMP" :
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
	
	public static boolean hasBlockToken(String str)
	{
		String temp=removeState(str);
		
		switch(temp)
		{
		case "SWITCH":
		case "IF":
		case "ELSE":
		case "FOR":
		case "WHILE":
		case "DOWHILE" :
			return true;
		}
		
		return false;
	}
	
	public static boolean isLoopToken(String str)
	{
		String temp=removeState(str);
		
		switch(temp)
		{
		case "FOR":
		case "WHILE":
		case "DOWHILE" :
			return true;
		}
		
		return false;
	}
	
	private boolean hasConditionToken(String str)
	{
		String temp = removeState(str);
		
		return isPreCondition(temp)||isPostCondition(temp);
	}

	private boolean isPreCondition(String str)
	{
		String temp = removeState(str);
		switch(temp)
		{
		case "IF":
		case "FOR":
		case "WHILE":
			return true;
		}
		return false;
	}
	
	private boolean isPostCondition(String str)
	{
		String temp = removeState(str);
		switch(temp)
		{
		case "DOWHILE" :
			return true;
		}
		return false;
	}
	
	private void print()
	{
		String[] tableHead=new String[]{"Index","Level","Name","Size","Width","X","Y"};
		String[] tableHead2=new String[]{"pointA","pointB","Line Type","String Word"};
		
		System.out.println("*******Data Detail*******");
		for(String temp : tableHead)
		{
			System.out.print(temp+"\t\t");
		}
		System.out.println();
		
		for(TokenData temp : data)
		{
			System.out.print(temp.getIndex()+"\t\t");
			System.out.print(temp.getLevel()+"\t\t");
			System.out.print(temp.getName()+"\t");
			if(temp.getName().length()<8)
				System.out.print("\t");
			System.out.print(temp.getSize()+"\t\t");
			System.out.print(temp.getWidth()+"\t\t");
			System.out.print(temp.getX()+"\t\t");
			System.out.print(temp.getY()+"\t\t");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("*******Lines Detail*******");
		for(String temp : tableHead2)
		{
			System.out.print(temp+"\t");
			if(temp.length()<8)
				System.out.print("\t");
		}
		System.out.println();
		
		for(List<Integer> temp : lines)
		{
//			for(int temp2 : temp)
//			{
//				System.out.print(temp2+"\t\t");
//			}
			System.out.print(temp.get(0)+"\t\t");
			System.out.print(temp.get(1)+"\t\t");
			//line type 1:normal 2:shift 3:deshift 4:return 5:fororwhileFalse
			//string Word 0:null 1:True 2:False
			switch(temp.get(2))
			{
			case 1:
				System.out.print("normal\t\t");
				break;
			case 2:
				System.out.print("shift\t\t");
				break;
			case 3:
				System.out.print("deshift\t\t");
				break;
			case 4:
				System.out.print("return\t\t");
				break;
			case 5:
				System.out.print("fororwhileFalse\t\t");
				break;
			case 6:
				System.out.print("jump\t\t");
				break;
			}
			switch(temp.get(3))
			{
			case 1:
				System.out.print("True\t\t");
				break;
			case 2:
				System.out.print("False\t\t");
				break;
			case 0:
				System.out.print("null\t\t");
				break;
			}
			System.out.println();
		}
	}
	
	public ArrayList<TokenData> getData(){return this.data;}
	
	public List<List<Integer>> getIndex(){return this.index;}
	
	public List<List<Integer>> getLines(){return this.lines;}
		
	public int getMaxLevel(){return this.maxLevel;}
	
}
