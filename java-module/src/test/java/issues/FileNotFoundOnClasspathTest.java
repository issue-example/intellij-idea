package issues;


import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class FileNotFoundOnClasspathTest {
    @Test
    public void shouldFindFile() throws Exception {
        File file = new ClassPathResource("file-to-find.txt").getFile();

        assertThat(file).exists();

    }

}
