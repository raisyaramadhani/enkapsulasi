public class TestSiswa {
    public static void main(String[] args) {
        
        //TODO code application logic here
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Raisya");
        siswa.setAge(17);
        siswa.setAddress(" Malang");

        System.out.println("nama : "+siswa.getName() + " alamat" +siswa.getAddress()+ " berumur " +siswa.getAge() + " tahun");
    }
}
