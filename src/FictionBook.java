public class FictionBook extends Book {
    private String category;

    public FictionBook() {}
    public FictionBook(String category) {}
    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getAmount( ) {
        return super.getAmount() * 93 / 100;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "\nMã sách='" + getBookCode() + '\'' +
                ",\nTên sách='" + getName() + '\'' +
                ",\nGiá sách=" + this.getAmount() +
                ",\nTác giả='" + getAuthor() + '\'' +
                ",\nCategory='" + category + '\'' +
                '}';
    }
}
