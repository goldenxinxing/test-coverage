package ai.test.a;

import ai.gxx.TestA;
import org.junit.Assert;
import org.junit.Test;

public class TestAa {
    @Test
    public void t() {
        System.out.println("start test for A");
        Assert.assertEquals("success", "i'm A", TestA.get());
    }
}
