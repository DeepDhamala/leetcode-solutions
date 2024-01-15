class Solution:
    def convert(self, s: str, numRows: int) -> str:
        # Define list of strings
        sbs = ['' for _ in range(numRows)]

        # Define variables
        arr = list(s)
        n = len(arr)
        index = 0

        # Traverse zigzag
        while index < n:
            # Go down
            for j in range(numRows):
                if index < n:
                    sbs[j] += arr[index]
                    index += 1

            # Go up
            for j in range(numRows - 2, 0, -1):
                if index < n:
                    sbs[j] += arr[index]
                    index += 1

        # Combine all strings into one
        res = ''.join(sbs)
        return res
