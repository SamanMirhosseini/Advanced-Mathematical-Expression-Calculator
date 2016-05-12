package s.a.m.calculator;

import java.math.BigDecimal;

public abstract class Mathfunctions {
	BigDecimal Domain;
	BigDecimal Bounder;
	public Mathfunctions(String s){
		Domain = new BigDecimal(s);
		setBounder();
	}
	public abstract BigDecimal calcbounder();
	public  void setBounder(){
		Bounder = calcbounder();
	}
}
