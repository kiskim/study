import java.util.ArrayList;

public class Solution3 {
    public static class Rail{
        int stop;
        ArrayList<Rail> list;

        public Rail(int n)
        {
            stop = n;
        }
        public Rail find(int n)
        {
            if (n == stop)
                return this;
            if (list != null)
                for(Rail r : list)
                {
                    if (r.stop == n)
                        return r;
                    else
                        return r.find(n);
                }
            return new Rail(n);
        }
    }
    public static int[] solution(int n, int[] passenger, int[][] train) {
        int[] answer = {};
        Rail r = new Rail(1);
        r.list = new ArrayList<>();
        //Arrays.sort(train);
        for(int i = 0; i < train.length; i++)
        {
            Rail temp = r.find(train[i][0]);
            if (temp.list == null)
                temp.list = new ArrayList<>();
            temp.list.add(new Rail(train[i][1]));
        }
        return answer;
    }
    public static void main(String[] args) {
        int passenger[] = {1, 1, 1, 1, 1, 1};
        int train[][] = {{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}};
        solution(6, passenger, train);
    }
}