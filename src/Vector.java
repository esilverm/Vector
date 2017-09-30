import java.util.ArrayList;

public class Vector {

    private ArrayList<Double> components;
    private double magnitude;

    public Vector() {
        components = new ArrayList<Double>();
    }

    public Vector(double[] d) {
        components = new ArrayList<Double>();
        for(Double comp : d) {
            components.add(comp);
        }
        double mag = (double [] l) -> {
            double s = 0;
            for(int i = 0; i < l.length; i++) {
                s += Math.pow(l[i], 2);
            }
            return Math.sqrt(s)
        };
    }

    public double[] getRawComponents() {
        double[] f = new double[components.size()];
        for(int i = 0; i < components.size(); i++) {
            f[i] = components.get(i);
        }
        return f;
    }

    public void setComponents(double[] f) {
        if(!components.isEmpty()) throw new RuntimeException("Vector already has components");
        for(Double d: f) {
            components.add(d);
        }
    }

    public static Vector subtract(Vector f, Vector s) {
        Vector o = Vector.opposite(s);
        Vector t = Vector.add(f, o);
        return t;
    }


    public static Vector add(Vector f, Vector s) {
        double[] ff = f.getRawComponents();
        double[] ss = s.getRawComponents();
        double[] tt = new double[ff.length];
        for(int i = 0; i < tt.length; i++) {
            tt[i] = ss[i] + ff[i];
        }
        Vector t = new Vector(tt);
        return t;
    }

    public static Vector opposite(Vector f) {
        Vector t = new Vector();
        double[] tt = new double[f.getRawComponents().length];
        for(int i = 0; i < f.getRawComponents().length; i++) {
            tt[i] = f.getRawComponents()[i] * -1;
        }
        t.setComponents(tt);
        return t;
    }

    public String toString() {
        String t = "< ";
        double[] tt = this.getRawComponents();
        for(int i = 0; i < tt.length;i++) {
            t += tt[i] + " ";
        }
        t += ">";
        return t;
    }

}
