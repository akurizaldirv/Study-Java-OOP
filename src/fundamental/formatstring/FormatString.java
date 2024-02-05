package fundamental.formatstring;

public class FormatString {
    public static void main(String[] args) {
        String nama = "Udin";
        Integer umur = 17;
        Double berat = 17.5;

//        Halo, nama saya udin, umur saya 17, berat saya 17.5 kg
        System.out.printf("Halo, nama saya %s, umur saya %d, berat saya %f kg\n", nama, umur, berat);

//        conversion : f=floating point, d=desimal, c=characer, s=string, b=boolean
//        struktur format : %[argumen_index$][flags][width][.precision][conversion]

//        [argumen_index$]
        System.out.println("\n[argumen index $]");
        System.out.printf("Halo, nama saya %1$s, sejak kecil saya dipanggil %1$s", nama);
        System.out.printf("\nHalo %1$s, berapa umur kamu?\n%1s menjawab : umur saya %2$d\nWah masih muda ya, %2$d", nama,umur);

//        [flags]
        int a = 10;
        int b = 12;
        int hasil = a + b;
        System.out.printf("\n%d + %d = %+15d", a, b, hasil);

    }
}
