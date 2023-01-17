package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {5, 8, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {0, -1, 14, 9, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 0, 9, 11, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {-2, 31, 4, -1, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-2, -1, 0, 4, 5, 31};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {0, 0, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 0, 0};
        assertThat(result).containsExactly(expected);
    }
}