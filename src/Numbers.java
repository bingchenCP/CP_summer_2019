public class Numbers {

    public static void main(String[] args) {
        float fl = 455.3;
        double d1 = fl;
        //float f2 = d1;

        int a = 6;
        long b = a;
        int c = Long.valueOf(b).intValue();

        Long bb = Long.valueOf(a);
        int cc = bb.intValue();

        int i = 0;
        i++; // i = i + 1;
        i--; // i = i - 1;
        i = 8;
        a = i++;
        System.out.println(a);

        i = 8;
        a = ++i;
        System.out.println(a);

        double res = Math.pow(Math.PI, 2);
        System.out.println(res);

        a = i % 7;
        System.out.println(a);



    }
}
