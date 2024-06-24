package com.entity.view;

import com.entity.YonghupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
@TableName("yonghupingjia")
public class YonghupingjiaView  extends YonghupingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghupingjiaView(){
	}
 
 	public YonghupingjiaView(YonghupingjiaEntity yonghupingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, yonghupingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
