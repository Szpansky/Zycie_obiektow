package apka;


public class Pojazdy {

    private int maxSpeed = 150;
    private String nazwa = "Taczki";
    private int id;

    public Pojazdy(int maxSpeed, String nazwa) {
        this.maxSpeed = maxSpeed;
        this.nazwa = nazwa;
    }

    public Pojazdy(int maxSpeed, String nazwa, int id) {
        this.maxSpeed = maxSpeed;
        this.nazwa = nazwa;
        this.id = id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Usuwanie Objektu nr: " + id);
    }

    @Override
    public String toString() {
        return "Pojazdy{" +
                "maxSpeed=" + maxSpeed +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
