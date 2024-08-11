public class remainingStringPOTD {
    class Solution {
        public String printString(String s, char ch, int count) {
            int pos = -1;
            for(int j=0 ; j<s.length(); j++){
                if(s.charAt(j)==ch && count>0){
                    pos=j;
                    count--;
                }
                
            }
            if(pos==-1 || count>0){
                return "";
            }
            String sb = "";
            for(int j=pos+1; j<s.length(); j++){
                sb += s.charAt(j);
            }
            
            return sb;
            
        }
    }
}
