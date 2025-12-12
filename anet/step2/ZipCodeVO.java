// date 251210 16:07
// title: 주소 내역 불러오기
package anet.step2;

public class ZipCodeVO {
    private  String zipcode = null; // 오라클 서버 zipcode_t 에서 읽어온 우편번호 담기
    private  String address = null; // 주소 정보 담기
    // 사용자 저의 생성자 구현 시 -> 하나라도 파라미터가 있는 생성자가 있으면,
    // default 생성자는 제공 안됨.
    public ZipCodeVO(String zipcode, String address) {
        this.zipcode=zipcode;
        this.address=address;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


}



