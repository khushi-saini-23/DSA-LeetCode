class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String number =operations[i];
            if(number.equals("+")){
                int val1=st.pop();
                int val2=st.peek();
                int newval=val1+val2;
                st.push(val1);
                
                st.push(newval);

            }else if(number.equals("C")){
                st.pop();
            }else if(number.equals("D")){
                st.push(2*st.peek());

            }else{
                st.push(Integer.parseInt(number));
            }
        }
            int totalval=0;
            while(st.size()>0){
                totalval+=st.pop();
            }
            return totalval;
        
    }
}