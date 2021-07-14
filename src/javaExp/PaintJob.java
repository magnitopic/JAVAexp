package javaExp;

public class PaintJob {
	public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		double area = width * height;
		double i = 0;
		while ((i + extraBuckets) * areaPerBucket < area) {
			i++;
		}
		return (int) i;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double area = width * height;
		double i = 0;
		do {
			i++;
		} while (i * areaPerBucket < area);
		return (int) i;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double i = 0;
		do {
			i++;
		} while (i * areaPerBucket < area);
		return (int) i;
	}
}
