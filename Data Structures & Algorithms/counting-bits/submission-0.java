class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        int count;
        for (int i=0;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            count = 0;
            for (char c : binary.toCharArray()){
                if (c=='1') count++;
            }
            bits[i] = count;
        }
        return bits;
    }
}
