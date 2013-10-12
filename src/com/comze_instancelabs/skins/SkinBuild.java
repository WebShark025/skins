package com.comze_instancelabs.skins;

import java.awt.Color;
import java.awt.image.BufferedImage;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class SkinBuild {

	static Main main;
	
	public static void buildPartOfImageEast(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, String component){
		main = m;

		if(component.equalsIgnoreCase("arm1_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 5, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ() - 4);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 1, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 4,end.getBlockY(),start.getBlockZ() - j + max_y - 1);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("arm1_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 5, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() - 4);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 4,end.getBlockY(),start.getBlockZ() - j + max_y - 1);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		if(component.equalsIgnoreCase("arm2_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 5, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ() + 11);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 1, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ() + 11);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 4,end.getBlockY(),start.getBlockZ() + j - max_y);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("arm2_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 5, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 11);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 11);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 4,end.getBlockY(),start.getBlockZ() + j - max_y);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		if(component.equalsIgnoreCase("head_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 25, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 25, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() + j - max_y + 9,end.getBlockY(), start.getBlockZ() + i - min_x);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
		    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("head_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ() + 8);

			////getLogger().info(start.toString());
			////getLogger().info(end.toString());


			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){

		    		Color c = new Color(bi.getRGB(i, j));

		    		Block change = p.getWorld().getBlockAt(start.getBlockX()- j + max_y,end.getBlockY(), start.getBlockZ() + i - min_x);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
		    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		
		
		
		if(component.equalsIgnoreCase("hat_left")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY(), p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 8,end.getBlockY() - j + max_y,p.getLocation().getBlockZ() - 1);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
						change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    		}
		    	}
		    }
		}else if(component.equalsIgnoreCase("hat_front")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 12, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() - 1,end.getBlockY() - j + max_y, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}else if(component.equalsIgnoreCase("hat_right")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY() + 12, p.getLocation().getBlockZ() + 7);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 7);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() + i - min_x - 7,end.getBlockY() - j + max_y,start.getBlockZ() + 1);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }
		}else if(component.equalsIgnoreCase("hat_behind")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY(), p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() + 1,end.getBlockY() - j + max_y, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}else if(component.equalsIgnoreCase("hat_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX()- j + max_y,end.getBlockY() + 1, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}

	}
	

	
	
	//TODO: SOUTH
	public static void buildPartOfImageSouth(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, String component){
		main = m;
		if(component.equalsIgnoreCase("arm1_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ() + 5);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - j + max_y,end.getBlockY(),start.getBlockZ() - i + max_x - 4);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.BLACK.getData());
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("arm1_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 5);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - j + max_y,end.getBlockY(),start.getBlockZ() - i + max_x - 4);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.BLACK.getData());
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		if(component.equalsIgnoreCase("arm2_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 7, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ() + 1);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 11, p.getLocation().getBlockY() + 13, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() + j - max_y,end.getBlockY(),start.getBlockZ() - i + max_x);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.BLACK.getData());
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("arm2_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 11, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 6);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 11, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x,end.getBlockY(),start.getBlockZ() + j - max_y);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.BLACK.getData());
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		
		
		if(component.equalsIgnoreCase("head_bottom")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 25, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 25, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		Block change = p.getWorld().getBlockAt(start.getBlockX() + j - max_y + 9,end.getBlockY(), start.getBlockZ() + i - min_x);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
		    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}else if(component.equalsIgnoreCase("head_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ() + 8);

			////getLogger().info(start.toString());
			////getLogger().info(end.toString());


			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){

		    		Color c = new Color(bi.getRGB(i, j));

		    		Block change = p.getWorld().getBlockAt(start.getBlockX()- j + max_y,end.getBlockY(), start.getBlockZ() + i - min_x);
					////getLogger().info(change.getLocation().toString());
		    		change.setType(Material.WOOL);
		    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    	}
		    }	
		}
		
		
		
		
		
		
		if(component.equalsIgnoreCase("hat_left")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY(), p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ());
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i + max_x - 8,end.getBlockY() - j + max_y,p.getLocation().getBlockZ() - 1);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
						change.setData(DyeColor.BLACK.getData());
						change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
		    		}
		    	}
		    }
		}else if(component.equalsIgnoreCase("hat_front")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 12, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() - 1,end.getBlockY() - j + max_y, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}else if(component.equalsIgnoreCase("hat_right")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY() + 12, p.getLocation().getBlockZ() + 7);
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 7);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() + i - min_x - 7,end.getBlockY() - j + max_y,start.getBlockZ() + 1);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }
		}else if(component.equalsIgnoreCase("hat_behind")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY(), p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 7, p.getLocation().getBlockY() + 24, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX() + 1,end.getBlockY() - j + max_y, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}else if(component.equalsIgnoreCase("hat_top")){
			Location current = p.getLocation();
			//getLogger().info("Building " + component);
			Location start = new Location(p.getWorld(), p.getLocation().getBlockX() - 1, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ());
			Location end = new Location(p.getWorld(), p.getLocation().getBlockX() + 6, p.getLocation().getBlockY() + 32, p.getLocation().getBlockZ() + 8);
			
			////getLogger().info(start.toString());
			////getLogger().info(end.toString());
			
			
			for(int i = min_x; i < max_x; i++){
		    	for(int j = min_y; j < max_y; j++){
		    		
		    		Color c = new Color(bi.getRGB(i, j));
		    		
		    		if(!isTransparent(bi, i, j)){
			    		Block change = p.getWorld().getBlockAt(start.getBlockX()- j + max_y,end.getBlockY() + 1, start.getBlockZ() + i - min_x);
						////getLogger().info(change.getLocation().toString());
			    		change.setType(Material.WOOL);
			    		change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
		    		}
		    	}
		    }	
		}

	}
	



	
	// EAST FRONT/BEHIND CUBOID
	public static void buildEastFront(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				if(!isTransparent(bi, min_x + i, min_y + j)){
					Color c = new Color(bi.getRGB(min_x + i, min_y + j));
		    		Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() + i);
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
				}
			}
		}
	}
	
	// EAST FRONT/BEHIND CUBOID INVERTED
	public static void buildEastFrontInvert(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				if(!isTransparent(bi, min_x + i, min_y + j)){
					Color c = new Color(bi.getRGB(min_x + i, min_y + j));
		    		Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() + width - i);
		    		change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
				}
			}
		}
	}
	
	// EAST RIGHT/LEFT CUBOID
	public static void buildEastSide(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start) {
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if(!isTransparent(bi, min_x + i, min_y + j)){
					Color c = new Color(bi.getRGB(min_x + i, min_y + j));
					Block change = p.getWorld().getBlockAt(start.getBlockX() + width - i, start.getBlockY() + height - j, start.getBlockZ());
					change.setType(Material.WOOL);
					change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());	
				}
			}
		}
	}
	
	

	// WEST FRONT/BEHIND CUBOID
	public static void buildWestFront(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() - i);
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// WEST FRONT/BEHIND CUBOID INVERTED
	public static void buildWestFrontInvert(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() - width + i);
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// WEST RIGHT/LEFT CUBOID
	public static void buildWestSide(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start) {
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
				Block change = p.getWorld().getBlockAt(start.getBlockX() - width + i, start.getBlockY() + height - j, start.getBlockZ());
				change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}

	
	

	// SOUTH FRONT/BEHIND CUBOID
	public static void buildSouthFront(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX() - i, start.getBlockY() + height - j, start.getBlockZ());
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// SOUTH FRONT/BEHIND CUBOID INVERTED
	public static void buildSouthFrontInvert(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX() - width + i, start.getBlockY() + height - j, start.getBlockZ());
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// SOUTH RIGHT/LEFT CUBOID
	public static void buildSouthSide(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start) {
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
				Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() + width - i);
				change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	
	

	// NORTH FRONT/BEHIND CUBOID
	public static void buildNorthFront(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX() + i, start.getBlockY() + height - j, start.getBlockZ());
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// NORTH FRONT/BEHIND CUBOID INVERTED
	public static void buildNorthFrontInvert(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start){
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
	    		Block change = p.getWorld().getBlockAt(start.getBlockX() + width - i, start.getBlockY() + height - j, start.getBlockZ());
	    		change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	// NORTH RIGHT/LEFT CUBOID
	public static void buildNorthSide(Main m, Player p, BufferedImage bi, int min_x, int max_x, int min_y, int max_y, Location start) {
		
		int width = max_x - min_x;
		int height = max_y - min_y;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Color c = new Color(bi.getRGB(min_x + i, min_y + j));
				Block change = p.getWorld().getBlockAt(start.getBlockX(), start.getBlockY() + height - j, start.getBlockZ() - width + i);
				change.setType(Material.WOOL);
				change.setData(DyeColor.valueOf(m.getStringFromColor(c)).getData());
			}
		}
	}
	
	
	
	
	public static boolean isTransparent(BufferedImage img, int x, int y) {
		int pixel = img.getRGB(x, y);
		if ((pixel >> 24) == 0x00) {
			return true;
		}
		return false;
	}
}