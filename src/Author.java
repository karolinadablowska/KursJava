public class Author {

    private String name;
    private String surname;


    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;
        }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname (String surname) {
        this.name = surname;
    }

    public void getInfo() {
        System.out.println("Author is: " + getName() + ", " + getSurname());
    }


}
