package s.a.m.calculator;

import java.math.BigDecimal;

public class Csch extends Mathfunctions {

	public Csch(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Sinh sinh = new Sinh(this.Domain.toString());
		return one.divide(sinh.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in Domain of Sech");
			return one;
		}
	}
}
