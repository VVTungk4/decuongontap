package bai6chatgpt;

public class Word {
	private int id;
	private String en, vn;

	public Word() {
	}

	public Word(int id, String en, String vn) {
		this.id = id;
		this.en = en;
		this.vn = vn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getVn() {
		return vn;
	}

	public void setVn(String vn) {
		this.vn = vn;
	}

	public void hienThi() {
		System.out.println(id + "." + en + ": " + vn);
	}
}
