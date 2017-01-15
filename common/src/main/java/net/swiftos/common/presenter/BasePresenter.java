package net.swiftos.common.presenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by ganyao on 2016/10/26.
 */

public abstract class BasePresenter {

    protected CompositeSubscription compositeSubscription;

    //RXjava取消注册，以避免内存泄露
    public void onUnsubscribe() {
        if (compositeSubscription != null && compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
        }
    }

    //RXjava注册
    public void addSubscription(Subscription subscriber) {
        if (compositeSubscription == null) {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(subscriber);
    }

    public void onViewInited() {

    }

    public void onViewDestoryed() {
        onUnsubscribe();
    }

    public <T> void onGetPar(T t) {

    }


}
