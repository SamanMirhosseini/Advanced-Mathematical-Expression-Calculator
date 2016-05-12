package s.a.m.calculator;

import java.math.BigDecimal;

public class Ln extends Mathfunctions {
	public Ln(String s){
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		try{
		Double d = new Double(this.Domain.toString());
		d = Math.log(d);
		BigDecimal b = new BigDecimal(d.toString());
		return b;
		}
		catch(java.lang.NumberFormatException e){
			System.out.println("Ln does not accept negative numbers");
			BigDecimal bio = new BigDecimal("0");
			return bio;
		}
	}
}
