class Solution{
    static int evenlyDivides(int N){
        int c=0;
        int tmp=N;
        while(tmp>0){
            int digit=tmp%10;
if (digit != 0 && N % digit == 0) {
                c++; // Increment count if the digit divides N evenly
            }            tmp/=10;
        }
        return c;
    }
}
