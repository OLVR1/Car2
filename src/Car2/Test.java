package Car2;

public class Test {

    public static void main(String[] args) {
        Bil b1 = new Bil("Citroën", "[SV 27699]", "rød");
        Bil b2 = new Bil("Citroën", "[SV 27699]", "rød");


        System.out.println(b1 + "\n" + "Serienr: " + b1.getRegno() + "\n" + "Næste ledige serienr: " + b1.getNextregno());
        System.out.println("\n" + b2 + "\n" + "Serienr: " +  b1.getRegno() + "\n" + "Næste ledige serienr: " + b1.getNextregno());

        if (b1.alike(b2))
            System.out.println("\n" + "Bilerne er ens");

        if (b1.equals(b2))
            System.out.println("\n" + "Nummerpladen er ens");

        System.out.println("\n" + "Næste ledige serienr: " + b1.getNextregno());
    }
}

//test11
