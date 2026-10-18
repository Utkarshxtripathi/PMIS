/**
 * Topic: JUnit 5 - Architecture & Lifecycle
 * Subtopics: @Test, @BeforeAll, @BeforeEach, @AfterEach, @AfterAll, @Disabled
 * 
 * JUnit 5 Architecture:
 * - JUnit Platform: Foundation for launching testing frameworks on JVM.
 * - JUnit Jupiter: Programming model and extension model (contains annotations & assertions).
 * - JUnit Vintage: Provides a TestEngine for running JUnit 3 and JUnit 4 tests.
 * 
 * Lifecycle sequence:
 * @BeforeAll (once before all tests)
 *   -> @BeforeEach (before each test method)
 *     -> @Test
 *   -> @AfterEach (after each test method)
 * @AfterAll (once after all tests)
 */
public class JUnit5LifecycleDemo {
    public static void main(String[] args) {
        System.out.println("JUnit 5 Lifecycle Annotations Overview:");
        System.out.println("1. @BeforeAll: Executed once before all tests (must be static)");
        System.out.println("2. @BeforeEach: Executed before each @Test");
        System.out.println("3. @Test: Denotes a test method");
        System.out.println("4. @AfterEach: Executed after each @Test");
        System.out.println("5. @AfterAll: Executed once after all tests (must be static)");
    }
}
