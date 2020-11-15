package programmers.level2.p23_song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public int get_sec(String start, String end){
		int res = 0;
		String [] st = start.split(":");
		String [] ed = end.split(":");
		res = Math.abs(Integer.parseInt(ed[0]) - Integer.parseInt(st[0])) * 60
			+ (Integer.parseInt(ed[1]) - Integer.parseInt(st[1]));
		return res + 1;
	}
	public class Music{
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
		String[] song = null;
		StringBuilder sb = null;
		ArrayList<Music> playlist = new ArrayList<Music>();
		for (String mss: ms)
			m = m.replaceAll(mss,mss.toLowerCase().toCharArray()[0]+"");
		for (int i = 0; i < musicinfos.length; i++) {
			song = musicinfos[i].split(",");
			int time = get_sec(song[0], song[1]);
			for(String mss : ms)
				song[3] = song[3].replaceAll(mss, mss.toLowerCase().toCharArray()[0]+"");
			sb = new StringBuilder(song[3]);
			while (sb.length() < time)
				sb.append(song[3]);
			song[3] = sb.substring(0, time);
			if (song[3].indexOf(m) > -1)
				playlist.add(new Music(time, song[2], i));
		}
		if (playlist.size() == 0)
			return "(None)";
		else if(playlist.size() > 1)
			Collections.sort(playlist, new Comparator<Music>(){
				@Override
				public int compare(Music o1, Music o2) {
					if (o1.time == o2.time)
						return o1.idx - o2.idx;
					return o2.time - o1.time;
				}
			});
		return playlist.get(0).title;
	}

	public static void main(String[] args) {
		String melody = "AA#";
		String [] music ={  "13:00,13:01,HAPPY,BA#" };//, "00:00,00:14,HELLO,C#D#EFGAB","13:03,13:18,WORLD,C#DEFGAB"};
		Solution s = new Solution();
		System.out.println(s.solution(melody, music));
	}
}
