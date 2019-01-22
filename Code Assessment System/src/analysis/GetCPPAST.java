package analysis;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;


public class GetCPPAST 
{
	public BaseTree AST;
	
	public GetCPPAST(String path)
	{
		System.out.println("GetCPPAST Start!!");
		try 
		{
			CPPLexer lexer1 = new CPPLexer(new ANTLRFileStream(path, "UTF8"));
			CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
			CPPParser parser1 = new CPPParser(tokens1);
			CPPParser.cpp_root_return r = parser1.cpp_root();
			
			AST = ((BaseTree)r.getTree());
			
			System.out.println("GetCPPAST End!!");
		} 
		catch (Exception e) 
		{
			System.out.println("Cannot Read The Cpp file!!");
			// TODO: handle exception
		}
	}
}
