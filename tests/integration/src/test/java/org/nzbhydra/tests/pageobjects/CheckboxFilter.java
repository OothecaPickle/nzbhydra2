package org.nzbhydra.tests.pageobjects;

import org.nzbhydra.misc.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.popper.fw.webdriver.elements.impl.AbstractWebElement;
import org.popper.fw.webdriver.elements.impl.WebElementReference;

import java.util.List;
import java.util.stream.Collectors;

public class CheckboxFilter extends AbstractWebElement implements ICheckboxFilter {

    public CheckboxFilter(WebElementReference reference) {
        super(reference);
    }


    @Override
    public void filterBy(List<String> values) {
        makeVisible();
        List<WebElement> elements = getWebelement().findElements(By.className("checkbox-filter-option"));
        for (WebElement element : elements) {
            String label = element.getAttribute("data-label");
            boolean wantedButNotSelected = values.contains(label) && !element.isSelected();
            boolean notWantedButSelected = !values.contains(label) && element.isSelected();
            if (wantedButNotSelected || notWantedButSelected) {
                element.click();
            }
        }

        getWebelement().findElement(By.className("checkbox-filter-button-apply")).click();
        Sleep.sleep(200);
    }

    protected void makeVisible() {
        if (!getWebelement().findElement(By.className("checkbox-filter-button-apply")).isDisplayed()) {
            getWebelement().findElement(By.className("toggle-column-filter")).click();
        }
    }

    @Override
    public void selectAll() {
        filterBy(getWebelement().findElements(By.className("checkbox-filter-option")).stream().map(x -> x.getAttribute("data-label")).collect(Collectors.toList()));
        Sleep.sleep(200);
    }

    @Override
    public void invertSelection() {
        getWebelement().findElement(By.className("checkbox-filter-button-invert")).click();
        Sleep.sleep(200);
    }

    @Override
    public void clear() {
        makeVisible();
        getWebelement().findElement(By.className("checkbox-filter-button-clear")).click();
        Sleep.sleep(200);
    }
}
