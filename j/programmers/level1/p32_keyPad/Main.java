package programmers.level1.p32_keyPad;

public class Main {
	public class Position{
		int x;
		int y;

		public Position(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		public void setPos(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		public String getCloser(Position right, Position left, String hand)
		{
			String res = "";
			int distRight = Math.abs(this.x - right.x) + Math.abs(this.y - right.y);
			int distLeft = Math.abs(this.x - left.x) + Math.abs(this.y - left.y);
			if(distLeft == distRight)
				res = hand;
			else{
				res = distLeft < distRight ? "left" : "right";
			}
			return  res;
		}		
	}
    public String solution(int[] numbers, String hand) {
		String answer = "";
		Position left = new Position(3, 0);
		Position right = new Position(3, 2);
		Position num = new Position(-1, -1);
		for(int n : numbers)
		{
			int pos = n - 1;
			int x = pos / 3;
			int y = pos - (x * 3);
			switch (n)
			{
				case 1:
				case 4:
				case 7:
					left.setPos(x, y);
					answer += "L";
					break;
				case 3:
				case 6:
				case 9:
					right.setPos(x, y);
					answer += "R";
					break;
				case 0:
					x = 3;
					y = 1;
				default :
					num.setPos(x, y);
					if(num.getCloser(right, left, hand).equals("left")){
						answer+="L";
						left.setPos(x, y);
					}
					else{
						answer+="R";
						right.setPos(x, y);
					}
					break;
			}
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		int [] n = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String h = "left";
		m.solution(n, h);
	}
}