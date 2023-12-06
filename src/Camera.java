public class Camera {
    public double XCam;
    public double YCam;

    public double XHero;
    public double YHero;



    public Camera(double XCam, double YCam, double XHero, double YHero) {
        this.XCam = XCam;
        this.YCam = YCam;
        this.XHero = XHero;
        this.YHero = YHero;
    }


    public double getXCam() {
        return XCam;
    }
    @Override
    public String toString(){
        return this.XHero+","+this.XCam;
    }

    public void update(){
        XCam+=10;
    }
}
