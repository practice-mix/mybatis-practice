package com.practice.mybatis.repository.jsonconvert.entity;

import com.practice.mybatis.repository.jsonconvert.element.SoftwareOuput;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Person {
    private Long id;

    private List<String> hobbys;

    private List<SoftwareOuput> softwareOutputs;

    private Map<String, String> contactMap;


}
