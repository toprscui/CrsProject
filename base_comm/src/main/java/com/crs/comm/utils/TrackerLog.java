package com.crs.comm.utils;

import android.util.Log;

/**
 * Time: 2020/7/7
 * Author: CRS
 * Description:
 */
public class TrackerLog {

    public static boolean DEBUG_TRACK_LOG = true;

    public static String getFileLineMethod() {
        if (!DEBUG_TRACK_LOG) {
            return "";
        }
        StackTraceElement traceElement = new Exception().getStackTrace()[1];
        StringBuilder toStringBuffer = new StringBuilder("[")
                .append("TrackerLog").append(" | ")
                .append(traceElement.getFileName()).append(" | ")
                .append(traceElement.getLineNumber()).append(" | ")
                .append(traceElement.getMethodName()).append("]");
        return toStringBuffer.toString();
    }

    public static void v(String tag, String log) {
        if (DEBUG_TRACK_LOG) {
            Log.v(tag, log);
        }
    }

    public static void i(String tag, String log) {
        if (DEBUG_TRACK_LOG) {
            Log.i(tag, log);
        }
    }

    public static void e(String tag, String log) {
        if (DEBUG_TRACK_LOG) {
            Log.e(tag, log);
        }
    }

    public static void e(String tag, String log, Throwable throwable) {
        if (DEBUG_TRACK_LOG) {
            Log.e(tag, log, throwable);
        }
    }

    public static void d(String tag, String log) {
        if (DEBUG_TRACK_LOG) {
            Log.d(tag, log);
        }
    }

    public static void w(String tag, String log) {
        if (DEBUG_TRACK_LOG) {
            Log.w(tag, log);
        }
    }
}
