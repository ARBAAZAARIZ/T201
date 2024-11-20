package SortedSetCollection;

public class Employee implements Comparable {

   private int id;
   private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    if previous id=1
//            current id = 2
//                    then this.id is 2
//    and what we are passing to compareTo object is previous object

    @Override
    public int compareTo(Object o) {
        Employee employee=(Employee) o;
        if( Integer.compare(this.id, employee.getId()) >=0){
            return +1;
        } else if (Integer.compare(this.id, employee.getId()) < 0) {
            return -1;
        }else{
          return this.name.compareTo(employee.name);
        }
    }

        @Override
        public String toString () {
            return "id : " + id + "  name : " + name;
        }


}
