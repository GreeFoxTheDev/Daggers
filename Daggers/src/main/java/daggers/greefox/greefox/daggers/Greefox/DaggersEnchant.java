package daggers.greefox.greefox.daggers.Greefox;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DaggersEnchant implements Listener {
    Main plugin;

    public DaggersEnchant(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onApplyDiamond(@NotNull InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("diamond_dagger")) {
                    ItemStack item = event.getCurrentItem();
                    ItemMeta im = item.getItemMeta();
                    List<String> lore = im.getLore();
                    if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                        int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                        double sharpDamage = 0.5 * enchLevel + 0.5;
                        double finalDamage = (3.5 + sharpDamage);
                        String finalDamageString = String.valueOf(finalDamage);
                        assert lore != null;
                        String lore0 = lore.get(0);
                        String lore1 = lore.get(1);
                        String lore3 = lore.get(3);

                        lore.clear();
                        lore.add(lore0);
                        lore.add(lore1);
                        lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                        lore.add(lore3);
                        im.setLore(lore);
                        item.setItemMeta(im);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyIron(@NotNull InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("iron_dagger")) {
                    ItemStack item = event.getCurrentItem();
                    ItemMeta im = item.getItemMeta();
                    List<String> lore = im.getLore();
                    if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                        int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                        double sharpDamage = 0.5 * enchLevel + 0.5;
                        double finalDamage = (3 + sharpDamage);
                        String finalDamageString = String.valueOf(finalDamage);
                        assert lore != null;
                        String lore0 = lore.get(0);
                        String lore1 = lore.get(1);
                        String lore3 = lore.get(3);

                        lore.clear();
                        lore.add(lore0);
                        lore.add(lore1);
                        lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                        lore.add(lore3);
                        im.setLore(lore);
                        item.setItemMeta(im);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyGold(@NotNull InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("gold_dagger")) {
                    ItemStack item = event.getCurrentItem();
                    ItemMeta im = item.getItemMeta();
                    List<String> lore = im.getLore();
                    if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                        int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                        double sharpDamage = 0.5 * enchLevel + 0.5;
                        double finalDamage = (2.3 + sharpDamage);
                        String finalDamageString = String.valueOf(finalDamage);
                        assert lore != null;
                        String lore0 = lore.get(0);
                        String lore1 = lore.get(1);
                        String lore3 = lore.get(3);

                        lore.clear();
                        lore.add(lore0);
                        lore.add(lore1);
                        lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                        lore.add(lore3);
                        im.setLore(lore);
                        item.setItemMeta(im);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onApplyCopper(@NotNull InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("copper_dagger")) {
                    ItemStack item = event.getCurrentItem();
                    ItemMeta im = item.getItemMeta();
                    List<String> lore = im.getLore();
                    if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL)) {
                        int enchLevel = im.getEnchantLevel(Enchantment.DAMAGE_ALL);
                        double sharpDamage = 0.5 * enchLevel + 0.5;
                        double finalDamage = (2.3 + sharpDamage);
                        String finalDamageString = String.valueOf(finalDamage);
                        assert lore != null;
                        String lore0 = lore.get(0);
                        String lore1 = lore.get(1);
                        String lore3 = lore.get(3);

                        lore.clear();
                        lore.add(lore0);
                        lore.add(lore1);
                        lore.add(ChatColor.DARK_GREEN + " " + finalDamageString + " Attack Damage");
                        lore.add(lore3);
                        im.setLore(lore);
                        item.setItemMeta(im);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onEnchantCopper(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasLocalizedName() && event.getCurrentItem().getItemMeta().getLocalizedName().contains("dagger")) {
                ItemStack item = event.getCurrentItem();
                ItemMeta im = item.getItemMeta();
                if (item.getItemMeta().hasEnchants()) {
                    String itemName = item.getItemMeta().getDisplayName();
                    String normalItemName = itemName.replace("§f", "");
                    im.setDisplayName(ChatColor.AQUA + normalItemName);
                    item.setItemMeta(im);
                }
            }
        }
    }
}