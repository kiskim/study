package exam.exam11;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public static boolean solution (int n){
        int num = n;
        int rev = 0;
        while (num > 0)
        {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        return num == rev;
    }

    public static int[] solution2(int [] card)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        int index = 0;
        for(int n : card)
            map.put(n, map.getOrDefault(n, 0)+1);
        for(int n : map.keySet())
            if (map.get(n) % 2 != 0)
                res[index++] = n;
        Arrays.sort(res);
        return res;
    }
    public static int solution3(int[][] office, int r, int c , String[] move)
    {
        int res = office[r][c];
        int face = 0;
        int t_r, t_c;
        office[r][c] = 0;
        for(String m : move)
        {
            t_r = r;
            t_c = c;
            switch (m)
            {
                case "go":
                    switch(face)
                    {
                        case 0: 
                            if (t_r > 0) t_r--;
                            break;
                        case 1: 
                            if (t_c < office[0].length) t_c++;
                            break;
                        case 2: 
                            if (t_r < office.length) t_r++;
                            break;
                        case 3: 
                            if (t_c > 0) t_c++;
                            break;
                    }
                    if (office[t_r][t_c] != -1)
                    {
                        c = t_c;
                        r = t_r;
                        res+= office[r][c];
                        office[r][c] = 0;
                    }
                    break;
                case "rigt":
                    if (face < 3) face++;
                    else face = 0;
                    break;
                case "left":
                    if (face > 0) face--;
                    else face = 3;
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [][]office = {{5, -1, 4}, {6, 3, -1}, {2, -1, 1}};
        int r = 1;
        int c = 0;
        String move[] = {"go", "go", "right", "go", "right", "go", "left", "go"};
        solution3(office, r, c, move);
    }
}
