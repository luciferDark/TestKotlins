package utils
/**
 * 日志输出工具类
 */
object Log {

    fun logI(msg : Any){
        printMe(msg, "Info")
    }

    fun logD(msg : Any){
        printMe(msg, "Debug")
    }

    fun logW(msg : Any){
        printMe(msg, "Warn")
    }

    fun logE(msg : Any){
        printMe(msg, "Error")
    }

    fun logArrayI(array: IntArray){
        for (index in array){
            logI("index = ${index}, item = ${array[index]}")
        }
    }

    fun  logArrayD(array: IntArray){
        for (index in array.indices){
            logD("index = ${index}, item = ${array[index]}")
        }
    }
    fun  <T>logArrayD(array: Array<T>){
        for (index in array.indices){
            logD("${index} = ${array[index]}")
        }
    }
    fun  logArrayW(array: IntArray){
        for (index in array.indices){
            logW("index = ${index}, item = ${array[index]}")
        }
    }
    fun  logArrayE(array: IntArray){
        for (index in array.indices){
            logE("index = ${index}, item = ${array[index]}")
        }
    }

    fun printMe(msg : Any, tag : String){
        if (null == msg){
            return
        }
        println(TimeUtil.getNow() + "-" + tag + ":\t${msg}")
    }
}