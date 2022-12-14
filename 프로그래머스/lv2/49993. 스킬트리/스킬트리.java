class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i =0; i<skill_trees.length; i++) {  
            boolean flag = true;

            int[] arr = new int[skill.length()];
  
            for(int j = 0; j<skill.length(); j++) {
                int idx = skill_trees[i].indexOf(skill.charAt(j));
                if(idx == -1)   idx = 100;
                
                arr[j] = idx;
            }
            
            for(int j = 0; j<skill.length()-1; j++) {
                if(arr[j] > arr[j+1])  {
                    flag = false;
                    
                }
            }

            if(flag)  answer++;
        }
        return answer;
    }
}