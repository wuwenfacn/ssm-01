package com.fa.service.impl;

import com.fa.entity.Carts;
import com.fa.exception.ServiceException;
import com.fa.mapper.CartsMapper;
import com.fa.request.CartsRequestParams;
import com.fa.service.CartsService;
import com.fa.utils.ColaBeanUtils;
import com.fa.vo.CartsVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import static com.fa.utils.ErrorStatus.SERVICE_ERROR;

@Component
public class CartsServiceImpl implements CartsService {
    @Resource
    CartsMapper cartsMapper;
    @Override
    public int saveCarts(CartsRequestParams cartsRequestParams) {
        int temp = 0;
        try {
            Carts carts = cartsMapper.selectByUserIdAndProductId(cartsRequestParams.getUserId(),
                    cartsRequestParams.getProductId());
            /*
            * 判断用户的购物车中是否存在该商品
            * 如果有，则增加数量
            * 如果没有，则将该商品信息添加进去
            * */
            if (carts != null) {
                int num = carts.getCartsNum() + cartsRequestParams.getCartsNum();
                temp = cartsMapper.updateById(carts.getCartsId(), num);
            } else {
                carts = new Carts();
                /*将对象的属性拷贝到另一个对象，属性的类型和名称要保持一致，（要拷贝的对象，目标对象）*/
                BeanUtils.copyProperties(cartsRequestParams, carts);
                temp = cartsMapper.insert(carts);
            }
        }catch (Exception e){
            throw new ServiceException(SERVICE_ERROR.getMessage(),SERVICE_ERROR.getStatus());
        }
        return temp;
    }

    @Override
    public List<CartsVo> findAllCarts(int userId) {
        List<Carts> carts = cartsMapper.selectList(userId);
        List<CartsVo> cartsVos = ColaBeanUtils.copyListProperties(carts, CartsVo::new);
        return cartsVos;
    }
}
