import com.example.lottery.service.LotteryService;
import com.example.lottery.service.business.SimpleLotteryService;
import com.example.random.service.RandomService;

module com.example.lottery.module {
    exports com.example.lottery.service;
    requires com.example.random.module;
    provides LotteryService with SimpleLotteryService;
    uses RandomService;
}