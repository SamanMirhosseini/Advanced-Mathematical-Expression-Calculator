package s.a.m.calculator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokeniser {
	private String to_be_tokenised;
	private Vector <Token> tok_vector = new Vector<Token>();
	public Tokeniser(String s){
		this.setTo_be_tokenised(s);
		this.setTok_vector(this.my_regex_tokeniser(this.to_be_tokenised));
	}
	public String getTo_be_tokenised() {
		return to_be_tokenised;
	}
	public void setTo_be_tokenised(String to_be_tokenised) {
		this.to_be_tokenised = to_be_tokenised;
	}
	public Vector<Token> getTok_vector() {
		return tok_vector;
	}
	public void setTok_vector(Vector<Token> tok_vector) {
		this.tok_vector = tok_vector;
	}
	private Vector<Token> my_regex_tokeniser(String s){
		Vector <Token> v = new Vector<Token>();
		Pattern p = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|(\\-*\\d*\\.\\d+)|(\\-*\\d+)|([\\^\\+\\-\\*/\\(\\)]))|(\\bsin\\b)|(\\bcos\\b)|(\\btan\\b)|(\\bcot\\b)|(\\bsec\\b)|(\\bcsc\\b)|(\\bln\\b)|(\\bsinh\\b)|(\\bcosh\\b)|(\\btanh\\b)|(\\bcoth\\b)|(\\bexp\\b)|(\\bsech\\b)|(\\bcsch\\b)|(\\bPI\\b)|(\\bE\\b)");
		Matcher m = p.matcher(s);
		while(m.find()){
			Token t = new Token(m.group());
			v.add(t);
		}
		return v;
	}
}
