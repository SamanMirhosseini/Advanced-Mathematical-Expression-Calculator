package s.a.m.calculator;

public class Cos extends Sin {
	public Cos(String s){
		super(what_we_want(s).toString());
	}
	public static Double what_we_want(String s){
		Double d = new Double(s);
		return Math.PI / 2 - d;
	}
}
