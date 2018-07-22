class Solution
{
  public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        map<int, int> buff_dict;
        vector<int> res;
        int len = nums.size();
        for (int i = 0; i < len; i++)
        {
            if (buff_dict.find(nums[i]) != buff_dict.end())
            {
                res.push_back(buff_dict[nums[i]]);
                res.push_back(i);
                return res;
            }
            else
            {
                buff_dict[target - nums[i]] = i;
            }
        }
        return res;
    }
};