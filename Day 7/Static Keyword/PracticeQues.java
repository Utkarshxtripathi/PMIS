/*Question: User Account Registration System (Static Variables and Static Methods)
Scenario: A system needs to manage user registrations and maintain a count of the total number of users created. The total user count should be shared among all instances of the UserAccount class.
Task:
1. Create a class named UserAccount with the following:
   - A private instance variable String username to store the username.
   - A private static variable int totalUsers, initialized to 0, to keep track of the total number of users created.
   - A parameterized constructor that accepts a username, initializes the instance variable, and increments totalUsers whenever a new user is created.
   - A getter method getUsername() to return the username.
   - A static method getTotalUsers() to return the total number of users registered.
2. Create a main class named StaticDemo1 that:
   - Displays the initial user count before creating any users.
   - Creates three UserAccount objects with the usernames "Aarav", "Priya", and "Rohan".
   - Displays the username of each newly created user.
   - Displays the total number of users registered by calling the static method directly through the UserAccount class, without creating an additional object. */

class UserAccount {
    private String username;
    private static int totalUsers = 0;

    UserAccount(String username) {
        this.username = username;
        totalUsers++;
    }

    String getUsername() {
        return username;
    }

    static int getTotalUsers() {
        return totalUsers;
    }
}

class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println("Initial user count: " + UserAccount.getTotalUsers());

        UserAccount user1 = new UserAccount("Aarav");
        UserAccount user2 = new UserAccount("Priya");
        UserAccount user3 = new UserAccount("Rohan");

        System.out.println("User: " + user1.getUsername());
        System.out.println("User: " + user2.getUsername());
        System.out.println("User: " + user3.getUsername());
        System.out.println("Total users registered: " + UserAccount.getTotalUsers());
    }
}
