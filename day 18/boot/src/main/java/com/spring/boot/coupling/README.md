# Hackathon Challenge: Smart Campus Notification System

## Difficulty and time limit

- **Difficulty:** Easy
- **Suggested build time:** 2 hours
- **Main concepts:** Tight coupling, loose coupling, interfaces, constructor dependency injection, and clean package structure

## Problem statement

A college wants to build a small **Smart Campus Notification System**. The system should notify students when important events happen, such as:

- A class is cancelled.
- An examination timetable is published.
- A library book is overdue.
- A campus event is starting soon.

The first version of the system sends every notification by email. Later, the college may also want to send notifications through SMS, a mobile application, or WhatsApp.

Your task is to design and build a small Java application that demonstrates the difference between a tightly coupled design and a loosely coupled design.

The application must allow the notification channel to be changed without rewriting the main notification logic. This represents a real-world requirement: business rules should not break when an external service or delivery method changes.

## What you must build

Create two implementations of the same notification feature:

1. **Tightly coupled version**
   - A notification service directly creates an email sender.
   - The service is strongly dependent on the email implementation.
   - Add comments explaining why this design becomes difficult to change.

2. **Loosely coupled version**
   - Create a `NotificationSender` interface.
   - Implement at least two senders, such as email and SMS.
   - Make the notification service depend only on the interface.
   - Supply the sender through constructor dependency injection.
   - Demonstrate that the same notification service can use different senders.

## Recommended folder structure

Keep the code organized into separate packages instead of placing every class in one folder:

```text
src/
└── main/
    └── java/
        └── com/
            └── spring/
                └── boot/
                    └── coupling/
                        ├── README.md
                        ├── tightlycoupled/
                        │   ├── TightlyCoupledDemo.java
                        │   ├── TightlyCoupledNotificationService.java
                        │   └── EmailSender.java
                        └── looselycoupled/
                            ├── LooselyCoupledDemo.java
                            ├── NotificationSender.java
                            ├── EmailNotificationSender.java
                            ├── SmsNotificationSender.java
                            └── NotificationService.java
```

The existing examples in this package may be used as a starting point, or you
may reorganize them into the structure above.

## Functional requirements

The application should:

1. Accept or define a student name, notification title, and notification message.
2. Send a notification using email in the tightly coupled example.
3. Send a notification using email in the loosely coupled example.
4. Send a notification using SMS in the loosely coupled example.
5. Print a clear result to the console, for example:

```text
Student: Anish
Title: Class Cancelled
Channel: SMS
Status: Notification sent successfully
```

6. Clearly show in the code comments where the two designs differ.

## Suggested class responsibilities

### `NotificationSender`

Declare the operation that every notification channel must support:

```java
void send(String recipient, String title, String message);
```

### `EmailNotificationSender`

Implement `NotificationSender` and print an email-style result to the console.

### `SmsNotificationSender`

Implement `NotificationSender` and print an SMS-style result to the console.

### `NotificationService`

Receive a `NotificationSender` in its constructor and use it to send messages.
It must not create `EmailNotificationSender` or `SmsNotificationSender` itself.

### Demo classes

Create one demo class for each design. The demo classes should create the
objects and call the notification operation so that the difference is easy to
observe.

## Important learning goal

The goal is not to connect to a real email or SMS provider. Console output is
enough. The goal is to understand object relationships:

```text
Tight coupling:
NotificationService ───────> EmailSender
                             (concrete class)

Loose coupling:
NotificationService ───────> NotificationSender
                             (interface)
                                  ▲
                    EmailSender ──┘
                    SmsSender ────┘
```

In the loosely coupled design, adding `PushNotificationSender` should require
creating a new class, not changing the notification service.

## Optional stretch goals

Only attempt these after the required functionality is complete:

- Add `PushNotificationSender`.
- Add a `Notification` model class instead of passing three separate strings.
- Validate that the recipient, title, and message are not blank.
- Add unit tests using a fake `NotificationSender`.
- Add a small Spring Boot REST endpoint that selects the channel from a request parameter.

## Acceptance criteria

The solution is complete when:

- The project compiles successfully.
- Both demo classes run from the command line.
- The tightly coupled example directly depends on a concrete email class.
- The loosely coupled example depends on an interface.
- At least email and SMS work through the same loosely coupled service.
- The sender is injected through a constructor.
- Classes are separated into meaningful packages and files.
- Comments explain the coupling difference in beginner-friendly language.
- Adding a new notification channel does not require modifying the loosely coupled service.

## Suggested two-hour plan

| Time | Activity |
|---|---|
| 0–15 minutes | Understand the scenario and create the package structure |
| 15–35 minutes | Build the tightly coupled version |
| 35–75 minutes | Build the interface and loosely coupled version |
| 75–95 minutes | Add SMS support and demo output |
| 95–110 minutes | Add comments, validation, and clean up packages |
| 110–120 minutes | Compile, run both demos, and verify the acceptance criteria |
