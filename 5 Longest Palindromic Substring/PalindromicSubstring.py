# class Solution:
    # def longestPalindrome(self, s: str) -> str:
    #     if len(s) <=1:
    #         return s
        
    #     Max_Len=1
    #     Max_Str = s[0]
    #     for i in range(len(s)-1):
    #         for j in range(i+1, len(s)):
    #             if j-i+1>Max_Len and s[i:j+1] == s[i:j+1][::-1]:
    #                 Max_Len = j-i+1
    #                 Max_Str = s[i:j+1]
    #     return Max_Str
        # def longestPalindrome(self, s:str) -> str:
        #         if len(s) <=1:
        #                 return s
        #         def expand_from_center(left, right):
        #                 while left>=0 and right <len(s) and s[left] == s[right]:
        #                         left -=1
        #                         right +=1
        #                 return s[left+1:right]
        #         max_str = s[0]

        #         for i in range(len(s) -1):
        #                 odd = expand_from_center(i,i)
        #                 even = expand_from_center(i,i+1)

        #                 if len(odd) >len(max_str):
        #                         max_str = odd
        #                 if len(even) > len(max_str):
        #                         max_str = even
        #         return max_str

# class Solution:
#     def longestPalindrome(self, s:str) -> str:
#         if len(s) <=1:
#             return s
#         Max_Len = 1
#         Max_Str =s[0]
#         for i in range(len(s)-1):
#             for j in range(i+1, len(s)):
#                 if j-i+1>Max_Len and s[i:j+1] == s[i:j+1][::-1]:
#                     Max_Len = j-i+1
#                     Max_Str = s[i:j+1]

#         return Max_Str
    
class Solution:
    def longestPalindrome(self, s:str) -> str:
        def expand_from_center(left, right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                right+=1
                left-=1
            return s[left+1:right]    

        if len(s)<=1:
            return s
        Max_Len = 0
        Max_Str = s[0]
        for i in range(len(s)-1):
            odd = expand_from_center(s,i,i)
            even = expand_from_center(s,i,i+1)
            if Max_Len<len(odd):
                    Max_Str = odd
                    Max_Len = len(odd)
            if Max_Len<len(even):
                 Max_Str = even
                 Max_Len = len(even)
        return Max_Str
                 



