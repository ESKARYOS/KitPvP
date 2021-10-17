package dev.com.eskaryos.kitpvp.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaUtils {

    /***
     * Metodo para dar clear no jogador
     * @param p
     */
    public static void clearPlayer(Player p){
        p.getInventory().clear();
        p.setItemOnCursor(new ItemStack(Material.AIR));
        p.getInventory().setArmorContents(new ItemStack[4]);
        p.setHealth(20);
        p.setExhaustion(0);
        p.setFoodLevel(20);
        p.setExp(0);
        for (PotionEffect effect : p.getActivePotionEffects())
            p.removePotionEffect(effect.getType());
    }

    public static void getItemsLobby(Player p){
        clearPlayer(p);

        p.getInventory().setItem(4,add(Material.CHEST,1,0,"§a{Seletor de Kits}", Collections.singletonList("§7Clique para abrir o menu")));
        p.getInventory().setItem(0,add(Material.COMPASS,1,0,"§a{Seletor de Warps}", Collections.singletonList("§7Clique para abrir o menu")));
        p.getInventory().setItem(8,add(Material.EMERALD,1,0,"§a{Click test}", Collections.singletonList("§7Clique para testar seus clicks")));

    }

    public static ItemStack add(Material material,int ammount,int data){
       return new ItemStack(material,ammount,(short)data);
    }
    public static ItemStack add(Material material,int ammount,int data,String name){
        ItemStack item = new ItemStack(material,ammount,(short)data);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack add(Material material, int ammount, int data, String name, List<String> lore){
        ItemStack item = new ItemStack(material,ammount,(short)data);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack add(Material material,int ammount,String name){
        ItemStack item = new ItemStack(material,ammount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack add(Material material, int ammount, String name, List<String> lore){
        ItemStack item = new ItemStack(material,ammount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
