package programmers.level2.p23_song;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Solution {
	public int get_sec(String start, String end) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		long diff = 0;
		try {
			Date d1 = sdf.parse(start);
			Date d2 = sdf.parse(end);
			diff = (d1.getTime() - d2.getTime() / 60000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (int)diff;
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
			for(String mss : ms){
				song[3] = song[3].replaceAll(mss, mss.toLowerCase().toCharArray()[0]+"");
				sb = new StringBuilder(song[3]);
				while (sb.length() < time)
					sb.append(song[3]);
				song[3] = sb.substring(0, time);
			}
			if (song[3].contains(m))
				playlist.add(new Music(time, song[2], i));
		}
		if (playlist.size() == 0)
			return "NONE";
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
		String melody = "ABC#DEFG";
		String [] music ={ "23:50,00:14,HELLO,C#DEFGAB", "13:00,13:15,WORLD,C#DEFGAB"};
		Solution s = new Solution();
		System.out.println(s.solution(melody, music));
		
	}
}
