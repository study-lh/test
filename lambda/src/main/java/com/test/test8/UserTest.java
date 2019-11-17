package com.test.test8;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.validator.ValidateWith;

public class UserTest {


    //    public static List change() {
    public static void main(String[] args) {

        UserTest userTest = new UserTest();
        ArrayList<SysUser> userList = new ArrayList<>();
        SysUser sysUser = new SysUser("0L", "零", 0, "0", "男", new Date(), new BigDecimal(0));
        SysUser sysUser1 = new SysUser("1L", "一", 1, "1", "女", new Date(), new BigDecimal(1));
        SysUser sysUser2 = new SysUser("2L", "二", 2, "2", "男", new Date(), new BigDecimal(2));
        SysUser sysUser3 = new SysUser("3L", "三", 3, "3.3", "男", new Date(), new BigDecimal(3));
        SysUser sysUser4 = new SysUser("3L", "四", 1, "4", "女", new Date(), new BigDecimal(4));
        SysUser sysUser5 = new SysUser("5L", "五", 5, "5", "男", new Date(), new BigDecimal(5));
        SysUser sysUser6 = new SysUser("6L", "aaa", 5, "5", "男", new Date(), new BigDecimal(5));
        SysUser sysUser7 = new SysUser("3L", "ccc", 2, "5", "男", new Date(), new BigDecimal(5));
        SysUser sysUser8 = new SysUser("3L", "dd", 88, "5", "男", new Date(), new BigDecimal(5));
        SysUser sysUser9 = new SysUser("7L", "ee", 5, "5", "男", new Date(), new BigDecimal(5));
        SysUser sysUser10 = new SysUser("9L", "ff", 5, "5", "男", new Date(), new BigDecimal(5));
        userList.add(sysUser);
        userList.add(sysUser1);
        userList.add(sysUser2);
        userList.add(sysUser3);
        userList.add(sysUser4);
        userList.add(sysUser5);
        userList.add(sysUser6);
        userList.add(sysUser7);
        userList.add(sysUser8);
        userList.add(sysUser9);
        userList.add(sysUser10);
//        return userList;
//        System.out.println(userList.toString());
        //分组
        //   userTest.groupingBy(userList);
        //过滤
        //userTest.filter(userList);
        //求和(家庭成员数)
//        userTest.Sum(userList);
        //判空
        // userTest.isNull(userList);
        //获得集合最大与最小值M
        // userTest.get(userList);
        //List转Map
        //userTest.listToMap(userList);
        //排序 单字段排序，根据id排序 多字段排序，根据id，年龄排序,id相同，比较年龄，从小打到
//        userTest.sort(userList);
        //排序加我去重
        userTest.distinct(userList);
        //userTest.NewList(userList);
        //批量改变List中的一个值
        //userTest.setUserList(userList);
//将List<pojo>pojo中某个属性取出组成list
        List<String> list = newList(userList);
        System.out.println(list.toString());
    }

    public static List<String> newList(List<SysUser> sysUserList) {
        List<String> collect = sysUserList.stream().map(SysUser::getName).collect(Collectors.toList());
        return collect;
    }

    public void groupingBy(List<SysUser> userList) {
        Object collect = userList.stream().collect(Collectors.groupingBy(SysUser::getSex));
        //分组
        Map<String, List<SysUser>> groupBySex = (Map<String, List<SysUser>>) userList.stream().collect(Collectors.groupingBy(SysUser::getSex));
        //遍历分组
        for (Map.Entry<String, List<SysUser>> entryUser : groupBySex.entrySet()) {
            String key = entryUser.getKey();
            System.out.println("key" + key);
            List<SysUser> entryUserList = entryUser.getValue();
            for (SysUser sysUser : entryUserList) {
                System.out.println(sysUser.toString());
            }

        }
    }

    private String creat() {
        return null;
    }

    public void filter(List<SysUser> userList) {
        //过滤
        //排除掉工号为201901的用户
        List<SysUser> userCommonList = userList.stream().filter(a -> !a.getJobNumber().equals("0") && !a.getJobNumber().equals("3")).collect(Collectors.toList());
        for (SysUser sysUser : userCommonList) {
            System.out.println(sysUser.toString());

        }

    }

