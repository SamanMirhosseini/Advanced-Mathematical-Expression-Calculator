package s.a.m.calculator;

import java.util.*;

public class ToPostfix {
	Stack <Token> operators_stack = new Stack<Token>();
	LinkedList <Token> output_queue= new LinkedList<Token>();
	Stack <Token> calculating_stack = new Stack<Token>();
	Vector <Token> process;
	public ToPostfix(String kir){
		Tokeniser t = new Tokeniser(kir);
		this.process =  t.getTok_vector();
		this.full_stack_and_queue();
	}
	private void full_stack_and_queue(){
		for(int i = 0;i < process.size();i++){
			switch(this.process.get(i).type){
			case Number:
				this.output_queue.push(this.process.get(i));
			break;
			case function:
				this.operators_stack.push(this.process.get(i));
			break;
			case operator:
				if(this.operators_stack.isEmpty() == true){
					this.operators_stack.push(this.process.get(i));
				}
				else{
					Token temp = this.operators_stack.pop();
					switch(temp.type){
					case operator:
						if(this.process.get(i).priority <= temp.priority){
							this.operators_stack.push(this.process.get(i));
							this.output_queue.push(temp);
						}
						else{
							this.operators_stack.push(temp);
							this.operators_stack.push(this.process.get(i));
						}
					break;
					default:
						this.operators_stack.push(temp);
						this.operators_stack.push(this.process.get(i));
					break;
					}
				}
			break;
			case par_open:
				this.operators_stack.push(this.process.get(i));
			break;
			case par_close:
				Token_type help = Token_type.par_open;
				Token_type func = Token_type.function;
				while(!this.operators_stack.isEmpty()){
					Token t = this.operators_stack.pop();
					if(t.type == help){
						break;
					}
					this.output_queue.push(t);
				}
				if(!this.operators_stack.isEmpty()){
				Token t = this.operators_stack.pop();
				if(t.type == func){
					this.output_queue.push(t);
				}
				else{
					this.operators_stack.push(t);
				}
				}
			break;
			}
		}
		while(!this.operators_stack.isEmpty()){
			Token temp = this.operators_stack.pop();
			if(temp.type == Token_type.par_open || temp.type == Token_type.par_close){
				System.out.println("Unmatch paranthesis");
			}
			this.output_queue.push(temp);
		}
	}
}
/*private void the_post_fix_calculator(){
	while(!this.output_queue.isEmpty()){
		 Token temp = this.output_queue.pollLast();
		 switch(temp.type){
		 case Number:
			 this.calculating_stack.push(temp);
			 for(int i = 0;i < this.calculating_stack.size();i++){
					System.out.print(this.calculating_stack.get(i).value+"    ");
					}
					System.out.println();
		 break;
		 case function:
			 this.function_handell(temp);
		 break;
		 case operator:
			 this.operation_handell(temp);
	     break;
	     default:
	     break;
		 }
	}
}
private void operation_handell(Token t){
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
	for(int i = 0;i < this.calculating_stack.size();i++){
		System.out.print(this.calculating_stack.get(i).value+"    ");
		}
		System.out.println();
}
private void function_handell(Token t){
	Token arg = this.calculating_stack.pop();
	switch(t.value){
	case "sin":
		Sin sin = new Sin(arg.value);
		Token temp01 = new Token(sin.Bounder.toString());
		this.calculating_stack.push(temp01);
		for(int i = 0;i < this.calculating_stack.size();i++){
			System.out.print(this.calculating_stack.get(i).value+"    ");
			}
			System.out.println();
	break;
	case "tan":
		Tan tan = new Tan(arg.value);
		Token temp02 = new Token(tan.Bounder.toString());
		this.calculating_stack.push(temp02);
		for(int i = 0;i < this.calculating_stack.size();i++){
		System.out.print(this.calculating_stack.get(i).value+"    ");
		}
		System.out.println();
	break;
	}
}*/
