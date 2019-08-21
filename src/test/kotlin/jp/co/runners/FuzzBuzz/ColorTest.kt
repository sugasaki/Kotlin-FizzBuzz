package jp.co.runners.FuzzBuzz;


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension



@ExtendWith(SpringExtension::class) // これを書く
@SpringBootTest
public class ColorTest {

    @BeforeEach // 2
    fun setup() {
        // do something
    }

    @Test
    fun getRedTest() {
        val expected = "FF0000"
        val actual =  Color().getRed()
        assertEquals(expected, actual)
    }


    @Test
    fun getRedTest2() {
        //Assert.assertEquals("FF0000", Color().getRed())
        throw Exception()
    }

}
