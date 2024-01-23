
import java.time.LocalDate;
import java.time.Period;

public class Savenote {
    private String maSo;
    private LocalDate ngayMoSo;
    private double soTienGoi;
    private int kyHan;
    private float laiSuat;

    public Savenote() {
        this.maSo = "";
        this.ngayMoSo = LocalDate.now(); // Sử dụng ngày hiện tại
        this.soTienGoi = 0.0;
        this.kyHan = 0;
        this.laiSuat = 0;
    }
    
    

    public Savenote(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
        this.maSo = maSo;
        this.ngayMoSo = ngayMoSo;
        this.soTienGoi = soTienGoi;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    public int tinhSoThangGoiThuc() {
        Period age = Period.between(ngayMoSo, LocalDate.now());
        int dt_nam = age.getYears(); //số năm chênh lệch giữa 2 ngày
        int dt_thang = age.getMonths(); //số tháng chênh lệch giữa 2 ngày
        int soThangGoi = dt_nam * 12 + dt_thang;
        if (soThangGoi % kyHan == 0)
            return soThangGoi;
        else
            return soThangGoi / kyHan * kyHan;
    }

    public double tinhTienLai() {
        int soThangGoiThuc = tinhSoThangGoiThuc();
        return soTienGoi * Math.pow((1 + laiSuat), soThangGoiThuc);
    }

    public String toString() {
        return "STK "  + maSo + '[' + ngayMoSo + "-" + LocalDate.now() + "]" +"KH" + kyHan +"Tháng," 
        + "Số tháng tính lãi" + tinhSoThangGoiThuc() +"Số tiền: " + soTienGoi + "--> tiền lãi: " + tinhTienLai();
                
    }

    public String getMaSo() {
        return this.maSo;
    }

    public LocalDate getNgayMoSo() {
        return this.ngayMoSo;
    }

    public double getSoTienGoi() {
        return this.soTienGoi;
    }

    public int getKyHan() {
        return this.kyHan;
    }

    public float getLaiSuat() {
        return this.laiSuat;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setNgayMoSo(LocalDate ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public void setSoTienGoi(double soTienGoi) {
        this.soTienGoi = soTienGoi;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }
}
