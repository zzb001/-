package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
    
	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	
	
	/*
	 * 需求：根据id查询商品数据
	 * 参数：Long itemId
	 * 返回值：TbItem
	 */
	@Override
	public TbItem findItemById(Long itemId) {
		//根据id查询商品数据
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		
		return item;
	}

}
