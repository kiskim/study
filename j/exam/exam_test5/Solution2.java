package exam.exam_test5;


public class Solution2 {
	public String solution(String encrypted_text, String key, int rotation) {
		StringBuilder sb = new StringBuilder("");
		int temp = 0;
		char [] enc_text = encrypted_text.toCharArray();
		char [] key_arr = key.toCharArray();
		while(Math.abs(rotation) > encrypted_text.length()){
			if (rotation > 0)
				rotation -= encrypted_text.length();
			else
				rotation += encrypted_text.length();
		}
		if (rotation < 0){
			for(int i = enc_text.length + rotation; i < enc_text.length; i++)
				sb.append(enc_text[i]);
			for(int i = 0; i < enc_text.length + rotation; i++)
				sb.append(enc_text[i]);
		}
		else
		{
			for(int i = rotation; i < enc_text.length; i++)
				sb.append(enc_text[i]);
			for(int i = 0; i < rotation; i++)
				sb.append(enc_text[i]);
		}
		for (int i = 0; i < encrypted_text.length(); i++)
		{
			temp = sb.charAt(i) - (key_arr[i] - 'a' + 1);
			if (temp < 'a')
				temp = 'z' - ('a' - temp) + 1;
			else if(temp > 'z')
				temp = 'a' + (temp - 'z' - 1);
				sb.setCharAt(i, (char)temp);
		}

        return sb.toString();
	}
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String enc = "qyyigoptvfb";
		String key = "abcdefghijk";
		int r = -100;
		s.solution(enc, key, r);
	}
}
