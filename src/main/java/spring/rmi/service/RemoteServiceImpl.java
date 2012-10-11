package spring.rmi.service;

import org.springframework.stereotype.Service;

@Service
public class RemoteServiceImpl implements RemoteService{

    @Override
    public String getSum(int a, int b) {
        return Integer.toString(a+b);
    }

    @Override
    public String getMultiplication(int a, int b) {
        return Integer.toString(a*b);
    }

}
