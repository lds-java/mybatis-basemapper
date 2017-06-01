package cn.howso.framework.mybatis.mapper.xml;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.howso.framework.mybatis.pagination.Pageable;
/**
 * 如果定义的表没有主键，则不需要关于主键的方法，那么继承这个接口更合适
 * */
public interface ExampleMapper<ENTITY, EXAMPLE> {
	//@ResultType(Integer.class)
	//@SelectProvider(type = ScriptSqlProviderImpl.class, method = "countByExample")
	int countByExample(EXAMPLE example);

	//@ResultType(Integer.class)
	//@Delete("<script>delete from sys_user <where> id=#{id}</where></script>")
	//@DeleteProvider(type = ScriptSqlProviderImpl.class, method = "deleteByExample")
	int deleteByExample(EXAMPLE example);

	//@ResultType(Integer.class)
	//@InsertProvider(type = ScriptSqlProviderImpl.class, method = "insert")
	int insert(ENTITY record);

	//@ResultType(Integer.class)
	//@InsertProvider(type = ScriptSqlProviderImpl.class, method = "insertSelective")
	int insertSelective(ENTITY record);

	//@ResultMap(ProviderHelper.BASE_RESULT_MAP)
	//@SelectProvider(type = ScriptSqlProviderImpl.class, method = "selectByExample")
	List<ENTITY> selectByExample(EXAMPLE example);

	//@ResultType(Integer.class)
	//@UpdateProvider(type = ScriptSqlProviderImpl.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") ENTITY record, @Param("example") EXAMPLE example);

	//@ResultType(Integer.class)
	//@UpdateProvider(type = ScriptSqlProviderImpl.class, method = "updateByExample")
	int updateByExample(@Param("record") ENTITY record, @Param("example") EXAMPLE example);

	//@ResultMap(ProviderHelper.BASE_RESULT_MAP)
	//@SelectProvider(type = ScriptSqlProviderImpl.class, method = "selectByExampleByPage")
	List<ENTITY> selectByExampleByPage(@Param("example") EXAMPLE example, @Param("page") Pageable page);

	//@ResultType(Integer.class)
	//@InsertProvider(type = ScriptSqlProviderImpl.class, method = "batchInsert")
	int batchInsert(@Param("recordList") List<ENTITY> recordList);

	//@ResultType(Integer.class)
	//@InsertProvider(type = ScriptSqlProviderImpl.class, method = "batchInsertSelective")
	int batchInsertSelective(@Param("recordList") List<ENTITY> recordList);
}