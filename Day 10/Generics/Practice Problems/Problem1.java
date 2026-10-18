/*Level 1: The Locker
Problem Statement
A school has lockers. One locker can hold one item. Students keep different things in them: a
book (String), a locker code (Integer), or a lunch price (Double).
Without generics, you’d write StringLocker, IntegerLocker, DoubleLocker, and so on.
Your task: Write one Locker<T> class that can hold any type of item.
Requirements:
1. put(item) stores an item.
2. get() returns the item.
3. Test it with a String and an Integer.
Expected output:
Locker has: Java Book
Locker has: 1234 */

public class Problem1 {

    static class Locker<T> {
        private T item;

        public void put(T item) {
            this.item = item;
        }

        public T get() {
            return item;
        }
    }

    public static void main(String[] args) {
        Locker<String> bookLocker = new Locker<>();
        bookLocker.put("Java Book");
        System.out.println("Locker has: " + bookLocker.get());

        Locker<Integer> codeLocker = new Locker<>();
        codeLocker.put(1234);
        System.out.println("Locker has: " + codeLocker.get());
    }
}
