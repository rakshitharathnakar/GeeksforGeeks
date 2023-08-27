class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        StringBuilder rs=new StringBuilder();
        String arr[]=S.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            rs.append(arr[i]);
            if(i>0){
             rs.append(".");
            }
        }
        return rs.toString();
    }
}
