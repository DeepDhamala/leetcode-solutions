class TwoSum:
    def two_sum(self, nums, target):
        num_set = set()
        for i, num in enumerate(nums):
            complementary = target - num
            if complementary in num_set:
                return [nums.index(complementary),i]
            num_set.add(num)
        return None