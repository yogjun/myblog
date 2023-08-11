package kmp;

/**
 * {@link KMP}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/8/11
 */
public class KMP {
  private int[][] dp;
  private String pat;

  // 构建状态机
  public KMP(String pat) {
    this.pat = pat;
    dp = new int[pat.length()][256];
    dp[0][pat.charAt(0)] = 1;
    int x = 0;
    for (int i = 1; i < pat.length(); i++) {
      for (int j = 0; j < 256; j++) {
        dp[i][j] = dp[x][j];
      }
      dp[i][pat.charAt(i)] = i + 1;
      // x的含义就是对应的最大重复串的位置
      x = dp[x][pat.charAt(i)];
    }
  }

  public static void main(String[] args) {
    new KMP("ABCABCD");
  }
}
