import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class ListTests {
  @Test
  public void filterTestEmpty() {
    List<String> input1 = Arrays.asList("ab", "ba");
    AlwaysTrue sc = new AlwaysTrue();
    List<String> result1 = ListExamples.filter(input1, sc);
    assertEquals(input1.size(), result1.size());

    for (int i = 0; i < input1.size(); i++) {
      assertEquals(input1.get(i), result1.get(i));
    }
  }

  @Test
  public void mergeTestOneEmpty() {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = Arrays.asList("ab");
    List<String> mergedList = ListExamples.merge(list1, list2);
    assertEquals(mergedList.size(), 1);
  }
}
