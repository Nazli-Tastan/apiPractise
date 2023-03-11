package getRequest;

import java.util.HashMap;
import java.util.Map;

public class deneme03 {

        /*{
        "status": "success",
                "data": {
            "id": 1,
                    "employee_name": "Tiger Nixon",
                    "employee_salary": 320800,
                    "employee_age": 61,
                    "profile_image": ""
        },
        "message": "Successfully! Record has been fetched."
    }*/
        // Parametreli metot oluşturduk dinamik olması için
        public Map<String, Object> Datacreated(int id, String employee_name, int employee_salary, int employee_age, String profile_image) {

            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", id);
            dataMap.put("employee_name", employee_name);
            dataMap.put("employee_salary", employee_salary);
            dataMap.put("employee_age", employee_age);
            dataMap.put("profile_image", profile_image);
            return dataMap;
        }
        public Map<String, Object> expectedDataMap(String status, Map<String, Object> data, String message ){
            Map<String, Object> expectedData = new HashMap<>();
            expectedData.put("status", status);
            expectedData.put("data", data);
            expectedData.put("message", message);
            return expectedData;

        }
















        public Map<String, Object> parametresizData() {

            Map<String, Object> dataMapParametresiz = new HashMap<>();
            dataMapParametresiz.put("id", 1);
            dataMapParametresiz.put("employee_name", "Tiger Nixon");
            dataMapParametresiz.put("employee_salary", 320800);
            dataMapParametresiz.put("employee_age", 61);
            dataMapParametresiz.put("profile_image", "");
            return dataMapParametresiz;


        }
        public Map<String, Object> parametresizData1() {

            Map<String, Object> dataMapParametresiz1 = new HashMap<>();
            dataMapParametresiz1.put("id", 1);
            dataMapParametresiz1.put("employee_name", "RamazanHoca");
            dataMapParametresiz1.put("employee_salary", 900000);
            dataMapParametresiz1.put("employee_age", 35);
            dataMapParametresiz1.put("profile_image", "");
            return dataMapParametresiz1;


        }
}
