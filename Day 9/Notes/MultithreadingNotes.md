# Multithreading & Concurrency in Java - Day 9 Notes

## 1. Quick Recap: Exceptions
- **Checked Exceptions**: Checked at compile-time (e.g., `InterruptedException`, `IOException`, `SQLException`). Must be caught with `try-catch` or declared using `throws`.
- **Unchecked Exceptions**: Occur at runtime (subclasses of `RuntimeException`, e.g., `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`).

---

## 2. Fundamentals of Threads

- **What is a Thread?**
  A thread in Java represents a single, independent path of execution of a group of statements.
- **Lightweight Process:**
  Threads are lightweight processes that share the memory and resources of the parent process.
- **Single-Threaded vs Multi-Threaded:**
  - When a program contains a single sequential flow of control, it is a **single-threaded program**.
  - When multiple tasks run concurrently within the same program, it is a **multithreaded program**.
- **Main Thread (Parent Thread):**
  - Every Java program has at least one thread managed internally by the JVM: the **main thread**.
  - All additional threads created by the program are **child threads**.
  - The main thread is typically the first thread to start and often coordinates child threads using `join()`.

---

## 3. Multithreading & Context Switching

- **Multithreading:**
  The technique of executing two or more threads concurrently to maximize CPU utilization.
- **Context Switching:**
  The process where the CPU switches its execution context from one thread to another. Context switching allows multiple threads to make progress seemingly at the same time on single-core or multi-core processors.

---

## 4. Ways to Create a Thread in Java

### Approach 1: Extending the `Thread` Class
1. Subclass `java.lang.Thread`.
2. Override the `run()` method with the task logic.
3. Instantiate the subclass and invoke `start()`.

```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running...");
    }
}

MyThread t = new MyThread();
t.start(); // Invokes run() on a separate call stack
```

### Approach 2: Implementing the `Runnable` Interface (Preferred)
1. Implement the functional interface `java.lang.Runnable`.
2. Override `run()`.
3. Pass the `Runnable` instance into the `Thread` constructor.
4. Call `start()`.

```java
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task running...");
    }
}

Thread t = new Thread(new MyTask(), "Worker-1");
t.start();
```

> **Why `Runnable` is preferred:** Java supports single class inheritance. Implementing `Runnable` keeps your class free to inherit from other classes and promotes separation of task from thread execution.

---

## 5. Thread Lifecycle and States

A thread transitions through various states in `java.lang.Thread.State`:

1. **NEW**: Instantiated via `new Thread()`, but `start()` has not yet been invoked.
2. **RUNNABLE**: Ready to run and waiting for CPU scheduling or actively executing.
3. **BLOCKED**: Waiting to acquire a monitor lock for a `synchronized` block/method.
4. **WAITING**: Waiting indefinitely for another thread to perform a particular action (e.g., via `wait()` or `join()`).
5. **TIMED_WAITING**: Waiting for a specified time interval (e.g., via `Thread.sleep(millis)`, `wait(timeout)`, `join(timeout)`).
6. **TERMINATED**: Finished execution of its `run()` method or terminated due to an uncaught exception.

---

## 6. Key Thread Methods

| Method | Description |
| :--- | :--- |
| `start()` | Allocates OS thread resources and invokes `run()` asynchronously. |
| `run()` | Contains the executable code for the thread. Calling directly runs on the caller's thread (synchronously). |
| `sleep(millis)` | Pauses the current thread for the specified duration (throws `InterruptedException`). |
| `join()` | Blocks the current calling thread until the target thread finishes execution. |
| `setName(String)` / `getName()` | Configures or retrieves the descriptive name of the thread. |
| `setPriority(int)` / `getPriority()` | Sets/reads thread priority (`Thread.MIN_PRIORITY = 1`, `NORM_PRIORITY = 5`, `MAX_PRIORITY = 10`). |
| `getState()` | Returns the current state enum value of the thread. |

---

## 7. Synchronization and Race Conditions

- **Race Condition:**
  Occurs when multiple threads read and write shared data concurrently, leading to unpredictable and inconsistent results.
- **Critical Section:**
  The portion of code accessing shared resources that must not be accessed concurrently by more than one thread.
- **The `synchronized` Keyword:**
  Enforces mutual exclusion using intrinsic locks (monitors). Only one thread can hold the lock on a given object at any time.

```java
class Counter {
    int count = 0;

    // Synchronized method guarantees atomic increment
    synchronized void increment() {
        count++;
    }
}
```

---

## 8. Inter-Thread Communication

Threads communicate and coordinate execution using monitor methods defined in `java.lang.Object`:

- **`wait()`**: Causes the current thread to release the monitor lock and wait until another thread invokes `notify()` or `notifyAll()` on the same monitor.
- **`notify()`**: Wakes up a single thread waiting on the object's monitor.
- **`notifyAll()`**: Wakes up all threads waiting on the object's monitor.

> **Rule:** `wait()`, `notify()`, and `notifyAll()` can **only** be called from within a `synchronized` context on that specific object.
