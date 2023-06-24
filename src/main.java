import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Date ngay1 = new Date(20, 7, 2003);
        Date ngay2 = new Date(8, 4, 2003);
        tacGia tacgia1 = new tacGia("xuandieu", ngay1);
        tacGia tacgia2 = new tacGia("tohuu", ngay2);
        Sach sach1 = new Sach("hoangcoder", 20, 2002, tacgia1);
        Sach sach2 = new Sach("hoangariz", 25, 2000, tacgia2);
        sach1.inTenSach();
        System.out.println( sach1.kiemTraCungNamXuatBan(sach2));
        Scanner sc = new Scanner(System.in);
        System.out.println("gia sach sau khi gia la " + sach1.giaSauKhiGiam(10));
    }

}
