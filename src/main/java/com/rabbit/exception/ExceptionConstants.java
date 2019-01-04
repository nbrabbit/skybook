package com.rabbit.exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionConstants {
	public static Map<Integer, String> EXCEPTION_CODE_MAP  = new HashMap<Integer, String>();
	static {
		EXCEPTION_CODE_MAP.put(new Integer("1001"), "未知错误！");
	}
}
