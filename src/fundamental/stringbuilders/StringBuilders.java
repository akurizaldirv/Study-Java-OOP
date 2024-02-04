package fundamental.stringbuilders;

import java.lang.StringBuilder;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);

//        Append -> menambahkan data di akhir string
        builder.append(" warga Surabaya");
        printData(builder);

//        Insert -> menyisipkan string pada index tertentu
        builder.insert(5, "semuanya ");
        printData(builder);

//        replace -> mengubah data pada index tertentu
        builder.replace(14, 19, "Penduduk");
        printData(builder);

//        delete -> menghapus data di index tertentu
        builder.delete(4, 13);
        printData(builder);

//        casting menjadi string
        String text = builder.toString();
        System.out.println("\nTeks = " + text);
        System.out.println("Panjang = " + text.length());

        int address = System.identityHashCode(text);
        System.out.println("Address = " + Integer.toHexString(address));

    }

    public static void printData(StringBuilder builder) {
        System.out.println("\nTeks = " + builder);
        System.out.println("Panjang = " + builder.length());
        System.out.println("Kapasitas = " + builder.capacity());

        int address = System.identityHashCode(builder);
        System.out.println("Address = " + Integer.toHexString(address));
    }
}
