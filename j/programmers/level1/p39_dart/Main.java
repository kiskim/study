package programmers.level1.p39_dart;

public class Main {
    public int solution(String dartResult) {
		int answer = 0;
		int idx = 0;
		int [] score = new int[3];
		for(int i = 0; i < dartResult.length(); i++){
			if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
				if(dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0'){
					i++;
					score[idx] = 10;
				}
				else
					score[idx] = dartResult.charAt(i) - '0';
			}
			else{
				switch(dartResult.charAt(i)){
					case 'S' : idx++; break;
					case 'D' : 
						score[idx] = score[idx] * score[idx];
						idx++;	break;
					case 'T' : 
						score[idx] = score[idx] * score[idx] * score[idx];
						idx++;	break;
					case '*' :
						score[idx - 1] *= 2; 
						if (idx - 2 >= 0)
							score[idx - 2] *=2;
							break;
					case '#' : score[idx - 1] *= -1; break;
				}
			}
		}
		for(int s : score)
			answer += s;
		return answer;
	}
	public static void main(String[] args) {
		String  s = "1D2S3T*";
		Main m = new Main();
		System.out.println(m.solution(s)+"");
	}
}
