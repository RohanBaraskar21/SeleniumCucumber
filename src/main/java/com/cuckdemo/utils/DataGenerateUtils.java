/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package com.cuckdemo.utils;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

public class DataGenerateUtils {

    private DataGenerateUtils() {
        super();
    }

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom random = new SecureRandom();

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(AB.charAt(random.nextInt(AB.length())));
        }
        return sb.toString();
    }

    public static String randomStringHexToken(int byteLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16); // Hexadecimal encoding
    }

    public static String randomStringUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public static int randomNumberIntFromTo(int from, int to) {
        int random_int = (int) Math.floor(Math.random() * (to - from + 1) + from);
        return random_int;
    }

    public static String randomFullName() {
        return DataFakerUtils.getFaker().name().fullName();
    }

    public static String randomPhoneNumber() {
        return DataFakerUtils.getFaker().phoneNumber().phoneNumber();
    }

    public static String randomCountry() {
        return DataFakerUtils.getFaker().address().country();
    }

    public static String randomZipCode() {
        return DataFakerUtils.getFaker().address().zipCode();
    }

    public static String randomAddress() {
        return DataFakerUtils.getFaker().address().fullAddress();
    }

    public static String randomCity() {
        return DataFakerUtils.getFaker().address().cityName();
    }

    public static String randomState() {
        return DataFakerUtils.getFaker().address().state();
    }

    public static String randomStreetName() {
        return DataFakerUtils.getFaker().address().streetName();
    }

    public static String randomJobTitle() {
        return DataFakerUtils.getFaker().job().title();
    }

    public static String randomJobSkills() {
        return DataFakerUtils.getFaker().job().keySkills();
    }

    public static String randomProgrammingLanguage() {
        return DataFakerUtils.getFaker().programmingLanguage().name();
    }


    @Test
    public void testDataGeneration() {
        System.out.println(randomProgrammingLanguage());
        System.out.println(randomJobTitle());
        System.out.println(randomJobSkills());
        System.out.println(randomFullName());
        System.out.println(randomPhoneNumber());
        System.out.println(randomAddress());
        System.out.println(randomCountry());
        System.out.println(randomZipCode());
        System.out.println(randomState());
        System.out.println(randomCity());
        System.out.println(randomStreetName());
    }

}
