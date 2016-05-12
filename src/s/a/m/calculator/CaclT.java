

import java.util.*;

public class CaclT {
	Stack <String> calculating_stack = new Stack<String>();
	ToPostfix toPost;
	Integer lastvalue;
	private void the_post_fix_calculator(){
		while(!this.toPost.output_queue.isEmpty()){
			 String temp = this.toPost.
			 switch(temp){
			 case "&":
				 this.and_handell();
			 break;
			 case "|":
				 this.or_handell();
			 break;
			 case "!":
				 this.not_handell();
		     break;
		     default:
		    	 this.calculating_stack.push(temp);
		     break;
			 }
		}
	}
	private void not_handell(){
		Integer help = new Integer(this.calculating_stack.pop());
		help = ~help;
		this.calculating_stack.push(help.toString());
	}
	private void or_handell(){
		Integer a = new Integer(this.calculating_stack.pop());
		Integer b = new Integer(this.calculating_stack.pop());
		a = a | b;
		this.calculating_stack.push(a.toString());
	}
	private void and_handell(){
		Integer a = new Integer(this.calculating_stack.pop());
		Integer b = new Integer(this.calculating_stack.pop());
		a = a & b;
		this.calculating_stack.push(a.toString());
	}
}
