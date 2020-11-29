
package pbo10119012latihan63;

/**
 *   NAMA   : DAMAI SAPUTRA LAOLI
 *   KELAS  : IF-1
 *   NIM    : 10119012
 * @author damai
 */
public class PBO10119012Latihan63 {

    
    public static void main(String[] args) {
        Koordinat koor1 = new Koordinat(2,10,5,7);
        int gradien1 = koor1.hitungGradien();
        System.out.println("Garis yang melalui titik (" + koor1.getX1() + "," + koor1.getY1() + ") dan (" + koor1.getX2() + "," + koor1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien1);

        Koordinat koor2 = new Koordinat(5,1,3,12);
        int gradien2 = koor2.hitungGradien();
        System.out.println("Garis yang melalui titik (" + koor2.getX1() + "," + koor2.getY1() + ") dan (" + koor2.getX2() + "," + koor2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien2);
    }
}
