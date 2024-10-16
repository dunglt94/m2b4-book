public class Main {
    public static void main(String[] args) {
        Book[] books;
        books = new Book[6];
        books[0] = new ProgrammingBook("0001",
                    "JavaScript and jQuery: Interactive Front-End Web Development 1st EditionJ",
                    900,
                   "Jon Duckett",
                 "Javascript",
                "Framework1");
        books[1] = new ProgrammingBook("0002",
                    "Head First Java: A Brain-Friendly Guide 3rd Edition",
                    1850,
                   " Kathy Sierra, Bert Bates, Trisha Gee",
                 "Java",
                "Framework2");
        books[2] = new ProgrammingBook("0003",
                    "Effective Java 3rd Edition",
                    2670,
                   "Joshua Bloch",
                 "Java",
                "Framework3");
        books[3] = new FictionBook("0004",
                    "Harry Potter and the Sorcerer's Stone: The Illustrated Edition",
                    1050,
                   "J.K. Rowling",
                  "Viễn tưởng 1");
        books[4] = new FictionBook("0005",
                    "Harry Potter and the Goblet of Fire: The Illustrated Edition",
                    1450,
                   "J.K. Rowling",
                 "Viễn tưởng 1");
        books[5] = new FictionBook("0006",
                    "Harry Potter and the Order of the Phoenix: The Illustrated Edition",
                    1400,
                   "J.K. Rowling",
                 "Viễn tưởng 1");

        System.out.println("Các loại sách: ");
        printBooks(books);

        System.out.println("Tổng giá của " + books.length + " quốn sách là " + getSumPrice(books));

        System.out.println("Có " + countJavaProgrammingBook(books) + " programming book có ngôn ngữ là Java.");

        System.out.println("Có " + countVT1FictionBook(books) + " fiction book thuộc loại viễn tưởng 1.");

        System.out.println("Có " + countBooksLowerThan1000(books) + " quốn sách có giá dưới 1000.");

    }

    private static int countBooksLowerThan1000(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book.getAmount() < 1000) {
                count++;
            }
        }
        return count;
    }

    private static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    private static int getSumPrice(Book[] books) {
        int sum = 0;
        for (Book x: books) {
            sum += x.getAmount();
        }
        return sum;
    }

    private static int countJavaProgrammingBook(Book[] books) {
        int count = 0;
        for (Book book: books) {
            if (book instanceof ProgrammingBook programmingBook) {
                if (programmingBook.getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countVT1FictionBook(Book[] books) {
        int count = 0;
        for (Book book: books) {
            if (book instanceof FictionBook fictionBookBook) {
                if (fictionBookBook.getCategory().equals("Viễn tưởng 1")) {
                    count++;
                }
            }
        }
        return count;
    }
}
