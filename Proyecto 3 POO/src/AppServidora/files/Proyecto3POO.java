/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.files;
import AppServidora.modelo.Alimento;
import AppServidora.negocio.FileControl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muril
 */

public class Proyecto3POO {
    public static void main(String[] args) {
    
        ArrayList lista = new ArrayList();
        lista.add(new Alimento("PRN-001", "Pollo en salsa de hongos", "Dos libras de pechuga de pollo cubierta con salsa de hongos",900,2,321,160,4000, "src\\img\\catalago\\polloSalsaHongos.png"));
        lista.add(new Alimento("PRN-002", "Arroz con pollo y camarones", "Arroz con pollo tradicional de una forma diferente con camarones",1200,6,606,303,3500, "src\\img\\catalago\\arrozPolloCamarones.png"));
        lista.add(new Alimento("PRN-003", "Brochetas de camarón con pimientos al ajo y cebolla", "Deliciosas brochetas de camarón con ajo y cebolla", 500,2,192,96,3000, "src\\img\\catalago\\brochetasCamaron.png"));
        lista.add(new Alimento("PRN-004", "Filete de corvina en salsa blanca", "Filete de corvina en salsa blanca",454,4,446,223,5000,"src\\img\\catalago\\fileteCorvina.png" ));
        lista.add(new Alimento("PRN-005", "Bistec encebollado", "Una libra de rico bistec encebollado",500,5,198,99,3000, "src\\img\\catalago\\bistecEncebolla.png"));
        lista.add(new Alimento("PRN-006", "Albóndigas en salsa boloñesa", "Deliciosas albóndigas bañadas en salsa boloñesa",500,8,188,94,3000, "src\\img\\catalago\\albondigas.png"));
        lista.add(new Alimento("PRN-007", "Espaguetis y res en salsa blanca", "500 gramos de espagueti en salsa de espinacas con hongos",600,6,426,213,4500,"src\\img\\catalago\\espagueti.png"));
        lista.add(new Alimento("PRN-008", "Filete de pescado a la caribeña", "Filete de pescado corvina con salsa de tomate",600,3,387,193,4500,"src\\img\\catalago\\filetePecadoCaribeña.jpg"));
        lista.add(new Alimento("PRN-009", "Costillas en salsa de mostaza, kétchup y miel", "Costillas al horno, bañadas en salsa de mostaza, kétchup y miel",1200,6,260,130,5000,"src\\img\\catalago\\costillas.jpg"));
        lista.add(new Alimento("PRN-010", "Muslos de pollo apanados", "Rico muslos de pollo apanados en pocos minutos",800,4,776,388,3000, "src\\img\\catalago\\muslosPollo.png"));
        lista.add(new Alimento("ENT-001", "Quesadilla de pollo", "Tortilla de trigo rellena de tomate, queso y pollo",800,4,776,388,3000, "src\\img\\catalago\\quesadilla.jpg"));
        lista.add(new Alimento("ENT-002", "Crema de brócoli crocante y queso", "Crema de brócoli con trocitos de brócoli, crocante y queso",500,4,648,324,2000, "src\\img\\catalago\\cremaBrocoli.png"));
        lista.add(new Alimento("ENT-003", "Brochetas de camarón con tomate y especias", "Deliciosas brochetas de camarón con especias",300,4,200,100,2000, "src\\img\\catalago\\brochetasCamaronEntrada.jpg"));
        lista.add(new Alimento("ENT-004", "Tacos al pastor","Tortilla con trozos de carne, cebolla y cilantro",500,10,149,74,4000, "src\\img\\catalago\\tacosAlPastor.jpg"));
        lista.add(new Alimento("ENT-005", "Champiñones rellenos con crema", "Champiñones rellenos de deliciosa crema de queso y tomates picados",800,5,281,140,2500,"src\\img\\catalago\\champiñones.jpg"));
        lista.add(new Alimento("ENT-006", "Ceviche de corvina con picante", "Ceviche con ketchup picante y cilantro",1100,4,269,134,3000, "src\\img\\catalago\\ceviche.jpg"));
        lista.add(new Alimento("BEB-001", "Coca cola", "Bebida gaseosa",100,1,42,21,500,"src\\img\\catalago\\coca.jfif"));
        lista.add(new Alimento("BEB-002", "Fanta", "Bebida gaseosa",100,1,39,19,500,"src\\img\\catalago\\fanta.jfif"));
        lista.add(new Alimento("BEB-003", "Sprite", "Bebida gaseosa",100,1,37,18,500, "src\\img\\catalago\\sprite.jfif"));
        lista.add(new Alimento("BEB-004", "Pepsi", "Bebida gaseosa",100,1,44,22,500, "src\\img\\catalago\\pepsi.jfif"));
        lista.add(new Alimento("BEB-005", "Fanta de limón", "Bebida gaseosa",100,2,46,23,500, "src\\img\\catalago\\fantaLimon.jfif"));
        lista.add(new Alimento("BEB-006", "Limonada", "Bebida natural",100,1,50,25,800, "src\\img\\catalago\\limonada.jfif"));
        lista.add(new Alimento("BEB-007", "Jugo de manzana", "Bebida natural",100,1,46,23,800, "src\\img\\catalago\\jugoManzana.jpg"));
        lista.add(new Alimento("BEB-008", "Jugo de mora", "Bebida natural",100,1,48,25,800, "src\\img\\catalago\\jugoMora.jfif"));
        lista.add(new Alimento("BEB-009", "Jugo de naranja", "Bebida natural",100,1,48,24,800,"src\\img\\catalago\\jugoNaranja.jfif"));
        lista.add(new Alimento("BEB-010", "Jugo de pera", "Bebida natural",100,1,60,30,800, "src\\img\\catalago\\jugoPera.jfif"));
        lista.add(new Alimento("PTR-001", "Trufas de cereza con chocolate", "Bombones de cereza cubiertos de chocolate",1400,30,134,67,3000,"src\\img\\catalago\\trufas.jfif"));
        lista.add(new Alimento("PTR-002", "Pie de limón", "Mezcla perfecta entre limón y leche condensada",800,16,246,123,3000, "src\\img\\catalago\\pieLimon.jfif"));
        lista.add(new Alimento("PTR-003", "Gelatina cremosa de frambuesa", "Dulce y cremosa gelatina de frambuesa",1500,16,174,87,3000, "src\\img\\catalago\\gelatina.jpg"));
        lista.add(new Alimento("PTR-004", "Flan de chocolate", "Postre de flan y chocolate nesquik",800,16,202,101,3000, "src\\img\\catalago\\flan.jfif"));
        lista.add(new Alimento("PTR-005", "Alfajores", "Alfajores rellenos de dulce de leche",800,24,203,101,3000,"src\\img\\catalago\\alfajores.jfif"));
        lista.add(new Alimento("PTR-006", "Cheesecake de fresa", "Cheesecake de fresa con galletas María molidas y leche condensada",1100,18,240,120,3000, "src\\img\\catalago\\cheesecake.jfif"));
        ArrayList pedido = new ArrayList();

        for (Object i: lista) {
            System.out.println(((Alimento)i).toString());            
        }
        
        FileControl map = new FileControl();
        int resultado = map.writeFile("src\\AppServidora\\files\\catalogoAlimentos.dat", lista);
        System.out.println(resultado);
   
        List<Object> listaCatalogo = map.loadFile("src\\AppServidora\\files\\catalogoAlimentos.dat");
        if (listaCatalogo != null){
            
            for (Object i: listaCatalogo){
                System.out.println(((Alimento)i).toString());
            }
    }
    }
    
}
