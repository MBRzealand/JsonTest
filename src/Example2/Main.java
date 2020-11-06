package Example2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class Main{

    static void selectItem() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Scanner input = new Scanner(System.in);

        String jsonStr = JsonItemString.getJsonData();


        ItemObject itemObject = objectMapper.readValue(jsonStr, ItemObject.class);


        boolean searchingForItem = true;


        while (searchingForItem) {

            System.out.println("Input Item Name:");

            String searchedItem = input.nextLine();


                Item fetchedItem = itemObject.getItems().stream()
                        .filter(x -> searchedItem.equals(x.getItemName()))
                        .findAny().orElse(null);


                if(fetchedItem != null) {

                    searchingForItem = false;

                    System.out.println(fetchedItem.printInfo());

                } else {
                    System.out.println("Item Doesn't exist");
                }

            }

    }





    public static void main(String[] args) throws JsonProcessingException {

        selectItem();

    }



}
