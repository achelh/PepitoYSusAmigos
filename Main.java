public class Main {
    public static void main(String[] args) {

        Morthex g1 = new Morthex("Gerald");
        Morthex g2 = new Morthex("Eloi");

        while (g1.esViu() && g2.esViu()) {

            g1.atacar(g2);

            if (g2.esViu()) {
                g2.atacar(g1);
            }
        }

        System.out.println("Mal total fet per " + g1 + ": " + g1.getMalFet());
        System.out.println("Mal total fet per " + g2 + ": " + g2.getMalFet());
    }
}