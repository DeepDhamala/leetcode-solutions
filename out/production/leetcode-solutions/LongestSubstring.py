class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        lastIndexes = {}
        start, maxLength = 0, 0

        for i, char in enumerate(s):
            if char in lastIndexes:
                lastIndex = lastIndexes[char] + 1
                if lastIndex > start:
                    maxLength = max(maxLength, i - start)
                    start = lastIndex

            lastIndexes[char] = i

        return max(maxLength, len(s) - start)


    