import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleRotationTest {
    @Test
    public void is(){
        String s = "hello world";
        String t = "worldhello ";
        Boolean result = CircleRotation.is(s,t);
        assertTrue(result);
    }
    @Test
    public void notIs(){
        String s = "hello world";
        String t = "world hello";
        Boolean result = CircleRotation.is(s,t);
        assertFalse(result);
    }
}