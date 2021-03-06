package cn.dankefu.enums;

import org.nutz.lang.Strings;

/**
 * 资源类型
 * author: 蛋蛋的忧伤
 * date: 2018/5/14 20:43
 */
public enum ResourcesTypeEnum {
    IMAGE("image","图片"),
    VIDEO("video","视频"),
    VOICE("voice","音频"),
    FILE("file","文件");

    String type;
    String desc;

    ResourcesTypeEnum(String type, String desc){
        this.type = type;
        this.desc= desc;
    }

    public static ResourcesTypeEnum valueOf2(String type){
        if(Strings.isBlank(type)){
            return null;
        }
        ResourcesTypeEnum[] values = values();
        for (ResourcesTypeEnum typeEnum : values){
            if(typeEnum.getType().equalsIgnoreCase(type)){
                return typeEnum;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
