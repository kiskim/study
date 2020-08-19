package programmers.level1.p18_calendar;

public class Main {
    public static String solution(int a, int b) {
		String answer = "";
		int n = b;
		System.out.println(n+"");
		for(int i = 1; i < a; i++)
		{
			switch (i)
			{
				case 1: ;
				case 3: ;
				case 5: ;
				case 7: ;
				case 8: ;
				case 10: ;
				case 12: n+= 31;	break;
				case 2: n+=29;	break;
				default : n += 30;	break;
			}
		}
		System.out.println(n+"");
		n = n % 7;
		System.out.println(n+"");
		switch(n)
		{
			case 1: answer = "FRI"; break;
			case 2: answer = "SAT"; break;
			case 3: answer = "SUN"; break;
			case 4: answer = "MON"; break;
			case 5: answer = "TUE"; break;
			case 6: answer = "WED"; break;
			case 0: answer = "THU"; break;
			default: break;
		}
        return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}
}