package basicGrammer

import utils.Log

/**
 * 基础语法测试
 */
class BaseGrammer() {

    /**
     * 测试基础类型
     */
    fun testBasicType() {
        val a: Int = 100
        val b: Int = 128

        val boxA: Int? = a
        val boxOtherA: Int? = a

        val boxB: Int? = b
        val boxOtherB: Int? = b

        Log.logD("is boxA == boxOtherA  = ${boxA == boxOtherA}")
        Log.logD("is boxA === boxOtherA  =  ${boxA === boxOtherA}")
        Log.logD("is boxB == boxOtherB  =  ${boxB == boxOtherB}")
        Log.logD("is boxB === boxOtherB  =  ${boxB === boxOtherB}")
        // todo 这里是个坑 系统缓存了IntegerCache [-128,127]的范围在这个范围内的装箱操作是没有的所以 同一性（===）是一致的,系统源码如下
        /*private static class IntegerCache {
            static final int low = -128;
            static final int high;
            static final Integer cache[];

            static {
                // high value may be configured by property
                int h = 127;
                // 省略部分代码......
                high = h;

                cache = new Integer[(high - low) + 1];
                int j = low;
                for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

                // range [-128, 127] must be interned (JLS7 5.1.7)
                assert IntegerCache.high >= 127;
            }

            private IntegerCache() {}
        }*/
        /*      for (i in -127..225 step 7){
                  var c : Int = i
                  val boxC : Int? = c
                  val boxOtherC : Int? = c

                  Log.logD("${i} is boxC == boxOtherC  = ${boxC == boxOtherC}")
                  Log.logD("${i} is boxC === boxOtherC  =  ${boxC === boxOtherC}")
              }*/
    }

    fun testFunctionEquire(a:Int, b:Int) = a + b

    fun testArray(){
        var arr : IntArray = intArrayOf(2,4,123,5,23,5)
        Log.logArrayD(arr)

        var arrB = IntArray(6){ it  * 2 + it * it }
        Log.logArrayD(arrB)

        var arrs : Array<String> = arrayOf("hello", "Sb","you")
        Log.logArrayD(arrs)
        var arrOfInt : Array<Int> = arrayOf(12, 234,5)
        arrOfInt[2] = 1234
        Log.logArrayD(arrOfInt)
    }
}