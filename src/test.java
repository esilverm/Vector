public class test {
    public static void main(String[] args) {
        Vector t = new Vector(new double[]{2, 2,2});
        Vector tt = new Vector(new double[]{3,3 ,3});
        System.out.println(Vector.add(t, tt).toString());
        System.out.println(Vector.subtract(t,tt).toString());
        System.out.println(Vector.opposite(t).toString());
        double avg = (double[] a) {
            double s = 0;
            for(int i = 0; i < a.length; i++) {
                s+= a[i];
            }
            s = s /a.length;
            return s;
        }
        double mag = () -> {
            double s = 0;
            for(int i = 0; i < 10; i++) {
                s += 2;
            }
            return s/2;
        };
        System.out.println(mag);

    }
}
