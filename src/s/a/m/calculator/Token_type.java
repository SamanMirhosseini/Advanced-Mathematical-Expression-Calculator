package s.a.m.calculator;

public enum Token_type {
Number,par_open,par_close,function,operator
}
/*@SuppressWarnings("resource")
Scanner s = new Scanner(System.in);
String q = s.nextLine();
//Pattern p = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\+\\-\\*///\\(\\)]))|(\\bsin\\b)|(\\bcos\\b)|(\\btan\\b)|(\\bcot\\b)|(\\bsec\\b)|(\\bcsc\\b)|(\\bsinh\\b)|(\\bcosh\\b)|(\\btanh\\b)|(\\bcoth\\b)|(\\bsech\\b)|(\\bcsch\\b)");
//Matcher m = p.matcher("sin(1.45*sech(12-6))+4.2*(5+2)/10-4");
//Tokeniser t = new Tokeniser(q);
//v = t.getTok_vector();
//for(int i = 0;i < v.size();i++){
	//System.out.println(v.get(i).value +"/t"+ v.get(i).type);
//}
/*special_tokeniser(q, 0);
for(int i = 0 ;i < v.size();i++){
	System.out.println(v.get(i));
}*/