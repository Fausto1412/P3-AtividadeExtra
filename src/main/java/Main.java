import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Resposta para a questão 1: ");
        String regex_test_1 = "a[a]+[b]+";
        System.out.println("aab = " + Pattern.matches(regex_test_1, "aab"));
        System.out.println("ab = " +Pattern.matches(regex_test_1, "ab"));
        System.out.println("aaba = " +Pattern.matches(regex_test_1, "aaba"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 2: ");
        String regex_test_2 = "a[a]*b{1,2}";
        System.out.println("aabbb = " + Pattern.matches(regex_test_2, "aabbb"));
        System.out.println("abb = " +Pattern.matches(regex_test_2, "abb"));
        System.out.println("aabb = " +Pattern.matches(regex_test_2, "aabb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 3: ");
        String regex_test3 = "a{2,}b{3,}";
        System.out.println("aabbb = " + Pattern.matches(regex_test3, "aabbb"));
        System.out.println("aabb = " +Pattern.matches(regex_test3, "aabb"));
        System.out.println("aaaaaabbbbbbb = " +Pattern.matches(regex_test3, "aaaaaabbbbbbb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 4: ");
        String regex_test_4 = "a+b{3,}";
        System.out.println("aabbb = " + Pattern.matches(regex_test_4, "aabbb"));
        System.out.println("ab = " +Pattern.matches(regex_test_4, "ab"));
        System.out.println("aaaaaabbbbbbb = " +Pattern.matches(regex_test_4, "aaaaaabbbbbbb"));


        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 5: ");
        String regex_test_5 = "[a*b]{1,2}|[a+b]{4,}";
        System.out.println("abb = " + Pattern.matches(regex_test_5, "abb"));
        System.out.println("ab = " +Pattern.matches(regex_test_5, "ab"));
        System.out.println("aaaaaabbbbbbb = " +Pattern.matches(regex_test_5, "aaaaaabbbbbbb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 6: ");
        String regex_test_6 = "(?:[ab]{2})+";
        System.out.println("abb = " + Pattern.matches(regex_test_6, "abb"));
        System.out.println("abab = " + Pattern.matches(regex_test_6, "abab"));
        System.out.println("ab = " +Pattern.matches(regex_test_6, "ab"));
        System.out.println("aaaaaabbbbbbbb = " +Pattern.matches(regex_test_6, "aaaaaabbbbbbbb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 7: ");
        String regex_test_7 = "^[ab]([ab]{2})*$";
        System.out.println("abb = " + Pattern.matches(regex_test_7, "abb"));
        System.out.println("aabb = " + Pattern.matches(regex_test_7, "aabb"));
        System.out.println("ab = " +Pattern.matches(regex_test_7, "ab"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 8: ");
        String regex_test_8 = "(?:[ab]{4})+";
        System.out.println("abbb = " + Pattern.matches(regex_test_8, "abbb"));
        System.out.println("aabbaabb = " + Pattern.matches(regex_test_8, "aabbaabb"));
        System.out.println("aaaaaabbbbbbb = " +Pattern.matches(regex_test_8, "aaaaaabbbbbbb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 9: ");
        String regex_test_9 = "(?:[a]{2}[b]+)+|(?:[a]{2})+[b]+";
        System.out.println("aabbb = " + Pattern.matches(regex_test_9, "aabbb"));
        System.out.println("aabaabb = " + Pattern.matches(regex_test_9, "aabaabb"));
        System.out.println("aaaaaabbbbbbbb = " +Pattern.matches(regex_test_9, "aaaaaabbbbbbb"));

        System.out.println("------------------------------------------");

        System.out.println("Resposta para a questão 10: ");
        String regex_test_10 = "a*(ba*ba*)*ba*";
        System.out.println("aabbb = " + Pattern.matches(regex_test_10, "aabbb"));
        System.out.println("aabbaabb = " + Pattern.matches(regex_test_10, "aabbaabb"));
        System.out.println("aaaaaabbbbbbbb = " +Pattern.matches(regex_test_10, "aaaaaabbbbbbb"));

    }
}
