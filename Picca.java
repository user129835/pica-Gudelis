
import java.util.ArrayList;

public class Picca {

	public static void main(String[] args) {}
	// 4. Masiva izveide un kodu aprekinasana
		private String izmers;
	    private ArrayList<String> Piedevas;
	    
	    public String dabIzm() {
	        return izmers;
	    }

	    public void uzIzm(String size) {
	        this.izmers = size;
	    }

	    public ArrayList<String> dabPiedevas() {
	        return Piedevas;
	    }

	    public void arPiedevu(ArrayList<String> Piedevas) {
	        this.Piedevas = Piedevas;
	    }

	    public String toString() {
	        return this.izmers + " pica ar " + this.dabPiedevas();
	    

	    }{

}
}
