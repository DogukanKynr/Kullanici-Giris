import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newUserName, newPassword ;
        String userName1 = ("patika");
        String password1 = ("java123");
        int a = 0;

        System.out.print("Kullanıcı Adı : ");
        userName = input.nextLine();
        System.out.print("Şifre : ");
        password = input.nextLine();

        if(userName.equals(userName1) && password.equals(password1)){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Bilgileriniz yanlış");
            System.out.print("Giriş bilgilerinizi yenilemek için 1'e basınız : ");
            a = input.nextInt();
            switch(a){
                case 1:
                    System.out.print("Yeni Kulllanıcı Adınızı Giriniz : ");
                    newUserName = input.next();
                    if(newUserName.equals(userName1)){
                        System.out.print("Kullanıcı adı oluşturulamadı, lütfen başka bir kullanıcı adı giriniz : ");
                        newUserName = input.next();
                        System.out.println("Kullanıcı adı oluşturuldu.");
                    }
                    else{
                        System.out.println("Kullanıcı adı oluşturuldu.");
                    }

                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    newPassword = input.next();
                    if(newPassword.equals(password1)){
                            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                            newPassword = input.next();
                            System.out.println("Şifre oluşturuldu.");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz bir numara tuşladınız.");
                    break;
        }


        }

    }


}