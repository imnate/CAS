/*�o�@�����Oimport�ڪ�antlr compiler ��CPPLexer & CPPParser*/
/**/
package main;

import analysis.*;
import graphing.GraphingControlFlow;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import org.antlr.runtime.tree.BaseTree;

import data.StrategyData;
import data.TokenData;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

import java.awt.Checkbox;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import analysis.GetSlice;




import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;




public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField cppPath1;
	private JTextField cppPath2;
	
	private ArrayList<TokenData> list1;
	private ArrayList<TokenData> list1WOL;
	private ArrayList<TokenData> list2;
	private ArrayList<TokenData> list2WOL;
	
	private boolean hasCompared=false;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	GetSlice gs1 ;
	GetSlice gs2 ;
	static SemanticAnalysis Sa;
	static StrategyData Sd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		if(args.length>0)
		{
			switch(args[0].toString())
			{
				case"0":
					if(args[1].toString().equals("")||
					   args[2].toString().equals("")||
					   args[3].toString().equals("")||
					   args[4].toString().equals("")||
					   args[5].toString().equals(""))												
					{
						System.out.println("���˹��J�Ѽ�");
					}
					else
					{
						try
						{
							CMD(args[1].toString(),args[2].toString(),args[3].toString(),args[4].toString(),args[5].toString());
						}
						catch(Exception e)
						{
							System.out.println("���˹��J�Ѽ� " + e);
						}
					}
					break;
				case"1":
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								UI frame = new UI();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					break;
			
			}
			
		}
		else
		{
			//C:\Users\Imnate\Imnate\Web\Upload\CS_106�٧�_for\9999999-12.cpp CS_106�٧�_forpic D:\Websites\OSMVA-UploadHW\OSMVA-UploadHW\img\9999999-12.png C:\Users\Imnate\Imnate\Web\Upload\CS_106�٧�_for_Structure 9999999-12
			//0 C:\Users\Imnate\Desktop\1031430-0.cpp D:\ test.png D:\ test.txt
			System.out.println("�ѼƶǤJ���~!");
			System.out.println("CMD�Ҧ�: java -jar 0 cpp���| ��X�Ϥ��s����| �Ϥ��W��.png");
			System.out.println("GUI�Ҧ�: java -jar 1");
		}

	}
	public static void CMD(String path,String Png_path,String Pic_name,String ST_path,String ST_name){
		
		
		System.out.println("�i�JCMD");
		
		
		JPanel contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane2);
		contentPane2.setLayout(null);
		
		
		
		final JInternalFrame internalFrame3 = new JInternalFrame("");
		internalFrame3.setEnabled(false);
		internalFrame3.setBounds(31, 194, 742, 1004);
		internalFrame3.setClosable(false);
		internalFrame3.setVisible(true);
		contentPane2.add(internalFrame3);
		
		checkCppCode_CMD(internalFrame3,path,Png_path,Pic_name,ST_path,ST_name);
		
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1741, 916);//2 internalFrame
		setBounds(100, 100, 1388, 1262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cppPath1 = new JTextField();
		cppPath1.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		cppPath1.setBounds(100, 25, 199, 35);
		contentPane.add(cppPath1);
		cppPath1.setColumns(10);
		/*******************/
		JButton btnBrowser1 = new JButton("Browse first file");
		btnBrowser1.setFont(new Font("�s�ө���", Font.BOLD, 18));
		btnBrowser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cppPath1.setText(fileChoose("D:\\OneDrive\\��s\\�|�~\\"));
				//D:\OneDrive\��s\�|�~\1001556.cpp
				//C:\\Users\\ImNaTE\\OneDrive\\��s
			}
		});
		btnBrowser1.setBounds(304, 22, 187, 40);
		contentPane.add(btnBrowser1);
		
		final JInternalFrame internalFrame1 = new JInternalFrame("");
		internalFrame1.setEnabled(false);
		internalFrame1.setBounds(31, 194, 742, 1004);
		internalFrame1.setClosable(false);
		internalFrame1.setVisible(true);
		contentPane.add(internalFrame1);
		
		final JInternalFrame internalFrame2 = new JInternalFrame("");
		internalFrame2.setEnabled(false);
		internalFrame2.setBounds(812, 194, 539, 929);
		internalFrame2.setClosable(false);
		internalFrame2.setVisible(true);
		contentPane.add(internalFrame2);
		
		JButton btnCheck = new JButton("Check First File");
		btnCheck.setFont(new Font("�s�ө���", Font.BOLD, 18));
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				if(cppPath1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "�Х��T���CPP�ɮ�");
					System.out.println("�Х��T���CPP�ɮ�");
				}
				else
				{
					checkCppCode(internalFrame1);
					System.out.println("****************************************\n");
				}
			}
		});
		btnCheck.setBounds(31, 86, 231, 44);
		contentPane.add(btnCheck);
		
		internalFrameUnmovable(internalFrame1);
		internalFrameUnmovable(internalFrame2);
		
		cppPath2 = new JTextField();
		cppPath2.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		cppPath2.setColumns(10);
		cppPath2.setBounds(585, 25, 199, 35);
		contentPane.add(cppPath2);
		
		JButton btnBrowser2 = new JButton("Browse Second file");
		btnBrowser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cppPath2.setText(fileChoose("D:\\OneDrive\\��s\\�|�~\\"));
				//D:\\OneDrive\\��s\\�|�~\\1002633.cpp
				//C:\\Users\\ImNaTE\\OneDrive\\��s
			}
		});
		btnBrowser2.setFont(new Font("�s�ө���", Font.BOLD, 18));
		btnBrowser2.setBounds(789, 21, 187, 44);
		contentPane.add(btnBrowser2);
		
		JButton btnCompare = new JButton("Compare Two File");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cppPath1.getText().isEmpty()||cppPath2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "�Х��T���CPP�ɮ�");
					System.out.println("�Х��T���CPP�ɮ�");
				}
				else
				{
					compareCppCode();
					System.out.println("****************************************\n");
				}
			}
		});
		btnCompare.setFont(new Font("�s�ө���", Font.BOLD, 18));
		btnCompare.setBounds(291, 86, 231, 44);
		contentPane.add(btnCompare);
		
		JLabel lblFile = new JLabel("File 1 :");
		lblFile.setBounds(31, 25, 68, 40);
		contentPane.add(lblFile);
		
		JLabel lblFile_1 = new JLabel("File 2 :");
		lblFile_1.setBounds(513, 25, 68, 40);
		contentPane.add(lblFile_1);
		
		JLabel lblFileFlow = new JLabel("File 1 Flow Graph :");
		lblFileFlow.setBounds(31, 151, 214, 25);
		contentPane.add(lblFileFlow);
		
		JLabel lblFileFlow_1 = new JLabel("File 2 Flow Graph :");
		lblFileFlow_1.setBounds(812, 151, 214, 25);
		contentPane.add(lblFileFlow_1);
		
		final JCheckBox ckbxShow1Less = new JCheckBox("Show File 1 Less");
		ckbxShow1Less.setSelected(true);
		ckbxShow1Less.setBounds(540, 86, 181, 23);
		contentPane.add(ckbxShow1Less);
		
		final JCheckBox ckbxShow2Less = new JCheckBox("Show File 2 Less");
		ckbxShow2Less.setSelected(true);
		ckbxShow2Less.setBounds(540, 107, 181, 23);
		contentPane.add(ckbxShow2Less);
		
		

		JButton btnShowFlow = new JButton("Show Compare Flow");
		btnShowFlow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				test();
				if(hasCompared)
				{
					showFlowGraph(internalFrame1,internalFrame2,ckbxShow1Less.isSelected(),ckbxShow2Less.isSelected());
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "�Х������ӵ{��");
					System.out.println("�Х������ӵ{��");
				}
			}
		});
		btnShowFlow.setFont(new Font("�s�ө���", Font.BOLD, 18));
		btnShowFlow.setBounds(745, 86, 231, 44);
		contentPane.add(btnShowFlow);
		
		
		
		
		 /*******************/
	}	
	private void internalFrameUnmovable(JInternalFrame internalFrame)
	{
		// Make first internal frame unmovable
		
		BasicInternalFrameUI ui = (BasicInternalFrameUI)internalFrame.getUI();
		Component north = ui.getNorthPane();
		MouseMotionListener[] actions =	(MouseMotionListener[])north.getListeners(MouseMotionListener.class);

		for (int i = 0; i < actions.length; i++)
			north.removeMouseMotionListener( actions[i] );
	}	
	private String fileChoose(String Path)
	{
		String filePath="";
		try
		{
			JFileChooser chooser = new JFileChooser(Path);
			FileNameExtensionFilter filter = new FileNameExtensionFilter("CPP","cpp");
			chooser.setFileFilter((javax.swing.filechooser.FileFilter) filter);
			int ret=chooser.showOpenDialog(null);
			if(ret==JFileChooser.APPROVE_OPTION)
			{
				System.out.println("�z��ܶ}�Ҧ���: "+chooser.getSelectedFile().getName());
				System.out.println("���|��: "+chooser.getSelectedFile().getAbsolutePath());
				filePath = chooser.getSelectedFile().getAbsolutePath();
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return filePath;
	}
	
	private void checkCppCode(JInternalFrame internalFrame)
	{
		System.out.println("********���k�P�y�k���R����*********");
		GetCPPAST ga = new GetCPPAST(cppPath1.getText());
		showAST(ga.AST,1);
		
		System.out.println("********���c���R����*********");
		GetSlice gs = new GetSlice(ga.AST);

		printCountList(gs.getTokenCount(),1);//call GetSlice ��function �L�X
		SettingToken.showTokenDataDetail(gs.getData(),false);
		
		System.out.println("********SemanticAnalysis*********");
		Sa=new SemanticAnalysis(gs.type(),
								gs.sned2SemanticAnalsis_cin(),
								gs.send2SemanticAnalsis(),
								gs.count_for(),
								gs.send2SemanticAnalsis_declare(),
								gs.count_declare(),
								gs.send2SemanticAnalsis_assignment(),
								gs.send2SemanticAnalsis_sentinel());
//		Sa=new SemanticAnalysis(type,sned2SemanticAnalsis_cin,send2SemanticAnalsis,count_for,sned2SemanticAnalsis_declare,count_declare);

		
		System.out.println("********��ı�Ƨe�{����*********");
		SettingToken ST=new SettingToken(gs.getData());
		GraphingControlFlow GCF = new GraphingControlFlow(ST.getData(), ST.getLines(), ST.getMaxLevel(), internalFrame);
		
		GCF.drawfront(gs.Show(),Sa.LoopTimes(),null,null);//��ܥXcondition��T
		
//		
//		System.out.println("UI GS Time :�@"+Sa.LoopTimes());
		
	}
	private static void output_printCountList(Map<String,Integer> map,String ST_path,String ST_name)
	{
		 FileWriter fw ;
		 try {
			fw = new FileWriter(ST_path+"\\"+ST_name+"Count.txt");
			
			for(String temp : map.keySet())
			{
				fw.write(temp+"\t"+map.get(temp)+"\r\n");
				//System.out.println(temp+"\t"+map.get(temp));
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		 					
	
	}
	private static void checkCppCode_CMD(JInternalFrame internalFrame,String path,String Png_path,String Pic_name,String ST_path,String ST_name)
	{
		JTextField cppPath3 = new JTextField();
		cppPath3.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		cppPath3.setBounds(100, 25, 199, 35);
		//contentPane.add(cppPath3);
		cppPath3.setColumns(10);
		cppPath3.setText(path);
		
		
		System.out.println("********���k�P�y�k���R����*********");
		GetCPPAST ga = new GetCPPAST(cppPath3.getText());
		showAST(ga.AST,1);
		
		System.out.println("********���c���R����*********");
		GetSlice gs = new GetSlice(ga.AST);
		printCountList(gs.getTokenCount(),1);//call GetSlice ��function �L�X
		SettingToken.showTokenDataDetail(gs.getData(),false);	
		
		output_printCountList(gs.getTokenCount(),ST_path,ST_name);//��X�����Ϊ�txt
		TokenLevel_CMD(SettingToken.out_TokenLevel(),ST_path,ST_name);//�P�_���c��Xtxt
		
		//System.out.println("�h :"+SettingToken.out_TokenLevel());
		
		
		System.out.println("********SemanticAnalysis*********");
		Sa=new SemanticAnalysis(gs.type(),gs.sned2SemanticAnalsis_cin(),gs.send2SemanticAnalsis(),gs.count_for(),gs.send2SemanticAnalsis_declare(),gs.count_declare(),gs.send2SemanticAnalsis_assignment(),gs.send2SemanticAnalsis_sentinel());
//		Sa=new SemanticAnalysis(type,sned2SemanticAnalsis_cin,send2SemanticAnalsis,count_for,sned2SemanticAnalsis_declare,count_declare);
	
		
		System.out.println("********��ı�Ƨe�{����*********");
		SettingToken ST=new SettingToken(gs.getData());
		GraphingControlFlow GCF = new GraphingControlFlow(ST.getData(), ST.getLines(), ST.getMaxLevel(), internalFrame);
		GCF.drawfront(gs.Show(),Sa.LoopTimes(),Png_path,Pic_name);//��ܥXcondition��T
		
		System.exit(1);//�o�q�O����IIS�djava process
//		
//		System.out.println("UI GS Time :�@"+Sa.LoopTimes());
		
	}
	private static void TokenLevel_CMD(ArrayList<String> tokendata,String ST_path,String ST_name)
	{
		FileWriter fw ;
		try{
			fw = new FileWriter(ST_path+"\\"+ST_name+"Level.txt");
		
			for(int i =0;i<tokendata.size();i++)
			{
				if(i%2==0&&i!=0)
				{
					fw.write("\r\n");
				}
				fw.write(tokendata.get(i));
				
			}
			fw.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}	
	private void compareCppCode()
	{
		System.out.println("********���k�P�y�k���R����*********");
		System.out.println("********1 CPP Tree*********");
		GetCPPAST ga1 = new GetCPPAST(cppPath1.getText());
//		showAST(ga1.AST,1);
		
		System.out.println("********2 CPP Tree*********");
		GetCPPAST ga2 = new GetCPPAST(cppPath2.getText());
//		showAST(ga2.AST,1);
		
		System.out.println("********���c���R����*********");
		System.out.println("********1 CUT MAIN CODE*********");
		gs1 = new GetSlice(ga1.AST);
		
//		showAST(gs1.getMainBlock(),1);
		System.out.println("********2 CUT MAIN CODE*********");
		gs2 = new GetSlice(ga2.AST);

//		showAST(gs2.getMainBlock(),1);
		
		printCountList(gs1.getTokenCount(),1);
		printCountList(gs2.getTokenCount(),2);
		
		
		//�����Υ������
//		GlobalAlignment GA=new GlobalAlignment(gs1.getData(),gs2.getData());
//		GA.PrintTable();
//		GA.PrintAns();
//		
//		list1=GA.getList1();
//		list1WOL=GA.getList1WOL();
//		list2=GA.getList2();
//		list2WOL=GA.getList2WOL();
//		
//		showTokenDataDetail(list1);
//		showTokenDataDetail(list1WOL);
//		showTokenDataDetail(list2);
//		showTokenDataDetail(list2WOL);
//		
//		SettingToken.indexCorrection(list1);
//		SettingToken.indexCorrection(list1WOL);
//		SettingToken.indexCorrection(list2);
//		SettingToken.indexCorrection(list2WOL);
//		
//		SettingToken.levelCorrection(list1);
//		SettingToken.levelCorrection(list1WOL);
//		SettingToken.levelCorrection(list2);
//		SettingToken.levelCorrection(list2WOL);
//		
//		showTokenDataDetail(list1);
//		showTokenDataDetail(list1WOL);
//		showTokenDataDetail(list2);
//		showTokenDataDetail(list2WOL);
		
		//��StructureCompare
		System.out.println("********�������*********");
		StructureCompare sc=new StructureCompare(gs1.getData(),gs2.getData());
		sc.depthFirstComparison();
		
		list1=sc.getComparedList1();
		list1WOL=sc.getComparedList1WOL();
		list2=sc.getComparedList2();
		list2WOL=sc.getComparedList2WOL();
		
		SettingToken.showTokenDataDetail(list1,false);
		SettingToken.showTokenDataDetail(list1WOL,false);
		SettingToken.showTokenDataDetail(list2,false);
		SettingToken.showTokenDataDetail(list2WOL,false);
		
		SettingToken.indexCorrection(list1);
		SettingToken.indexCorrection(list1WOL);
		SettingToken.indexCorrection(list2);
		SettingToken.indexCorrection(list2WOL);
		
		SettingToken.levelCorrection(list1);
		SettingToken.levelCorrection(list1WOL);
		SettingToken.levelCorrection(list2);
		SettingToken.levelCorrection(list2WOL);
		
		SettingToken.showTokenDataDetail(list1,false);
		SettingToken.showTokenDataDetail(list1WOL,false);
		SettingToken.showTokenDataDetail(list2,false);
		SettingToken.showTokenDataDetail(list2WOL,false);
		
		hasCompared=true;
		
		JOptionPane.showMessageDialog(null, "�������");
		System.out.println("�������");
	}
	private void showFlowGraph(JInternalFrame internalFrame1,JInternalFrame internalFrame2,boolean show1Less,boolean show2Less)
	{
		System.out.println("********��ı�Ƨe�{����*********");
		ArrayList<TokenData> Flow1 = null;
		ArrayList<TokenData> Flow2 = null;
		if(show1Less)
		{
			Flow1=list1;
		}
		else
		{
			Flow1=list1WOL;
		}
		
		if(show2Less)
		{
			Flow2=list2;
		}
		else
		{
			Flow2=list2WOL;
		}
		
		if(!Flow1.isEmpty()&&!Flow2.isEmpty())
		{
			
			ArrayList<StrategyData> List_Sd = new ArrayList<StrategyData>();
			
			SettingToken ST1=new SettingToken(Flow1);
			SettingToken ST2=new SettingToken(Flow2);
			
			SettingToken.showTokenDataDetail(Flow1,true);
			SettingToken.showTokenDataDetail(Flow2,true);	
			
			
			/*�o��O�D�n�O�e�y�{��j����R���c
			 * sd�O�t�d�N���get set �Ϊ� �i�H�h��StrategyData.java�̭�������method value
			 * �NSa�̭��� �j��type Times Strategy �Ǩ�sd�̭���
			 * �A�N�L�Ǩ�Strategic_SemanticsCompare.java �� �����P�y�N�����
			 * mark 2017/05/23
			 * */
			GraphingControlFlow gcf1 = new GraphingControlFlow(ST1.getData(), ST1.getLines(), ST1.getMaxLevel(), internalFrame1);			
			Sa=new SemanticAnalysis(gs1.type(),gs1.sned2SemanticAnalsis_cin(),gs1.send2SemanticAnalsis(),gs1.count_for(),gs1.send2SemanticAnalsis_declare(),gs1.count_declare(),gs1.send2SemanticAnalsis_assignment(),gs1.send2SemanticAnalsis_sentinel());						
						
			gcf1.drawfront(gs1.Show(),Sa.LoopTimes(),null,null);
			
			Sd = new StrategyData();
			Sd.Set_Loop_Type(Sa.Sa_Get_Loop_type());
			Sd.Set_Loop_Strategy(Sa.Sa_Get_Loop_Strategy());
			Sd.Set_Loop_Times(Sa.Sa_Get_Loop_Times());
			List_Sd.add(Sd);	
			
			
			GraphingControlFlow gcf2 = new GraphingControlFlow(ST2.getData(), ST2.getLines(), ST2.getMaxLevel(), internalFrame2);			
			Sa=new SemanticAnalysis(gs2.type(),gs2.sned2SemanticAnalsis_cin(),gs2.send2SemanticAnalsis(),gs2.count_for(),gs2.send2SemanticAnalsis_declare(),gs2.count_declare(),gs2.send2SemanticAnalsis_assignment(),gs2.send2SemanticAnalsis_sentinel());			
			gcf2.drawfront(gs2.Show(),Sa.LoopTimes(),null,null);
		
			
			Sd = new StrategyData();
		
			Sd.Set_Loop_Type(Sa.Sa_Get_Loop_type());
			Sd.Set_Loop_Strategy(Sa.Sa_Get_Loop_Strategy());
			Sd.Set_Loop_Times(Sa.Sa_Get_Loop_Times());
			List_Sd.add(Sd);
			Strategic_SemanticsCompare SSC = new Strategic_SemanticsCompare(List_Sd);
			
		}
	}	
	private static void showAST(BaseTree AST,int num)
	{
		
		for(int i =0;i<AST.getChildCount();i++)
		{
			if(SettingToken.isToken(AST.getChild(i).toString()))
			{
				System.out.print(num+":");
				for(int j=1;j<num;j++)
					System.out.print("\t");
				
				System.out.println(AST.getChild(i).toString()+" ");
				
				if(AST.getChild(i).getChildCount()!=0)
					showAST((BaseTree)AST.getChild(i),num+1);
			}
		}
	}	
	private static void printCountList(Map<String,Integer> map,int num)
	{
		System.out.println("****"+num+" Count");
		for(String temp : map.keySet())
		{
			System.out.println(temp+"\t"+map.get(temp));
		}
		System.out.println("******************");
	}	
	private void test()
	{	
		GetCPPAST ga1 = new GetCPPAST(cppPath1.getText());
		System.out.println("********1 ALL CODE*********");
		
		GetCPPAST ga2 = new GetCPPAST(cppPath2.getText());
		System.out.println("********2 ALL CODE*********");
		
		GetSlice gs1 = new GetSlice(ga1.AST);
		System.out.println("********1 MAIN CODE*********");
		
		GetSlice gs2 = new GetSlice(ga2.AST);
		System.out.println("********2 MAIN CODE*********");
		
		StructureCompare sc=new StructureCompare(gs1.getData(),gs2.getData());
	}
}
