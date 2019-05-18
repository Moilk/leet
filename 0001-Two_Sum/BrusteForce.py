class Solution:
	def twoSum(self, nums, target):
		for x in range(len(nums)):
			for y in range(x,len(nums)):
				if((nums[x]+nums[y])==target):
					return [x,y]