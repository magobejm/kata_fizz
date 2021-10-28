package com.example.TDD.FizzBuzz

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class FizzBuzzTest {
    var fizzBuzz: FizzBuzz =
        FizzBuzz()


    @Test
    @Throws(Exception::class)
    fun shouldReturnEmpty() {
        assertArrayEquals(ARRAY_EMPTY, fizzBuzz.filter(intArrayOf()))
    }


    companion object {
        private val ARRAY_EMPTY = arrayOfNulls<Any>(0)
    }
}