import list.order.OrderPerson;
import list.order.Person;
import list.search.Book;
import list.search.Catalog;

public class Main {
    public static void main(String[] args) {
//        TaskList taskList = new TaskList();
//        System.out.println(taskList.totalTasks());
//        taskList.addTask("Task 1");
//        System.out.println(taskList.totalTasks());
//        taskList.addTask("Task 2");
//        taskList.addTask("Task 2");
//        System.out.println(taskList.totalTasks());
//        taskList.printTasks();
//        taskList.removeTask("Task 2");
//        System.out.println(taskList.totalTasks());

//        Catalog catalog = new Catalog();
//        catalog.addBook(new Book("Book 1", "Author 1", 2015));
//        catalog.addBook(new Book("Book 2", "Author 2", 2021));
//        catalog.addBook(new Book("Book 2", "Author 2", 2022));
//        catalog.addBook(new Book("Book 3", "Author 2", 2022));
//        catalog.addBook(new Book("Book 4", "Author 3", 2023));
//        catalog.addBook(new Book("Book 4", "Author 3", 2023));
//        catalog.addBook(new Book("Book 4", "Author 4", 2024));
//        catalog.addBook(new Book("Book 5", "Author 5", 2025));
//        catalog.addBook(new Book("Book 6", "Author 5", 2026));
//        catalog.addBook(new Book("Book 7", "Author 6", 2026));
//        catalog.addBook(new Book("Book 8", "Author 6", 2027));
//        catalog.addBook(new Book("Book 9", "Author 7", 2028));

//        List<Book> booksToAuthor = catalog.searchByAuthor("Author 2");
//        System.out.println(booksToAuthor);

//        List<Book> booksToYear = catalog.searchByYear(2020, 2023);
//        System.out.println(booksToYear);

//        Book bookToTitle = catalog.searchByTile("Book 4");
//        System.out.println(bookToTitle);

        OrderPerson orderPerson = new OrderPerson();
        orderPerson.addPerson(new Person("Name 1", 25, 1.74));
        orderPerson.addPerson(new Person("Name 2", 42, 1.74));
        orderPerson.addPerson(new Person("Name 3", 65, 1.62));
        orderPerson.addPerson(new Person("Name 4", 22, 1.73));
        orderPerson.addPerson(new Person("Name 5", 15, 1.71));
        orderPerson.addPerson(new Person("Name 6", 27, 1.82));
        orderPerson.addPerson(new Person("Name 7", 30, 1.92));
        orderPerson.addPerson(new Person("Name 8", 25, 1.65));
        orderPerson.addPerson(new Person("Name 9", 15, 1.80));
        orderPerson.addPerson(new Person("Name 10", 21, 1.54));

        System.out.println(orderPerson.orderByAge());
        System.out.println("\n=================================\n");
        System.out.println(orderPerson.orderByHeight());

    }
}