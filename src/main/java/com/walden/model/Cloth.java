package com.walden.model;

public class Cloth {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Cloth.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Cloth.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Cloth.from
     *
     * @mbg.generated
     */
    private String from;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Cloth.picid
     *
     * @mbg.generated
     */
    private String picid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Cloth.price
     *
     * @mbg.generated
     */
    private String price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Cloth.id
     *
     * @return the value of Cloth.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Cloth.id
     *
     * @param id the value for Cloth.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Cloth.name
     *
     * @return the value of Cloth.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Cloth.name
     *
     * @param name the value for Cloth.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Cloth.from
     *
     * @return the value of Cloth.from
     *
     * @mbg.generated
     */
    public String getFrom() {
        return from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Cloth.from
     *
     * @param from the value for Cloth.from
     *
     * @mbg.generated
     */
    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Cloth.picid
     *
     * @return the value of Cloth.picid
     *
     * @mbg.generated
     */
    public String getPicid() {
        return picid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Cloth.picid
     *
     * @param picid the value for Cloth.picid
     *
     * @mbg.generated
     */
    public void setPicid(String picid) {
        this.picid = picid == null ? null : picid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Cloth.price
     *
     * @return the value of Cloth.price
     *
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Cloth.price
     *
     * @param price the value for Cloth.price
     *
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}