import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        String[] a = br.readLine().split(" ");
        
        for(int i = 0; i<a.length; i++) {
            hm.put(a[i], hm.getOrDefault(a[i],0) + 1);
        }
        
        int M = Integer.parseInt(br.readLine());
        
        String[] b = br.readLine().split(" ");
        
        int[] ans = new int[b.length];
        
        for(int i = 0; i<ans.length; i++) {	
        	if(hm.get(b[i]) != null) {
        		ans[i] = hm.get(b[i]);
        	}
        }
        
        for(int i = 0; i <ans.length; i++) {
             bw.write(String.valueOf(ans[i]));
             bw.write(" ");
        }
        bw.flush();
    }
}