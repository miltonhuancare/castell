
package com.tecsup.castell.controller.campain;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.tecsup.castell.model.Campain;
import com.tecsup.castell.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("campain")
@SessionAttributes("campain")
public class CampainControler {
    
    @Autowired
    CampainService service;
    
     @RequestMapping(method = RequestMethod.GET)
    public String index(Model model ){
    model.addAttribute("campain", service.all());
    return "campain/index";
     }
    
     @RequestMapping("create")
    public String create(Model model) {

        model.addAttribute("campain", new Campain());
        return "campain/formulario";
    }
    
   @RequestMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {

        Campain campain = service.find(id);
        
        if (campain==null){
            return "rediret:/campain";
        }
        model.addAttribute("campain",campain);
        return "campain/formulario";
    }
       @RequestMapping("save")
    public String save(@ModelAttribute Campain campain) {
   try {
       
        service.save(campain);
   } catch (Exception ex){
       ex.printStackTrace();
   }
        return "redirect:/campain";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.delete(id);
        return "redirect:/campain";
    }

}
