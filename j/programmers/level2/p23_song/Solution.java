package programmers.level2.p23_song;

import java.util.ArrayList;

public class Solution {
	public int get_sec(String start, String end){
		int res = 0;
		String [] st = start.split(":");
		String [] ed = end.split(":");
		res = Integer.parseInt(ed[0]) * 60 + Integer.parseInt(ed[1])
				- Integer.parseInt(st[0]) * 60 + Integer.parseInt(st[1]) + 1;
		return res;
	}
	public class Music {
		int time;
		int idx;
		String title;

		public Music(int time, String title, int idx) {
			this.time = time;
			this.title = title;
			this.idx = idx;
		}
	}

	public String solution(String m, String[] musicinfos) {
		String ms[]  = {"C#", "D#", "A#", "F#", "G#"};
		String answer = "";
		String[] song = null;
		StringBuilder sb = null;
		ArrayList<Music> playlist = new ArrayList<Music>();
		for (String mss: ms)
			m = m.replaceAll(mss,mss.toLowerCase().toCharArray()[0]+"");
		for (int i = 0; i < musicinfos.length; i++) {
			song = musicinfos[i].split(",");
			int time = get_sec(song[0], song[1]);
			for(String mss : ms){
				song[3] = song[3].replaceAll(mss, mss.toLowerCase().toCharArray()[0]+"");
				sb = new StringBuilder(song[3]);
				while (song[3].length() < time)
					sb.append(song[3]);
				song[3] = sb.substring(0, time);
			}
			if (song[3].contains(m))
				playlist.add(new Music(time, song[2], i));
		}
		for (int i = 1; i < playlist.size(); i++)
		{
			//if (playlist[idx])
		}
		return answer;
	}

	public static void main(String[] args) {
		String melody = "ABC#DEFG";
		String [] music ={ "12:00,12:14,HELLO,C#DEFGAB", "13:00,14:05,WORLD,ABCDEF"};
		Solution s = new Solution();
		s.solution(melody, music);
		
	}
}
