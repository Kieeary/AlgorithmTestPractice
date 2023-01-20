import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	HashMap<String, Integer> hm = new HashMap<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                
        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]);
        int M = Integer.parseInt(tmp[1]);
        
        int cnt = 0;
        
        for(int i = 0; i < N+M; i++) {
        	String str = br.readLine();
        	hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        
        ArrayList<String> al = new ArrayList<>();
              
        for(String K : hm.keySet()) {
        	if(hm.get(K) >1) {
        		cnt++;
                al.add(K);
        	}
        }
        
        Collections.sort(al);
        
        String stN = String.valueOf(cnt);
        bw.write(stN);
        bw.newLine();
        for(String K : al) {
            bw.write(K);
            bw.newLine();
        }

        bw.flush();
    }
    
}