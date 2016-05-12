package s.a.m.calculator;

import java.math.BigDecimal;

public class Csc extends Mathfunctions{

	public Csc(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		BigDecimal one = new BigDecimal("1");
		try{
		Sin sin = new Sin(this.Domain.toString());
		one = new BigDecimal("1");
		return one.divide(sin.Bounder,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in domain of Csc");
			return one;
		}
	}
}
