
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.text.DecimalFormat;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang) throws Exception {
        if (maHang.isEmpty()) {
            throw new Exception("Mã hàng không được để trống!");
        }
        this.maHang = maHang;
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        this(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (!tenHang.isEmpty()) {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (!ngaySanXuat.isAfter(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (!ngayHetHan.isBefore(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }

    public boolean isHetHan() {
        return LocalDate.now().isAfter(ngayHetHan);
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%-20s %-20s %10.2fVND %17s %20s %20s", maHang, tenHang, donGia, dtf.format(ngaySanXuat), dtf.format(ngayHetHan), (isHetHan() ? "Hàng hết hạn" : ""));
    }
}

