package s.a.m.calculator;

public class Token {
	Token_type type;
	String value;
	int priority;
	boolean is_pi;
	boolean is_e;
	public Token(String s){
		this.value = s;
		switch(s){
			case "PI":
				PI pi = new PI();
				this.type = Token_type.Number;
				this.value = pi.value.toString();
				this.is_pi = true;
			break;
			case "E":
				E e = new E();
				this.type = Token_type.Number;
				this.value = e.value1.toString();
				this.is_pi = true;
			break;
			case "(":
			this.type = Token_type.par_open;	
			this.priority = 0;
			break;
			case ")":
				this.type = Token_type.par_close;
				this.priority = 0;
			break;
			case "+":
			case "-":
				this.type = Token_type.operator;
				this.priority = 1;
			break;
			case "/":
			case "*":
				this.type = Token_type.operator;
				this.priority = 2;
			break;
			case "^":
				this.type = Token_type.operator;
				this.priority = 3;
			break;
			case "ln":
			case "exp":
			case "sin":
			case "cos":
			case "tan":
			case "cot":
			case "sec":
			case "csc":
			case "sinh":
			case "cosh":
			case "tanh":
			case "coth":
			case "sech":
			case "csch":
				this.type = Token_type.function;
				this.priority = 0;
			break;
			default:
				this.type = Token_type.Number;
				this.priority = 0;
			break;
		}
	}
}
