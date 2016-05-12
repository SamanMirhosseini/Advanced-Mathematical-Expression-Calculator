package s.a.m.calculator;

import java.math.BigDecimal;

public class Tan {
	/*Double Domain1;
	Double Bounder1;*/
	BigDecimal Domain;
	BigDecimal Bounder;
	Sin sin;
	Cos cos;
	Tan(String s){
		/*BigDecimal help = new BigDecimal(s);
		BigDecimal one = new BigDecimal("1");
		BigDecimal two = new BigDecimal("2");
		PI p = new PI();
		if(help.divide(p.value.divide(two,1)).remainder(two).compareTo(one) == 0){
			System.out.println("Not in range of tangent");
		}*/
		this.Domain = new BigDecimal(s);
		//this.Domain1 = new Double(s);
		sin = new Sin(s);
		cos = new Cos(s);
		try{
		this.calcBounder();
		}
		catch(java.lang.NullPointerException e0){
			System.out.println("As you entered ompossible statements so the whole opration could not be compeleted");
		}
	}
	private void calcBounder(){
		//this.Bounder1 = sin.Bounder1 / cos.Bounder1;
		try{
		this.Bounder = sin.Bounder.divide(cos.Bounder,0);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in the range of tangent");
		}
	}
}
