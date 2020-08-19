package org.weishe.kotlindemo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * panyi crate on 2020.08.19 11:29
 * desc
 */
public class RankDataBean {
    private String nextPageUrl;

    public String getNextPageUrl() {
        return nextPageUrl == null ? "" : nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    private List<HomeDataBean.IssueListBean.ItemListBean> itemList;

    public List<HomeDataBean.IssueListBean.ItemListBean> getItemList() {
        if (itemList == null) {
            return new ArrayList<>();
        }
        return itemList;
    }

    public void setItemList(List<HomeDataBean.IssueListBean.ItemListBean> itemList) {
        this.itemList = itemList;
    }
}
