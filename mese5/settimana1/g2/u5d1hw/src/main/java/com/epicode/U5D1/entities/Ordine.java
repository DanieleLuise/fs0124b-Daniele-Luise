package com.epicode.U5D1.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private List<Item> elementiMenu = new ArrayList<>();
    private Integer numeroOrdine;
    private Integer numeroCoperti;
    private LocalDate oraAcquisizione;
}
