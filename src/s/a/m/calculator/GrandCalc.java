package s.a.m.calculator;

import java.math.BigDecimal;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrandCalc {
	int x;
	String string;
	String last;
	public GrandCalc(String s){
		this.string = s;
		this.sigma(0);
	}
	public void sigma(int index){
		try{
		x = string.lastIndexOf("sigma");
		if(x != -1){
			BigDecimal ans = new BigDecimal("0");
			int h = string.lastIndexOf("for");
			int y = string.lastIndexOf("from");
			int z = string.lastIndexOf("to");
			String pat = string.substring(h+4,y-1);
			StringTokenizer str = new StringTokenizer(pat);
			pat = "";
			while(str.hasMoreTokens())
			pat += str.nextToken();
			pat = "(\\b"+pat+"\\b)";
			str = new StringTokenizer(string.substring(y+4,z-1));
			Integer first = new Integer(str.nextToken());
			str = new StringTokenizer(string.substring(z+2));
			String help = str.nextToken();
			int j;
			String[] helper = help.split("[^0-9\']+");
			for( j = z + 2;j < string.length();j++){
				if(string.charAt(j) != ' '&& (string.charAt(j) < 48 || string.charAt(j) > 57)){
					break;
				}
			}
			//String back_up = string.substring(x,j);
			Integer last = new Integer(helper[0]);
			Pattern p = Pattern.compile(pat);
			Matcher m = p.matcher(string.substring(x+5,h));
			String temp = "";
			for(Integer i = first;i <= last;i++){
				if(i < last){
				temp+= (m.replaceAll(i.toString()) + "+");
				}
				else
				temp+= m.replaceAll(i.toString());
			}
			ExpressionCalcualtor exp = new ExpressionCalcualtor(temp);
			try{
			ans = ans.add(exp.lastvalue);
			}catch(java.lang.NullPointerException e2){
				System.out.println("Invalid sigma notation");
			}
			int firster = (x >= 0)? x : 0;
			String help_me = string.substring(0,firster);
			String help_me2 =string.substring(j);
			string = help_me + ans.toString() + help_me2;
			sigma(0);
		}
		else{
			ExpressionCalcualtor e = new ExpressionCalcualtor(string);
			System.out.println(e.lastvalue);
			try{
			this.last = e.lastvalue.toString();
			}catch(java.lang.NullPointerException e1){
				System.out.println("Nothing to calculate");
			}
		}
		}
		catch(java.lang.StringIndexOutOfBoundsException e){
			System.out.println("Invalid sigma notation");
		}
	}
}
