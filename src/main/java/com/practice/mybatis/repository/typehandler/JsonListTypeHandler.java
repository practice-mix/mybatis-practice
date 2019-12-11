package com.practice.mybatis.repository.typehandler;

import com.practice.mybatis.repository.jsonconvert.element.SoftwareOuput;
import com.practice.mybatis.util.JSON;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Luo Bao Ding
 * @since 2019/12/11
 */
@MappedTypes({List.class, SoftwareOuput.class})
@MappedJdbcTypes(value = {JdbcType.VARCHAR}, includeNullJdbcType = false)
public class JsonListTypeHandler<T> extends BaseTypeHandler<List<T>> {
    private Class<T> clazz;

    public JsonListTypeHandler(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<T> parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.stringify(parameter));
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSON.parseList(rs.getString(columnName), clazz);
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return JSON.parseList(rs.getString(columnIndex), clazz);
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return JSON.parseList(cs.getString(columnIndex), clazz);
    }
}
