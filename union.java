class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
       HashSet<Integer> ai=new HashSet<>();
        //int c=0;
       for(int i=0;i<a.length;i++){
           ai.add(a[i]);
       }
       for(int j=0;j<b.length;j++){
           ai.add(b[j]);
       }
       return ai.size();
    }
}
