public class KidUsers implements LibraryUser
{

    @Override
    public void registerAccount(int age) {
        if(age<12)
            System.out.println("You have successfully " +
                    "registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than " +
                    "12 to register as a kid");

    }

    @Override
    public void requestBook(String str) {
       if(str=="Kids")
           System.out.println("Book Issued successfully, " +
                   "please return the book within 10 days");
       else
           System.out.println("“Oops, you are allowed to take " +
                   "only kids books");
    }
}
