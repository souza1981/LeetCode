public class SpecialPythagoreanTriplet {

    public double solution(double value){
        int a = 1;
        int b = 1;
        boolean found = false;
        double calculo;
        while (true){
            while (true){
                calculo = a + b + Math.sqrt(a * a + b * b);
                if (calculo == value) {
                    found = true;
                    break;
                } else if (calculo > value){
                    b = a + 1;
                    break;
                } else {
                    b++;
                }
            }
            if (found) break;
            a++;
            calculo = a + b + Math.sqrt(a * a + b * b);
            if (calculo > value) break;
        }
        if (found){
            double c = value - a - b;
            return a * b * c;
        }
        return -1;
    }
    /*
    c = sqrt(a * a + b * b)
    a + b + sqrt(a * a + b * b) = 1000


     */
    public static void main(String[] args) {
        SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
        System.out.println(specialPythagoreanTriplet.solution(1000));
    }
}
