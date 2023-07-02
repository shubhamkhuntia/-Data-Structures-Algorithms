// https://practice.geeksforgeeks.org/problems/odd-divisors5347/1

class Solution{
    static int oddNumberOfDivisor(int N){
        // code here
        int count =1;
        for(int i=2;i<=N;i++){
            int val =(int) Math.sqrt(i);
            if(val*val==i){
                count++;
            }
        }
        return count;
    }
}

