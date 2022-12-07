import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;

import entity.Person;


import java.util.*;

public class Four_DeWeight {
    public static void main(String[] args) {
        String jsonStr = "[{\n" +
                "    \"name\": \"张三\",\n" +
                "    \"serial\": \"0001\"\n" +
                "  }, {\n" +
                "    \"name\": \"李四\",\n" +
                "    \"serial\": \"0002\"\n" +
                "  }, {\n" +
                "    \"name\": \"王五\",\n" +
                "    \"serial\": \"0003\"\n" +
                "  }, {\n" +
                "    \"name\": \"王五2\",\n" +
                "    \"serial\": \"0003\"\n" +
                "  }, {\n" +
                "    \"name\": \"赵四\",\n" +
                "    \"serial\": \"0004\"\n" +
                "  }, {\n" +
                "    \"name\": \"小明\",\n" +
                "    \"serial\": \"005\"\n" +
                "  }, {\n" +
                "    \"name\": \"小张\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"小李\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"小李2\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"赵四2\",\n" +
                "    \"serial\": \"0004\"\n" +
                "  }]";

        List<Person> lists = JSON.parseArray(jsonStr, Person.class);
        HashSet set = new HashSet(lists);
        //把List集合所有元素清空
        lists.clear();
        //把HashSet对象添加至List集合
        lists.addAll(set);
//        for (Object o : set) {
//            System.out.println(o);
//        }
        //hashset转换为JSON串
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jsonTest",JSONObject.toJSONString(set));

        System.out.println(jsonObject.getString("jsonTest"));
    }
}
