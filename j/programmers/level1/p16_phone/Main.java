package programmers.level1.p16_phone;

public class Main {
    public static String solution(String phone_number) {
		char [] s = phone_number.toCharArray();
		for(int i = 0; i < phone_number.length() - 4; i++)
			s[i] = '*';
        return String.valueOf(s);
    }
}