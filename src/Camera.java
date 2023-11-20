public class Camera {
    public double XCam;
    public double YCam;

    public double XHero;
    public double YHero;
    double vx = 1; // camera velocity



    public Camera(double XCam, double YCam, double XHero, double YHero) {
        this.XCam = XCam;
        this.YCam = YCam;
        this.XHero = XHero;
        this.YHero = YHero;
    }

    public double getXHero() {
        return XHero;
    }

    public double getXCam() {
        return XCam;
    }
    @Override
    public String toString(){
        return this.XHero+","+this.XCam;
    }
    /*public void update(long deltaTime){
        final double k = 0.1;  // spring constant
        final double m = 1.0;  // mass
        final double f = 0.8;  // damping coefficient
        double ax = (k / m) * (XHero - XCam) + (f / m) * vx;
        vx = ax * deltaTime - vx;
        XCam = vx * deltaTime - XCam;
    }*/
    public void update(){
        XCam+=5;
    }
}
