class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       printSubseq(0,new ArrayList<>(),nums,nums.length,ans);
       return ans;
    }
    static void printSubseq(int index,ArrayList<Integer> ds,int[]arr,int n,List<List<Integer>> ans){
            if(index==n){
                ans.add(new ArrayList<>(ds));
                return ;
            }
            ds.add(arr[index]);
            printSubseq(index+1,ds,arr,n,ans);
            ds.remove(ds.size()-1);
            printSubseq(index+1,ds,arr,n,ans);
        }
    }
