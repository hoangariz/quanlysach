public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private tacGia tacgia;

    public Sach(String tenSach, double giaBan, int namXuatBan, tacGia tacgia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacgia = tacgia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public tacGia getTacgia() {
        return tacgia;
    }

    public void setTacgia(tacGia tacgia) {
        this.tacgia = tacgia;
    }

    public void inTenSach() {
        System.out.println(this.tenSach);
    }

    public boolean kiemTraCungNamXuatBan(Sach sachkhac) {
        return this.namXuatBan == sachkhac.namXuatBan;
    }
    public double giaSauKhiGiam(double giamSoPhanTram) {
        return this.giaBan  * (100-giamSoPhanTram) / 100;
    }
}
