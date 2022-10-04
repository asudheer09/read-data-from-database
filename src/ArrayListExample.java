import java.util.ArrayList;
class Employee{
    private int id;
    private String name;
    private String company;

    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList arrayList= new ArrayList();
        arrayList.add(123);
        arrayList.add(123.456);
        arrayList.add("string");
        arrayList.add(123);
        arrayList.add(true);
        arrayList.add("string");
        Employee e1= new Employee(123,"sudheer","HCL");
        //System.out.println(e1);
        arrayList.add(e1);
        System.out.println(arrayList);
        // it is allowing duplicates.
        // it is allowing heterogeneous objects allowed.
        // it maintained insertion order.

        Employee e2= new Employee(113,"kb","TCS");
        Employee e3= new Employee(114,"kb1","Infosys");
        Employee e4= new Employee(115,"kb2","HCL");
        Employee e5= new Employee(116,"kb3","LTI");


        //Generics
        ArrayList<Employee> empList= new ArrayList<Employee>();
       /* empList.add(123);
        empList.add(123.456);
        empList.add(flase);
        empList.add("123");*/
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);


        for(Employee e:empList){
            System.out.println(e);
        }

        System.out.println(empList.get(0));

        empList.remove(e5);
        System.out.println(empList);


    }
}
