package s.a.m.calculator;

import java.math.BigDecimal;

public class Tanh extends Mathfunctions {

	public Tanh(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Sinh sinh = new Sinh(this.Domain.toString());
		Cosh cosh = new Cosh(this.Domain.toString());
		return sinh.Bounder.divide(cosh.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in Domain of Tanh");
			return one;
		}
	}
}
