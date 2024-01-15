public class ZigZag {
    // public String convert(String s, int numRows) {
    //     // Define StringBuilders
    //     StringBuilder[] sbs = new StringBuilder[numRows];
    //     for (int i = 0; i < numRows; i++) {
    //         sbs[i] = new StringBuilder();
    //     }
    //     // Define Variables
    //     char[] arr = s.toCharArray();
    //     int n = arr.length;
    //     int index = 0;
    //     // Tranverse zig zig
    //     while (index < n) {
    //         // GO down
    //         for (int j = 0; j < numRows && index < n; j++) {
    //             sbs[j].append(arr[index++]);
    //         }
    //         // Go up before start
    //         for (int j = numRows - 2; j > 0 && index < n; j--) {
    //             sbs[j].append(arr[index++]);
    //         }
    //     }
    //     // combine all stringbuiders into one
    //     StringBuilder res = sbs[0];
    //     for (int i = 1; i < numRows; i++) {
    //         res.append(sbs[i].toString());
    //     }
    //     return res.toString();
    // }
    public static void main(String[] args) {
        System.out.println(convert("DeepDhamalaIsSuperCool", 3));
    }
    public static String convert (String s, int numRows){
        //Define string builder
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i<numRows; i++){
            sbs[i] = new StringBuilder();
        }
        //Define variables
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;
        //Transverse zigzag
        while(index<n){
            //go down
            for (int j = 0; j<numRows && index < n; j++){
                sbs[j].append(arr[index++]);
            }
            //go up
            for(int j=numRows -2; j>0 && index<n;j--){
                sbs[j].append(arr[index++]);
            }
        }
        StringBuilder res = sbs[0];
        for(int i =1; i<numRows; i++){
            res.append(sbs[i].toString());
        }

        return res.toString();
    }
}