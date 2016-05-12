package s.a.m.calculator;

import java.math.BigDecimal;

public class Sin {
	//Double Domain1;
	//Double Bounder1;
	BigDecimal Domain;
	BigDecimal Bounder;
	public Sin(String s){
		//this.Domain1 = new Double(s);
		//this.Bounder1 = this.dobcalcbounder();
		this.Domain = new BigDecimal(s);
		this.setBounder();
	}
	public BigDecimal calcBounder(){
		PI pi = new PI();
		BigDecimal two = new BigDecimal("2");
		two = two.multiply(pi.value);
		BigDecimal Copy = this.Domain;
		BigDecimal ans = new BigDecimal("0");
		BigDecimal one = new BigDecimal("-1");
		while(Copy.compareTo(two) == 1 || Copy.compareTo(ans) == -1){
			if(Copy.compareTo(ans) == 1){
				Copy = Copy.add(one.multiply(two));
			}
			else{
				Copy = Copy.add(two);
			}
		}
		for(int i = 0;i < 100;i++){
			BigDecimal b;
			b = one.pow(i);
			//System.out.println(one);
			BigDecimal help = Copy.pow((2 * i) + 1);
			//System.out.println(help);
			help = help.multiply(b);
			//System.out.println(help);
			//System.out.println(this.fact((2 * i) + 1));
			help = help.divide(this.fact((2 * i) + 1),30,1);
			//System.out.println(help);
			//ans = ans.add(one.pow(i).multiply(this.Domain.pow(i).divide(this.fact((2 * i) + 1))));
			ans = ans.add(help);
			//System.out.println(ans);
		}
		if(Copy.compareTo(pi.value) == 0 || Copy.compareTo(two) == 0){
			BigDecimal zero = new BigDecimal("0");
			return zero;
		}
		else{
		return ans;
		}
	}
	public void setBounder(){
		this.Bounder = this.calcBounder();
	}
	public BigDecimal fact(int n){
		
		BigDecimal ans = new BigDecimal("1");
		for(Integer i = 1;i <= n;i++){
			BigDecimal help = new BigDecimal(i);
			ans = ans.multiply(help);
		}
		return ans;
	}
	/*public long longfact(int n){
		long ans = 1;
		for(int i = 1;i <= n;i++){
			ans *= i;
		}
		return ans;
	}
	public double dobcalcbounder(){
		Double ans = 0.0;
		for(int i = 0;i < 20;i++){
			ans += (Math.pow(this.Domain1,2 * i + 1) / this.longfact(2 * i + 1)) * Math.pow(-1,i); 
		}
		return ans;
	}*/
}
