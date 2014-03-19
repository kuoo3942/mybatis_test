package com.mybatis.until;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes({String[].class})
@MappedJdbcTypes({JdbcType.VARCHAR})
public class StringArrayTypeHandler implements TypeHandler<String[]> {
	
	/**
	 * 将对象的String[] 转换成数据库中的VACHAR类型
	 */
	
	public void setParameter(PreparedStatement ps, int i, String[] parameter,
			JdbcType jdbcType) throws SQLException {
		
		if( parameter == null ){
			ps.setNull(i, Types.VARCHAR);
		}else{
			StringBuffer ss = new StringBuffer() ;
			for( String param : parameter ){
				ss.append(param).append(",") ;
			}
			ss.deleteCharAt(ss.length() - 1) ;
			ps.setString(i, ss.toString());
		}
	}

	public String[] getResult(ResultSet rs, String columnName) throws SQLException {
		return this.toArray(rs.getString(columnName));
	}

	public String[] getResult(ResultSet rs, int columnIndex) throws SQLException {
		return this.toArray(rs.getString(columnIndex));
	}

	public String[] getResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return this.toArray(cs.getString(columnIndex));
	}
	
	private String[] toArray( String param ){
		
		if( param == null){
			return null ;
		}
		return param.split(",") ;
	}
}
