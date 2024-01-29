package org.systech.compliance.actions;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface ActionsMethods {


    default void click(WebElement element){

    }

    default void sendKeysMethod(WebElement element,String text){

    }


    default void comboDropDown(WebElement element,String text){

    }
    default void selectDropDown(){

    }

    default void detectSuccessPopUp(){

    }
    default void radioButton(WebElement element){

    }

    default void clearTextField(WebElement element){
    }

    default void clear(WebElement element,String text){
    }

    default void randomUserSelector(WebElement element){

    };

    default void clickEnter(WebElement element){

    };

    default void doubleClick(WebElement element){};

    default void moveToElement(WebElement element){};

    default void clickRandomCheckBox(WebElement element){};

    default void clickElementWithClassName(String className, int elementIndex){};


     default void performTaskOnElements(List<WebElement> elements){};
     default String generateDateToday(){return null;};
     default WebElement confirmGridPresent(){
         return null;
     };

    default boolean isPopUpPresent() {
        return false;
    }
    default boolean isToastDispayed(){
        return true;
    }
    default String currentDateToday(WebElement element){
        return null;
    };


}
