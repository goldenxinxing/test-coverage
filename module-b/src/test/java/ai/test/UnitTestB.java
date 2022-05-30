package ai.test;

import ai.gxx.TestB;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestB {
    @Test
    public void t() {
        System.out.println("start test for B");
        Assert.assertEquals("success", "i'm B", TestB.get());
    }
}
