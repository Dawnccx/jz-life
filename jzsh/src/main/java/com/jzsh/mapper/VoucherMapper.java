package com.jzsh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jzsh.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
