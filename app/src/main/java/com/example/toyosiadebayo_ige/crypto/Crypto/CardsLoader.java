package com.example.toyosiadebayo_ige.crypto.Crypto;

import android.content.AsyncTaskLoader;
import android.content.Context;


/**
 * Created by toyosi.adebayo-ige on 30/10/2017.
 */


public class CardsLoader extends AsyncTaskLoader<Card[]> {

    //api url string to load the price of bitcoin and ethereum crypto currency in 20 diffferent currencies
    private static final String urlString = "https://min-api.cryptocompare.com/data/pricemulti?" +
            "fsyms=BTC,ETH&tsyms=NGN,GBP,USD,EUR,CNY,EGP,GHS,AED,INR,KWD,QAR,SAR,ZAR,IDR,CAD,DZD," +
            "UGX,RUB,PHP,MYR";

    public CardsLoader(Context context){
        super(context);
    }

    @Override
    public Card[] loadInBackground() {
        return UtilityClass.extractCryptoCards(urlString);
    }
}
