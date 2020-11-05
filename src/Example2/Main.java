package Example2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main{

    static String jsonStr = JsonItemString.getJsonData();

    public static void main(String[] args) throws JsonProcessingException {



        ObjectMapper objectMapper = new ObjectMapper();

        ItemObject testObject = objectMapper.readValue(jsonStr, ItemObject.class);



        Item result1 = testObject.getItems().stream()
                .filter(x -> "Cotton Tabard".equals(x.getItemName()))
                .findAny()
                .orElse(null);

        assert result1 != null;
        System.out.println(result1.printInfo());


    }

}
