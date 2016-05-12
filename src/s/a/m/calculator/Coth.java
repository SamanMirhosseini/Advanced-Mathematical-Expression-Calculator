package s.a.m.calculator;

import java.math.BigDecimal;

public class Coth extends Mathfunctions{

	public Coth(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Sinh sinh = new Sinh(this.Domain.toString());
		Cosh cosh = new Cosh(this.Domain.toString());
		return cosh.Bounder.divide(sinh.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in Domain of Coth");
			return one;
		}
	}
}
