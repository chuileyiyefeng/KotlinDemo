package org.weishe.kotlindemo.bean;

/**
 * panyi crate on 2020.08.14 16:48
 * desc
 */
public class ItemListBean {
    private String type;
    private RecommendDataBean data;

    public String getType() {
        return type == null ? "" : type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RecommendDataBean getData() {
        return data;
    }

    public void setData(RecommendDataBean data) {
        this.data = data;
    }


}
