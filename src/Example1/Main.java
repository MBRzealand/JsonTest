package Example1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonStr = "{\"bills\":[{\"amount\":\"13\",\"billId\":\"billid3\"} ,{\"amount\":\"155\",\"billId\":\"billid4\"}]}";

        ObjectMapper objectMapper = new ObjectMapper();

        TestObject testObject = objectMapper.readValue(jsonStr, TestObject.class);



        Bill result1 = testObject.getBills().stream()
                .filter(x -> "billid4".equals(x.getBillId()))
                .findAny()
                .orElse(null);

        assert result1 != null;
        System.out.println(result1.printInfo());


    }

}



