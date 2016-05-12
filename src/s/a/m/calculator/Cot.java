package s.a.m.calculator;

import java.math.BigDecimal;

public class Cot {
	//Double Domain1;
	//Double Bounder1;
	BigDecimal Domain;
	BigDecimal Bounder;
	Sin sin;
	Cos cos;
	public Cot(String s){
		try{
		/*BigDecimal help = new BigDecimal(s);
		BigDecimal one = new BigDecimal("1");
		BigDecimal two = new BigDecimal("2");
		PI p = new PI();
		if(help.divide(p.value.divide(two)).remainder(two).compareTo(one) == 0){
			System.out.println("Not in range of tangent");
		}*/
		this.Domain = new BigDecimal(s);
		//this.Domain1 = new Double(s);
		sin = new Sin(s);
		cos = new Cos(s);
		this.calcBounder();
		}
		catch(java.lang.NullPointerException e){
			System.out.println("As we reach impossible eperations in your input so the whole operation could not be done");
			System.exit(0);
		}
	}
	private void calcBounder(){
		//this.Bounder1 = cos.Bounder1 / sin.Bounder1;
		try{
		this.Bounder = cos.Bounder.divide(sin.Bounder,0);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Not in the Domain of cotangent");
		}
	}
}
