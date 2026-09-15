class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     boolean[]seen=new boolean[246];
        //     int count=0;
        //     for(int j=i;j<s.length();j++){
        //         if(seen[s.charAt(j)]){
        //             break;
        //         }
        //         seen[s.charAt(j)]=true;
        //         count++;
        //         if(count>max){
        //             max=count;
        //         }
        //     }
        // }
        // return max;
        
        int max=0;
        int st=0;
        int e=0;
        ArrayList<Character> list =new ArrayList<>();
        while(e<s.length()){
            if(!list.contains(s.charAt(e))){
                list.add(s.charAt(e));
                max=Math.max(max,e-st+1);
                e++;
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    }
}