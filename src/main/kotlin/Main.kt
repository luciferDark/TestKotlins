import basicGrammer.BaseGrammer
import utils.Log

fun main(args: Array<String>) {
    testBasicGrammer()
}

fun testBasicGrammer() {
    var baseGrammer : BaseGrammer = BaseGrammer()

    baseGrammer.testBasicType()
    Log.logD("a + b = ${baseGrammer.testFunctionEquire(10 , 21)}")
    baseGrammer.testArray()
}
