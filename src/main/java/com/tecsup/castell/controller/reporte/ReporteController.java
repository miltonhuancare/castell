package com.tecsup.castell.controller.reporte;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reporte")
public class ReporteController {

    @RequestMapping("pdf")
    public String pdf(Model model) {

        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo", "12");
        notas.put("Eduardo", "10.5");
        notas.put("Milton", "11");
        notas.put("Gino", "12");
        notas.put("Alonso", "13");
        notas.put("Erick", "10");
        
        model.addAttribute("reporteNotas", notas);
        return "reportePDF";
    }
    
    @RequestMapping("excel")
    public String excel(Model model) {

        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo", "12");
        notas.put("Eduardo", "10.5");
        notas.put("Milton", "11");
        notas.put("Gino", "12");
        notas.put("Alonso", "13");
        notas.put("Erick", "10");
        
        model.addAttribute("reporteNotas", notas);
        return "reporteExcel";
    }
}
