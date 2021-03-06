package com.absurd.np.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by wangwenwei on 16/11/6.
 */
public class P37Test {
    @Test
    public void gcdOf36And63Is9() throws Exception {
        int gcd = P37.gcd(36, 63);
        assertThat(gcd, equalTo(9));
    }
}
