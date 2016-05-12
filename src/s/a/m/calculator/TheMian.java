package s.a.m.calculator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigDecimal;

public class TheMian {
	//static int x;
	//static String string;
	//1  0.5  +  cos  2  6  ^  *  sin  2  +  4  -
	public static void main (String []args){
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		GrandCalc grandCalc = new GrandCalc(string);
		s.close();
	}
	/*public static void sigma(int index){
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
			System.out.println(temp);
			ExpressionCalcualtor exp = new ExpressionCalcualtor(temp); 
			ans = ans.add(exp.lastvalue);
			int firster = (x >= 0)? x : 0;
			String help_me = string.substring(0,firster);
			String help_me2 =string.substring(j);
			string = help_me + ans.toString() + help_me2;
			sigma(0);
		}
		else{
			ExpressionCalcualtor e = new ExpressionCalcualtor(string);
			System.out.println(e.lastvalue);
		}
		}
		catch(java.lang.StringIndexOutOfBoundsException e){
			System.out.println("Invalid sigma notation");
		}
	}
	/*public static String find_arg(String s){
	int x = s.lastIndexOf("(");
	int y = s.indexOf(")",x);
	return s.substring(x + 1,y);
	}
	public static void push_stack(String s,int x){
		if(x >= s.length()){return;};
		int i = s.indexOf("(", x);
		if(i == -1){return;};
		stack.push(s.substring(i - 3,i));
		push_stack(s,i + 1);
	}//jnfsindslkndsldshnolkdsnlkdsnlkdsnds/lbds/ldsbn/dsbnlkdndgknfdkngdsLbd
	/*public static void special_tokeniser(String s,int x){
		int counter = 0,count = 0;
		int i = s.indexOf("(",x);
		int first = i - 3;
		while(s.charAt(i) != ')' && i < s.length()){
			if(s.charAt(i) == '('){
				counter++;
			}
			i++;
		}
		while(count < counter && i < s.length()){
			if(s.charAt(i) == ')'){
				count++;
			}
			i++;
		}
		v.add(s.substring(first,i));
		if(i >= s.length() - 1){
			return;
		}
		special_tokeniser(s,i);
	}*/
}
/*String [] strng = q.split("[a-zA-Z0-9\']");
String [] string = q.split("[^a-zA-Z0-9\']");
for(int j = 0;j < string.length;j++){
	System.out.print(string[j]+"\t");
}
for(int j = 0;j < strng.length;j++){
	System.out.print(strng[j]+"\t");
}
/*push_stack(q,0);
String arg = find_arg(q);
String func = stack.pop();
String next = "";
switch(func){
case "sin":
	Sin sin = new Sin(arg);
	next = sin.Bounder.toString();
break;
case "Tan":
	Tan t = new Tan(arg);
	next = t.Bounder.toString();
break;
}
while(!stack.isEmpty()){
	func = stack.pop();hhhhiihh
	switch(func){
	case "sin":
		Sin sin = new Sin(next);
		next = sin.Bounder.toString();
	break;
	case "Tan":
		Tan t = new Tan(next);
		next = t.Bounder.toString();
	break;
	}
}
System.out.println(next);*/