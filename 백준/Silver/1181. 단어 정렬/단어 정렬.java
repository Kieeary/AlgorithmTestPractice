import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        String[] arr = new String[cnt];
        
        for(int i = 0; i<cnt; i++) {
            arr[i] = sc.next();    
        }
        
        // 1차 정렬 (길이순서대로)
        for(int i =0; i<cnt; i++){
            for(int j =  i+1; j<cnt; j++) {
                if(arr[i].length() > arr[j].length()) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        // 2차 정렬 (같은 길이일때 알파벳 순서)
        int idx = 0;
        while(idx < cnt) {
            
           
            if(idx + 1 < cnt && arr[idx].length() == arr[idx+1].length()) // 서로 이웃하는게 동일한 길이이면
            {
            	int k = idx+1;
            	while(idx < cnt && k < cnt && arr[idx].length() == arr[k].length()) {
                 
                    if(arr[idx].compareTo(arr[k]) > 0) {
                        String tmp = arr[idx];
                        arr[idx] = arr[k];
                        arr[k] = tmp;
//                        System.out.println("서로 바뀐 단어: " +  arr[k] + "->" + arr[idx]);
                        k++;
                    } else if(arr[idx].equals(arr[k])) {
                    	arr[idx] = "";
                    	k++;
                    } else {
                    	k++;
                    }
            	}
            	idx++;
            } else idx++;
        }
        
        for(int i =0; i<cnt; i++) {
        	if(!arr[i].equals(""))	System.out.println(arr[i]);
        }
    }
}