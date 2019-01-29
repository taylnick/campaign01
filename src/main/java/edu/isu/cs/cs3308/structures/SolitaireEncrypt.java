package edu.isu.cs.cs3308.structures;

import edu.isu.cs.cs3308.structures.impl.CircularyLinkedList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SolitaireEncrypt {

    public SolitaireEncrypt(String s){
        SolitaireEndcrypt(s);
    }

    public CircularyLinkedList<Integer> SolitaireEndcrypt(String path){
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] integerContent = content.split(" ");

        CircularyLinkedList deck = new CircularyLinkedList();

        for(int i = 0; i < content.length(); i++){
            deck.addLast(Integer.parseInt(integerContent[i]));
        }

        return deck;
    }

    public String execute(String code){
        return code;
    }
}
