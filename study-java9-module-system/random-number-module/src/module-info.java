import com.example.random.service.RandomService;
import com.example.random.service.business.SimpleRandomService;

module com.example.random.module {
    exports com.example.random.service;
    provides RandomService with SimpleRandomService;
}