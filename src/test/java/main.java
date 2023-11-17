import com.bst.BST;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class main {
    public static void main(String[] args) throws DepthException, BetweenLevelException {
        BST bst = new BST();
        for (int i = 0; i < 49; i++) {

            bst.insert(-i, true);

        }
        try {
            bst.printBetweenLevel(1,50);
        } catch (BetweenLevelException e) {
            throw new RuntimeException(e);
        }
    }
}
