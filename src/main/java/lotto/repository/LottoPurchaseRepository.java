package lotto.repository;

import lotto.domain.LottoPurchase;

import java.util.ArrayList;
import java.util.List;

public class LottoPurchaseRepository {

    List<LottoPurchase> lottoPurchases = new ArrayList<>();

    public void save(LottoPurchase lottoPurchase) {
        lottoPurchases.add(lottoPurchase);
    }

    public void delete(LottoPurchase lottoPurchase) {
        lottoPurchases.remove(lottoPurchase);
    }

    public List<LottoPurchase> findAll() {
        return lottoPurchases;
    }

    public LottoPurchase findByIndex(int index) {
        return lottoPurchases.get(index);
    }

    public LottoPurchase findOne() {
        return lottoPurchases.getFirst();
    }

    public int size() {
        return lottoPurchases.size();
    }

    public boolean isEmpty() {
        return lottoPurchases.isEmpty();
    }

}