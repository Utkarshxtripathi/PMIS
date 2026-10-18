import java.util.function.Consumer;
import java.util.function.Supplier;

public class w {
    public static void main(String[] args) {
        Consumer<String> pr = message -> System.out.println(message);

        pr.accept("Hello I love cricket.");

        Supplier<String> message = () -> "Welcome to the world";
        System.out.println(message.get());

        Consumer<String> smsNotifier = mobNo -> {
            System.out.println("Sending the OTP to the ph no.: " + mobNo);
        };
        smsNotifier.accept("+91 12345678");
    }
}
