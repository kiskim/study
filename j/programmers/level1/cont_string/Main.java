package programmers.level1.cont_string;

public class Main {
	public static boolean solution(String s){
		if(!(s.length() == 4 || s.length() == 6))
			return false;
		for (char c: s.toCharArray()){
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				return false;
		}
		return true;
	}

	public static boolean solution2(String s){
		if(s.length() == 4 || s.length() == 6){
			try{
				Integer.parseInt(s);
			}catch(NumberFormatException e){
				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean solution3(String s){
		return s.matches("[0-9]{4}|{6}");
	}
}