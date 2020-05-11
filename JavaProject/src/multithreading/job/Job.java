package multithreading.job;

public interface Job {
   public void handleJob();
   public boolean isUsed();
   public void setFlag(boolean flag);
}
