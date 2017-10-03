public class Angle {

    private double angle;

    public Angle(double a) {
        angle = a;
    }

    public void setAngle(double a) {
        angle = a;
    }

    public double getAngleDeg() {
        return angle;
    }

    public double getAngleRad() {
        return Math.toRadians(angle);
    }

}
