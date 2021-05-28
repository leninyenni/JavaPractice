package javaLearning.langPackage;

public class Student {
    String name;
    int rollno;

    Student(String name, int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }

    public boolean equals(Object o)
    {
        try {
            String name1= this.name;
            int rollno1= this.rollno;

            Student s= (Student) o;
            String name2= s.name;
            int rollno2=s.rollno;

            if (name1.equals(name2) && rollno1==rollno2)
            {
                return true;
            }
            else {
                System.out.println("came here");
                return false;
            }
        } catch (ClassCastException e) {
            System.out.println("class cast");
            System.out.println(e);
            return false;
        }
        catch (NullPointerException n)
        {
            System.out.println("null point");
            return false;
        }
    }

    public static void main(String[] args) {
        Student s1= new Student("vijay",100);
        Student s2= new Student("kumar",100);
        Student s3= new Student("ramu",100);
        Student s4= new Student("vijay",100);
        Student s5=s4;
       /* System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));*/
        System.out.println(s1.equals("vijay"));
        System.out.println(s1.equals(null));
    }


}
