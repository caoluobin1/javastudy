package org.clb.util.reflector;

import lombok.Data;
import org.apache.ibatis.reflection.Reflector;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
@Data
public class ReflectorUtil {
    private  final ConcurrentMap<Class<?>, List<Field>> fileMap = new ConcurrentHashMap<>();
    private  Boolean isCached;

    public ReflectorUtil(Boolean isCached) {
        this.isCached = isCached;
    }

    public List<Field> getAllFiled(Class c) {
        Class parent = c;
        List<Field> res = new ArrayList<>();
        while (parent != null) {
            Field[] declaredFields = parent.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0)
                res.addAll(Arrays.asList(declaredFields));
            parent=parent.getSuperclass();
        }
        if (isCached!=null&&isCached){
            fileMap.put(c,res);
        }
        return res;

    }

}
