class Solution {
    p public int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        int reversedX = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating reversedX
            if (reversedX > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // Return 0 for overflow
            }

            reversedX = reversedX * 10 + digit;
            x = x / 10;
        }

        return sign * reversedX;
    }
    // public int reverse(int x) {
    //     int[] arrX = convertTOArray(x);
    //     int iX = 0;
    //     for (int i = arrX.length-1; i>=0; i--){
    //         iX = iX * 10 + arrX[i]; 
    //     } 
    //     return iX;
    // }
    // private int[] convertTOArray(int num){
    //         int numDigit = (int) Math.log10(num) + 1;
    //         int[] arrNum = new int[numDigit];
    //         for(int i =0; i < numDigit; i++){
    //             arrNum[i] = num % 10;
    //             num = num /10;
    //         }
    //     return arrNum;
    // }
}