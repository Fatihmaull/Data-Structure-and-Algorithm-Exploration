public class Calculator {
    public int add(int a, int b) {
        return a + b;
    } //untuk nambahin 2 integer, parameternya 2 int
    public int add(int a, int b, int c) {
        return a + b + c;
    }// untuk nambah 3 integer, beda parameter dgn yg sebelumnya
    public double add(double a, double b) {
        return a + b;
    } //untuk nambahin double, beda jenis parameter yaitu double, parameter sblumnya int
    public String add(String a, String b) {
        return a + b;
    }// beda parameter yaitu string, fungsinya utk menggabungkan 2 string

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("hasil tambah 2 integer: " + calc.add(5, 10)); //15
        System.out.println("tambahan dari 3 integer: " + calc.add(5, 10, 15)); //30
        System.out.println("Tambahan dua tipe data double: " + calc.add(2.5, 3.7)); //6.2
        System.out.println("Dua String Digabungkan: " + calc.add("Hello ", "World")); //Hello World
    }
}
