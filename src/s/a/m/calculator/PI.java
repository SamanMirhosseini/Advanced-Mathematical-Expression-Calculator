package s.a.m.calculator;

import java.math.BigDecimal;

public class PI {
	Double value1;
	BigDecimal value;
	public  PI(){
		this.value1 = new Double(Math.PI);
		this.value =  new BigDecimal(this.value1);
	}
}
