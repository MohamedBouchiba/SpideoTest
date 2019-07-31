import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void maxDuffelBagValue() throws Exception {

        List<CakeType> cakeTypes = Arrays.asList(
                new CakeType(7, 160),
                new CakeType(3, 90),
                new CakeType(2, 15));
        int res = Main.maxDuffelBagValue(cakeTypes,20);

        Assert.assertEquals(555,res);
    }


}