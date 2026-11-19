class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        String a= ans.reverse().toString();
        Stack<Character> p=new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if (!p.isEmpty()) {
                    p.pop();
                }
            }
            else{
                p.push(ch);
            }
        }
        StringBuilder u=new StringBuilder();
        while(!p.isEmpty()){
            u.append(p.pop());
        }
        String b= u.reverse().toString();
        return a.equals(b);
    }
}
