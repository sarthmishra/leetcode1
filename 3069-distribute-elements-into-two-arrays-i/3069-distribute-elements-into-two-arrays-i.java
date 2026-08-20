class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();


        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i = 2; i < n; i++){
            

            int lastElement1 = list1.get(list1.size() - 1);
            int lastElement2 = list2.get(list2.size() - 1);

            if(lastElement1 > lastElement2){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        int[] result = new int[n];
        int index = 0;
        for(int i = 0; i < list1.size(); i++){
            result[i] = list1.get(i);
            index++;
        }
        for(int i = 0; i < list2.size(); i++){
            result[index] = list2.get(i);
            index++;
        }




        return result;

    }
}