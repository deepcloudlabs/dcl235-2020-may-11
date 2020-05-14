import com.example.lottery.service.LotteryService;

module com.example.lottery.application.module {
    requires com.example.lottery.module;
    uses LotteryService;
}