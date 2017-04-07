package com.i5d5.testmodule.TEST.Model;

import java.util.List;

/**
 * class_name: StoreInfoModel
 * package_name: com.i5d5.salamu.WD.Model
 * acthor: lucheng
 * time: 2016/8/19 15:43
 */
public class StoreInfoModel {

    /**
     * code : 200
     * datas : {"store_info":{"store_id":"13","store_name":"红盖头穆斯林商行","grade_id":"1","member_id":"54","member_name":"红盖头","seller_name":"红盖头","sc_id":"2","store_company_name":"红盖头穆斯林商行档案","province_id":"0","area_info":"浙江 金华市 义乌市","store_address":"义乌市稠州北路251弄1幢5号-1前门","store_zip":"","store_state":"1","store_close_info":"","store_sort":"0","store_time":"1466575108","store_end_time":"1498147200","store_label":"05200151841580273.jpg","store_banner":"05200151841581530.png","store_avatar":"http://img1.selanwang.com/shop/store/05200151622197672_sm.png","store_keywords":"","store_description":"","store_qq":"348817","store_ww":"","store_phone":"13157961191","store_zy":"","store_domain":null,"store_domain_times":"0","store_recommend":"0","store_theme":"default","store_credit":{"store_desccredit":{"text":"描述相符","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"},"store_servicecredit":{"text":"服务态度","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"},"store_deliverycredit":{"text":"发货速度","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"}},"store_desccredit":"0","store_servicecredit":"0","store_deliverycredit":"0","store_collect":0,"store_slide":"05210497398905071.png,,,,","store_slide_url":"http://,http://,http://,http://,http://","store_stamp":null,"store_printdesc":null,"store_sales":"0","store_presales":null,"store_aftersales":null,"store_workingtime":null,"store_free_price":"50.00","store_decoration_switch":"0","store_decoration_only":"0","store_decoration_image_count":"0","live_store_name":null,"live_store_address":null,"live_store_tel":null,"live_store_bus":null,"is_own_shop":false,"bind_all_gc":"0","store_vrcode_prefix":null,"store_baozh":"0","store_baozhopen":"0","store_baozhrmb":"零","store_qtian":"0","store_zhping":"0","store_erxiaoshi":"0","store_tuihuo":"0","store_shiyong":"0","store_shiti":"0","store_xiaoxie":"0","store_huodaofk":"0","store_free_time":"0","mb_title_img":"","mb_sliders":[],"deliver_region":null,"goods_count":184,"store_credit_average":5,"store_credit_percent":100,"store_time_text":"2016-06-22","sc_name":"服装鞋包","is_favorate":false}}
     */

    private int code;
    /**
     * store_info : {"store_id":"13","store_name":"红盖头穆斯林商行","grade_id":"1","member_id":"54","member_name":"红盖头","seller_name":"红盖头","sc_id":"2","store_company_name":"红盖头穆斯林商行档案","province_id":"0","area_info":"浙江 金华市 义乌市","store_address":"义乌市稠州北路251弄1幢5号-1前门","store_zip":"","store_state":"1","store_close_info":"","store_sort":"0","store_time":"1466575108","store_end_time":"1498147200","store_label":"05200151841580273.jpg","store_banner":"05200151841581530.png","store_avatar":"http://img1.selanwang.com/shop/store/05200151622197672_sm.png","store_keywords":"","store_description":"","store_qq":"348817","store_ww":"","store_phone":"13157961191","store_zy":"","store_domain":null,"store_domain_times":"0","store_recommend":"0","store_theme":"default","store_credit":{"store_desccredit":{"text":"描述相符","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"},"store_servicecredit":{"text":"服务态度","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"},"store_deliverycredit":{"text":"发货速度","credit":5,"percent":"----","percent_class":"equal","percent_text":"持平"}},"store_desccredit":"0","store_servicecredit":"0","store_deliverycredit":"0","store_collect":0,"store_slide":"05210497398905071.png,,,,","store_slide_url":"http://,http://,http://,http://,http://","store_stamp":null,"store_printdesc":null,"store_sales":"0","store_presales":null,"store_aftersales":null,"store_workingtime":null,"store_free_price":"50.00","store_decoration_switch":"0","store_decoration_only":"0","store_decoration_image_count":"0","live_store_name":null,"live_store_address":null,"live_store_tel":null,"live_store_bus":null,"is_own_shop":false,"bind_all_gc":"0","store_vrcode_prefix":null,"store_baozh":"0","store_baozhopen":"0","store_baozhrmb":"零","store_qtian":"0","store_zhping":"0","store_erxiaoshi":"0","store_tuihuo":"0","store_shiyong":"0","store_shiti":"0","store_xiaoxie":"0","store_huodaofk":"0","store_free_time":"0","mb_title_img":"","mb_sliders":[],"deliver_region":null,"goods_count":184,"store_credit_average":5,"store_credit_percent":100,"store_time_text":"2016-06-22","sc_name":"服装鞋包","is_favorate":false}
     */


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

