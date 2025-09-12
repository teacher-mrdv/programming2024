public class VampireCat extends Cat
{
    private int fangs;

    public VampireCat(String name, int birthYear, int fangs) {
        super(name, birthYear, true, "Black");
        this.fangs = fangs;
    }

    public int getFangs()
    {   return fangs;
    }

    public void setFangs(int fangs)
    {   this.fangs = fangs;
    }

    public String toString() {
        return (super.toString() + "  fangs: " + fangs );
    }
}
