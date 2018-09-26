package com.study.chapter5_7;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * 
 * @ClassName: ObjectAnalyzer
 * @Description: TODO(P200)
 * @author X-Dragon
 * @date 2018��9��26�� ����6:56:16
 *
 */
public class ObjectAnalyzer {
	private ArrayList<Object> visited = new ArrayList<>();

	/**
	 * Converts an object to String representation that lists all fields @Title:
	 * toString @Description: TODO(������һ�仰�����������������) @param @param
	 * obj @param @return ���� @return String �������� @throws
	 */
	public String toString(Object obj) {
		// ���objΪ��
		if (obj == null)
			return "null";
		// ���ArrayList����obj
		if (visited.contains(obj))
			return "...";
		visited.add(obj);
		Class c1 = obj.getClass();
		// �����String����
		if (c1 == String.class)
			return (String) obj;
		if (c1.isArray()) {
			String r = c1.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(obj); i++) {
				if (i > 0)
					r += ",";
				Object val = Array.get(obj, i);
				if (c1.getComponentType().isPrimitive())
					r += val;
				else
					r += toString(val);
			}
			return r + "}";
		}

		String r = c1.getName();
		// inspect the fields of this class and all superclasses
		do {
			r += "[";
			Field[] fields = c1.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			// get the names and values of all fields
			for (Field field : fields) {
				if (!Modifier.isStatic(field.getModifiers())) {
					if (!r.endsWith("["))
						r += ",";
					r += field.getName() + "=";

					try {
						Class t = field.getType();
						Object val = field.get(obj);
						if (t.isPrimitive())
							r += val;
						else
							r += toString(val);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
			r += "[";
			c1 = c1.getSuperclass();

		} while (c1 != null);
		return r;
	}
}