        private StoreInfoBean store_info;

        public StoreInfoBean getStore_info() {
            return store_info;
        }

        public void setStore_info(StoreInfoBean store_info) {
            this.store_info = store_info;
        }

        public static class StoreInfoBean {


            private String store_id;
            private String store_name;
            private String grade_id;
            private String member_id;
            private String member_name;
            private String seller_name;
            private String sc_id;
            private String store_company_name;
            private String province_id;
            private String area_info;
            private String store_address;
            private String store_zip;
            private String store_state;
            private String store_close_info;
            private String store_sort;
            private String store_time;
            private String store_end_time;
            private String store_label;
            private String store_banner;
            private String store_avatar;
            private String store_keywords;
            private String store_description;
            private String store_qq;
            private String store_ww;
            private String store_phone;
            private String store_zy;
            private Object store_domain;
            private String store_domain_times;
            private String store_recommend;
            private String store_theme;

            private StoreCreditBean store_credit;
            private String store_desccredit;
            private String store_servicecredit;
            private String store_deliverycredit;
            private int store_collect;
            private String store_slide;
            private String store_slide_url;
            private Object store_stamp;
            private Object store_printdesc;
            private String store_sales;
            private Object store_presales;
            private Object store_aftersales;
            private Object store_workingtime;
            private String store_free_price;
            private String store_decoration_switch;
            private String store_decoration_only;
            private String store_decoration_image_count;
            private Object live_store_name;
            private Object live_store_address;
            private Object live_store_tel;
            private Object live_store_bus;
            private boolean is_own_shop;
            private String bind_all_gc;
            private Object store_vrcode_prefix;
            private String store_baozh;
            private String store_baozhopen;
            private String store_baozhrmb;
            private String store_qtian;
            private String store_zhping;
            private String store_erxiaoshi;
            private String store_tuihuo;
            private String store_shiyong;
            private String store_shiti;
            private String store_xiaoxie;
            private String store_huodaofk;
            private String store_free_time;
            private String mb_title_img;
            private Object deliver_region;
            private int goods_count;
            private double store_credit_average;
            private int store_credit_percent;
            private String store_time_text;
            private String sc_name;
            private boolean is_favorate;
            private List<?> mb_sliders;

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getStore_name() {
                return store_name;
            }

            public void setStore_name(String store_name) {
                this.store_name = store_name;
            }

            public String getGrade_id() {
                return grade_id;
            }

            public void setGrade_id(String grade_id) {
                this.grade_id = grade_id;
            }

            public String getMember_id() {
                return member_id;
            }

            public void setMember_id(String member_id) {
                this.member_id = member_id;
            }

            public String getMember_name() {
                return member_name;
            }

            public void setMember_name(String member_name) {
                this.member_name = member_name;
            }

            public String getSeller_name() {
                return seller_name;
            }

            public void setSeller_name(String seller_name) {
                this.seller_name = seller_name;
            }

            public String getSc_id() {
                return sc_id;
            }

            public void setSc_id(String sc_id) {
                this.sc_id = sc_id;
            }

            public String getStore_company_name() {
                return store_company_name;
            }

            public void setStore_company_name(String store_company_name) {
                this.store_company_name = store_company_name;
            }

            public String getProvince_id() {
                return province_id;
            }

            public void setProvince_id(String province_id) {
                this.province_id = province_id;
            }

            public String getArea_info() {
                return area_info;
            }

            public void setArea_info(String area_info) {
                this.area_info = area_info;
            }

            public String getStore_address() {
                return store_address;
            }

            public void setStore_address(String store_address) {
                this.store_address = store_address;
            }

            public String getStore_zip() {
                return store_zip;
            }

            public void setStore_zip(String store_zip) {
                this.store_zip = store_zip;
            }

            public String getStore_state() {
                return store_state;
            }

            public void setStore_state(String store_state) {
                this.store_state = store_state;
            }

            public String getStore_close_info() {
                return store_close_info;
            }

            public void setStore_close_info(String store_close_info) {
                this.store_close_info = store_close_info;
            }

            public String getStore_sort() {
                return store_sort;
            }

            public void setStore_sort(String store_sort) {
                this.store_sort = store_sort;
            }

            public String getStore_time() {
                return store_time;
            }

