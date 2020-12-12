public class Supplier implements Comparable<Supplier> {
        private Integer id;
        private String name;
        private String country;
        private String phone;

        public Supplier(Integer id, String name, String country, String phone) {
                this.id = id;
                this.name = name;
                this.country = country;
                this.phone = phone;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getNombre() {
                return name;
        }

        public void setNombre(String nombre) {
                this.name = nombre;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        @Override
        public String toString() {
                return "Supplier{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", country='" + country + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
        }

        @Override
        public int compareTo(Supplier supplier) {
                if (id == supplier.id){
                        return 0;
                } else if (id < supplier.id){//this is less thn argument
                        return -1;
                } else {
                        return 1;
                }
        }
}
