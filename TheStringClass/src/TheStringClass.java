import java.util.Scanner;
public class TheStringClass {

	public static boolean forgivingPrompt(String question) {
		System.out.println(question);
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		String[] pos = {"y", "yes", "yep"};
		String[] neg = {"n", "no", "nope"};
		response = response.toLowerCase();
		
		int c = 0;
		int i = 0;
		
		while (c < 4) {
		if (c == 3) {
			c = 0;
			System.out.println (question);
			response = in.nextLine();
			}
		else if (response.equals(neg[c])){
			i = 2;
			break;
		}
		else if (response.equals(pos[c])) {
			i = 1;
			break;
			
			}
		else{
			c++;
			}
		}
		if (i == 1){
			System.out.println ("True");
			return true;
		}
		else{
			System.out.println ("False");
			return false;
		}
	}
	public static void main(String[] args) {
		
		forgivingPrompt("Is today Tuesday?");
			
		
	}

}
