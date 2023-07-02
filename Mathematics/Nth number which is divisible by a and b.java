// https://www.hackerearth.com/problem/algorithm/hp-and-nth-number-408fb73b/


static long solve(long a, long b, long N){
       // Write your code here
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        while (max % min != 0) {
            long temp = max;
            max = min;
            min = temp % min;
        }
        long hcf = min;
        long lcm = (a*b)/hcf;
        return lcm*N;
    }


// TC :  O(logbase2max(A,B))
