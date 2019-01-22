package graphing;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

import analysis.SettingToken;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
//import com.mxgraph.view.mxEdgeStyle;
import com.mxgraph.view.mxGraph;
//import com.mxgraph.view.mxStyleRegistry;



















import data.TokenData;

public class GraphingControlFlow 
{	
	private ArrayList<TokenData> data;
	private ArrayList<String> data_showfront;
	private List<Object> ob = new ArrayList<>();
	private List<List<Integer>> lines;
	private mxGraph graph;
	private Object parent;
	private int sizeX=50;
	private int sizeY=50;
	private int Xoffset=110;
	private double offset=(Xoffset-sizeX)/2-6;
	private int MaxY=20;
	private int groundSaveSize=20;
	private List<Integer> skip=new ArrayList<>();
	private int maxLevel;
	private ArrayList<Integer> SaveCountMax = new ArrayList<Integer>();	
	public ArrayList<String> getLoopTimes=new ArrayList<String>();

	private int setnum=1;
	String showfront = "";
	
	TokenData td;
	String times ="";
	
	public GraphingControlFlow(ArrayList<TokenData> data, List<List<Integer>> lines, int maxLevel, JInternalFrame internalFrame)
	{
		//System.out.println("GraphingControlFlow Start!!");
		//繪圖機制
		//畫圖型物件位置
		//畫線(線的保留空間，不讓線重疊)
		//保留圖型下緣		
		this.data = data;
		this.lines=lines;
		this.maxLevel=maxLevel;
				
		graph = new mxGraph();
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		parent = graph.getDefaultParent();
		internalFrame.setContentPane(graphComponent);
		graphComponent.setEnabled(true);
		graph.getModel().beginUpdate();

		
		try 
		{
			
			
			draw();
			
			drawLine();
			
			saveGround();
			
			
			//System.out.println("GraphingControlFlow End!!");
		}
		catch (Exception e) 
		{
			System.out.println("GraphingControlFlow Error!!");
		}
		finally
		{
			graphComponent.setEnabled(false);
			graph.getModel().endUpdate();
		}
	}
	public void drawfront(ArrayList<String> test,ArrayList<String> LoopTimes,String Png_path,String Pic_name){
		this.data_showfront=test;
		getLoopTimes=LoopTimes;
		for(int i =0;i<data_showfront.size();i++)
		{
			showfront+= "("+(i+1)+") "+data_showfront.get(i);
		}
	
		for(int j =0;j<getLoopTimes.size();j++)//int j =0;j<getLoopTimes.size()-1;j++
		{
			times+=getLoopTimes.get(j)+"\r\n";
		}
		
		graph.insertVertex(parent,null,showfront+times,200,30,setshowfrontWidth(),setshowfrontHeight(),null);
		//graph.insertVertex(parent,null,showfront+times,200,30,100,setshowfrontHeight(),null);
		//Output_Image(Png_path,Pic_name);//輸出圖片

	}
	private void Output_Image(String Png_path,String Pic_name)//這邊可以修改成用mode那個bit的參數來判斷
	{
		//if(mode==0)
		if(Png_path == null)//沒有路徑就是GUI介面用的
		{
			String path ="C:\\Users\\Imnate\\page.png";
			File Filepath = new File(path);
			
			BufferedImage im = mxCellRenderer.createBufferedImage(graph, null, 1,Color.WHITE, true, null);
			try {
				ImageIO.write(im,"PNG",Filepath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR 圖片輸出錯誤");
			}
		}
		else
		{
			String path =Png_path+"\\"+Pic_name;
			File Filepath = new File(path);
			
			BufferedImage im = mxCellRenderer.createBufferedImage(graph, null, 1,Color.WHITE, true, null);
			try {
				ImageIO.write(im,"PNG",Filepath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR 圖片輸出錯誤");
			}
		}
		
	}
	public int setshowfrontWidth()//算寬
	{
		String showfrontlength ="";
		int Width = 0;
		for(int i =0;i<data_showfront.size();i++)
		{
			showfrontlength = data_showfront.get(i);
			SaveCountMax.add(showfrontlength.length());
		}
			Collections.sort(SaveCountMax);			
			//System.out.println("String Width: "+SaveCountMax+"Size : "+SaveCountMax.size());			
			Width = SaveCountMax.get(SaveCountMax.size()-1)*5;			
			//System.out.println("Width : "+Width);
			return Width;
	}
	
	public int setshowfrontHeight()//算高
	{
		int Height =0;
		
		if((data_showfront.size()+getLoopTimes.size())>8)
		
			Height = (data_showfront.size()+getLoopTimes.size()+1)*17;
					
		else
			
			Height = (data_showfront.size()+getLoopTimes.size()+1)*20;
		
		return Height;		
	}
	
	private void draw()
	{		
		//System.out.println("\tdraw Start!!");
		for(int i=0;i<data.size();i++)
		{
			
			
			
			td=data.get(i);
			
			
			
			if(!(td.getX()==0&&td.getY()==0))
			{
				String shape="";
				String color="";
				String style="";
				Object v1;
				
				shape=getShape(data.get(i).getName());
				
				color=getColor(data.get(i).getName());
				
				style=shape+color;
				
				
				//insertVertex
				//在迴圈類型的結構上面加入 編號
				checkshowfront(td.getName());
				
				if(checkshowfront(td.getName()))
				{			
					setnum ++;
					
					//String tdname = td.getName()+setshowfrontnum.get(setnum-1);
					String tdname = td.getName()+"("+(setnum-1)+")";
					v1=graph.insertVertex(parent,null,tdname,td.getX(),td.getY(),sizeX,sizeY,style);
					//System.out.println("tdname "+tdname);
				}
				else
				{
					v1=graph.insertVertex(parent,null,td.getName(),td.getX(),td.getY(),sizeX,sizeY,style);

				}
				ob.add(v1);
//				System.out.println("td X Y: "+td.getX()+","+td.getY()+" getname : "+td.getName());
				
				
				
				
			}
			else
			{//有空白的點，但是忘記是什麼了
				skip.add(i);//td x=0, y=0
			}
			
			if(MaxY<td.getY())
			{
				MaxY=td.getY();
			}
		}
		//System.out.println("\tdraw End!!");
		
	}
	public boolean checkshowfront(String checkfront){
		
		switch(checkfront)
		{
			case"FOR":
				return true;
			case"IF":
				return true;
			case"WHILE":
				return true;
			case"DOWHILE":
				return true;		
		}
		return false;
	}
	
	private String getShape(String name) {
		String shape="";
		
		if(name.equals("CONDITION"))
		{
			shape =mxConstants.STYLE_SHAPE+"="+mxConstants.SHAPE_RHOMBUS+";";
			// 畫菱形
		}
		else
		{
			shape =mxConstants.STYLE_SHAPE+"="+mxConstants.SHAPE_RECTANGLE+";";
			// 畫正方形
		}
		
		return shape;
	}
	
	private String getColor(String name) {
		//控制顏色(* + -)
		String color="";
		
		if(name.endsWith("*"))
		{
			color = mxConstants.STYLE_FILLCOLOR+"="+mxUtils.getHexColorString(Color.PINK)+";";
		}
		else if(name.endsWith("+"))
		{
			color = mxConstants.STYLE_FILLCOLOR+"="+"#53FF53"+";";
		}
		else if(name.endsWith("-"))
		{
			color = mxConstants.STYLE_FILLCOLOR+"="+mxUtils.getHexColorString(Color.LIGHT_GRAY)+";";
		}
		else if(name.endsWith("^"))
		{
			color = mxConstants.STYLE_FILLCOLOR+"="+"#ffe432"+";";
		}
		else
		{
			color = mxConstants.STYLE_FILLCOLOR+"="+"#97CBFF"+";";
		}
		
		return color;
	}
	
	private void drawLine()
	{
		//lines 資訊
		//pointA
		//pointB
		//line type 1:normal 2:shift 3:deshift 4:return 5:fororwhileFalse
		//string Word 0:null 1:True 2:False
		
		//System.out.println("\tdrawLine Start!!");
		
		for(int i=0;i<lines.size();i++)
		{
			int lineType=lines.get(i).get(2);
			String stringWord="";
			String fontStyle="";
			String lineStyle="";
			String style="";
			int pointA=lines.get(i).get(0);
			int pointB=lines.get(i).get(1);
			int skipA=0;
			int skipB=0;
			Object o;
			
			//扣除移除的點
			for(int temp:skip)
			{
				if(temp<pointA)
				{
					skipA++;
				}
				else
				{
					break;
				}
			}
			for(int temp:skip)
			{
				if(temp<pointB)
				{
					skipB++;
				}
				else
				{
					break;
				}
			}
			pointA-=skipA;
			pointB-=skipB;
			
			//設定線上文字
			//string Word 0:null 1:True 2:False
			if(lines.get(i).get(3)==0)
			{}
			else if(lines.get(i).get(3)==1)
			{
				stringWord="true";
				fontStyle=mxConstants.STYLE_FONTCOLOR+"="+"#00cc00"+";";
			}
			else if(lines.get(i).get(3)==2)
			{
				stringWord="false";
				fontStyle=mxConstants.STYLE_FONTCOLOR+"="+mxUtils.getHexColorString(Color.red)+";";
			}
			else
			{
				System.out.println("String Word Error");
			}

			//設定line的型態
			//line type 1:normal 2:shift 3:deshift 4:return 5:fororwhileFalse 6:jump
			//enum
			if(lineType==1)
			{
				lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_TOPTOBOTTOM+";exitX=0.5;exitY=1;entryX=0.5;entryY=0;";
			}
			else if(lineType==2)
			{
				lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=1;exitY=0.5;entryX=0.5;entryY=0;";
			}
			else if(lineType==3)
			{
				lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=0.5;exitY=1;entryX=1;entryY=0.5;";
			}
			// 4 5 6 三種線的型態 都需要另一個object來作為連線的轉彎位置
			else if(lineType==4)
			{
				String tempStyle="";
				int j=lines.get(i).get(0);
				for(;j>=0;j--)
				{
					if(SettingToken.isLoopToken(data.get(j).getName())&&(data.get(j).getLevel()==data.get(lines.get(i).get(0)).getLevel()-1))
						break;
				}
				double x=data.get(j).getX()-(maxLevel-data.get(j).getLevel())*offset/maxLevel;
				tempStyle = "fillColor=none;strokeColor=none;";
				
				o=graph.insertVertex(parent,null,"",x,data.get(lines.get(i).get(0)).getY(),sizeX,sizeY,tempStyle);
				lineStyle = "exitX=0;exitY=0.5;entryX=0;entryY=0.5;endArrow=none;";
				style=fontStyle+lineStyle;
				graph.insertEdge(parent, null, stringWord, ob.get(pointA), o,style);
				ob.add(o);
				pointA=ob.size()-1;
				stringWord="";
				lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=0;exitY=0.5;entryX=0;entryY=0.5;";
			}
			else if(lineType==5)
			{
				String tempStyle="";
				int j=lines.get(i).get(0);
				for(;j>=0;j--)
				{
					if(SettingToken.isLoopToken(data.get(j).getName()))
						break;
				}
				double x=data.get(j).getX()+(data.get(j).getWidth()-1)*Xoffset+(maxLevel-data.get(j).getLevel())*offset/maxLevel;
				tempStyle = "fillColor=none;strokeColor=none;";
				o=graph.insertVertex(parent,null,"",x,data.get(lines.get(i).get(0)).getY(),sizeX,sizeY,tempStyle);
				lineStyle = "exitX=1;exitY=0.5;entryX=1;entryY=0.5;endArrow=none;";
				style=fontStyle+lineStyle;
				graph.insertEdge(parent, null, stringWord, ob.get(pointA), o,style);
				ob.add(o);
				pointA=ob.size()-1;
				stringWord="";
				lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=1;exitY=0.5;entryX=1;entryY=0.5;";
			}
			else if(lineType==6)
			{
//				String lineColor="strokeColor="+mxUtils.getHexColorString(Color.PINK)+";";
				String lineColor="";
				String tempStyle="";
				double x=data.get(lines.get(i).get(0)).getX()+offset/3;
				tempStyle = "fillColor=none;strokeColor=none;";
				o=graph.insertVertex(parent,null,"",x,data.get(lines.get(i).get(0)).getY(),sizeX,sizeY,tempStyle);
				if(lines.get(i).get(0)<pointB)
					lineStyle = "exitX=1;exitY=0.75;entryX=1;entryY=0.75;endArrow=none;"+lineColor;
				else
					lineStyle = "exitX=1;exitY=0.25;entryX=1;entryY=0.25;endArrow=none;"+lineColor;
				style=fontStyle+lineStyle;
				graph.insertEdge(parent, null, stringWord, ob.get(pointA), o,style);
				ob.add(o);
				pointA=ob.size()-1;
				stringWord="";
				if(lines.get(i).get(0)<pointB)
					lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=1;exitY=0.75;entryX=1;entryY=0.25;"+lineColor;
				else
					lineStyle = "edgeStyle="+mxConstants.EDGESTYLE_ORTHOGONAL+";exitX=1;exitY=0.25;entryX=1;entryY=0.75;"+lineColor;
			}
			else
			{
				System.out.println("Line Type error");
			}
			
			style=fontStyle+lineStyle;
			
			graph.insertEdge(parent, null, stringWord, ob.get(pointA), ob.get(pointB),style);
		}
		//System.out.println("\tdrawLine End!!");
	}
	
//	private boolean isRetrunToken(String str)
//	{
//		boolean result=false;
//		str=SettingToken.removeState(str);
//		switch(str)
//		{
//		case "FOR":
//		case "WHILE":
//		case "DOWHILE":
//			result=true;
//			break;
//		}
//		
//		return result;
//	}
	
	
	private void saveGround() {
		// 多設定一個object 不會讓圖行直接到圖型下緣
		String style="";
		Object v1;
		MaxY=MaxY+sizeY;
		style = "fillColor=none;strokeColor=none;";
		v1=graph.insertVertex(parent,null,"",50,MaxY,1,groundSaveSize,style);
		ob.add(v1);
	}

	
}
