package s.a.m.calculator;

import java.math.BigDecimal;

public class Exp extends Mathfunctions {
	public Exp(String s){
		super(s);
	}
	@Override
	public BigDecimal calcbounder(){
		E e = new E();
		SimpleOps s = new SimpleOps();
		return s.power(e.value1.toString(),this.Domain.toString());                           
	}
}
