package Practice1;

public class Resume {
    private String name;
    private int age;

    public Resume(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){

        return "My name is "+ name+",my age is "+age;
    }
}
