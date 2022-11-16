import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

	public int[] solution(int[] progresses, int[] speeds) {
        
		int[] origin = new int[progresses.length];
		boolean flag = false;

		for (int i = 0; i < origin.length; i++) {
			origin[i] = progresses[i];
		}

		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			q.add(progresses[i]);
		}

		int size = q.size();

		while (!q.isEmpty()) {
			int first = size - q.size();
			for (int i = first; i < progresses.length; i++) {
                int cnt = 0;
				if (progresses[i] < 100) {
					progresses[i] += speeds[i];
				} else {
					flag = true;
                    for(int k = first; k<i; k++) {
						if(origin[k] < 100)	{
							flag=false;
							break;
						}
					}
					while (q.peek() == origin[i] && flag) {
							q.poll();
							cnt++;
							i++;
							if(q.size() == 0)	break;
							if(progresses[i] < 100)	{
                                flag = false;
                                i--;
                            }
					}
					if(cnt > 0) list.add(cnt);
					// if (i == progresses.length - 1)
					// 	break;
				}
			}
		}
        int[] answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }   
	}