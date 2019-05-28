package com.gem.demo.entity;

public class Message {
    private Integer idyuiy1;

    private String me;

    private String content;

    private Integer mcatoryI;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getMcatoryId() {
        return mcatoryId;
    }

    public void setMcatoryId(Integer mcatoryId) {
        this.mcatoryId = mcatoryId;
    }
}