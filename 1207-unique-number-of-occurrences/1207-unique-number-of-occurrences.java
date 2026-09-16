class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int freq: arr){
           map.put(freq,map.getOrDefault(freq,0)+1);
       }
       HashSet<Integer> set=new HashSet<>();
       for(int i : map.values()){
           set.add(i);
       }
       if(set.size()==map.size()){
        return true;
       }
       return false;
    }
}