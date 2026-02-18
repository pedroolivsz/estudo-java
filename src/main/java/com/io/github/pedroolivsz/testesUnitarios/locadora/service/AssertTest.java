package com.io.github.pedroolivsz.testesUnitarios.locadora.service;

import com.io.github.pedroolivsz.testesUnitarios.locadora.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
    @Test
    public void teste() {
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals("Erro de comparação", 1, 1);
        Assert.assertEquals(0.51234, 0.5132, 0.01);

        Assert.assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer i2 = 5;

        Assert.assertEquals(Integer.valueOf(i), i2);
        Assert.assertEquals(i, i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertNotEquals("bola", "casa");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assert.assertTrue("bola".startsWith("bola"));

        User u1 = new User("User 1");
        User u2 = new User("User 1");
        User u3 = null;

        Assert.assertEquals(u1, u2);

        Assert.assertSame(u2, u2);
        Assert.assertNotSame(u1, u2);

        Assert.assertNull(u3);
        Assert.assertNotNull(u1);
    }
}
