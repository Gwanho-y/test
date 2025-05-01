package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItems> items;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addItem(MenuItems item) {
        items.add(item);
    }

    public int getMenuItemCount() {
        return items.size();
    }

    public MenuItems getMenuItem(int index) {
        return items.get(index);
    }
}