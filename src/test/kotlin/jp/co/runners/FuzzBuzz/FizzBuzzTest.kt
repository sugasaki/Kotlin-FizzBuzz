package jp.co.runners.FuzzBuzz


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.fail
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension



//@RunWith(SpringRunner::class)
@ExtendWith(SpringExtension::class) // これを書く
@SpringBootTest
public class FizzBuzzTest {


    @Test
    fun getRedTest2() {
        //Assert.assertEquals("FF0000", Color().getRed())
        throw Exception()
    }

    @Test
    internal fun _1を渡したら文字列1を返す() {

        //前準備
        val fizzbuzz = FizzBuzz()

        //実行

        //検証
        assertEquals("1", fizzbuzz.convert(1))

    }



    @Test
    internal fun test() {
        fail("これは落ちるはず")
    }



/*








@Test
internal fun name() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
*/
}
