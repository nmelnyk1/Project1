package Lesson1;

class NewClass {
    static int age;
    static String name;
    public int variable;

    // static block
    static{
        age = print();
    }

    public static int print(){
        System.out.println(age);
        return 1;
       // show(); cannot use this method as it is non-static
    }
    public void show(){
        System.out.println("No");
    }
}
