package programmers.level1.p43_id;

public class Solution {
    // level 1 - 신규 아이디 추천
    public String solution(String new_id) {
		new_id = new_id.toLowerCase().replaceAll("[^a-zA-Z0-9\\-_\\.]", "").replaceAll("[\\.]{2,}", ".").replaceAll("[\\.]$", "").replaceAll("^[\\.]", "");
		if(new_id.length() == 0)
			new_id = "a";
		if(new_id.length() >= 16)
			new_id = new_id.substring(0, 15).replaceAll("[\\.]$", "");
		String temp = new_id.charAt(new_id.length() - 1)+"";
		while(new_id.length() <= 2)
			new_id+=temp;
        return new_id;
	}
}
