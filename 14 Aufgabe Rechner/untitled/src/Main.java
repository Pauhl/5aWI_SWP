public class Main {
    public static void main(String[] args) {

        System.out.println(addieren(new double[]{12, 1}));
        System.out.println(subtrahieren(8.1,6.7));
        System.out.println(multiplizieren(new double[]{6.7,1.2,3}));
        System.out.println(dividieren(56,7));
        System.out.println(tan(2));
        System.out.println(sin(2));
        System.out.println(wurzel(169));

        System.out.println(subtrahieren(tan(3),addieren(new double[]{12, 1})));




    }

    public static double addieren(double[] arr){
    double num=0;
        if(arr.length==1) {
            num = arr[0];

        }
        else {
            for (int i=0;i<arr.length;i++) {
                num+=arr[i];
            }
        }
    return num;
    }

    public static double subtrahieren(double zahl1, double zahl2){

        return zahl1-zahl2;
    }

    public static double multiplizieren(double[] arr){
        double num=1;
        if(arr.length==1) {
            num = arr[0];

        }
        else {
            for (int i=0;i<arr.length;i++) {
                num=num * arr[i];
            }
        }
        return num;
    }

    public static double dividieren(double zahl1, double zahl2){

        return zahl1/zahl2;
    }

    public static double tan(double zahl) {
        return Math.tan(zahl);
    }
    public static double sin(double zahl) {
        return Math.sin(zahl);
    }

    public static double wurzel(double zahl) {
        return Math.sqrt(zahl);
    }

}