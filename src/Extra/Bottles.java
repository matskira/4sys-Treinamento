package Extra;
/**
 * 99 bottles music
 * @author mpoda
 * @since 12/02/2020
 * @version 0.1
 */
public class Bottles {
	
	public static void main(String[] args) {
		int bottle = 99;
		String name = "bottles";
		while (bottle > 0){
			if (bottle == 1){
				name = "bottle";
				System.out.println(bottle + " " + name + " off beer on the wall");
			}else{
				System.out.println(bottle + " " + name + " off beer on the wall");
				System.out.println(bottle + " " + name + " off beer");
				System.out.println("Take one down, pass it around");
				bottle -=1;
			}
		}
		
	}
}
