public class Main {
    public static void main(String[] args) {

    Student student = new Student("Nurbolsun",15,50,
            170,"kyrgyz","Kyrgyzstan",2,"IT");
    Student student1 = new Student("Bektur",23,70,
            165,"kyrgyz","Russia",1,"IT");
    Student student2 = new Student("Beknur",17,72,
            163,"kyrgyz","USA",1,"IT");
    Student student3 = new Student("Altynbek",30,75,
            155,"kyrgyz","Kazahstan",2,"IT");
    Student student4 = new Student("Begimai",18,55,
            160,"kyrgyz","Japan",1,"IT");

    Footbaler footbaler = new Footbaler("Xavi",40,70,
            168,"spanish","Spain",78,"Barcelona");
    Footbaler footbaler1 = new Footbaler("Rooney",38,75,
            165,"english","England",80,"MU");
    Footbaler footbaler2 = new Footbaler("Haaland",22,102,
            194,"norwegian","Norway",90,"MC");
    Footbaler footbaler3 = new Footbaler("Zidan",45,74,
            170,"french","France",78,"Real Madrid");
    Footbaler footbaler4 = new Footbaler("Ronaldinho",47,80,
            172,"brazilian","Brazil",78,"Barcelona");
    Person[] people = {student,footbaler,student1,footbaler1,student2,
            footbaler2,student3,footbaler3,student4,footbaler4};
        for (Person ps:people) {
            System.out.println(ps);
        }

    }
}