package com.backend.service.impl;

import com.backend.service.CytoscapeService;
import org.springframework.stereotype.Service;

@Service
public class CytoscapeServiceImpl implements CytoscapeService {

    @Override
    public String getCompanyData() {
        return "{\n" +
                "  \"elements\": [\n" +
                "    { \"data\": { \"id\": \"a1\", \"type\": \"L_3\", \"node\": \"12540740\", \"banNm\": \"萬OOO股份有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a30\", \"type\": \"L_3\", \"node\": \"19754458\", \"banNm\": \"OO加油站股份有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a31\", \"type\": \"L_3\", \"node\": \"27843567\", \"banNm\": \"OO有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a32\", \"type\": \"L_3\", \"node\": \"37827566\", \"banNm\": \"OOO蛋糕有限公司XX門市\" } },\n" +
                "    { \"data\": { \"id\": \"a33\", \"type\": \"L_3\", \"node\": \"85233331\", \"banNm\": \"正好停股份有限公司三重商工站\" } },\n" +
                "    { \"data\": { \"id\": \"a34\", \"type\": \"L_3\", \"node\": \"91552810\", \"banNm\": \"O水盒餐廚工坊\" } },\n" +
                "    { \"data\": { \"id\": \"a2\", \"type\": \"O_3\", \"node\": \"ACT (FASTENERS & COMPONENTS) LTD\", \"banNm\": \"ACT (FASTENERS & COMPONENTS) LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a3\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a4\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a5\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\" } },\n" +
                "    { \"data\": { \"id\": \"a6\", \"type\": \"O_3\", \"node\": \"ASSOCIATED FASTENING PRODUCTS, INC.\", \"banNm\": \"ASSOCIATED FASTENING PRODUCTS, INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a7\", \"type\": \"O_3\", \"node\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\", \"banNm\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a8\", \"type\": \"O_3\", \"node\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\", \"banNm\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\" } },\n" +
                "    { \"data\": { \"id\": \"a9\", \"type\": \"O_3\", \"node\": \"CAN-AM TOOL CORP.\", \"banNm\": \"CAN-AM TOOL CORP.\" } },\n" +
                "    { \"data\": { \"id\": \"a10\", \"type\": \"O_3\", \"node\": \"CHUN YU WORKS (USA), INC.\", \"banNm\": \"CHUN YU WORKS (USA), INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a11\", \"type\": \"O_3\", \"node\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\", \"banNm\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a12\", \"type\": \"O_3\", \"node\": \"DANIEL GRUPPE GMBH\", \"banNm\": \"DANIEL GRUPPE GMBH\" } },\n" +
                "    { \"data\": { \"id\": \"a13\", \"type\": \"O_3\", \"node\": \"HFI PYROTECHNICS INC.\", \"banNm\": \"HFI PYROTECHNICS INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a14\", \"type\": \"O_3\", \"node\": \"INDUSTRIAL PRODUCTS COMPANY INC\", \"banNm\": \"INDUSTRIAL PRODUCTS COMPANY INC\" } },\n" +
                "    { \"data\": { \"id\": \"a15\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a16\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a17\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a18\", \"type\": \"O_3\", \"node\": \"OTTO EICHHOFF GMBH & CO. KG\", \"banNm\": \"OTTO EICHHOFF GMBH & CO. KG\" } },\n" +
                "    { \"data\": { \"id\": \"a19\", \"type\": \"O_3\", \"node\": \"RAB COMPONENTS\", \"banNm\": \"RAB COMPONENTS\" } },\n" +
                "    { \"data\": { \"id\": \"a20\", \"type\": \"O_3\", \"node\": \"STATE INDUSTRIAL SUPPLY CORP.\", \"banNm\": \"STATE INDUSTRIAL SUPPLY CORP.\" } },\n" +
                "    { \"data\": { \"id\": \"a21\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\", \"banNm\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a22\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES CR S.R.O.\", \"banNm\": \"SUPPLY TECHNOLOGIES CR S.R.O.\" } },\n" +
                "    { \"data\": { \"id\": \"a23\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES CR S.R.O.\", \"banNm\": \"SUPPLY TECHNOLOGIES CR S.R.O.\" } },\n" +
                "    { \"data\": { \"id\": \"a24\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES-REYNOSA\", \"banNm\": \"SUPPLY TECHNOLOGIES-REYNOSA\" } },\n" +
                "    { \"data\": { \"id\": \"a25\", \"type\": \"O_3\", \"node\": \"TIGGES GMBH & CO. KG\", \"banNm\": \"TIGGES GMBH & CO. KG\" } },\n" +
                "    { \"data\": { \"id\": \"a26\", \"type\": \"O_3\", \"node\": \"TR FASTENINGS AB\", \"banNm\": \"TR FASTENINGS AB\" } },\n" +
                "    { \"data\": { \"id\": \"a27\", \"type\": \"O_3\", \"node\": \"TR FASTENINGS INC.\", \"banNm\": \"TR FASTENINGS INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a28\", \"type\": \"O_3\", \"node\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\", \"banNm\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\" } },\n" +
                "    { \"data\": { \"id\": \"a29\", \"type\": \"O_3\", \"node\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\", \"banNm\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\" } },\n" +
                "    { \"data\": { \"source\": \"a30\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a32\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a34\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a31\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a33\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a2\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a3\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a4\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a5\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a6\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a7\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a8\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a9\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a10\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a11\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a12\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a13\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a14\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a15\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a16\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a17\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a18\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a19\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a20\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a21\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a22\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a23\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a24\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a25\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a26\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a27\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a28\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a29\", \"arrow\": \"sell\" } }\n" +
                "  ]\n" +
                "}\n";
    }

