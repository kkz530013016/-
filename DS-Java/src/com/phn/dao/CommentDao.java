/**
 * 
 */
package com.phn.dao;

import com.phn.bean.Comments;


public interface CommentDao {
	public boolean add(Comments comment);

	/**
	 * @param comments
	 */
	public void update(Comments comments);

	/**
	 * @param id
	 * @return
	 */
	public Comments find(int id);

	/**
	 * @param comment
	 */
	public void delete(Comments comment);

}
