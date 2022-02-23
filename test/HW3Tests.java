import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class HW3Tests {

    @Test
    public void testProblem1Vowels() {
        assertTrue(Problem1.hasManyVowels("aaeeiioouu"));
        assertFalse(Problem1.hasManyVowels("aeiou"));

        assertTrue(Problem1.hasManyVowels("aeiouzzzzzaeiou"));
        assertFalse(Problem1.hasManyVowels("zzzzzzz"));


        assertTrue(Problem1.hasManyVowels("aeiouzzzzzazzezzizzozzu"));
        assertFalse(Problem1.hasManyVowels("aeiouzzzzzazzezzi"));
    }

    @Test
    public void testProblem1Type() {
        assertTrue(Problem1.hasManyOfType("aaeeiioouu", "aeiou", 2));
        assertFalse(Problem1.hasManyOfType("aeiou", "aeiou", 2));
        assertTrue(Problem1.hasManyOfType("aaeeiioouu", "aeiou", 1));

        assertTrue(Problem1.hasManyOfType("aeiouzzzzzaeiou", "z", 5));
        assertFalse(Problem1.hasManyOfType("zzzzzzz", "z", 10));


        assertTrue(Problem1.hasManyOfType("aeiouzzzzzazzezzizzozzu", "aeiouz", 2));
        assertFalse(Problem1.hasManyOfType("b", "a", 1));
    }


    @Test
    public void testProblem2() {
        Problem2FruitStore fruitStore = new Problem2FruitStore();
        FruitType largeApple = new FruitType("Apple", FruitSize.LARGE);
        FruitType smallApple = new FruitType("Apple", FruitSize.SMALL);
        FruitType smallPear = new FruitType("Pear", FruitSize.SMALL);

        fruitStore.addDelivery(largeApple, new Inventory(2, new Date("01-01-2001")));
        fruitStore.addDelivery(largeApple, new Inventory(4, new Date("01-02-2001")));
        fruitStore.addDelivery(smallPear, new Inventory(4, new Date("01-02-2001")));
        fruitStore.addDelivery(smallPear, new Inventory(4, new Date("01-02-2001")));
        fruitStore.addDelivery(smallApple, new Inventory(4, new Date("01-02-2001")));

        assertEquals(4, fruitStore.getInventory(smallApple).itemCount);
        assertEquals(6, fruitStore.getInventory(largeApple).itemCount);
        assertEquals(8, fruitStore.getInventory(smallPear).itemCount);
        assertEquals(new Date("01-01-2001"), fruitStore.getInventory(largeApple).oldestFruit);
    }

    @Test
    public void testProblem3() {
        Node smallTree = new Node(3, new Node(4), new Node(7));
        Node root = new Node(1, new Node(2), new Node(3, smallTree, new Node(6)));

        Problem3.preorderLeaves(root); // 2 4 7 6

        Problem3.inOrderRightLeft(root); // 6 3 7 3 4 1 2


    }

}
