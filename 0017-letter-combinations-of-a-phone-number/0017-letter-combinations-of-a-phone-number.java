class Solution {
     static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();
        if(digits.length()==0){
            return ll;
        }
        Key_Pad(digits,"",ll);
        return ll;
    }
      public static void Key_Pad(String ques , String ans,List<String> ll){ //23,_
        if(ques.length()==0){
           // System.out.println(ans);
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);//2
        String press=map[ch-'0'];//abc
        for(int i=0 ; i<press.length() ; i++){
            Key_Pad(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}