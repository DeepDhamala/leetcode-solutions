import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
void merge() {
    MedianSolution solution1 = new MedianSolution();
    int[] result = solution1.merge(new int[]{1, 3}, new int[]{2});
    assertArrayEquals(new int[]{1, 2, 3}, result);
}

}
