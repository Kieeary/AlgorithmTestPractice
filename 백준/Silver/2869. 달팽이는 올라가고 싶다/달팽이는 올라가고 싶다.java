import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int A = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);
        int V = Integer.parseInt(strs[2]);
        
        int rb = V - A;
        int step = A - B;
        
        if(rb % step == 0) {
            int tmp = rb / step;
            answer = tmp + 1;
        } else {
            int tmp = rb / step;
            answer = tmp + 2;
        }
        
        System.out.println(answer);
        
    }
}