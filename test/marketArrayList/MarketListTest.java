package marketArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarketListTest {
    MarketList marketList;
    @BeforeEach
    void setUp(){
        marketList = new MarketList();
    }

    @Test
    public void testThatListIsEmpty(){
        marketList.isEmpty();
        assertTrue(true);
    }

    @Test
    public void testThatMyListIsNotEmptyAfterAddingAnItem(){
        marketList.addToList("garri");
        assertFalse(marketList.isEmpty());

    }

    @Test
    public void testThatICanGetItemByTheIndex(){
        marketList.addToList("garri");
        marketList.addToList("oil");
        assertEquals("oil",marketList.getIndexOfItem(1));
    }

    @Test
    public void testThatICanRemoveItemFromMyList(){
        marketList.addToList("garri");
        marketList.addToList("oil");
        marketList.addToList("fish");
        assertTrue(marketList.removeItem("oil"));
        assertEquals("fish", marketList.getIndexOfItem(1));
    }

    @Test
    public void testThatMyListContainsWhatIAddToIt(){
        marketList.addToList("garri");
        marketList.addToList("oil");
        assertTrue(marketList.containsItem("oil"));
    }

    @Test
    public void testThatICanClearAllItemInMyList(){
        marketList.addToList("garri");
        marketList.addToList("oil");
        marketList.addToList("crayfish");
        assertEquals(0,marketList.clearAllItem(0));

    }

    @Test
    public void testThatICanCheckTheSizeOfItemsInMyList(){
        marketList.addToList("garri");
        marketList.addToList("oil");
        marketList.addToList("crayfish");
        marketList.addToList("turkey");
        assertEquals(4,marketList.sizeOfList());
    }
}