    public void Sum(List<SysUser> userList) {
        //基本类型加a，减s,乘m，除m
        //求和
        int sumAge = userList.stream().mapToInt(SysUser::getAge).sum();
        System.out.println(sumAge);
        //BigDecimal求和
        BigDecimal totalQuantity = userList.stream().map(SysUser::getFamilyMemberQuantity).reduce(BigDecimal.ZERO, BigDecimal::add);
        //  BigDecimal reduce = userList.stream().map(SysUser::getFamilyMemberQuantity).reduce(BigDecimal.ZERO, BigDecimal::multiply);
        //   System.out.println(reduce);
        System.out.println(totalQuantity);

    }

    public void isNull(List<SysUser> userList) {
        //判空
        System.out.println(userList.stream().filter(x -> x != null));
    }

    public void get(List<SysUser> userList) {
        //判空
        //最小
        Date minEntryDate = userList.stream().map(SysUser::getEntryDate).max(Date::compareTo).get();
        System.out.println("最小值为" + minEntryDate);
        Integer minAge = userList.stream().map(SysUser::getAge).max(Integer::compareTo).get();
        System.out.println("最大值为" + minAge);


        //最大
        Date maxEntryDate = userList.stream().map(SysUser::getEntryDate).max(Date::compareTo).get();
        System.out.println("最大值为" + maxEntryDate);
    }


    public void listToMap(List<SysUser> userList) {
        /**
         * List -> Map
         * 需要注意的是：
         * toMap 如果集合对象有重复的key，会报错Duplicate key ....
         *  user1,user2的id都为1。
         *  可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2
         */
      /*  Map<Long, SysUser> userMap = userList.stream().collect(Collectors.toMap(SysUser::getId, a -> a, (k1, k2) -> k1));
        for (Map.Entry<Long, SysUser> longSysUserEntry : userMap.entrySet()) {
            System.out.println("key为" + longSysUserEntry.getKey() + "value为" + longSysUserEntry.getValue().toString());
        }*/


    }

    public void sort(List<SysUser> userList) {
        System.out.println(1111);
     /*   //排序
        //单字段排序，根据id排序
        //  userList.sort(Comparator.comparing(SysUser::getId));
//        userList.stream().sorted(Comparator.comparing(SysUser::getId)).forEach(System.out::println);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //多字段排序，根据id，年龄排序,id相同，比较年龄，从小打到
        // userList.sort(Comparator.comparing(SysUser::getId).thenComparing(SysUser::getAge));*/
        List<SysUser> collect = userList.stream().sorted(Comparator.comparing(SysUser::getId).thenComparing(SysUser::getAge)).collect(Collectors.toList());
        for (SysUser sysUser : collect) {
            System.out.println(sysUser);

        }

    }

    public void distinct(List<SysUser> userList) {
        //去重 单独一个list
        List<Long> idList = new ArrayList<Long>();
        idList.add(1L);
        idList.add(1L);
        idList.add(2L);
        List<Long> distinctIdList = idList.stream().distinct().collect(Collectors.toList());
        for (Long aLong : distinctIdList) {
            System.out.println(aLong);
        }
        //年龄小于三岁，按照家庭人数排序
        List<SysUser> collect = userList.stream().filter(product -> product.getAge() < 3)
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(SysUser::getJobNumber))), ArrayList::new));
        for (SysUser product : collect) {
            System.out.println(product);
        }
    }

    public void NewList(List<SysUser> userList) {
        //获取list对象的某个字段组装成新list
        List<String> userIdList = userList.stream().map(a -> a.getName()).collect(Collectors.toList());
        for (String aLong : userIdList) {
            System.out.println(aLong);

        }
    }

    public void setUserList(List<SysUser> userList) {
        userList.stream().forEach(a -> a.setName("李航"));
        for (SysUser sysUser : userList) {
            System.out.println(sysUser);
        }
    }
}


