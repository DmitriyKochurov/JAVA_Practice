import java.util.*;

class Tasks {

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static int multiplyByCondition(int number) {
        return number % 2 == 0 ? number * 4 : number * 5;
    }

    public static int toNegative(int number) {
        return number > 0 ? -number : number;
    }

    public static int getCentury(int year) {
        return (year + 99) / 100;
    }

    public static int findSmallest(int[] numbers) {
        return Arrays.stream(numbers).min().orElseThrow();
    }

    public static List<Integer> twoLargest(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .sorted()
                .toList();
    }

    public static int[] countPosSumNeg(int[] numbers) {
        if (numbers == null || numbers.length == 0) return new int[0];
        int countPos = 0;
        int sumNeg = 0;
        for (int num : numbers) {
            if (num > 0) countPos++;
            else if (num < 0) sumNeg += num;
        }
        return new int[]{countPos, sumNeg};
    }

    public static int countVowels(String str) {
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiouy".indexOf(c) >= 0)
                .count();
    }

    public static String getMiddle(String str) {
        int len = str.length();
        int mid = len / 2;
        return len % 2 == 0 ? str.substring(mid - 1, mid + 1) : str.substring(mid, mid + 1);
    }

    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                table[i][j] = (i + 1) * (j + 1);
        return table;
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
        System.out.println(multiplyByCondition(4));
        System.out.println(toNegative(5));
        System.out.println(getCentury(2023));
        System.out.println(findSmallest(new int[]{34, 15, 88, 2}));
        System.out.println(twoLargest(new int[]{1, 5, 87, 45, 8, 8}));
        System.out.println(Arrays.toString(countPosSumNeg(new int[]{1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15})));
        System.out.println(countVowels("Education"));
        System.out.println(getMiddle("student"));
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
    }
}
