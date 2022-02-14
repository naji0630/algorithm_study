import leet_code_problem.daily.Problem567PermutationInString;

public class main {

    public static void main(String[] args) {

        String s1 ="hello";
        String s2 ="ooolleoooleh";

        Problem567PermutationInString problem567PermutationInString = new Problem567PermutationInString();
        System.out.println(problem567PermutationInString.checkInclusion(s1, s2));
    }
}
