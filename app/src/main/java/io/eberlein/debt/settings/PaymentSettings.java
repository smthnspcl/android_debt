package io.eberlein.debt.settings;

import java.util.ArrayList;

public class PaymentSettings extends Settings {
    public PaymentSettings(){
        settings = new ArrayList<>();
        settings.add(new PayPalSetting());
        settings.add(new BitcoinSetting());
    }
}
