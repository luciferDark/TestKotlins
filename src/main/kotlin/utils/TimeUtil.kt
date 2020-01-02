package utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * 时间辅助工具类
 */
object TimeUtil {
    val TIME_FORMAT_NORMAL : String = "yyyy-MM-dd HH:mm:ss.SSS"

    /**
     * 获取当前时间
     * 格式 yyyy-MM-dd HH:mm:ss.SSS
     */
    fun getNow() : String{
        return SimpleDateFormat(TIME_FORMAT_NORMAL).format(Date())
    }
}