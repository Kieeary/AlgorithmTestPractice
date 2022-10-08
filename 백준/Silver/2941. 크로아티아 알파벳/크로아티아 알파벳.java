import java.util.*;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] c = str.toCharArray();
        int answer = 0;
        
        for(int i = 0; i<str.length(); i++) {
            
            if(c[i] == 'c') { // 첫번째 단어가 c 인경우
                    if(i < str.length() - 1 && c[i+1] == '=') { // c= 인 경우
                        i++;
                        answer++;
                    } 
                    else if(i < str.length() -1 && c[i+1] == '-'){ // c- 인 경우
                         i++;
                         answer++;
                    } else answer++; // c만 인 경우
            }
            else if(c[i] == 'd') { // 첫번째 단어가 d 인경우
                if(i < str.length() - 2 && c[i+1] == 'z' && c[i+2] == '=') { // dz= 인 경우
                         i += 2;
                         answer++;
            }  else if(i < str.length() -1 && c[i+1] == '-') { //d- 인 경우
                        i++;
                        answer++;
               } else { // d 만 인 경우
            	  answer++;
               }
        }    else if(c[i] == 'l' && i < str.length() -1 && c[i+1] == 'j'){ //lj 인경우
                        i++;
                        answer++;
            } else if(c[i] == 'n' && i < str.length() -1 && c[i+1] == 'j'){ //nj 인경우
                        i++;
                        answer++;
            } else if(c[i] == 's' && i < str.length() - 1 && c[i+1] == '=') { // s= 인경우
                    i++;
                    answer++;
            } else if(c[i] == 'z' && i < str.length() - 1 && c[i+1] == '=') { // s= 인경우
                    i++;
                    answer++;
            }
            else answer++;
    }
        System.out.println(answer);
}
}