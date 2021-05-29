class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }
        
        boolean[] prime = new boolean[n];
        for(int p = 2; p <= (int)Math.sqrt(n); p++){
            if(prime[p] == false){
                for(int j = p*p; j < n; j += p){
                    prime[j] = true; 
                }
            }
            
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(prime[i] == false){
                count++;
            }
        }
        return count;
    }
    }