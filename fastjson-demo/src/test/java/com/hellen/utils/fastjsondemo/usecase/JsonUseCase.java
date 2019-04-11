package com.hellen.utils.fastjsondemo.usecase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hellen.utils.fastjsondemo.vo.Customer;
import com.hellen.utils.fastjsondemo.vo.Waiters;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class JsonUseCase {

    @Test
    public void testjson(){
        Waiters waiters = new Waiters();
        waiters.setAge(19);
        waiters.setIdNo("190392083");
        waiters.setName("阳光");
        Customer customer = new Customer();
        customer.setAmount(new BigDecimal("100"));
        customer.setIdNo("1");
        ArrayList<Waiters> arrayList = new ArrayList<>();
        arrayList.add(waiters);
        customer.setWaiters(arrayList);
        /**
         * 输出jsonstring
         */
        Object o = JSON.toJSON(customer);
        System.out.println(o);
        String s = o.toString();
        System.out.println(s);

        /**
         * 将json对象parse成jsonObject
         * jsongObject是key value的形式
         * value 可以输出成string等，根据实际需要的格式getXX
         */
        JSONObject jsonObject =  JSON.parseObject(s);

        /**
         * 获取jsonArray对象 jsonArray对象是list的形式
         */
        JSONArray waitersArray = jsonObject.getJSONArray("waiters");
        System.out.println(waitersArray);
        JSONObject waiterObject = waitersArray.getJSONObject(0);
        System.out.println(waiterObject);
        /**
         * jsonobject获取String
         */
        String name = waiterObject.getString("name");
        System.out.println(name);

        /**
         * jsongObje 获取integer
         */
        Integer age = waiterObject.getInteger("age");
        System.out.println(age);

        /**
         *jsonObject 获取integer
         */
        BigDecimal ageBigDecimal = waiterObject.getBigDecimal("age");
        System.out.println(ageBigDecimal);


        /**
         * jsonObject 获取long
         */
        Long idNo = waiterObject.getLong("idNo");
        System.out.println(idNo);

    }
}
