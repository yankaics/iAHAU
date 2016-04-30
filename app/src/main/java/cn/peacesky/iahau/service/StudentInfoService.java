package cn.peacesky.iahau.service;

import org.litepal.crud.DataSupport;

import java.util.List;

import cn.peacesky.iahau.model.StudentInfo;

/**
 * Created by SuooL on 15/10/6.
 */
public class StudentInfoService {

    public boolean save(StudentInfo linknode) {
        return linknode.save();
    }

    /**
     * 查询所有链接
     *
     * @return
     */
    public List<StudentInfo> findAll() {
        return DataSupport.findAll(StudentInfo.class);
    }

    public void parseBasicInfo(byte[] result) {
    }

}
