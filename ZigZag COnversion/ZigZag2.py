class Solution:
    def convert(self, s:str, numRows:int)-> str:
        sbs = ['' for _ in range(numRows)]
  
        arr = list(s)
        n = len(arr)
        index = 0

        while index < n:
            for j in range(numRows):
                if index < n:
                    sbs[j] += arr[index]
                    index += 1

            for j in range(numRows -2, 0, -1):
                if index < n:
                    sbs[j] += arr[index]
                    index += 1

        res = ''.join(sbs)
        return res