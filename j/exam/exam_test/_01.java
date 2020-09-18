package exam.exam_test;

public class _01 {
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
	
	public static void main(String[] args) {
		_01 test = new _01();
		System.out.println(test.solution(""));
	}
}
