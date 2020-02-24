   
package Practice;
import java.util.*;
    import java.io.*;
    class nge {
        public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T= Integer.parseInt(br.readLine());
            while(T--!=0){
                Map<Character,Integer> map = new HashMap<Character, Integer>();
                map.put('a',0);
                map.put('e',0);
                map.put('i',0);
                map.put('o',0);
                map.put('u',0);
                int n = Integer.parseInt(br.readLine());
                int temp =n;
                while(n--!=0){
                    String s = br.readLine();
                    Set<Character> resultSet = new HashSet<>();
     
                    for (int i = 0; i < s.length(); i++) {
                        resultSet.add(s.charAt(i));
                    }
                    
                      
                    for(Character c : resultSet){
                        if(c=='a' || c=='e' || c=='i' || c =='o' || c =='u' ){
                           map.put(c, map.get(c)+1);
                        }
                    }
                }
                long sum=0;
                for(Map.Entry<Character,Integer> m : map.entrySet()){
              
                int v = m.getValue();
                 
                if(v>2){
                    sum+= ncr(v);
                }
                
                // System.out.print(v+", sum = "+sum+"||");
                }
                
                System.out.println(sum);
            }
            
            
        }
        static long ncr(int n) {
            long f =1;
            for(int i=0;i<3;i++){
                f*=n-i;
            }
            
            return f/6;
        }
    }
       
     