public class Main {
    public static void main(String[] args) {
        Book book[] = new Book[6];
        book[0] = new Book("0001", "Toán", 1200, "Kim Đồng");
        book[1] = new Book("0002", "Lý", 800, "Kim Đồng");
        book[2] = new Book("0003", "Hoá", 800, "Kim Đồng");
        book[3] = new Book("0004", "Văn", 1100, "Kim Đồng");
        book[4] = new Book("0005", "Anh", 1300, "Kim Đồng");
        book[5] = new Book("0006", "Sinh", 800, "Kim Đồng");

        System.out.println("Các loại sách: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println((i + 1) + ". Mã sách: " + book[i].getBookCode()
                                + " - Tên sách: " + book[i].getName()
                                + " - giá sách: " + book[i].getPrice()
                                + " - Tác giả: " + book[i].getAuthor());
        }

        int sum = 0;
        for (Book x: book) {
            sum += x.getPrice();
        }
        System.out.println("Tổng giá của " + book.length + " quốn sách là " + sum);

        System.out.println("Những quốn sách có giá lớn hơn 1000:");
        for (int i = 0; i < book.length; i++) {
            if (book[i].getPrice() > 1000) {
                System.out.println((i + 1) + ". " + book[i].getName());
            }
        }
    }
}
