public class HirarrchyConcept {
    public static void main(String[] args) {
        Vijay tvk = new Vijay();
        tvk.batmiton();
        tvk.cricket();
        tvk.vollyball();
    }
}
interface Kishore
{
    void vollyball();
}
interface Prasanth extends Kishore
{
    void cricket();
}
interface Kushal extends Kishore
{
    void batmiton();
}
class Vijay implements Prasanth,Kushal
{
    @Override
    public void cricket() {
        System.out.println("Kishore plays Cricket");
    }

    @Override
    public void batmiton() {
        System.out.println("Kushal Plays Batmiton");
    }

    @Override
    public void vollyball() {
        System.out.println("Prasanth plays vollyball");
    }
}