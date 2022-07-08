public class LibraryInterfaceDemo
{
    public static void main(String[] args) {

        LibraryUser kids= new KidUsers();
        LibraryUser adults = new AdultUser();
        kids.requestBook("Kids");
       kids.registerAccount(10);
        adults.requestBook("Fiction");
        adults.registerAccount(30);

    }
}
