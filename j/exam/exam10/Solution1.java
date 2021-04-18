
public class Solution1 {
    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < gift_cards.length; i++)
        {
            if (gift_cards[i] != wants[i])
                for(int j = 0; j < gift_cards.length; j++)
                {
                    if (gift_cards[j] == wants[i] || wants[j] == gift_cards[i])
                    {
                        temp = gift_cards[j];
                        gift_cards[j] = gift_cards[i];
                        gift_cards[i] = temp;
                        break;
                    }
                }
        }
        for(int i = 0; i < gift_cards.length; i++)
            if (gift_cards[i] != wants[i])
                answer++;
        return answer;
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 1, 1, 1, 1,};
        solution(a, b);
    }
}
