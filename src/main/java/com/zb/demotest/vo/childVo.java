package com.zb.demotest.vo;

public class childVo extends fatherVo{
    private String name;

    childVo(String aa) {
//        super(aa);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
