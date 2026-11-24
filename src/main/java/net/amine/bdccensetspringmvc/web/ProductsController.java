
package net.amine.bdccensetspringmvc.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import net.amine.bdccensetspringmvc.entities.Products;
import net.amine.bdccensetspringmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired //  l'injection des depandences oubien en utlise le constructeure
    private ProductRepository productRepository;

    @GetMapping("/user/index") // acceder a cette methode
    @PreAuthorize("hasRole('USER')")
    public String index(Model model){
        List<Products> products =productRepository.findAll();
        model.addAttribute("productsList",products);
        return "products";
    }


    // Nouvelle méthode pour ADMIN
    @GetMapping("/admin/index")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminIndex(Model model){
        List<Products> products = productRepository.findAll();
        model.addAttribute("productsList", products);
        return "products";
    }

    @GetMapping("/") // acceder a cette methode
    public String home(){
        return "redirect:/user/index";
    }

    @PostMapping("/admin/delete")
    @PreAuthorize("hasRole('ADMIN')")
    public String delete(@RequestParam(name ="id")Long id){
        productRepository.deleteById(id);
        return "redirect:/admin/index";
    }

    @GetMapping("/admin/newProducts")
    @PreAuthorize("hasRole('ADMIN')")
    public String newProducts(Model model){
        model.addAttribute("products", new Products());   // <-- seule ligne changée
        return "new-products";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/admin/saveProduct")
    public String saveProduct(@Valid Products product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())
            return "new-products";
        productRepository.save(product);
        return "redirect:/admin/index";
    }

    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }
}
