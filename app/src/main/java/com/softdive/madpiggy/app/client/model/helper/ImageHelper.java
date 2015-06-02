package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Image;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.Imageable;

import java.util.*;

public class ImageHelper {

	public static Image getCoverImage(Imageable imageable, ImageType imageType) {
		Image img = null;
		if (imageable.getImages() != null) {
			for (Image image : imageable.getImages()) {
				if (image.getName().equals(imageable.getCoverImage()) && imageType == image.getImgType()) {
					img = image;
					break;
				}
			}
		}
		if (img == null) {
			img = getOriginalCoverImageImage(imageable);
		}

		if (img == null) {
			Collection<Image> images = getImages(imageable, imageType);
			if (images != null && images.size() > 0) {
				img = images.iterator().next();
			}
		}
		return img;
	}

	private static Image getOriginalCoverImageImage(Imageable imageable) {
		if (imageable.getImages() != null) {
			for (Image image : imageable.getImages()) {
				if (image.getName().equals(imageable.getCoverImage()) && image.getImgType() == ImageType.ORIG) {
					return image;
				}
			}
		}
		return null;
	}

	public static Collection<Image> getImages(Imageable imageable, ImageType type) {
		Map<String, Map<ImageType, Image>> imageMap = new LinkedHashMap<>();
		if (imageable.getImages() != null) {
			for (Image image : imageable.getImages()) {
				Map<ImageType, Image> imap = imageMap.get(image.getName());
				if (imap == null) {
					imap = new LinkedHashMap<>();
					imageMap.put(image.getName(), imap);
				}
				imap.put(image.getImgType(), image);
			}
		}

		List<Image> images = new ArrayList<>();
		for (Map<ImageType, Image> imap : imageMap.values()) {
			if (imap.get(type) != null) {
				images.add(imap.get(type));
			} else {
				images.add(imap.get(ImageType.ORIG));
			}
		}
		return images;
	}
}