            public void setStore_time(String store_time) {
                this.store_time = store_time;
            }

            public String getStore_end_time() {
                return store_end_time;
            }

            public void setStore_end_time(String store_end_time) {
                this.store_end_time = store_end_time;
            }

            public String getStore_label() {
                return store_label;
            }

            public void setStore_label(String store_label) {
                this.store_label = store_label;
            }

            public String getStore_banner() {
                return store_banner;
            }

            public void setStore_banner(String store_banner) {
                this.store_banner = store_banner;
            }

            public String getStore_avatar() {
                return store_avatar;
            }

            public void setStore_avatar(String store_avatar) {
                this.store_avatar = store_avatar;
            }

            public String getStore_keywords() {
                return store_keywords;
            }

            public void setStore_keywords(String store_keywords) {
                this.store_keywords = store_keywords;
            }

            public String getStore_description() {
                return store_description;
            }

            public void setStore_description(String store_description) {
                this.store_description = store_description;
            }

            public String getStore_qq() {
                return store_qq;
            }

            public void setStore_qq(String store_qq) {
                this.store_qq = store_qq;
            }

            public String getStore_ww() {
                return store_ww;
            }

            public void setStore_ww(String store_ww) {
                this.store_ww = store_ww;
            }

            public String getStore_phone() {
                return store_phone;
            }

            public void setStore_phone(String store_phone) {
                this.store_phone = store_phone;
            }

            public String getStore_zy() {
                return store_zy;
            }

            public void setStore_zy(String store_zy) {
                this.store_zy = store_zy;
            }

            public Object getStore_domain() {
                return store_domain;
            }

            public void setStore_domain(Object store_domain) {
                this.store_domain = store_domain;
            }

            public String getStore_domain_times() {
                return store_domain_times;
            }

            public void setStore_domain_times(String store_domain_times) {
                this.store_domain_times = store_domain_times;
            }

            public String getStore_recommend() {
                return store_recommend;
            }

            public void setStore_recommend(String store_recommend) {
                this.store_recommend = store_recommend;
            }

            public String getStore_theme() {
                return store_theme;
            }

            public void setStore_theme(String store_theme) {
                this.store_theme = store_theme;
            }

            public StoreCreditBean getStore_credit() {
                return store_credit;
            }

            public void setStore_credit(StoreCreditBean store_credit) {
                this.store_credit = store_credit;
            }

            public String getStore_desccredit() {
                return store_desccredit;
            }

            public void setStore_desccredit(String store_desccredit) {
                this.store_desccredit = store_desccredit;
            }

            public String getStore_servicecredit() {
                return store_servicecredit;
            }

            public void setStore_servicecredit(String store_servicecredit) {
                this.store_servicecredit = store_servicecredit;
            }

            public String getStore_deliverycredit() {
                return store_deliverycredit;
            }

            public void setStore_deliverycredit(String store_deliverycredit) {
                this.store_deliverycredit = store_deliverycredit;
            }

            public int getStore_collect() {
                return store_collect;
            }

            public void setStore_collect(int store_collect) {
                this.store_collect = store_collect;
            }

            public String getStore_slide() {
                return store_slide;
            }

            public void setStore_slide(String store_slide) {
                this.store_slide = store_slide;
            }

            public String getStore_slide_url() {
                return store_slide_url;
            }

            public void setStore_slide_url(String store_slide_url) {
                this.store_slide_url = store_slide_url;
            }

            public Object getStore_stamp() {
                return store_stamp;
            }

            public void setStore_stamp(Object store_stamp) {
                this.store_stamp = store_stamp;
            }

            public Object getStore_printdesc() {
                return store_printdesc;
            }

            public void setStore_printdesc(Object store_printdesc) {
                this.store_printdesc = store_printdesc;
            }

            public String getStore_sales() {
                return store_sales;
            }

            public void setStore_sales(String store_sales) {
                this.store_sales = store_sales;
            }

            public Object getStore_presales() {
                return store_presales;
            }

            public void setStore_presales(Object store_presales) {
                this.store_presales = store_presales;
            }

            public Object getStore_aftersales() {
                return store_aftersales;
            }

            public void setStore_aftersales(Object store_aftersales) {
                this.store_aftersales = store_aftersales;
            }

            public Object getStore_workingtime() {
                return store_workingtime;
            }

            public void setStore_workingtime(Object store_workingtime) {
                this.store_workingtime = store_workingtime;
            }

            public String getStore_free_price() {
                return store_free_price;
            }

            public void setStore_free_price(String store_free_price) {
                this.store_free_price = store_free_price;
            }

