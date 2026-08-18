class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        binary = String.format("%32s",binary).replace(' ','0');
        String sb = new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(sb,2);
    }
}
