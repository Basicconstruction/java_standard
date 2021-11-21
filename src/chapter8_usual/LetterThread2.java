package chapter8_usual;

public class LetterThread2 implements Runnable{
    private char letter;
    private int num;
    public LetterThread2 (char letter,int num){
        this.letter =letter;
        this.num =num;
    }
    public void run() {
        for(int i=0;i<num;i++){
            System.out.print(letter);
        }
        System.out.println();
    }
}