# BetterBus
用Handler封装的Bus，方便使用
##第一步 
  private BetterSubject subject;//定义
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        subject = BetterBus.register("MainActivity");//注册返回subject
        subject.subscibe(new ICyzBus() {//使用subject进行订阅
            @Override
            public void handleMessage(Message msg) {
                
            }
        });
        
##第二步 取消注册
    @Override
    protected void onDestroy() {
        super.onDestroy();
        BetterBus.unRegister("MainActivity");
    }
    
##第三部 在其它线程中发送事件

BetterBus.getSubject("MainActivity").post(msg);
具体可以看例子
