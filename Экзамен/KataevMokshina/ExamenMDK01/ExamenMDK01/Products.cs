//------------------------------------------------------------------------------
// <auto-generated>
//     Этот код создан по шаблону.
//
//     Изменения, вносимые в этот файл вручную, могут привести к непредвиденной работе приложения.
//     Изменения, вносимые в этот файл вручную, будут перезаписаны при повторном создании кода.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ExamenMDK01
{
    using System;
    using System.Collections.Generic;
    
    public partial class Products
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Products()
        {
            this.Payment_Schedules = new HashSet<Payment_Schedules>();
            this.Product_Sales = new HashSet<Product_Sales>();
        }
    
        public long ID_Product { get; set; }
        public string Name_Product { get; set; }
        public long ID_Type { get; set; }
        public System.DateTime Date_Delivery { get; set; }
        public int Estimated_Cost { get; set; }
        public long ID_Worker { get; set; }
        public int Cost_Secured { get; set; }
        public int Cost_Redemption { get; set; }
        public long ID_Clients { get; set; }
    
        public virtual Clients Clients { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Payment_Schedules> Payment_Schedules { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Product_Sales> Product_Sales { get; set; }
        public virtual Types Types { get; set; }
        public virtual Workers Workers { get; set; }
    }
}
