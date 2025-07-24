class Person {
    private String name;
    private int age;

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
}

public class testage {
    public static void main(String[] args) {
        Person p = new Person();
        
        // Gán giá trị thông qua setter
        p.setName("Truong");
        p.setAge(25);
        
        // Lấy giá trị thông qua getter
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}