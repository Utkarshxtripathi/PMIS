/*once done with the quiz, solve the below question:

Problem statement
Create a generic class Box<T> that can store one item of any reference type.
Requirements:
1. Create a class Box<T> with a private variable item.
2. Create a setItem(T item) method to store the item.
3. Create a getItem() method to return the item.
4. Test the class using String and Integer.
Expected output
Mobile: Samsung
Price: 25000 */



class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class problem2 {
    public static void main(String[] args) {
        Box<String> mobile = new Box<>();
        mobile.setItem("Samsung");

        Box<Integer> price = new Box<>();
        price.setItem(25000);

        System.out.println("Mobile: " + mobile.getItem());
        System.out.println("Price: " + price.getItem());
    }
}
