package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @Test
    void testAdd(){
        //this test gets used when add() gets called
        assertEquals(2,myCalc.add(1,1));
    }

    @AfterEach
    void tearDown() {
    }
}