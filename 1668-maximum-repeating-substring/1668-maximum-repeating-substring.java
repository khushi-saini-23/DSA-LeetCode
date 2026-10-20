class Solution {
    public int maxRepeating(String sequence, String word) {
        String rep=word;
        int k=0;
        while(sequence.contains(rep)){
            k++;
            rep+=word;
        }
        return k;

    }
}