package ComplementOfBase10Integer;

public class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder complement = new StringBuilder();

        for (char x : binary.toCharArray()){
            complement.append(x == '0' ? '1' : '0');
        }

        return Integer.parseInt( complement.toString(),2);
    }
}
