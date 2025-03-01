public class Camera {

    // Resolution attributes
    private int resolutionX;
    private int resolutionY;

    // Constructors
    public Camera() {}
    public Camera(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    // Setters, throws exception if negative
    public void setResolutionX(int resolutionX) throws NegativeNumberException {
        if (resolutionX > 0) {
            this.resolutionX = resolutionX;
        } else {
            throw new NegativeNumberException();
        }
    }
    public void setResolutionY(int resolutionY) throws NegativeNumberException {
        if (resolutionY > 0) {
            this.resolutionY = resolutionY;
        } else {
            throw new NegativeNumberException();
        }
    }

    // Getters
    public int getResolutionX() { return this.resolutionX; }
    public int getResolutionY() { return this.resolutionY; }
}
