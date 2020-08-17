class Math {

    private static final double PI = 3.14;

    static int sum(int ... values) {
        int sum = 0;
        for(int value : values){
            sum+=value;
        }
        return sum;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
