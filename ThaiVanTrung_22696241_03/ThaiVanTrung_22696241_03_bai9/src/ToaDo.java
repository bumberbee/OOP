
public class ToaDo {
	 private String ten;
	    private float x;
	    private float y;

	    public ToaDo(String ten, float x, float y) {
	        this.ten = ten;
	        this.x = x;
	        this.y = y;
	    }

	    public ToaDo() {
	        this.ten = "";
	        this.x = 0.0f;
	        this.y = 0.0f;
	    }

	    public float getX() {
	        return this.x;
	    }

	    public void setX(float x) {
	        this.x = x;
	    }

	    public float getY() {
	        return this.y;
	    }

	    public void setY(float y) {
	        this.y = y;
	    }

	    public String getTen() {
	        return this.ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }
	    @Override
	    public String toString() {
	        return this.ten + "(" + this.x + ", " + this.y + ")";
	    }
}
