
import java.util.Map;

public class Sentence {
  private String sentID;
  private String content;
  private Map<String,Integer>mp;
  private double sentScore;
  

  public Sentence(String id,String cont,Map<String,Integer>map,double score){
    this.sentID = id;
    this.content = cont;
    this.mp = map;
    this.sentScore = score;
  }
  
  public Map<String, Integer> getMp() {
    return mp;
  }
  
  public void setMp(Map<String, Integer> mp) {
    this.mp = mp;
  }
 
  public String getSentID() {
    return sentID;
  }
  public void setSentID(String sentID) {
    this.sentID = sentID;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
 
  public double getSentScore() {
    return sentScore;
  }

  public void setSentScore(double sentScore) {
    this.sentScore = sentScore;
  }

  
  

}
