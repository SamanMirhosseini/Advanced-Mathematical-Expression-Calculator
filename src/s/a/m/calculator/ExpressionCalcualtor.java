package s.a.m.calculator;

import java.math.BigDecimal;
import java.util.*;

public class ExpressionCalcualtor {
	Stack <Token> calculating_stack = new Stack<Token>();
	ToPostfix toPost;
	BigDecimal lastvalue;
	boolean hasErr;
	public ExpressionCalcualtor(String s){
		this.hasErr = false;
		toPost = new ToPostfix(s);
		this.the_post_fix_calculator();
		if(this.calculating_stack.size() != 1){
			System.out.println("invalid input (You put tokens together in wrong way)");
		}
		else{
		try{
		this.lastvalue = new BigDecimal(this.calculating_stack.pop().value);
		}
		catch(java.util.EmptyStackException e){
			System.out.println();
		}
		}
	}
	private void the_post_fix_calculator(){
		while(!this.toPost.output_queue.isEmpty()){
			 Token temp = this.toPost.output_queue.pollLast();
			 switch(temp.type){
			 case Number:
				 this.calculating_stack.push(temp);
			 break;
			 case function:
				 this.function_handell(temp);
			 break;
			 case operator:
				 this.operation_handell(temp);
		     break;
		     default:
		    	 System.out.println("Unmatched parathesis");
		     break;
			 }
		}
	}
	private void operation_handell(Token t){
		try{
		Token b = this.calculating_stack.pop();
		Token a = this.calculating_stack.pop();
		Token temp = new Token("0");
		SimpleOps s = new SimpleOps();
		switch(t.value){
		case "+":
			temp = new Token(s.add(a.value,b.value).toString());
		break;
		case "-":
			temp = new Token(s.dec(a.value,b.value).toString());
		break;
		case "*":
			temp = new Token(s.mult(a.value,b.value).toString());
		break;
		case "/":
			temp = new Token(s.div(a.value,b.value).toString());
		break;
		case "^":
			temp = new Token(s.power(a.value,b.value).toString());
		break;
		}
		this.calculating_stack.push(temp);
		}
		catch(java.util.EmptyStackException e){
			if(this.hasErr == false){
				this.hasErr = true;
			System.out.println("Your input contians invalid tokens(You put tokens together in unapropriate way)");
			}
		}
	}
	private void function_handell(Token t){
		try{
		Token arg = this.calculating_stack.pop();
		switch(t.value){
		case "sin":
			Sin sin = new Sin(arg.value);
			Token temp01 = new Token(sin.Bounder.toString());
			this.calculating_stack.push(temp01);
		break;
		case "tan":
			try{
			Tan tan = new Tan(arg.value);
			Token temp02 = new Token(tan.Bounder.toString());
			this.calculating_stack.push(temp02);
			}
			catch(java.lang.NullPointerException e1){
			System.out.println("As we reach impossible operations while calcualting so the whole operation could not be done");	
			}
		break;
		case "cos":
			Cos cos = new Cos(arg.value);
			Token temp03 = new Token(cos.Bounder.toString());
			this.calculating_stack.push(temp03);
		break;
		case "cot":
			try{
			Cot cot = new Cot(arg.value);
			Token temp04 = new Token(cot.Bounder.toString());
			this.calculating_stack.push(temp04);
			}
			catch(java.lang.NullPointerException e){
				System.out.println("As we reach impossible eperations in your input so the whole operation could not be done");
				System.exit(0);
			}
		break;
		case "exp":
			Exp exp = new Exp(arg.value);
			Token temp05 = new Token(exp.Bounder.toString());
			this.calculating_stack.push(temp05);
		break;
		case "sec":
			Sec sec = new Sec(arg.value);
			Token temp06 = new Token(sec.Bounder.toString());
			this.calculating_stack.push(temp06);
		break;
		case "csc":
			Csc csc = new Csc(arg.value);
			Token temp07 = new Token(csc.Bounder.toString());
			this.calculating_stack.push(temp07);
		break;
		case "sinh":
			Sinh sinh = new Sinh(arg.value);
			Token temp08 = new Token(sinh.Bounder.toString());
			this.calculating_stack.push(temp08);
		break;
		case "cosh":
			Cosh cosh = new Cosh(arg.value);
			Token temp09 = new Token(cosh.Bounder.toString());
			this.calculating_stack.push(temp09);
		break;
		case "tanh":
			Tanh tanh = new Tanh(arg.value);
			Token temp10 = new Token(tanh.Bounder.toString());
			this.calculating_stack.push(temp10);
		break;
		case "coth":
			Coth coth = new Coth(arg.value);
			Token temp11 = new Token(coth.Bounder.toString());
			this.calculating_stack.push(temp11);
		break;
		case "sech":
			Sech sech = new Sech(arg.value);
			Token temper = new Token(sech.Bounder.toString());
			this.calculating_stack.push(temper);
		break;
		case "csch":
			Csch csch = new Csch(arg.value);
			Token temporar = new Token(csch.Bounder.toString());
			this.calculating_stack.push(temporar);
		break;
		case "ln":
			Ln ln = new Ln(arg.value);
			Token tempteror = new Token(ln.Bounder.toString());
			this.calculating_stack.push(tempteror);
		break;
		}
		}
		catch(java.util.EmptyStackException stack){
			if(this.hasErr == false){
				this.hasErr = true;
			System.out.println("Your input contains invalid tokens (You put tokens together in unapropriate way)");
			}
		}
		
	}
}
