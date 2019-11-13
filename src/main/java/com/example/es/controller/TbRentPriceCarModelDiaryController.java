package com.example.es.controller;


import com.example.es.entity.TbRentPriceCarModelDiary;
import com.example.es.service.ITbRentPriceCarModelDiaryService;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zyk
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/carModel")
public class TbRentPriceCarModelDiaryController {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    /**
     * @Description: 查询demo
     * @Author: zyk
     * @Date: 2019/11/13 10:11
     * @Param: []
     * @Return: org.elasticsearch.action.get.GetResponse
     */
    @GetMapping("getCarModelData")
    public GetResponse getCarModelData(){
        GetRequest getRequest = new GetRequest("rent","524");
        GetResponse documentFields = null;
        try {
            documentFields = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return documentFields;
    }

    /**
     * @Description:删除 demo
     * @Author: zyk
     * @Date: 2019/11/13 10:11
     * @Param: []
     * @Return: org.elasticsearch.action.delete.DeleteResponse
     */
    @GetMapping("deleteCarModelData")
    public DeleteResponse deleteCarModelData(){
        DeleteRequest deleteRequest = new DeleteRequest("rent","524");
        DeleteResponse deleteResponse = null;
        try {
            deleteResponse = restHighLevelClient.delete(deleteRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deleteResponse;
    }

    /**
     * @Description: 修改demo
     * @Author: zyk
     * @Date: 2019/11/13 10:11
     * @Param: []
     * @Return: org.elasticsearch.action.update.UpdateResponse
     */
    @GetMapping("updateCarModelData")
    public UpdateResponse updateCarModelData(){
        UpdateRequest updateRequest = new UpdateRequest("rent","44362");
        UpdateResponse deleteResponse = null;
        try {
            Map<String,Object> hashMap = new HashMap<>();
            hashMap.put("update_time","122233");
            hashMap.put("company_name","11111111的公司");
            updateRequest.doc(hashMap);
            deleteResponse = restHighLevelClient.update(updateRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deleteResponse;
    }

}
