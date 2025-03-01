public class Display {

    // Attributes
    private float inches;
    private int resolutionX;
    private int resolutionY;

    // Constructors
    public Display() {}
    public Display(float inches, int resolutionX, int resolutionY) {
        this.inches = inches;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    // Sets display size, throws exception if negative
    public void setInches(float inches) throws NegativeNumberException {
        if (inches <= 0) throw new NegativeNumberException();
        this.inches = inches;
    }

    // Sets resolution width, throws exception if negative
    public void setResolutionX(int resolutionX) throws NegativeNumberException {
        if (resolutionX <= 0) throw new NegativeNumberException();
        this.resolutionX = resolutionX;
    }

    // Sets resolution height, throws exception if negative
    public void setResolutionY(int resolutionY) throws NegativeNumberException {
        if (resolutionY <= 0) throw new NegativeNumberException();
        this.resolutionY = resolutionY;
    }

    // Getters
    public float getInches() { return inches; }
    public int getResolutionX() { return resolutionX; }
    public int getResolutionY() { return resolutionY; }
}
