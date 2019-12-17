package cn.edu.cqu.hospital.tool;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;


public class ImageVerificationCode {

    private int weight = 100;           //��֤��ͼƬ�ĳ��Ϳ�
    private int height = 40;
    private String text;                //����������֤����ı�����
    private Random r = new Random();    //��ȡ���������
    //private String[] fontNames = {"����", "���Ŀ���", "����", "΢���ź�", "����_GB2312"};   //��������
    //��������
    private String[] fontNames = {"Georgia"};
    //��֤������
    private String codes = "23456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";

    /**
     * ��ȡ�������ɫ
     *
     * @return
     */
    private Color randomColor() {
        int r = this.r.nextInt(225);  //����Ϊʲô��225����Ϊ��r��g��b��Ϊ255ʱ����Ϊ��ɫ��Ϊ�˺ñ��ϣ���Ҫ��ɫ��һ�㡣
        int g = this.r.nextInt(225);
        int b = this.r.nextInt(225);
        return new Color(r, g, b);            //����һ�������ɫ
    }

    /**
     * ��ȡ�������
     *
     * @return
     */
    private Font randomFont() {
        int index = r.nextInt(fontNames.length);  //��ȡ���������
        String fontName = fontNames[index];
        int style = r.nextInt(4);         //�����ȡ�������ʽ��0������ʽ��1�ǼӴ֣�2��б�壬3�ǼӴּ�б��
        int size = r.nextInt(10) + 24;    //�����ȡ����Ĵ�С
        return new Font(fontName, style, size);   //����һ�����������
    }

    /**
     * ��ȡ����ַ�
     *
     * @return
     */
    private char randomChar() {
        int index = r.nextInt(codes.length());
        return codes.charAt(index);
    }

    /**
     * �������ߣ���֤�������������ֹ���������ͼƬ
     *
     * @param image
     */
    private void drawLine(BufferedImage image) {
        int num = r.nextInt(10); //��������ߵ�����
        Graphics2D g = (Graphics2D) image.getGraphics();
        for (int i = 0; i < num; i++) {
            int x1 = r.nextInt(weight);
            int y1 = r.nextInt(height);
            int x2 = r.nextInt(weight);
            int y2 = r.nextInt(height);
            g.setColor(randomColor());
            g.drawLine(x1, y1, x2, y2);
        }
    }

    /**
     * ����ͼƬ�ķ���
     *
     * @return
     */
    private BufferedImage createImage() {
        //����ͼƬ������
        BufferedImage image = new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB);
        //��ȡ����
        Graphics2D g = (Graphics2D) image.getGraphics();
        //���ñ���ɫ���
        g.setColor(new Color(255, 255, r.nextInt(245) + 10));
        g.fillRect(0, 0, weight, height);
        //����һ��ͼƬ
        return image;
    }

    /**
     * ��ȡ��֤��ͼƬ�ķ���
     *
     * @return
     */
    public BufferedImage getImage() {
        BufferedImage image = createImage();
        Graphics2D g = (Graphics2D) image.getGraphics(); //��ȡ����
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++)             //���ĸ��ַ�����
        {
            String s = randomChar() + "";      //��������ַ�����Ϊֻ�л��ַ����ķ�����û�л��ַ��ķ�����������Ҫ���ַ�����ַ����ٻ�
            sb.append(s);                      //��ӵ�StringBuilder����
            float x = i * 1.0F * weight / 4;   //�����ַ���x����
            g.setFont(randomFont());           //�������壬���
            g.setColor(randomColor());         //������ɫ�����
            g.drawString(s, x, height - 5);
        }
        this.text = sb.toString();
        drawLine(image);
        return image;
    }

    /**
     * ��ȡ��֤���ı��ķ���
     *
     * @return
     */
    public String getText() {
        return text;
    }

    public static void output(BufferedImage image, OutputStream out) throws IOException                  //����֤��ͼƬд���ķ���
    {
        ImageIO.write(image, "JPEG", out);
    }
}