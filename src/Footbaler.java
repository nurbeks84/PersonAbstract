public class Footbaler extends Person{
    private int speed;
    private String FootballClub;

    public Footbaler(String name, int age, int weight, int height, String nationality, String country,int speed,String FootballClub) {
        super(name, age, weight, height, nationality, country);
        this.FootballClub=FootballClub;
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFootballClub() {
        return FootballClub;
    }

    public void setFootballClub(String footballClub) {
        FootballClub = footballClub;
    }

    @Override
    public void parents() {

    }

    @Override
    public void city() {

    }
}
