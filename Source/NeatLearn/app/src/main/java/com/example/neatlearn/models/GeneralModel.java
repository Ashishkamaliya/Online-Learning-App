package com.example.neatlearn.models;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class GeneralModel implements Serializable {
    File Uri;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    String designation;

    public File getUri() {
        return Uri;
    }

    public void setUri(File uri) {
        Uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmobileno() {
        return mobileno;
    }

    public void getmobileno(String mobileno) {
        this.mobileno = mobileno;
    }
    public String getWeight_id() {
        return weight_id;
    }

    public void setWeight_id(String weight_id) {
        this.weight_id = weight_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    String price;

    String weight_id;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    String whatsapp_no;

    public String getWhatsapp_no() {
        return whatsapp_no;
    }

    public void setWhatsapp_no(String whatsapp_no) {
        this.whatsapp_no = whatsapp_no;
    }

    public String getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(String customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    String customer_type_id;

    public String getSource_of_inquiry() {
        return source_of_inquiry;
    }

    public void setSource_of_inquiry(String source_of_inquiry) {
        this.source_of_inquiry = source_of_inquiry;
    }

    String source_of_inquiry;

    public String getGst_no() {
        return gst_no;
    }

    public void setGst_no(String gst_no) {
        this.gst_no = gst_no;
    }

    String gst_no;

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(String isActivity) {
        this.isActivity = isActivity;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    String id;
    String name;
    String code;
    String country_id;
    String isDelete;
    String pincode;
    String state_id;
    String slug;
    String isActivity;
    String class_id;
    String state_name;
    String mobileno;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    String customer_name;

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    String country_name;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    String city_name;

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    String local_id;

    public String getStatus_count() {
        return status_count;
    }

    public void setStatus_count(String status_count) {
        this.status_count = status_count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    String status_count;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;
    String company_name;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    String image_path;
    String title;
    String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    String disc;

    public GeneralModel() {

    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String person_name, address,department;

    public String getExpance_type() {
        return expance_type;
    }

    public void setExpance_type(String expance_type) {
        this.expance_type = expance_type;
    }

    String expance_type;

    public String getExpance_image_flag() {
        return expance_image_flag;
    }

    public void setExpance_image_flag(String expance_image_flag) {
        this.expance_image_flag = expance_image_flag;
    }

    String expance_image_flag;

    public String getExpanse_fixamount() {
        return expanse_fixamount;
    }

    public void setExpanse_fixamount(String expanse_fixamount) {
        this.expanse_fixamount = expanse_fixamount;
    }

    String expanse_fixamount;

    String sub_id;

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    String sub_name;
    String latitud;
    String longitud;
    String pincolor;

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPincolor() {
        return pincolor;
    }

    public void setPincolor(String pincolor) {
        this.pincolor = pincolor;
    }

    public String getPintext() {
        return pintext;
    }

    public void setPintext(String pintext) {
        this.pintext = pintext;
    }

    String pintext;
    String topcategoryid;

    public String getTopcategoryid() {
        return topcategoryid;
    }

    public void setTopcategoryid(String topcategoryid) {
        this.topcategoryid = topcategoryid;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    String categoryid;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    String discount;

    public int getSubpossition() {
        return subpossition;
    }

    public void setSubpossition(int subpossition) {
        this.subpossition = subpossition;
    }

    int subpossition;

    public ArrayList<GeneralModel> getComplain_subcategory() {
        return complain_subcategory;
    }

    public void setComplain_subcategory(ArrayList<GeneralModel> complain_subcategory) {
        this.complain_subcategory = complain_subcategory;
    }

    ArrayList<GeneralModel> complain_subcategory;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;
}
