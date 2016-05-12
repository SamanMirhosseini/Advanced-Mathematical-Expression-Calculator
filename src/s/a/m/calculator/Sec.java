package s.a.m.calculator;

import java.math.BigDecimal;

public class Sec extends Mathfunctions {
	public Sec(String s){
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Cos cos = new Cos(this.Domain.toString());
		one = new BigDecimal("1");
		return one.divide(cos.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in domain of Sec");
			return one;
		}
	}
}
