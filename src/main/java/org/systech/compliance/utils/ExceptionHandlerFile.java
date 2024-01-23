package org.systech.compliance.utils;

import org.openqa.selenium.WebElement;
import org.systech.compliance.base.BaseClass;

import java.util.List;

public class ExceptionHandlerFile extends BaseClass {

    public WebElement findE(WebElement element) {
        try {
            return webs.waitVisible(element);
        } catch (Exception e) {
            logger.error(e.getMessage());

            throw e;
        }
    }
    public WebElement findList(List<WebElement> elements) {
        try {
            return webs.waitVisible((WebElement) elements);
        } catch (Exception e) {
            logger.error(e.getMessage());

            throw e;
        }
    }

    public WebElement findClickable(WebElement element) {
        try {
            return webs.waitClickable(element);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }
}

