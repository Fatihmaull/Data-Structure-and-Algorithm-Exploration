class Kendaraan {// merupakan superclass atau induknya
    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak");
    }// method yang di override
}

class Mobil extends Kendaraan {// subclass nya
    @Override
    public void bergerak() {
        System.out.println("Mobil sedang melaju di jalan");
    }// overriding method "bergerak"
}

public class Main {
    public static void main(String[] args) {
        // objek dri class kendaraan
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.bergerak(); // Kendaraan sedang bergerak

        // Membuat objek dari class Mobil (polymorphism overriding)
        Kendaraan kendaraan2 = new Mobil();
        kendaraan2.bergerak(); // Mobil sedang melaju di jalan
    }
}
