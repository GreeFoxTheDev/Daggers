package daggers.greefox.greefox.daggers.Greefox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Daggers extends JavaPlugin {
    public static void init(){
        createIronDagger();
        createGoldDagger();
        createDiamondDagger();
        createCopperDagger();
    }
    public static ItemStack ironDagger;
    private static void createIronDagger(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fIron Dagger");
        im.setLocalizedName("iron_dagger");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 3 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 2.5 Attack Speed");
        im.setLore(lore);
        im.setCustomModelData(12);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -1.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        ironDagger=item;
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("iron_dagger"), item);
        sr.addIngredient(1, Material.IRON_INGOT);
        sr.addIngredient(1, Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack goldDagger;
    private static void createGoldDagger(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fGold Dagger");
        im.setLocalizedName("gold_dagger");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(10);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 2.5 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 2.5 Attack Speed");
        im.setLore(lore);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -1.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        goldDagger = item;
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("golden_dagger"), item);
        sr.addIngredient(1, Material.GOLD_INGOT);
        sr.addIngredient(1, Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack diamondDagger;
    private static void createDiamondDagger(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fDiamond Dagger");
        im.setLocalizedName("diamond_dagger");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(10);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 3.5 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 2.5 Attack Speed");
        im.setLore(lore);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -1.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 3.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        diamondDagger = item;

        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("diamond_dagger"), item);
        sr.addIngredient(1, Material.DIAMOND);
        sr.addIngredient(1, Material.STICK);

        SmithingRecipe smr = new SmithingRecipe(NamespacedKey.minecraft("netherite_dagger"), item,
                new RecipeChoice.ExactChoice(diamondDagger), //base on upgrade gear
                new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)); //addictio

        Bukkit.getServer().addRecipe(sr);
        Bukkit.getServer().addRecipe(smr);
    }
    public static ItemStack copperDagger;
    private static void createCopperDagger(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCopper Dagger");
        im.setLocalizedName("copper_dagger");
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        im.setCustomModelData(13);
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.DARK_GREEN + " 2.3 Attack Damage");
        lore.add(ChatColor.DARK_GREEN + " 2.5 Attack Speed");
        im.setLore(lore);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -1.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 2.3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        copperDagger = item;
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("copper_dagger"), item);
        sr.addIngredient(1, Material.COPPER_INGOT);
        sr.addIngredient(1, Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}