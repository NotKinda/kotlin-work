// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Correct median when size=1"{
        median(listOf(4.2f)) shouldBe (4.2f plusOrMinus tolerance)
    }

    "Correct median when size=2"{
        median(listOf(4.0f,2.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "Correct median when size=3"{
        median(listOf(5.0f,9.0f,1.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Correct median when size=4"{
        median(listOf(7.0f,1.0f,9.0f,3.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }
})
