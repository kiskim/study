package exam._01_hash;

public class 전화번호 {
    public static boolean solution(String[] phone_book) {
		boolean answer = true;
		for(String s : phone_book)
		{
			for(String d : phone_book)
			{
				if(!s.equals(d) && s.indexOf(d) == 0)
					answer = false;

			}
		}
        return answer;
	}
	public static void main(String[] args) {
		String [] s = {"119", "97674223", "1195524421"};
		String [] s2 = {"819232312", "976", "119552", "2"};
		System.out.println(solution(s));
		System.out.println(solution(s2));
	}
}