class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack)-len(needle)):
            if needle[i:i+len(needle)] == needle:
                return i
        else:
            return -1