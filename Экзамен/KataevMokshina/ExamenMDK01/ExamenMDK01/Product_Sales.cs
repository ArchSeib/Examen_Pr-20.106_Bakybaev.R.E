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
    
    public partial class Product_Sales
    {
        public long ID_Product_Sale { get; set; }
        public long ID_Product { get; set; }
        public System.DateTime Date_Sale { get; set; }
        public long ID_Worker { get; set; }
        public int Cost { get; set; }
    
        public virtual Products Products { get; set; }
        public virtual Workers Workers { get; set; }
    }
}
