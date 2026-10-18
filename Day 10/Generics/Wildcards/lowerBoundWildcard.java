import java.util.ArrayList;
import java.util.List;

/**
 * Topic: Generics - Lower Bounded Wildcards (<? super Type>)
 * Subtopics: Lower bound wildcard vs Upper bound wildcard (PECS: Producer Extends, Consumer Super)
 * 
 * Concept:
 * - <? super Integer> accepts Integer or any of its superclasses (Number, Object).
 * - Safe for adding/writing elements of type Integer.
 */
public class lowerBoundWildcard {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println("Numbers list: " + numList);

        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        System.out.println("Objects list: " + objList);
    }
}
