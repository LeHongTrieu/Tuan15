import java.util.ArrayList;
import java.util.List;

public class Test_Ex2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(45, 12, 78, 23, 56, 89, 34, 67, 1, 90));
        List<Integer> list2 = new ArrayList<>(List.of(3, 8, 1, 12, 5, 7, 20, 15, 6, 9));
        Context context1 = new Context(new Bubble_Sort());
        Context context2 = new Context(new Selection_Sort());
        context1.sortStrategy(list1);
        System.out.println(list1);
        context2.sortStrategy(list2);
        System.out.println(list2);
    }
}