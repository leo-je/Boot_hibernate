/**
* by shengte lee 2017年11月14日 上午10:03:07
*/
package com.je.demo.api.user.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.je.demo.api.user.entity.User;


/**
 * 
 * @Type UserRepository
 * @Desc 
 * @author shengte Lee
 * @date 2017年11月14日下午4:34:55 
 * @version
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	User findByUsername(String name);
}
