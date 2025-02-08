class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num1 = []
        for i in str(x):
           num1.append(i)

        num2 = num1[::-1]

        if num2 == num1:
            return True
        else:
            return False

sol = Solution()
print(sol.isPalindrome(-121))