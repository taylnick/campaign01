package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.SolitaireDecrypt;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Isaac Griffith
 */
public class SolitaireDecryptTest {

    @Test
    public void testExecute() {
        SolitaireDecrypt decrypt = new SolitaireDecrypt("data/deck1.txt");
        try {
            List<String> encrypted = Files.readAllLines(Paths.get("data/encrypted.txt"));
            List<String> decrypted = Files.readAllLines(Paths.get("data/decrypted.txt"));

            for (int i = 0; i < encrypted.size(); i++) {
                String result = decrypt.execute(encrypted.get(i));
                assertEquals(result, decrypted.get(i));
            }
        } catch (IOException e) {
            fail();
        }
    }
}