            public String getStore_decoration_switch() {
                return store_decoration_switch;
            }

            public void setStore_decoration_switch(String store_decoration_switch) {
                this.store_decoration_switch = store_decoration_switch;
            }

            public String getStore_decoration_only() {
                return store_decoration_only;
            }

            public void setStore_decoration_only(String store_decoration_only) {
                this.store_decoration_only = store_decoration_only;
            }

            public String getStore_decoration_image_count() {
                return store_decoration_image_count;
            }

            public void setStore_decoration_image_count(String store_decoration_image_count) {
                this.store_decoration_image_count = store_decoration_image_count;
            }

            public Object getLive_store_name() {
                return live_store_name;
            }

            public void setLive_store_name(Object live_store_name) {
                this.live_store_name = live_store_name;
            }

            public Object getLive_store_address() {
                return live_store_address;
            }

            public void setLive_store_address(Object live_store_address) {
                this.live_store_address = live_store_address;
            }

            public Object getLive_store_tel() {
                return live_store_tel;
            }

            public void setLive_store_tel(Object live_store_tel) {
                this.live_store_tel = live_store_tel;
            }

            public Object getLive_store_bus() {
                return live_store_bus;
            }

            public void setLive_store_bus(Object live_store_bus) {
                this.live_store_bus = live_store_bus;
            }

            public boolean isIs_own_shop() {
                return is_own_shop;
            }

            public void setIs_own_shop(boolean is_own_shop) {
                this.is_own_shop = is_own_shop;
            }

            public String getBind_all_gc() {
                return bind_all_gc;
            }

            public void setBind_all_gc(String bind_all_gc) {
                this.bind_all_gc = bind_all_gc;
            }

            public Object getStore_vrcode_prefix() {
                return store_vrcode_prefix;
            }

            public void setStore_vrcode_prefix(Object store_vrcode_prefix) {
                this.store_vrcode_prefix = store_vrcode_prefix;
            }

            public String getStore_baozh() {
                return store_baozh;
            }

            public void setStore_baozh(String store_baozh) {
                this.store_baozh = store_baozh;
            }

            public String getStore_baozhopen() {
                return store_baozhopen;
            }

            public void setStore_baozhopen(String store_baozhopen) {
                this.store_baozhopen = store_baozhopen;
            }

            public String getStore_baozhrmb() {
                return store_baozhrmb;
            }

            public void setStore_baozhrmb(String store_baozhrmb) {
                this.store_baozhrmb = store_baozhrmb;
            }

            public String getStore_qtian() {
                return store_qtian;
            }

            public void setStore_qtian(String store_qtian) {
                this.store_qtian = store_qtian;
            }

            public String getStore_zhping() {
                return store_zhping;
            }

            public void setStore_zhping(String store_zhping) {
                this.store_zhping = store_zhping;
            }

            public String getStore_erxiaoshi() {
                return store_erxiaoshi;
            }

            public void setStore_erxiaoshi(String store_erxiaoshi) {
                this.store_erxiaoshi = store_erxiaoshi;
            }

            public String getStore_tuihuo() {
                return store_tuihuo;
            }

            public void setStore_tuihuo(String store_tuihuo) {
                this.store_tuihuo = store_tuihuo;
            }

            public String getStore_shiyong() {
                return store_shiyong;
            }

            public void setStore_shiyong(String store_shiyong) {
                this.store_shiyong = store_shiyong;
            }

            public String getStore_shiti() {
                return store_shiti;
            }

            public void setStore_shiti(String store_shiti) {
                this.store_shiti = store_shiti;
            }

            public String getStore_xiaoxie() {
                return store_xiaoxie;
            }

            public void setStore_xiaoxie(String store_xiaoxie) {
                this.store_xiaoxie = store_xiaoxie;
            }

            public String getStore_huodaofk() {
                return store_huodaofk;
            }

            public void setStore_huodaofk(String store_huodaofk) {
                this.store_huodaofk = store_huodaofk;
            }

            public String getStore_free_time() {
                return store_free_time;
            }

            public void setStore_free_time(String store_free_time) {
                this.store_free_time = store_free_time;
            }

            public String getMb_title_img() {
                return mb_title_img;
            }

            public void setMb_title_img(String mb_title_img) {
                this.mb_title_img = mb_title_img;
            }

            public Object getDeliver_region() {
                return deliver_region;
            }

            public void setDeliver_region(Object deliver_region) {
                this.deliver_region = deliver_region;
            }

            public int getGoods_count() {
                return goods_count;
            }

            public void setGoods_count(int goods_count) {
                this.goods_count = goods_count;
            }

