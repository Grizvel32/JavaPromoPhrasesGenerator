package com.company;

import java.util.Random;

public class PromoPhrasesGenerator {
    private Random random = null;

    private PhraseList callToActionPhrases = null;
    private PhraseList itemPhrases = null;
    private PhraseList brandPhrases = null;
    private PhraseList prepositionPhrases = null;
    private PhraseList placePhrases = null;

    public PromoPhrasesGenerator() {
        random = new Random();

        callToActionPhrases = new PhraseList();
        callToActionPhrases.addRange(new String[]{
                "Купи",
                "Выбери",
                "Найди",
                "Забери"
        });

        itemPhrases = new PhraseList();
        itemPhrases.addRange(new String[]{
                "машину",
                "квартиру",
                "телефон",
                "пылесос",
                "стиральную машинку"
        });

        brandPhrases = new PhraseList();
        brandPhrases.addRange(new String[]{
                "Apple",
                "Samsung",
                "Звезда",
                "Philips",
                "Дружба"
        });

        prepositionPhrases = new PhraseList();
        prepositionPhrases.addRange(new String[]{
           "в",
           "на"
        });


        placePhrases = new PhraseList();
        placePhrases.addRange(new String[]{
                "торговом центре",
                "доме отдыха",
                "чёрном рынке",
                "магазине",
                "базаре"
        });
    }

    public String getRandomPhrase() throws Exception{
        int callToActionIndex = random.nextInt(callToActionPhrases.getLength());
        String callToAction = callToActionPhrases.getByIndex(callToActionIndex);

        int itemIndex = random.nextInt(itemPhrases.getLength());
        String item = itemPhrases.getByIndex(itemIndex);

        int brandIndex = random.nextInt(brandPhrases.getLength());
        String brand = brandPhrases.getByIndex(brandIndex);

        int prepositionIndex = random.nextInt(prepositionPhrases.getLength());
        String preposition = prepositionPhrases.getByIndex(prepositionIndex);

        int placeIndex = random.nextInt(placePhrases.getLength());
        String place = placePhrases.getByIndex(placeIndex);
    }

}
