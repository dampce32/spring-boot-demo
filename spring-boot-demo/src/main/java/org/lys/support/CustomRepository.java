package org.lys.support;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
/**
 * 自动模糊查询：对于任意的实体对象进行查询，对象里有几个值我们就查几个值，
 * 当值为字符串时，我们就自动like查询，其余的类型使用自动等于查询，没有值我们就查询全部
 * @copyright: 福建凌智信息科技有限公司 (c)2017
 * @createTime: 2017年11月22日上午9:11:18
 * @author：lys
 * @version：1.0
 */
@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable>extends JpaRepository<T, ID> ,JpaSpecificationExecutor<T>{
	
	Page<T> findByAuto(T example,Pageable pageable);
	

}
