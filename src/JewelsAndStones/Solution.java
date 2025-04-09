package JewelsAndStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelArray = jewels.toCharArray();
        char[] stoneArray = stones.toCharArray();
        int number = 0;

        for (char jewel : jewelArray) {
            for (char stone : stoneArray) {
                if (jewel == stone) number++;
            }
        }
        return number;
    }
}
