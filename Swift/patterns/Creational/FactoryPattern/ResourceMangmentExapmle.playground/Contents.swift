import UIKit

import Foundation


protocol ResourceFactoryProtocol {
    
   static func create() -> String
}


class ProductionResourceFactory : ResourceFactoryProtocol {
   
    static func create() -> String {
        
        return "https://productionServer"
    }
}


class DevResourceFactory : ResourceFactoryProtocol {

    
    
    static func create() -> String {
        
        return "https://devServer"
    }
}


protocol URLFactoryProtocol {
    
    func create() -> String?
}


class URLFactory : URLFactoryProtocol {
    
    var env: Environment
    
    enum Environment {
        case prod
        case dev
    }
    
    init(env : Environment){ self.env = env }
    
    func create() -> String? {
        
        switch self.env {
            
        case .dev :
            return DevResourceFactory.create()
        
        case .prod:
            return ProductionResourceFactory.create()
            
        }
    }
}


func factoryMainCall(){
    
    var urlFactory = URLFactory(env: .dev)
    print (urlFactory.create() ?? "")
   
    urlFactory = URLFactory(env: .prod)
    print (urlFactory.create() ?? "")

    

}



factoryMainCall()
