package ppms.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.transaction.Transactional;

import ppms.daoimpl.BaseDaoImp;
import ppms.gason.adapter.TargetStrategy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * json转换类,实现成员变量内有代理对象的转换在查找和一些代理集合的设null操作后转换
 * @author shark
 * @update 2015下午6:29:38
 * @function
 *
 */
public class ToJsonUtil {

	/**
	 * 要转成json的成员变量名数组
	 */
	private String[] fieldNames;
	/**
	 * 装换对象的字节码
	 */
	private Class<?> clazz;
	/**
	 * json根名
	 */
	private String rootName;
	/**
	 * 标记是否深层再赋值标记
	 */
	private boolean flag;

	/**
	 * 设置要转换成json的成员变量数组和要转换对象的字节码
	 * 
	 * @param fieldNames
	 * @param clazz
	 */
	
	public ToJsonUtil setFieldToJson(String[] fieldNames) {

		this.fieldNames = fieldNames;
		
		return this;
	}

	/**
	 * 设置要执行的hsql语句
	 * 
	 * @param hsql
	 */
	

	/**
	 * 将List打包成json数组
	 * @param list
	 * @param dao
	 * @return
	 */
	@Transactional
	public <T> String toJson(Map<String, List<T>> map ,BaseDaoImp dao) {

		try {
			List<T> list=null;
			for (Entry<String, List<T>> entry : map.entrySet()) {
				
				list=entry.getValue();
				
				clazz=list.get(0).getClass();
				if (fieldNames == null) {
					List<T> newObjs = new ArrayList<T>();
					Object newObject;
					for (Object object : list) {
						newObject =clazz.newInstance();
						// 获取Hibnerate实体类的成员变量
						Field[] fields = clazz.getDeclaredFields();

						for (Field field : fields) {

							String fieldName = field.getName();
							fieldName = fieldName.replaceFirst(
									fieldName.substring(0, 1),
									fieldName.substring(0, 1).toUpperCase());
							Method methodGet = clazz.getMethod("get" + fieldName);

							Object invoke = methodGet.invoke(object);

							String clazzName = null;
							Method methodSet = null;
							if (invoke != null) {
								clazzName = invoke.getClass().getName().split("_")[0];
								if (isEntityObj(clazzName)) {

									Class<?> orgClazz = field.getType();
									String[] split = orgClazz.getName()
											.split("[.]");

									String className = split[split.length - 1];
									String idName = orgClazz.getDeclaredFields()[0]
											.getName();

									idName = idName.replaceFirst(idName.substring(
											0, 1), idName.substring(0, 1)
											.toUpperCase());
									Method method2 = orgClazz.getMethod("get"
											+ idName);

									String hsql = "from " + className + " where "
											+ idName;
									if (orgClazz.getDeclaredFields()[0].getType()
											.getName().equals("java.lang.String")) {
										hsql = hsql + "='" + method2.invoke(invoke)
												+ "'";
									} else {
										hsql = hsql + "=" + method2.invoke(invoke);
									}

									List<?> findByHSQL = dao.findByHSQL(hsql,
											orgClazz.newInstance());

									methodSet = clazz
											.getMethod(
													"set"
															+ field.getName()
																	.replaceFirst(
																			field.getName()
																					.substring(
																							0,
																							1),
																			field.getName()
																					.substring(
																							0,
																							1)
																					.toUpperCase()),
													orgClazz);

									Object find = findByHSQL.get(0);

									Object newFind = field.getType().newInstance();
									Field[] fields2 = field.getType()
											.getDeclaredFields();
									for (Field field2 : fields2) {

										String name = field2.getType().getName();

										Object invoke2 = null;
										if (!isEntityObj(name)) {

											if (field2.getType().getName()
													.equals("java.util.Set")) {
												invoke2 = null;
												System.out.println("setsdff");
												Method method = field
														.getType()
														.getMethod(
																"set"
																		+ field2.getName()
																				.replaceFirst(
																						field2.getName()
																								.substring(
																										0,
																										1),
																						field2.getName()
																								.substring(
																										0,
																										1)
																								.toUpperCase()),
																field2.getType());
												method.invoke(newFind, invoke2);
											} else {
												String name2 = field2.getName();
												name2 = name2.replaceFirst(name2
														.substring(0, 1), name2
														.substring(0, 1)
														.toUpperCase());
												Method declaredMethod = field
														.getType()
														.getDeclaredMethod(
																"get" + name2);

												invoke2 = declaredMethod
														.invoke(find);
												Method declaredMethod2 = field
														.getType()
														.getDeclaredMethod(
																"set" + name2,
																field2.getType());
												declaredMethod2.invoke(newFind,
														invoke2);
											}

										}
									}
									methodSet.invoke(newObject, newFind);
								} else if (field.getType().getName()
										.equals("java.util.Set")) {

									Set set = (Set) invoke;
									invoke = null;
									System.out.println("set");
									methodSet = clazz.getMethod("set" + fieldName,
											field.getType());
									methodSet.invoke(newObject, invoke);
								} else {
									methodSet = clazz.getMethod("set" + fieldName,
											field.getType());
									methodSet.invoke(newObject, invoke);
								}
							}
						}
						newObjs.add((T) newObject);
					}

					map.put(entry.getKey(), (List<T>) newObjs);
				}
			}
			Gson gson;
			if (fieldNames == null) {
				gson = new Gson();
			} else {
				// 设置对TbEmployee的策略
				TargetStrategy ts = null;
				if (list.size() < 1) {
					
					System.out.println();
				} else {
					ts = new TargetStrategy(list.get(0).getClass());
				}
				ts.setReverse(true);
				ts.setFields(fieldNames);
				// 表示仅转换TbEmployee中的employeename和employeeid属性
				gson = new GsonBuilder().setExclusionStrategies(ts).create();
			}
			String json = gson.toJson(map);
			System.out.println(json);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 判断类是否是实体类
	 * 
	 * @param clazzName
	 * @return
	 */
	public static boolean isEntityObj(String clazzName) {

		if(clazzName.startsWith("ppms.domain")){
			return true;
		}
		return false;
	}

	
	
//	/**
//	 * 获取某包下所有类
//	 * 
//	 * @param packageName
//	 *            包名
//	 * @param isRecursion
//	 *            是否遍历子包
//	 * @return 类的完整名称
//	 */
//	public static Set<String> getClassName(String packageName,
//			boolean isRecursion) {
//		Set<String> classNames = null;
//		ClassLoader loader = Thread.currentThread().getContextClassLoader();
//		String packagePath = packageName.replace(".", "/");
//
//		URL url = loader.getResource(packagePath);
//		if (url != null) {
//			String protocol = url.getProtocol();
//			if (protocol.equals("file")) {
//				classNames = getClassNameFromDir(url.getPath(), packageName,
//						isRecursion);
//			} else if (protocol.equals("jar")) {
//				JarFile jarFile = null;
//				try {
//					jarFile = ((JarURLConnection) url.openConnection())
//							.getJarFile();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//
//				if (jarFile != null) {
//					getClassNameFromJar(jarFile.entries(), packageName,
//							isRecursion);
//				}
//			}
//		} else {
//			/* 从所有的jar包中查找包名 */
//			classNames = getClassNameFromJars(
//					((URLClassLoader) loader).getURLs(), packageName,
//					isRecursion);
//		}
//
//		return classNames;
//	}
//
//	/**
//	 * 从项目文件获取某包下所有类
//	 * 
//	 * @param filePath
//	 *            文件路径
//	 * @param className
//	 *            类名集合
//	 * @param isRecursion
//	 *            是否遍历子包
//	 * @return 类的完整名称
//	 */
//	private static Set<String> getClassNameFromDir(String filePath,
//			String packageName, boolean isRecursion) {
//
//		Set<String> className = new HashSet<String>();
//		File file = new File(filePath);
//		File[] files = file.listFiles();
//		for (File childFile : files) {
//			if (childFile.isDirectory()) {
//				if (isRecursion) {
//					className.addAll(getClassNameFromDir(childFile.getPath(),
//							packageName + "." + childFile.getName(),
//							isRecursion));
//				}
//			} else {
//				String fileName = childFile.getName();
//				if (fileName.endsWith(".class") && !fileName.contains("$")) {
//					className.add(packageName + "."
//							+ fileName.replace(".class", ""));
//				}
//			}
//		}
//		return className;
//	}
//
//	/**
//	 * @param jarEntries
//	 * @param packageName
//	 * @param isRecursion
//	 * @return
//	 */
//	private static Set<String> getClassNameFromJar(
//			Enumeration<JarEntry> jarEntries, String packageName,
//			boolean isRecursion) {
//		Set<String> classNames = new HashSet<String>();
//
//		while (jarEntries.hasMoreElements()) {
//			JarEntry jarEntry = jarEntries.nextElement();
//			if (!jarEntry.isDirectory()) {
//				/*
//				 * 这里是为了方便，先把"/" 转成 "." 再判断 ".class" 的做法可能会有bug (FIXME: 先把"/" 转成
//				 * "." 再判断 ".class" 的做法可能会有bug)
//				 */
//				String entryName = jarEntry.getName().replace("/", ".");
//				if (entryName.endsWith(".class") && !entryName.contains("$")
//						&& entryName.startsWith(packageName)) {
//					entryName = entryName.replace(".class", "");
//					if (isRecursion) {
//						classNames.add(entryName);
//					} else if (!entryName.replace(packageName + ".", "")
//							.contains(".")) {
//						classNames.add(entryName);
//					}
//				}
//			}
//		}
//		return classNames;
//	}
//
//	/**
//	 * 从所有jar中搜索该包，并获取该包下所有类
//	 * 
//	 * @param urls
//	 *            URL集合
//	 * @param packageName
//	 *            包路径
//	 * @param isRecursion
//	 *            是否遍历子包
//	 * @return 类的完整名称
//	 */
//	private static Set<String> getClassNameFromJars(URL[] urls,
//			String packageName, boolean isRecursion) {
//		Set<String> classNames = new HashSet<String>();
//
//		for (int i = 0; i < urls.length; i++) {
//			String classPath = urls[i].getPath();
//
//			// 不必搜索classes文件夹
//			if (classPath.endsWith("classes/")) {
//				continue;
//			}
//
//			JarFile jarFile = null;
//			try {
//				jarFile = new JarFile(classPath.substring(classPath
//						.indexOf("/")));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			if (jarFile != null) {
//				classNames.addAll(getClassNameFromJar(jarFile.entries(),
//						packageName, isRecursion));
//			}
//		}
//		return classNames;
//	}
}
