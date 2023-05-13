package Java3;

public class Person {


    String firstname = "Keya", lastname = "Patel", FullName = "Keya Patel";
    int age = 25;

    public static void main(String[] args) {
        Person z = new Person();
        Person person = new Person();
        person.setfirstname(""); // firstName is set to empty string
        person.setlastname(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullname());
        System.out.println("teen= " + person.teen());
        person.setfirstname("Keya"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullname());
        System.out.println("teen= " + person.teen());
        person.setlastname("Patel"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullname());

           }

    public String getfirstName() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String setfirstname(String firstname) {
        return firstname;
    }

    public String setlastname(String lastname) {
        return lastname;
    }

    public int setAge(int age) {

        if (age < 0 || age > 100) {
            age = 0;
        } else {
            age = age;
        }
        return age;
    }

    public boolean teen() {
        if (age >= 12 && age <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public String getFullname() {
        String Fullname = firstname + lastname;
        return FullName;
   }
}







