import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    Plane plane;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);

    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(700, PlaneType.getCapacity);

    }


}
