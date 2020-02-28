package org.jb.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Test1 {
    @Test
    fun testZero() {
        assertEquals(addZero(5), 5 * get10())
    }
}