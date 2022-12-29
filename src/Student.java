public class Student extends Person{

    private int level;
    private String faculty;

    public Student(String name, int age, int weight, int height, String nationality, String country,int level,String faculty) {
        super(name, age, weight, height, nationality, country);
        this.faculty=faculty;
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    @Override
    public void parents() {
        
    }

    @Override
    public void city() {

    }
}
