class Reverse
{
    
    public static String reverseWord(String str)
    {
       
        String re="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            re+=str.charAt(i);
        }
        return re;
    }
}
