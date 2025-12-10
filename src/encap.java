class encap1
{
    private String name;
    private String collageName;
    private int rollNumber;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCollageName() {
        return collageName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }
}
public class encap {
    public static void main(String[] args) {
        encap1 obj=new encap1();
        obj.setName("Abhi");
        obj.setRollNumber(19);
        obj.setCollageName("UVCE");
        obj.setAddress("Bengaluru");

        System.out.println(obj.getName()+" "+obj.getRollNumber()+" "+obj.getCollageName()+" "+obj.getAddress());
    }
}
