object InventorySystem extends App {

    case class Product(name : String , quantity : Int , price : Double)

    type Inventory = Map[Int,Product]

    val inventory1 : Inventory = Map(
        101 -> Product("A" , 10 , 15.50),
        102 -> Product("B" , 5 , 25.00),
        103 -> Product("C" , 8 , 10.75)
    )

    val inventory2 : Inventory = Map(
        102 -> Product("B" , 3 , 27.00),
        104 -> Product("D" , 7 , 12.50)
    )

    def getAllProductNames(inventory : Inventory) : List[String] ={
        inventory.values.map(_.name).toList
    }

    def CalculateTotalValue(inventory : Inventory) : Double ={
        inventory.values.map(product => product.quantity*product.price).sum
    }

    def isEmpty(inventory: Inventory): Boolean = {
        inventory.isEmpty
    }

    def mergeInventories(inv1: Inventory, inv2: Inventory): Inventory = {
    inv2.foldLeft(inv1) {
        case (acc, (id, product)) =>
            acc.get(id) match {
            case Some(existingProduct) =>
                acc + (id -> existingProduct.copy(
                quantity = existingProduct.quantity + product.quantity,
                price = math.max(existingProduct.price, product.price)
                ))
            case None => acc + (id -> product)
            }
        }
    }

    def printProductDetails(inventory: Inventory, productId: Int): Unit = {
        inventory.get(productId) match {
        case Some(product) => println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
        case None => println(s"Product with ID $productId does not exist.")
        }
    }

    println("Product names in inventory1: " + getAllProductNames(inventory1))

    println("Total value of products in inventory1: " + CalculateTotalValue(inventory1))

    println("Is inventory1 empty? " + isEmpty(inventory1))

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged Inventory: " + mergedInventory)

    printProductDetails(inventory1, 102)

}