
package com.tecsup.castell.controller.security;

import com.tecsup.castell.helper.CastellException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandlerControler {
    
    @ExceptionHandler(CastellException.class)
       public ModelAndView handlerCastellException(HttpServletRequest rq, Exception ex){
     ModelAndView vistaError = new ModelAndView();
     
     vistaError.setViewName("helper/error");
     vistaError.addObject("titulo","Error de Porceso");
     vistaError.addObject("mensaje", ex.getMessage());
     return vistaError;
     }
    
    
     @ExceptionHandler(Exception.class)
       public ModelAndView handlerException(HttpServletRequest rq, Exception ex){
     ModelAndView vistaError = new ModelAndView();
     
     vistaError.setViewName("helper/error");
     vistaError.addObject("titulo","Error de Programación");
     vistaError.addObject("mensaje", ex.getMessage());
     return vistaError;
     }
    
}
