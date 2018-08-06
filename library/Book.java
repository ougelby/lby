package library;

class Book {
    int id;
    Book(int id) {
        this.id=id;    //每本书给一个id，用于区分
    }
    public String toString() {
        return "Book:"+id;
    }
}