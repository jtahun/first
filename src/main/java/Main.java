public class Main {
  public  static void main(String[]args){
    try (HasResource1 res1 = new HasResource1()) {
      System.out.println("make some action.");
      throw new RuntimeException();
    }catch (Exception e){
      e.printStackTrace();
    }
    
    
    //System.out.println("Hello Java!!!");
  }
}

class HasResource1 implements AutoCloseable {
  public  HasResource1(){
    System.out.println("get resouce1");
  }
  public void free(){
    System.out.println("Free resource1");    
  }
  @Override
  public void close(){
    free();
  }
}//some changes

public BeanGetter<JdbcAcces> jdbcAccess;

private List<SomeClass> getSomeFunc(String one, String two){
  return jdbcAccess.get().execute(new ConnectionCallback<List<SomeClass>>(){    //... .execute(new OtherClass
    @Override 
      public List<SomeClass> doInConnection(Connection connection) throws Exception{
        return null;
    }
        
  });
}

class OtherClass implements ConnectionCallback<List<SomeClass>>{
  @Override
    public List<SomeClass> doInConnection(Connection connection) throws Exception{
      
  }
}
