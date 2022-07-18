
import java.util.Arrays;
import java.util.Random;

public class De {
	Random rand = new Random();
	private int tour = 0;
	private int[] de = { 0, 0 };

	public void lancezLeDe() {
		de[0] = (rand.nextInt(6) + 1);
		de[1] = (rand.nextInt(6) + 1);
		
		
	}

	public int getTour() {
		return tour;
	}

	public void setTour() {
		this.tour++;
	}

	public int[] getDes() {
		return de;
	}
	public int getSommeDes() {
		return de[0]+de[1];
	}

	@Override
	public String toString() {
		return "Des: " + Arrays.toString(de) + "   ";
	}
	
}
