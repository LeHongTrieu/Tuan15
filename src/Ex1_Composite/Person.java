import java.util.ArrayList;
import java.util.List;

public class Person {
    private  String name;
    private  String birthday;
    private  String sex;
    private  String married;
    private List<Person> children = new ArrayList<>();

    public Person() {

    }

    public Person (String name, String bir, String sex, String mar) {
        this. name = name;
        this.birthday = bir;
        this.sex = sex;
        this.married = mar;
    }

    public Person (String name, String bir, String sex, String mar, List<Person>child) {
        this. name = name;
        this.birthday = bir;
        this.sex = sex;
        this.married = mar;
        this.children = child;
    }

    public void addChildren(Person p) {
        children.add(p);
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setBirthday(String bir) {
        this.birthday = bir;
    }

    public void setSex(String s) {
        this.sex = s;
    }

    public void setMarried(String m) {
        this.married = m;
    }

    public String getName() {
        return name;
    }

    public String getMarried() {
        return married;
    }

    public String getBirthday() {return birthday;}

    public String getSex() {return sex;}

    public List<Person> getChildren() {
        return children;
    }

    public String toString() {
        return "Name: " + name + "\nDate of birth: " + birthday + "\nSex: " + sex
                + "\nMarried: " + married;
    }
}
