package com.solid.d_isp.service;
import com.solid.d_isp.entity.Entity;

import java.util.List;
public interface PesistanceServiceInt <T extends Entity>{
	public List<T> findByName(String name);
}
