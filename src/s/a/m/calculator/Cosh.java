package s.a.m.calculator;

import java.math.BigDecimal;

public class Cosh extends Mathfunctions{

	public Cosh(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
	Exp a = new Exp(this.Domain.toString());
	BigDecimal one = new BigDecimal("1");
	BigDecimal minus_one = new BigDecimal("1");
	BigDecimal two = new BigDecimal("2");
	return a.Bounder.add(minus_one.multiply(one.divide(a.Bounder,30,1))).divide(two,30,1);
	}
}
