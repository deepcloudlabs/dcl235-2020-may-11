package com.example.domain;

import com.example.Audit;

@Audit
public class Account {

    // status codes defined: 1..10
    private AccountStatus status; // ACTIVE, CLOSED, BLOCKED

    public AccountStatus getStatus() {
        return status;
    }

    // validation: compile-time -> compiler
    public void setStatus(AccountStatus status) {
        this.status = status;
        /*
        this.status = switch(status){
            case 1,2,3,4,5,6,7,8,9,10 -> {
               yield status;
            }
            default -> {
                throw new IllegalArgumentException("Undefined status code");
            }
        };
        switch(status){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                throw new IllegalArgumentException("Undefined status code");
        }

         */
    }
}
