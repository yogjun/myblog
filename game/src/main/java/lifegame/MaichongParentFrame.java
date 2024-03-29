package lifegame;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author
 * @date 2020/4/20
 */
public class MaichongParentFrame extends JFrame {
    private int width = 17;
    private int heigh = 17;
//    private int bornChance = 10;
    private int size = width*heigh;
    private boolean[][] life = new boolean[width][heigh];
    private JLabel[] label = new JLabel[size];
    public MaichongParentFrame() {
        con();
    }
    public void nextGeneration() throws InterruptedException {
        while(true){
            Thread.sleep(100);
            //计算隔代生存数
            generation();
            colorJLabel();
        }
    }

    private void con(){
        initLife();
        colorLife();
        // 添加组件
        this.setLayout(new GridLayout(width, heigh));
        for (int i = 0; i < size; i++) {
            this.add(label[i]);
        }
        // 设置窗体属性
        this.setTitle("生命游戏");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    //设置指定格子颜色
    private void setColor(int labelId , boolean exist){
        if (exist) {
            label[labelId].setBackground(Color.BLACK);
        } else {
            label[labelId].setBackground(Color.WHITE);
        }
    }

    private void initLife(){
//        for (int i = 0; i < heigh; i++) {
//            for (int j = 0; j < width; j++) {
//                if(new Random().nextInt(bornChance)==0){
//                    life[i][j]=true;
//                }
//            }
//        }
        life[2][4] = true;
        life[2][5] = true;
        life[2][11] = true;
        life[2][12] = true;
        life[14][4] = true;
        life[14][5] = true;
        life[14][11] = true;
        life[14][12] = true;

        life[3][5] = true;
        life[3][6] = true;
        life[3][10] = true;
        life[3][11] = true;
        life[13][5] = true;
        life[13][6] = true;
        life[13][10] = true;
        life[13][11] = true;

        life[4][2] = true;
        life[4][5] = true;
        life[4][7] = true;
        life[4][9] = true;
        life[4][11] = true;
        life[4][14] = true;
        life[12][2] = true;
        life[12][5] = true;
        life[12][7] = true;
        life[12][9] = true;
        life[12][11] = true;
        life[12][14] = true;

        life[5][2] = true;
        life[5][3] = true;
        life[5][4] = true;
        life[5][6] = true;
        life[5][7] = true;
        life[5][9] = true;
        life[5][10] = true;
        life[5][12] = true;
        life[5][13] = true;
        life[5][14] = true;
        life[11][2] = true;
        life[11][3] = true;
        life[11][4] = true;
        life[11][6] = true;
        life[11][7] = true;
        life[11][9] = true;
        life[11][10] = true;
        life[11][12] = true;
        life[11][13] = true;
        life[11][14] = true;

        life[6][3] = true;
        life[6][5] = true;
        life[6][7] = true;
        life[6][9] = true;
        life[6][11] = true;
        life[6][13] = true;
        life[10][3] = true;
        life[10][5] = true;
        life[10][7] = true;
        life[10][9] = true;
        life[10][11] = true;
        life[10][13] = true;

        life[7][4] = true;
        life[7][5] = true;
        life[7][6] = true;
        life[7][10] = true;
        life[7][11] = true;
        life[7][12] = true;
        life[9][4] = true;
        life[9][5] = true;
        life[9][6] = true;
        life[9][10] = true;
        life[9][11] = true;
        life[9][12] = true;
    }

    private void colorLife(){
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) {
                label[i*width+j] = new JLabel();
                label[i*width+j].setOpaque(true);
                setColor(i*width+j,life[i][j]);
            }
        }
    }

    private void colorJLabel(){
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) {
                setColor(i*width+j,life[i][j]);
            }
        }
    }

    private void generation(){
        boolean[][] tmp = new boolean[life.length][life[0].length];
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) {
                    int sum = sumLifeAround(i,j);
                    if(sum==3){
                        tmp[i][j] = true;
                    }else if(sum==2){
                        tmp[i][j] = life[i][j];
                    }else {
                        tmp[i][j] = false;
                    }
            }
        }
        life = tmp;
    }

    private int sumLifeAround(int x,int y){
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                if(i>=0&&i<heigh&&j>=0&&j<width){
                    if(life[i][j]){
                        sum++;
                    }
                }
            }
        }
        if(life[x][y]){
            sum--;
        }
        return sum;
    }
}
