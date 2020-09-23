package programmers.level1.p39_dart;

public class Main {
    public int solution(String dartResult) {
		int temp = 0;
		boolean ten = false;
		int []point = new int[3];
		int index = -1;
		for(char c: dartResult.toCharArray())
		{
			if(c >= '0' && c <= '9')
			{
				if(ten == false){
					if(index > -1 && index < 3){
						point[index] = temp;
					}
					index++;
					if(c == '1')
						ten = true;
					temp = c - '0';
				}
				else if(c == '0' && ten == true){
					temp = 10;
					ten = false;
				}
			}
			else if(temp != 0)
			{
				ten = false;
				switch(c)
				{
					case 'D': temp = temp * temp; break;
					case 'T': temp = temp * temp * temp; break;
					case '*': 
						if(index > 0)
							point[index-1] *=2;
						temp *=2;
						break;
					case '#': temp = temp *(-1); break;
				}
			}
		}
		point[index]= temp;
        return point[0] + point[1] + point[2];
	}
    public int solution2(String dartResult) {
		int answer = 0;
		int [] point = new int[3];
		int pointCnt = 0;
		for(int i = 0; i < dartResult.length(); i++)
		{
			char c = dartResult.charAt(i);
			if(c >= '0' && c <= '9')
			{
				if(c == '1' && dartResult.charAt(i+1) == '0'){
					point[pointCnt] = 10;
					i++;
				}
				else
					point[pointCnt] = c - '0';
			}
			else{
				switch(c)
				{
					case 'S': point[pointCnt] = (int)Math.pow(point[pointCnt], 1); pointCnt++;break;
					case 'D': point[pointCnt] = (int)Math.pow(point[pointCnt], 2); pointCnt++;break;
					case 'T': point[pointCnt] = (int)Math.pow(point[pointCnt], 3); pointCnt++;break;
					case '*':
						point[pointCnt - 1] *= 2;
						if(pointCnt - 2 >= 0)
							point[pointCnt - 2] *= 2;
						break;
					case '#':
						point[pointCnt - 1] *= -1;
						break;
				}
			}
		}
		for(int a: point)
			answer+= a;
		return answer;
	}

	public static void main(String[] args) {
		String  s = "1D2S3T*";
		Main m = new Main();
		System.out.println(m.solution2(s)+"");
	}
}
