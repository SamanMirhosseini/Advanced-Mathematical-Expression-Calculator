package s.a.m.calculator;

import java.math.BigDecimal;

public class Sech extends Mathfunctions{

	public Sech(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Cosh cosh = new Cosh(this.Domain.toString());
		return one.divide(cosh.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in Domain of Sech");
			return one;
		}
	}
}