    @Override
    public String getSocialData() {
        return "{\n" +
                "  \"elements\": {\n" +
                "    \"nodes\": [\n" +
                "      {\"data\": {\"id\": \"0\"}},\n" +
                "      {\"data\": {\"id\": \"1\"}},\n" +
                "      {\"data\": {\"id\": \"2\"}},\n" +
                "      {\"data\": {\"id\": \"3\"}},\n" +
                "      {\"data\": {\"id\": \"4\"}},\n" +
                "      {\"data\": {\"id\": \"5\"}},\n" +
                "      {\"data\": {\"id\": \"9\"}},\n" +
                "      {\"data\": {\"id\": \"16\"}},\n" +
                "      {\"data\": {\"id\": \"17\"}},\n" +
                "      {\"data\": {\"id\": \"18\"}},\n" +
                "      {\"data\": {\"id\": \"20\"}},\n" +
                "      {\"data\": {\"id\": \"25\"}},\n" +
                "      {\"data\": {\"id\": \"26\"}},\n" +
                "      {\"data\": {\"id\": \"53\"}},\n" +
                "      {\"data\": {\"id\": \"54\"}},\n" +
                "      {\"data\": {\"id\": \"67\"}},\n" +
                "      {\"data\": {\"id\": \"72\"}},\n" +
                "      {\"data\": {\"id\": \"73\"}},\n" +
                "      {\"data\": {\"id\": \"78\"}},\n" +
                "      {\"data\": {\"id\": \"87\"}},\n" +
                "      {\"data\": {\"id\": \"88\"}},\n" +
                "      {\"data\": {\"id\": \"92\"}},\n" +
                "      {\"data\": {\"id\": \"115\"}},\n" +
                "      {\"data\": {\"id\": \"116\"}},\n" +
                "      {\"data\": {\"id\": \"122\"}},\n" +
                "      {\"data\": {\"id\": \"149\"}},\n" +
                "      {\"data\": {\"id\": \"152\"}},\n" +
                "      {\"data\": {\"id\": \"156\"}},\n" +
                "      {\"data\": {\"id\": \"158\"}},\n" +
                "      {\"data\": {\"id\": \"181\"}},\n" +
                "      {\"data\": {\"id\": \"195\"}},\n" +
                "      {\"data\": {\"id\": \"226\"}}\n" +
                "    ],\n" +
                "    \"edges\": [\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"1\"}},\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"2\"}},\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"3\"}},\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"16\"}},\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"17\"}},\n" +
                "      {\"data\": {\"source\": \"0\", \"target\": \"18\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"9\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"18\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"53\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"54\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"73\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"88\"}},\n" +
                "      {\"data\": {\"source\": \"1\", \"target\": \"92\"}},\n" +
                "      {\"data\": {\"source\": \"2\", \"target\": \"20\"}},\n" +
                "      {\"data\": {\"source\": \"2\", \"target\": \"115\"}},\n" +
                "      {\"data\": {\"source\": \"2\", \"target\": \"116\"}},\n" +
                "      {\"data\": {\"source\": \"2\", \"target\": \"149\"}},\n" +
                "      {\"data\": {\"source\": \"2\", \"target\": \"226\"}},\n" +
                "      {\"data\": {\"source\": \"3\", \"target\": \"9\"}},\n" +
                "      {\"data\": {\"source\": \"3\", \"target\": \"25\"}},\n" +
                "      {\"data\": {\"source\": \"3\", \"target\": \"26\"}},\n" +
                "      {\"data\": {\"source\": \"3\", \"target\": \"67\"}},\n" +
                "      {\"data\": {\"source\": \"3\", \"target\": \"72\"}},\n" +
                "      {\"data\": {\"source\": \"4\", \"target\": \"78\"}},\n" +
                "      {\"data\": {\"source\": \"4\", \"target\": \"152\"}},\n" +
                "      {\"data\": {\"source\": \"4\", \"target\": \"181\"}},\n" +
                "      {\"data\": {\"source\": \"4\", \"target\": \"195\"}},\n" +
                "      {\"data\": {\"source\": \"5\", \"target\": \"87\"}},\n" +
                "      {\"data\": {\"source\": \"5\", \"target\": \"122\"}},\n" +
                "      {\"data\": {\"source\": \"5\", \"target\": \"156\"}},\n" +
                "      {\"data\": {\"source\": \"5\", \"target\": \"158\"}}\n" +
                "    ]\n" +
                "  }\n" +
                "}\n";
    }

