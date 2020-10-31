package programmers.level2.p22_openchat;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	public class Log{
		String uid;
		boolean status;

		public Log(String uid, boolean status){
			this.uid = uid;
			this.status = status;
		}
	}
    public String[] solution(String[] record) {
		String[] answer = null;
		String [] info = null;
		HashMap<String, String> userMap = new HashMap<String, String>();
		ArrayList<Log> log = new ArrayList<Log>();
		StringBuilder sb = null;
		for (String msg : record)
		{
			info = msg.split(" ");
			if (info.length > 2)
				userMap.put(info[1], info[2]);
			if (!info[0].equals("Change"))
				log.add(new Log(info[1], info[0].equals("Enter")));
			
		}
		answer = new String[log.size()];
		for(int i = 0; i < log.size(); i++){
			sb = new StringBuilder("");
			sb.append(userMap.get(log.get(i).uid));
			sb.append("님이 ");
			if (log.get(i).status) 
				sb.append("들어왔습니다.");
			else
				sb.append("나갔습니다.");
			answer[i] = sb.toString();
		}
        return answer;
	}
	
	public static void main(String[] args) {
		String [] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
			"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Solution s = new Solution();
		s.solution(str);
	}
}
