class Solution {
public:
    long long findScore(vector<int>& nums) {
        
        int n=nums.size();
        vector<vector<int>>mat(n,vector<int>(2));
        for(int i=0;i<n;i++){
            mat[i][0]=nums[i];
            mat[i][1]=i;
        }
        std::sort(mat.begin(), mat.end(), [](const std::vector<int>& a, const std::vector<int>& b) {
            if (a[0] != b[0]) {
                return a[0] < b[0];
            }
            return a[1] < b[1];
        });
        vector<bool>arr(n);
        long long sum=0;
        for(int i=0;i<n;i++){
            int val=mat[i][0];
            int idx=mat[i][1];

        
            if(arr[idx]){
                continue;
        }
        sum+=val;
        arr[idx]=true;
        if(idx>0){
            arr[idx-1]=true;
        }
        if(idx<n-1){
            arr[idx+1]=true;
        }
        }
    return sum;

    }
};