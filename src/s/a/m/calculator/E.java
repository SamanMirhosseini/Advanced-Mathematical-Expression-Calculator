package s.a.m.calculator;

import java.math.BigDecimal;

public class E {
	Double value1;
	BigDecimal value;
	public  E(){
		this.value1 = new Double(Math.E);
		this.value =  new BigDecimal(value1.toString());
	}
}
