public class VampireCat extends Cat {
    private int fangs;

    public VampireCat(String name, int birthYear, int fangs) {
        super(name, birthYear, true, "Black");
        this.fangs = fangs;
    }

    public int getFangs() {
        return fangs;
    }

    public void setFangs(int fangs) {
        this.fangs = fangs;
    }

    public String toString() {
        return (super.toString() + ", Fangs: " + fangs);
    }

    public void eat() {
        System.out.println("Slurp slurp :[");
    }

    public void talk() {
        System.out.println("(Evil meowy laughter)");
    }
}
