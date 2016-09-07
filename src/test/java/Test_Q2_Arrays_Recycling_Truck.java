import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class Test_Q2_Arrays_Recycling_Truck {

    @Test
    public  void testGetRecyclingPerHouse() {

        //Mock the scanner

        int[] crateInput = {4, 3, 6, 2};

        //http://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input
        ByteArrayInputStream in = new ByteArrayInputStream("4\n3\n6\n2\n".getBytes());
        System.setIn(in);

        int[] recycling = Q2_Arrays_Recycling_Truck.getRecyclingPerHouse(4);

        assertArrayEquals(crateInput, recycling);

        System.setIn(System.in);

    }

    @Test
    public void testCalculateTotal() {

    }

    @Test
    public void testCalculateMax() {
    }

    @Test
    public void testCalculateMin() {
    }


    @Test
    public void testCalculateHouseWithMostRecycling() {
    }
}
