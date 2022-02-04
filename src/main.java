import leet_code_problem.daily.Problem220204;

public class main {

    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {-2,-1};
        int [] nums3 = {-1,2};
        int [] nums4 = {0,2};

        Problem220204 problem220204 = new Problem220204();
        System.out.println(problem220204.fourSumCount(nums1,nums2, nums3, nums4));
    }
}
