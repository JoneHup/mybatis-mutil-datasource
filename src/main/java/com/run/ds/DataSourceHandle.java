package com.run.ds;
/**
 * 数据源操作类
 * @author hupeng
 *
 */
public class DataSourceHandle {
	
	/**
	 * 线程本地环境
	 */
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/**
	 * 设置数据源类型
	 * 
	 * @param dataSourceType
	 */
	public static void setDataSourceType(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	/**
	 * 获取数据源类型
	 * 
	 * @return
	 */
	public static String getDataSourceType() {
		return (String) contextHolder.get();
	}

}
