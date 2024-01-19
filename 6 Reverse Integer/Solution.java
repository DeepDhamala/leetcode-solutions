class Solution {
    public int reverse(int x) {
        int[] arrX = convertTOArray(x);
        int iX = 0;
        for (int i = arrX.length-1; i>=0; i--){
            iX = iX * 10 + arrX[i]; 
        } 
        return iX;
    }
    private int[] convertTOArray(int num){
            int numDigit = (int) Math.log10(num) + 1;
            int[] arrNum = new int[numDigit];
            for(int i =0; i < numDigit; i++){
                arrNum[i] = num % 10;
                num = num /10;
            }
        return arrNum;
    }
}