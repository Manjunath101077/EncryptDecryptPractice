package com.PracticeSpring.SpringBractice.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Component
public class CBSJsonRequestPlain {

    @JsonProperty("SOURCE_ID")
    private String sourceId;

    @JsonProperty("ACCOUNT_NUMBER")
    private String accNo;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getAccNo() {
        return accNo;
    }

    public Map<String,Object> toHashMap() throws IllegalAccessException {
        Map<String,Object> hashMap=new HashMap<>();

        Field[] fileds= getClass().getDeclaredFields();

        for(Field field:fileds){
            if (field.isAnnotationPresent(JsonProperty.class)){
                String value=field.getAnnotation(JsonProperty.class).value();
                field.setAccessible(true);
                hashMap.put(value,field.get(this));
            }
        }

return hashMap;

    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
}
