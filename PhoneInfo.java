package org.phone;

public class PhoneInfo {

private void phoneName() {
	System.out.println("phone name : vivo ");
}
private void phoneMieiNum() {
	System.out.println("phone mieinum : 234386545 ");
}
private void camera() {
	System.out.println("camera : 6gb ");

}
private void storage() {
	System.out.println("storage : 128gb ");

}
private void osName() {
	System.out.println("os name : android ");

}
public static void main(String[] args) {
	PhoneInfo p=new PhoneInfo();
	p.phoneName();
	p.phoneMieiNum();
	p.camera();
	p.osName();
	p.storage();
}

}
