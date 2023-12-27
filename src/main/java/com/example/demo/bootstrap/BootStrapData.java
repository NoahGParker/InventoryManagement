package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        InhousePart intel_Cpu = new InhousePart();
        intel_Cpu.setName("Intel Cpu");
        intel_Cpu.setPrice(250.00);
        intel_Cpu.setInv(10);
        intel_Cpu.setMinInventory(1);
        intel_Cpu.setMaxInventory(30);

        InhousePart amd_Cpu = new InhousePart();
        amd_Cpu.setName("Amd Cpu");
        amd_Cpu.setPrice(180.00);
        amd_Cpu.setInv(6);
        amd_Cpu.setMinInventory(1);
        amd_Cpu.setMaxInventory(30);

        InhousePart evga_Video_card = new InhousePart();
        evga_Video_card.setName("Evga Video Card");
        evga_Video_card.setPrice(400.00);
        evga_Video_card.setInv(15);
        evga_Video_card.setMinInventory(1);
        evga_Video_card.setMaxInventory(30);

        InhousePart asus_Video_card = new InhousePart();
        asus_Video_card.setName("Asus Video Card");
        asus_Video_card.setPrice(500.00);
        asus_Video_card.setInv(4);
        asus_Video_card.setMinInventory(1);
        asus_Video_card.setMaxInventory(30);

        InhousePart corsair_Ram_8GB = new InhousePart();
        corsair_Ram_8GB.setName("Corsair Ram 8GB");
        corsair_Ram_8GB.setPrice(89.00);
        corsair_Ram_8GB.setInv(30);
        corsair_Ram_8GB.setMinInventory(1);
        corsair_Ram_8GB.setMaxInventory(30);

        OutsourcedPart evga_power_supply = new OutsourcedPart();
        evga_power_supply.setId(10);
        evga_power_supply.setInv(5);
        evga_power_supply.setPrice(75.00);
        evga_power_supply.setName("Evga Power Supply");
        evga_power_supply.setCompanyName("EVGA 3rd party supplier");
        evga_power_supply.setMinInventory(1);
        evga_power_supply.setMaxInventory(30);

        OutsourcedPart asus_power_supply = new OutsourcedPart();
        asus_power_supply.setId(11);
        asus_power_supply.setInv(15);
        asus_power_supply.setPrice(99.00);
        asus_power_supply.setName("Asus Power Supply");
        asus_power_supply.setCompanyName("Asus 3rd party supplier");
        asus_power_supply.setMinInventory(1);
        asus_power_supply.setMaxInventory(30);

        OutsourcedPart asus_motherboard = new OutsourcedPart();
        asus_motherboard.setId(12);
        asus_motherboard.setInv(5);
        asus_motherboard.setPrice(225.00);
        asus_motherboard.setName("Asus Motherboard Supply");
        asus_motherboard.setCompanyName("Asus 3rd party supplier");
        asus_motherboard.setMinInventory(1);
        asus_motherboard.setMaxInventory(30);

        OutsourcedPart msi_motherboard = new OutsourcedPart();
        msi_motherboard.setId(13);
        msi_motherboard.setInv(12);
        msi_motherboard.setPrice(299.00);
        msi_motherboard.setName("MSI Motherboard ");
        msi_motherboard.setCompanyName("MSI 3rd party supplier");
        msi_motherboard.setMinInventory(1);
        msi_motherboard.setMaxInventory(30);


        OutsourcedPart intel_Ram_16GB = new OutsourcedPart();
        intel_Ram_16GB.setId(14);
        intel_Ram_16GB.setInv(20);
        intel_Ram_16GB.setPrice(125.00);
        intel_Ram_16GB.setName("Intel Ram 16GB");
        intel_Ram_16GB.setCompanyName("Intel 3rd party supplier");
        intel_Ram_16GB.setMinInventory(1);
        intel_Ram_16GB.setMaxInventory(30);

        if(partRepository.count() == 0) {
            partRepository.save(intel_Cpu);
            partRepository.save(amd_Cpu);
            partRepository.save(evga_Video_card);
            partRepository.save(asus_Video_card);
            partRepository.save(corsair_Ram_8GB);
            partRepository.save(evga_power_supply);
            partRepository.save(asus_power_supply);
            partRepository.save(asus_motherboard);
            partRepository.save(msi_motherboard);
            partRepository.save(intel_Ram_16GB);

        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        Product chromebook = new Product (100, "Chrome Book", 299.00, 5);
        Product macbook = new Product (101, "Macbook", 1899.00, 15);
        Product gaming_pc_asus = new Product (102, "Gaming pc with Asus parts", 1299.00, 5);
        Product gaming_pc_msi = new Product (103, "Gaming pc with MSI parts", 2599.00, 3);
        Product desktop_home = new Product (104, "Desktop for basic home actvities", 599.00, 20);


        if(productRepository.count() == 0) {
            productRepository.save(chromebook);
            productRepository.save(macbook);
            productRepository.save(gaming_pc_asus);
            productRepository.save(gaming_pc_msi);
            productRepository.save(desktop_home);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
