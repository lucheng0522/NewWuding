package com.i5d5.wuding.WD.Model;

import java.util.ArrayList;

/**
 * class_name: ClassRootModel
 * package_name: com.i5d5.salamu.WD.Model
 * acthor: lucheng
 * time: 2016/6/27 17:01
 */
public class ClassRootModel {


    private int code;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {

        private ArrayList<ClassListBean> class_list;

        public ArrayList<ClassListBean> getClass_list() {
            return class_list;
        }

        public void setClass_list(ArrayList<ClassListBean> class_list) {
            this.class_list = class_list;
        }

        public static class ClassListBean {
            private String gc_id;
            private String gc_name;
            private String type_id;
            private String type_name;
            private String gc_parent_id;
            private String commis_rate;
            private String gc_sort;
            private String gc_virtual;
            private String gc_title;
            private String gc_keywords;
            private String gc_description;
            private String gc_show;
            private String image;



            private boolean isSelect;
//            private String text;
            public boolean isSelect() {
                 return isSelect;
            }

            public void setSelect(boolean select) {
                isSelect = select;
            }
            public String getGc_id() {
                return gc_id;
            }

            public void setGc_id(String gc_id) {
                this.gc_id = gc_id;
            }

            public String getGc_name() {
                return gc_name;
            }

            public void setGc_name(String gc_name) {
                this.gc_name = gc_name;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public String getType_name() {
                return type_name;
            }

            public void setType_name(String type_name) {
                this.type_name = type_name;
            }

            public String getGc_parent_id() {
                return gc_parent_id;
            }

            public void setGc_parent_id(String gc_parent_id) {
                this.gc_parent_id = gc_parent_id;
            }

            public String getCommis_rate() {
                return commis_rate;
            }

            public void setCommis_rate(String commis_rate) {
                this.commis_rate = commis_rate;
            }

            public String getGc_sort() {
                return gc_sort;
            }

            public void setGc_sort(String gc_sort) {
                this.gc_sort = gc_sort;
            }

            public String getGc_virtual() {
                return gc_virtual;
            }

            public void setGc_virtual(String gc_virtual) {
                this.gc_virtual = gc_virtual;
            }

            public String getGc_title() {
                return gc_title;
            }

            public void setGc_title(String gc_title) {
                this.gc_title = gc_title;
            }

            public String getGc_keywords() {
                return gc_keywords;
            }

            public void setGc_keywords(String gc_keywords) {
                this.gc_keywords = gc_keywords;
            }

            public String getGc_description() {
                return gc_description;
            }

            public void setGc_description(String gc_description) {
                this.gc_description = gc_description;
            }

            public String getGc_show() {
                return gc_show;
            }

            public void setGc_show(String gc_show) {
                this.gc_show = gc_show;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

//            public String getText() {
//                return text;
//            }
//
//            public void setText(String text) {
//                this.text = text;
//            }
        }
    }
}
