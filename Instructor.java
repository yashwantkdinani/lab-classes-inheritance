
public class Instructor extends Person
{
    private String office;

    public Instructor(String name, String email, String office)
    {
        super(name, email);
        this.office = office;
    }

    public String getOffice()
    {
        return office;
    }

    public void print()
    {
        super.print();
        System.out.println("Office: " + office);
    }
}
