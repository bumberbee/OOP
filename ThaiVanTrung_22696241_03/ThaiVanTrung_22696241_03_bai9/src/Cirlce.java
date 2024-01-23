
public class Cirlce {
	private ToaDo tam;
    private double banKinh;

    public Cirlce(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public Cirlce() {
        this.tam = new ToaDo();
        this.banKinh = 0.0;
    }

    public ToaDo getTam() {
        return this.tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return this.banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * Math.pow(this.banKinh, 2);
    }

    @Override
    public String toString() {
        return "Dien tích, chu vi hình tròn tâm " + this.tam.toString() + " có bán kính " + this.banKinh + "m : " + String.format("%.2f", this.tinhDienTich()) + " và " + String.format("%.2f", this.tinhChuVi()) + ".";
    }
}


