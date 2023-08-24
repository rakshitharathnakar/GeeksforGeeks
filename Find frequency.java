class Solution{
    int findFrequency(int A[], int x){
       int n=A.length;
       int c=0;
       for(int i=0;i<n;i++){
           if(A[i]==x){
               c++;
           }
       }
       return c;
    }
}
