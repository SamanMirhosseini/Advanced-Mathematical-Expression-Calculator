package s.a.m.calculator;

import java.math.BigDecimal;

public class SimpleOps {
	public BigDecimal add(String s1,String s2){
		BigDecimal a = new BigDecimal(s1);
		BigDecimal b = new BigDecimal(s2);
		return a.add(b);
	}
	public BigDecimal dec(String s1,String s2){
		BigDecimal m = new BigDecimal("-1");
		BigDecimal a = new BigDecimal(s1);
		BigDecimal b = new BigDecimal(s2);
		return a.add(b.multiply(m));
	}
	public BigDecimal mult(String s1,String s2){
		BigDecimal a = new BigDecimal(s1);
		BigDecimal b = new BigDecimal(s2);
		return a.multiply(b);
	}
	public BigDecimal power(String s1,String s2){
		try{
		BigDecimal a = new BigDecimal(s1);
		Integer b = new Integer(s2);
		return a.pow(b);
		}
		catch(java.lang.NumberFormatException e){
			Double a = new Double(s1);
			Double b = new Double(s2);
			Double c = new Double(Math.pow(a,b));
			BigDecimal big = new BigDecimal(c.toString());
			return big;
		}
	}
	public BigDecimal div(String s1,String s2){
		try{
		BigDecimal a = new BigDecimal(s1);
		BigDecimal b = new BigDecimal(s2);
		return a.divide(b,30,1);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println("Division by zero");
			e.getMessage();
			BigDecimal b = new BigDecimal("0");
			return b;
		}
	}
}
