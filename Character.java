public class Character {

    int index;
    String binaryRepresentation;
    char letter;

    Character(char letter){
        this.letter = letter;
        this.binaryRepresentation = Integer.toBinaryString(letter);
        this.index = (int)letter - 64;
    }

    public char getLetter(){
        return this.letter;
    }

    public String getBinary(){
        return this.binaryRepresentation;
    }

    public int getIndex(){
        return this.index;
    }
}
