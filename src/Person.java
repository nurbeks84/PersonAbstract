public abstract class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String nationality;
    private String country;

    public abstract void parents();
    public abstract void city();

    public Person(String name, int age, int weight, int height, String nationality, String country) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.nationality = nationality;
        this.country = country;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", nationality='" + nationality + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
