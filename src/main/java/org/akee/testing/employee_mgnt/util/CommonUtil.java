package org.akee.testing.employee_mgnt.util;

import java.util.List;

public class CommonUtil {

	public static boolean checkList(List<?> dataList) {
		if(dataList != null && dataList.size() > 0) {
			return true;
		}
		return false;
	}

}