    @Override
    public String getData() {
        return "{\n" +
                "  \"elements\": {\n" +
                "    \"nodes\": [\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a1\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"12540740\",\n" +
                "          \"banNm\": \"萬OOO股份有限公司\"\n" +
                "        },\n" +
                "        \"position\": {}\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a30\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"19754458\",\n" +
                "          \"banNm\": \"OO加油站股份有限公司\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": -100,\n" +
                "          \"y\": -125\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a31\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"27843567\",\n" +
                "          \"banNm\": \"OO有限公司\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": -200,\n" +
                "          \"y\": -175\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a32\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"37827566\",\n" +
                "          \"banNm\": \"OOO蛋糕有限公司XX門市\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": -300,\n" +
                "          \"y\": -125\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a33\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"85233331\",\n" +
                "          \"banNm\": \"正好停股份有限公司三重商工站\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": -400,\n" +
                "          \"y\": -175\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a34\",\n" +
                "          \"type\": \"L_3\",\n" +
                "          \"node\": \"91552810\",\n" +
                "          \"banNm\": \"O水盒餐廚工坊\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": -100,\n" +
                "          \"y\": -25\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a2\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"ACT (FASTENERS & COMPONENTS) LTD\",\n" +
                "          \"banNm\": \"ACT (FASTENERS & COMPONENTS) LTD\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -325\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a3\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\",\n" +
                "          \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -375\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a4\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\",\n" +
                "          \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -325\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a5\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\",\n" +
                "          \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -375\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a6\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"ASSOCIATED FASTENING PRODUCTS, INC.\",\n" +
                "          \"banNm\": \"ASSOCIATED FASTENING PRODUCTS, INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -425\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a7\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\",\n" +
                "          \"banNm\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -475\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a8\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\",\n" +
                "          \"banNm\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -425\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a9\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"CAN-AM TOOL CORP.\",\n" +
                "          \"banNm\": \"CAN-AM TOOL CORP.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -475\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a10\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"CHUN YU WORKS (USA), INC.\",\n" +
                "          \"banNm\": \"CHUN YU WORKS (USA), INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -525\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a11\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\",\n" +
                "          \"banNm\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -575\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a12\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"DANIEL GRUPPE GMBH\",\n" +
                "          \"banNm\": \"DANIEL GRUPPE GMBH\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -525\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a13\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"HFI PYROTECHNICS INC.\",\n" +
                "          \"banNm\": \"HFI PYROTECHNICS INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -575\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a14\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"INDUSTRIAL PRODUCTS COMPANY INC\",\n" +
                "          \"banNm\": \"INDUSTRIAL PRODUCTS COMPANY INC\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -625\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a15\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"LAUBE TECHNOLOGY\",\n" +
                "          \"banNm\": \"LAUBE TECHNOLOGY\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -675\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a16\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"LAUBE TECHNOLOGY\",\n" +
                "          \"banNm\": \"LAUBE TECHNOLOGY\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -625\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a17\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"LAUBE TECHNOLOGY\",\n" +
                "          \"banNm\": \"LAUBE TECHNOLOGY\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -675\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a18\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"OTTO EICHHOFF GMBH & CO. KG\",\n" +
                "          \"banNm\": \"OTTO EICHHOFF GMBH & CO. KG\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -725\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a19\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"RAB COMPONENTS\",\n" +
                "          \"banNm\": \"RAB COMPONENTS\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -775\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a20\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"STATE INDUSTRIAL SUPPLY CORP.\",\n" +
                "          \"banNm\": \"STATE INDUSTRIAL SUPPLY CORP.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -725\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a21\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\",\n" +
                "          \"banNm\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -775\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a22\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"SUPPLY TECHNOLOGIES CR S.R.O.\",\n" +
                "          \"banNm\": \"SUPPLY TECHNOLOGIES CR S.R.O.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -825\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a23\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"T.F.C. GERMANY\",\n" +
                "          \"banNm\": \"T.F.C. GERMANY\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -875\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a24\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"TSUBAKI NAKASHIMA CO., LTD.\",\n" +
                "          \"banNm\": \"TSUBAKI NAKASHIMA CO., LTD.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -825\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a25\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"UFS CORPORATION\",\n" +
                "          \"banNm\": \"UFS CORPORATION\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -875\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a26\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"UNIVERSAL FASTENERS SUPPLY INC.\",\n" +
                "          \"banNm\": \"UNIVERSAL FASTENERS SUPPLY INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 100,\n" +
                "          \"y\": -925\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a27\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"VERTEX DISTRIBUTION, INC.\",\n" +
                "          \"banNm\": \"VERTEX DISTRIBUTION, INC.\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 200,\n" +
                "          \"y\": -975\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a28\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"WESTERN FASTENER COMPANY\",\n" +
                "          \"banNm\": \"WESTERN FASTENER COMPANY\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 300,\n" +
                "          \"y\": -925\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"data\": {\n" +
                "          \"id\": \"a29\",\n" +
                "          \"type\": \"O_3\",\n" +
                "          \"node\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\",\n" +
                "          \"banNm\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\"\n" +
                "        },\n" +
                "        \"position\": {\n" +
                "          \"x\": 400,\n" +
                "          \"y\": -975\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"edges\": [\n" +
                "      { \"data\": { \"source\": \"a30\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "      { \"data\": { \"source\": \"a32\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "      { \"data\": { \"source\": \"a34\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "      { \"data\": { \"source\": \"a31\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "      { \"data\": { \"source\": \"a33\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a2\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a3\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a4\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a5\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a6\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a7\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a8\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a9\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a10\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a11\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a12\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a13\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a14\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a15\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a16\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a17\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a18\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a19\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a20\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a21\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a22\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a23\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a24\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a25\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a26\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a27\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a28\", \"arrow\": \"sell\" } },\n" +
                "      { \"data\": { \"source\": \"a1\", \"target\": \"a29\", \"arrow\": \"sell\" } }\n" +
                "    ]\n" +
                "  }\n" +
                "}\n";
    }
}
