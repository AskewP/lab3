import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class LinkedListTests {
  @Test
  public void testAppend() {
    LinkedList list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(4);
    assertEquals(list.length(), 4);
  }
}
