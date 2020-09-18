package programmers.level1.p25_py;
public class Main {
    boolean solution(String s) {
		int count = 0;
		s = s.toLowerCase();
		if(s.contains("p") || s.contains("y")){
			for(char c: s.toCharArray())
			{
				if(c == 'p')
					count++;
				else if(c == 'y')
					count--;
			}
			return count == 0 ? true : false;
		}
		else
			return true;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.solution("PP"));
	}
}
