public class gen {
    static class Box<T> {
        T obj;

        void set(T obj) {
            this.obj = obj;
        }

        T get() {
            return obj;
        }
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("hello");
        String s = box.get();
        System.out.println(s);
    }
}

/*
1. compile time errors detected. Without generics we can detect
compile time errors, the code will break while executing(run time)
2. No manual casting
3. reusable code. (One box class works for any type).

Rules:
1. Mention the wrapper class.
2. Java automatically performs autoboxing and unboxing.
*/
