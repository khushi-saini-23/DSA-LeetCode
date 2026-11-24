class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s1=new Stack<>();
        int n=temp.length;
        int []indexarr=new int[n];
        for(int i=0;i<n;i++){
            while (!s1.isEmpty() && temp[i] > temp[s1.peek()]) {
                int prev = s1.pop();
                indexarr[prev] = i - prev;
            }

            s1.push(i);
        }return indexarr;
    }
}