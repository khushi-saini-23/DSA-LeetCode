class Solution {
    public void reverse(char arr[],int left,int right){
        for(int i=0;i<arr.length;i++){
            if(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public String reverseStr(String s, int k) {
       char arr[]=s.toCharArray();
       int length=s.length();
       int i=0;
       while(i<length){
        int j=Math.min(i+k-1,length-1);
        reverse(arr,i,j);
        i=i+2*k;
       }
       return new String(arr);
    }
}