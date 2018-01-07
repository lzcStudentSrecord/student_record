package com.lzlz.student.record.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.lzlz.student.record.entiy.Credit;
import com.lzlz.student.record.entiy.Criticism;
import com.lzlz.student.record.entiy.GeneralCertificate;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.StudentTextbook;
import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.CreditService;
import com.lzlz.student.record.service.CriticismService;
import com.lzlz.student.record.service.GeneralCertificateService;
import com.lzlz.student.record.service.ProfessCertificateService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.service.StudentTextbookService;
import com.lzlz.student.record.service.WellService;

public class ExcelProcess {
	/**
	 * 学生excel处理的方法（已检测）
	 * 
	 * @param studentService
	 * @param is
	 * @param classno
	 * @return
	 */
	public static String studentProcess(StudentService studentService, InputStream is, long classno) {
		String title = "学号学生姓名性别年级班级专业家庭住址状态";
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<Student> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 8; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 8);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本必须为数字";
				else if (!rowstr[2].matches("男|女"))
					return "第" + (i + 1) + "行," + 'C' + "列的文本必须为男或女";
				else if (!rowstr[3].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'D' + "列的文本必须为数字";
				else if (!rowstr[4].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'E' + "列的文本必须为数字";
				else if (!rowstr[7].matches("在校|休学|退学"))
					return "第" + (i + 1) + "行," + 'H' + "列的文本必须为在校、休学或者退学";
				else if (studentService.getStudentBySno(Long.parseLong(rowstr[0])) != null)
					return "第" + (i + 1) + "行,1列的学号已存在";
				else {
					Student s = new Student(Long.parseLong(rowstr[0]), rowstr[1], rowstr[2],
							Integer.parseInt(rowstr[3]), Integer.parseInt(rowstr[4]), rowstr[5], rowstr[6], null, null,
							null, null, classno, rowstr[7]);
					list.add(s);
				}
			}
			int ret = studentService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

	/**
	 * 
	 * @param creditService
	 * @param is
	 * @return
	 */
	public static String creditProcess(CreditService creditService, InputStream is) {
		String title = "学号课程名称类型加分情况";
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<Credit> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 4);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本必须为数字";
				else if (!rowstr[2].matches("必修|选修|公选课"))
					return "第" + (i + 1) + "行," + 'B' + "列的文本必须为必修、选修或者公选课";
				else if (!rowstr[3].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'D' + "列的文本必须为数字";
				else {
					Credit credit = new Credit(0, Long.parseLong(rowstr[0]), rowstr[1], rowstr[2],
							Integer.parseInt(rowstr[3]));
					list.add(credit);
				}
			}
			int ret = creditService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

	/**
	 * 
	 * @param wellService
	 * @param is
	 * @param type
	 * @return
	 */
	public static String wellProcess(WellService wellService, InputStream is) {
		String title = "学号时间名称类型";
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<Well> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 4);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("\\d+"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本只能为数字";
				else if (!rowstr[1].matches("\\d{4}-(0\\d|\\d|1[0-2])-(0\\d|\\d|[1-2]\\d|3[0-1])"))
					return "第" + (i + 1) + "行," + 'B' + "列的文本请输入YYYY/MM/DD格式的时间";
				else {
					Well w = new Well(0, Long.parseLong(rowstr[0]), rowstr[1], rowstr[3], rowstr[2]);
					list.add(w);
				}
			}
			int ret = wellService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

	public static String criticismProcess(CriticismService criticismService, InputStream is) {
		String title = "学号时间(学期)原因通报类型处分";
		System.out.println("---------");
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<Criticism> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 5; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 5);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本必须为数字";
				else {
					Criticism criticism = new Criticism(0, Long.parseLong(rowstr[0]), rowstr[1], rowstr[2], rowstr[3],
							rowstr[4]);
					list.add(criticism);
				}
			}
			int ret = criticismService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

	public static String generalCertificateProcess(GeneralCertificateService generalCertificateService,
			InputStream is) {
		String title = "学号类别通过时间通过成绩";
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<GeneralCertificate> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 4);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本必须为数字";
				else if (!rowstr[1].matches("计算机一级|计算机二级|计算机三级|计算机四级|计算机五级|高职高专英语|CET|普通话"))
					return "第" + (i + 1) + "行," + 'B' + "列的文本必须为计算机一级、计算机二级、计算机三级、计算机四级、计算机五级、高职高专英语、CET或者普通话";
				else if (!rowstr[2].matches("\\d{4}-(0\\d|\\d|1[0-2])-(0\\d|\\d|[1-2]\\d|3[0-1])"))
					return "第" + (i + 1) + "行," + 'C' + "列的文本请输入YYYY-MM-DD格式的时间";
				else if (!rowstr[3].matches("\\d{1,3}|\\d{1,3}.\\d"))
					return "第" + (i + 1) + "行," + 'D' + "列文本必须是数字或者一位小数的格式";
				else {
					GeneralCertificate generalCertificate = new GeneralCertificate(0, Long.parseLong(rowstr[0]),
							rowstr[1], rowstr[2], Float.parseFloat(rowstr[3]));
					list.add(generalCertificate);
				}
			}
			int ret = generalCertificateService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

	public static String studentTextbookProcess(StudentTextbookService studentTextbookService, InputStream is) {
		String title = "学号教材名称教材数量价格";
		try {
			Workbook wk = new HSSFWorkbook(is);
			Sheet sheet = wk.getSheetAt(0);
			List<StudentTextbook> list = new ArrayList<>();
			if (sheet == null)
				return "请上传正确的文件";
			Row row = sheet.getRow(0);
			if (row == null)
				return "请上传正确的文件";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++)
				sb.append(row.getCell(i));
			if (!sb.toString().equals(title))
				return "你的标题不正确,标题请根据模板来设定";
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row rowtemp = sheet.getRow(i);
				String[] rowstr = CustomerUtil.getRowString(rowtemp, 4);
				if (rowstr == null)
					return "第" + (i + 1) + "行的数据中不能有空";
				int ret = CustomerUtil.strIsEmpty(rowstr);
				char col = 'A';
				col += ret;
				if (ret != -1)
					return "第" + (i + 1) + "行," + col + "列的文本有问题";
				else if (!rowstr[0].matches("[0-9]*"))
					return "第" + (i + 1) + "行," + 'A' + "列的文本必须为数字";
				else if (!rowstr[2].matches("\\d+"))
					return "第" + (i + 1) + "行," + 'C' + "列文本必须是数字";
				else if (!rowstr[3].matches("\\d+.\\d{1,2}|\\d+"))
					return "第" + (i + 1) + "行," + 'D' + "列文本必须是数字或者两位小数";
				else {
					StudentTextbook st = new StudentTextbook(0, Long.parseLong(rowstr[0]), rowstr[1],
							Integer.parseInt(rowstr[2]), Float.parseFloat(rowstr[3]), "未确认");
					list.add(st);
				}
			}
			int ret = studentTextbookService.insertByList(list);
			if (ret != 0)
				return "添加成功";
			else
				return "服务器出错";
		} catch (IOException e) {
			e.printStackTrace();
			return "服务器出错";
		}
	}

}
