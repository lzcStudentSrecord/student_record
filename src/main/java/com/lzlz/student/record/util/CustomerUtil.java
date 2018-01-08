package com.lzlz.student.record.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class CustomerUtil {
	/**
	 * 计算出数据库limit的第一个参数(通过当前页数和一次查多少个)
	 * 
	 * @param curpage
	 *            当前页
	 * @param count
	 *            一页多少个
	 * @return
	 */
	public static int getFirstValue(int curpage, int count) {
		return curpage * count - count;
	}

	/**
	 * 计算页数通过所有的记录数
	 * 
	 * @param allcount
	 *            记录总数
	 * @param count
	 *            一页多少条记录
	 * @return
	 */
	public static int getPageByCount(int allcount, int count) {
		return allcount % count == 0 ? allcount / count : allcount / count + 1;
	}

	public static int strIsEmpty(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null || str[i].equals(""))
				return i;
		}
		return -1;
	}

	public static String[] getRowString(Row row, int count) {
		String[] str = new String[count];
		for (int i = 0; i < count; i++) {
			Cell cell = row.getCell(i);
			if (cell == null){
				System.out.println(i);
				return null;
			}
			if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					str[i] = new SimpleDateFormat("YYYY-MM-dd").format(date);
				} else {
					cell.setCellType(Cell.CELL_TYPE_STRING);
					str[i] = cell.getStringCellValue();
				}
			} else {
				cell.setCellType(Cell.CELL_TYPE_STRING);
				str[i] = cell.getStringCellValue();
			}
		}
		return str;
	}

}