            public double getStore_credit_average() {
                return store_credit_average;
            }

            public void setStore_credit_average(int store_credit_average) {
                this.store_credit_average = store_credit_average;
            }

            public int getStore_credit_percent() {
                return store_credit_percent;
            }

            public void setStore_credit_percent(int store_credit_percent) {
                this.store_credit_percent = store_credit_percent;
            }

            public String getStore_time_text() {
                return store_time_text;
            }

            public void setStore_time_text(String store_time_text) {
                this.store_time_text = store_time_text;
            }

            public String getSc_name() {
                return sc_name;
            }

            public void setSc_name(String sc_name) {
                this.sc_name = sc_name;
            }

            public boolean isIs_favorate() {
                return is_favorate;
            }

            public void setIs_favorate(boolean is_favorate) {
                this.is_favorate = is_favorate;
            }

            public List<?> getMb_sliders() {
                return mb_sliders;
            }

            public void setMb_sliders(List<?> mb_sliders) {
                this.mb_sliders = mb_sliders;
            }

            public static class StoreCreditBean {
                /**
                 * text : 描述相符
                 * credit : 5
                 * percent : ----
                 * percent_class : equal
                 * percent_text : 持平
                 */

                private StoreDesccreditBean store_desccredit;
                /**
                 * text : 服务态度
                 * credit : 5
                 * percent : ----
                 * percent_class : equal
                 * percent_text : 持平
                 */

                private StoreServicecreditBean store_servicecredit;
                /**
                 * text : 发货速度
                 * credit : 5
                 * percent : ----
                 * percent_class : equal
                 * percent_text : 持平
                 */

                private StoreDeliverycreditBean store_deliverycredit;

                public StoreDesccreditBean getStore_desccredit() {
                    return store_desccredit;
                }

                public void setStore_desccredit(StoreDesccreditBean store_desccredit) {
                    this.store_desccredit = store_desccredit;
                }

                public StoreServicecreditBean getStore_servicecredit() {
                    return store_servicecredit;
                }

                public void setStore_servicecredit(StoreServicecreditBean store_servicecredit) {
                    this.store_servicecredit = store_servicecredit;
                }

                public StoreDeliverycreditBean getStore_deliverycredit() {
                    return store_deliverycredit;
                }

                public void setStore_deliverycredit(StoreDeliverycreditBean store_deliverycredit) {
                    this.store_deliverycredit = store_deliverycredit;
                }

                public static class StoreDesccreditBean {
                    private String text;
                    private double credit;
                    private String percent;
                    private String percent_class;
                    private String percent_text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public double getCredit() {
                        return credit;
                    }

                    public void setCredit(int credit) {
                        this.credit = credit;
                    }

                    public String getPercent() {
                        return percent;
                    }

                    public void setPercent(String percent) {
                        this.percent = percent;
                    }

                    public String getPercent_class() {
                        return percent_class;
                    }

                    public void setPercent_class(String percent_class) {
                        this.percent_class = percent_class;
                    }

                    public String getPercent_text() {
                        return percent_text;
                    }

                    public void setPercent_text(String percent_text) {
                        this.percent_text = percent_text;
                    }
                }

                public static class StoreServicecreditBean {
                    private String text;
                    private double credit;
                    private String percent;
                    private String percent_class;
                    private String percent_text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public double getCredit() {
                        return credit;
                    }

                    public void setCredit(int credit) {
                        this.credit = credit;
                    }

                    public String getPercent() {
                        return percent;
                    }

                    public void setPercent(String percent) {
                        this.percent = percent;
                    }

                    public String getPercent_class() {
                        return percent_class;
                    }

                    public void setPercent_class(String percent_class) {
                        this.percent_class = percent_class;
                    }

                    public String getPercent_text() {
                        return percent_text;
                    }

                    public void setPercent_text(String percent_text) {
                        this.percent_text = percent_text;
                    }
                }

                public static class StoreDeliverycreditBean {
                    private String text;
                    private double credit;
                    private String percent;
                    private String percent_class;
                    private String percent_text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public double getCredit() {
                        return credit;
                    }

                    public void setCredit(int credit) {
                        this.credit = credit;
                    }

                    public String getPercent() {
                        return percent;
                    }

                    public void setPercent(String percent) {
                        this.percent = percent;
                    }

                    public String getPercent_class() {
                        return percent_class;
                    }

                    public void setPercent_class(String percent_class) {
                        this.percent_class = percent_class;
                    }

                    public String getPercent_text() {
                        return percent_text;
                    }

                    public void setPercent_text(String percent_text) {
                        this.percent_text = percent_text;
                    }
                }
            }
        }
    }

}
