import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Before
    public void setUp(){
        new TicTacToe();
    }


    @Test
     void testGame()
    {

    }

    @Test
    void testInitTable()
    {
        char[][] table = {{'.', '.', '.'},
                          {'.', '.', '.'},
                          {'.', '.', '.'}};
        char[][] unexpected = {{'.', '.', '.'},
                               {'.', '.', '.'},
                               {'.', '.', '.'}};
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.initTable();
        ticTacToe.turnAI(table);

        assertNotSame(unexpected, table);
    }

    @Test
    void testPrintTable()
    {

    }

    @Test
    void testTurnHuman()
    {

    }

    @Test
    void testIsCellValid()
    {
        char[][] table = {{'x', 'x', 'x'},
                          {'o', 'o', 'x'},
                          {'x', 'o', '.'}};
        int x = 2;
        int y = 2;
        boolean expected = true;

        boolean actual = new TicTacToe().isCellValid(x, y, table);

        assertEquals(expected, actual);
    }

    @Test
    void testTurnAI()
    {
        char[][] table = {{'x', 'x', 'x'},
                          {'o', '.', 'x'},
                          {'x', 'o', 'o'}};
        char[][] expected = {{'x', 'x', 'x'},
                             {'o', 'o', 'x'},
                             {'x', 'o', 'o'}};

        new TicTacToe().turnAI(table);

        assertArrayEquals(expected, table);
    }

    @Test
    void testCheckWin()
    {
        char[][] table = {{'x', 'x', 'x'},
                          {'o', 'x', 'o'},
                          {'o', 'o', 'x'}};
        boolean expected = true;

        boolean actual = new TicTacToe().checkWin('x', table);

        assertEquals(expected, actual);
    }

    @Test
    void testIsTableFull()
    {
        char[][] table = {{'x', 'x', 'x'},
                          {'o', 'o', 'x'},
                          {'x', 'o', 'o'}};
        boolean expected = false;

        boolean actual = new TicTacToe().isTableFull(table);

        assertNotEquals(expected, actual);
    }
}