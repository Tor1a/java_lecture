package exec;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {}
	public Song(int year,String country, String artist,String title ) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
	public static void main(String[] args) {
		Song mySong = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		mySong.show();
	}
}
