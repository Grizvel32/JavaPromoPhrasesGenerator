package com.company;

public class PromoPhrasesGenerator {
    private PhraseList callToActionPhrases = null;
    private PhraseList itemPhrases = null;
    private PhraseList brandPhrases = null;
    private PhraseList prepositionPhrases = null;
    private PhraseList placePhrases = null;

    public PromoPhrasesGenerator() {
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

}
