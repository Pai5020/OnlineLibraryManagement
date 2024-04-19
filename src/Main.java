public class Main {
    public static void main(String[] args) {
        Book b = new Book("XZC","DFG",234);
        System.out.println("Id : "+ b.getId());
        System.out.println("Name : " + b.getName());
        System.out.println("Author : " + b.getAuthor());
        b.addItem();
        b.removeItem();
        b.borrowItem();
        b.returnItem();

        Magazine M = new Magazine("SDF",201);
        System.out.println("Id : "+ M.getId());
        System.out.println("Name : " + M.getName());
        M.addItem();
        M.removeItem();
        M.borrowItem();
        M.returnItem();

        Dvd D = new Dvd("ASF",1029);
        System.out.println("Id : "+ D.getId());
        System.out.println("Name : " + D.getName());
        D.addItem();
        D.removeItem();
        D.borrowItem();
        D.returnItem();

    }
}