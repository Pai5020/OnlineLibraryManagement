public class Main {
    public static void main(String[] args) {
        Book b = new Book("XZC","DFG",234);
        System.out.println("id : "+ b.getId());
        System.out.println("Name : "+b.getName());
        System.out.println("Author : " +  b.getAuthor());
        b.borrowItem();
        b.returnItem();

        Magazine M = new Magazine();
        M.setId(101);
        M.setName("Magazine3");
        System.out.println("Id : "+ M.getId());
        System.out.println("Name : " + M.getName());
        M.borrowItem();
        M.returnItem();

        Dvd D = new Dvd();
        D.setIdD(103);
        D.setNameD("PQR");
        System.out.println("Id : "+ D.getIdD());
        System.out.println("Name : " + D.getNameD());
        M.borrowItem();
        M.returnItem();

    }
}