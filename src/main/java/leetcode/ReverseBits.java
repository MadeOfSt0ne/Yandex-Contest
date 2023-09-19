package leetcode;

public class ReverseBits {
    /**
     * Leetcode 190
     * Reverse bits of a given 32 bits unsigned integer.
     * Note:
     * Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output
     * will be given as a signed integer type. They should not affect your implementation, as the integer's internal
     * binary representation is the same, whether it is signed or unsigned.
     * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2
     * above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
     */
    public int reverseBits(int num) {

        int result = 0, temp = num, bit;
        for (int i = 0; i <= 31; i++) {
            // 32 bits in an integer and starting from i=0
            // because in the first iteration we are checking the last bit withour shifting the bits of temp

            bit = (temp >> i) & 1; //shifting the bits of temp to right by i places and then AND with 1 to get the last bit
            result = result | (bit << (31 - i)); //shifting the bit to left by 31-i places and then OR with result

        }

        return result;

    }
}
