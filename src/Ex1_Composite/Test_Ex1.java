import java.util.ArrayList;
import java.util.List;

public class Test_Ex1 {
    public void getAllPeople(List<Person> people, Person person) {
        if (person != null && !people.contains(person)) {
            people.add(person);
            for (int i = 0; i < person.getChildren().size(); i++) {
                getAllPeople(people, person.getChildren().get(i));
            }
        }
    }


    public static void main(String []args) {
        Test_Ex1 test = new Test_Ex1();

        Person james = new Person("James", "17/02/1985", "Male", "JvH");
        Person hana = new Person("Hana","", "Female", "JvH");
        Person ryan = new Person("Ryan","", "Male", "");
        Person kai = new Person("Kai","", "Male", "KvJ");
        Person jeny = new Person("Jenny","", "Female", "KvJ");

        james.addChildren(kai);
        james.addChildren(james);
        hana.addChildren(james);
        hana.addChildren(kai);

        Person k1 = new Person("k1","", "Female", "");
        Person k_1 = new Person("k_1","", "Male", "K1vK2");
        Person k2 = new Person("k2","", "Female", "K1vK2");
        Person k3 = new Person("k3","", "Male", "");
        Person k4 = new Person("k4","", "Male", "");

        kai.addChildren(k1);
        kai.addChildren(k2);
        kai.addChildren(k3);
        kai.addChildren(k4);
        jeny.addChildren(k1);
        jeny.addChildren(k2);
        jeny.addChildren(k3);
        jeny.addChildren(k4);

        Person k12 = new Person("k12","", "Female", "");
        Person k22 = new Person("k22","", "Female", "True");

        k_1.addChildren(k12);
        k_1.addChildren(k22);
        k2.addChildren(k12);
        k2.addChildren(k22);

        List<Person> listPersonNotMarried = new ArrayList<>();
        List<Person> listPersonHasTwoChildren = new ArrayList<>();
        List<Person> listPersonOfTheLastGeneration = new ArrayList<>();
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(hana);
        listPerson.add(k_1);
        listPerson.add(ryan);
        test.getAllPeople(listPerson, james);
        for(int i=0; i < listPerson.size();i++) {
            if((listPerson.get(i).getMarried()).isEmpty()) {
                listPersonNotMarried.add(listPerson.get(i));
            } else {
                if(listPerson.get(i).getChildren().size() == 2) {
                    listPersonHasTwoChildren.add(listPerson.get(i));
                }
                if(listPerson.get(i).getChildren().size() == 0) {
                    listPersonOfTheLastGeneration.add(listPerson.get(i));
                }
            }
        }

        System.out.println("Person who is not married:");
        for (Person person : listPersonNotMarried) System.out.println(person + "\n");

        System.out.println("\nPerson with two kids:");
        for (Person person : listPersonHasTwoChildren) System.out.println(person + "\n");

        System.out.println("\nYoungest generation:");
        for (Person person : listPersonOfTheLastGeneration) System.out.println(person + "\n");
    }
}
