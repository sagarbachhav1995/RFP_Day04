import java.util.Random;
public class SL_Game03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random Dice = new Random();
        int a = Dice.nextInt(6)+1;
        System.out.println("You got: " +a);
        if(a == 1){
            System.out.println("Move one position forward");

        }else if(a == 2){
            System.out.println("Roll Again");
        }else if(a == 3){
            System.out.println("Roll Again");
        }else if (a == 4){
            System.out.println("You Win the Game");
        }else if (a == 5){
            System.out.println("Roll Again");
        }else if (a == 6){
            System.out.println("Roll  Again");
        }else{
            System.out.println("Hang on");
        }
    
	}

}
