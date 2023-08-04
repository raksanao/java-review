import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
       students.add(new Student(1,"Sofia"));
       students.add(new Student(2,"Omar"));
       students.add(new Student(3,"Layla"));
        System.out.println("students = " + students);
        for (Student each: students) {
            System.out.println("______For each Loop______" + each);
        }
            System.out.println("---------For Loop --------");


            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
                System.out.println("--------Iterator_________");

          Iterator iter=students.listIterator();
          while (iter.hasNext()){
              System.out.println( iter.next());

            }
          //Backward ieterator
        System.out.println("backward iterator");
          while (((ListIterator<?>)iter).hasPrevious()){
              System.out.println(((ListIterator<?>)iter).previous());

        }

         //3 for each loop
        System.out.println("<<<<<<<<Print for each loop>>>>>>>>>>>");
          for(Student student:students) System.out.println("student = " + student);
//4. lambda

        System.out.println("<<<<<<<Lambda>>>>>>>>>>>");
        students.forEach(student -> System.out.println(student));

    //sorting elements in list
      Collections.sort(students,new sortByIdDes());
        System.out.println(students);

Collections.sort(students,new sortByNameDes());
        System.out.println("students = " + students);
    }
    static class sortByIdDes implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }
  static class sortByNameDes implements  Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareToIgnoreCase(o1.name);
            }
        }

}


