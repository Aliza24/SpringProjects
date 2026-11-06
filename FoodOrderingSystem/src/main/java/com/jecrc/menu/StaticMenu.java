package com.jecrc.menu;

import com.jecrc.model.Menu;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StaticMenu implements MenuProvider {

    private List<Menu> menu;

    public StaticMenu(List<Menu> menu) {
        this.menu = menu;
    }

    @Override
    public List<Menu> getMenu() {
        return menu;
    }
}