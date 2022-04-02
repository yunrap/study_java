package study_java.src.com.yunrap.codingSusSkill;


/* if else 문을 사용한 예이다.
*  그렇다면 이코드를 수정해보면 어떨까?
*
*
* */

/*public class WithoutIfElse {
    public String hintUpdate(HintTesterVo hintTesterVo) {
        HintTesterVo bHint = new HintTesterVo();
        if (hintTesterVo.getRQrId() != null) {      // 차량 RID일때
            bHint.setRId(hintTesterVo.getBRId());
            RfidVo rfidVo = rfidChk(hintTesterVo);
            if (rfidVo == null) {                   // 1
                return "등록되지 않은 RFID 입니다.";
            }
            if (rfidVo.getRInOut().equals("O")) {   // 2
                return "이미 사용중인 RFID 입니다.";
            } else {
                hintTesterVo.setRId(rfidVo.getRId());   //3
                hintTesterVo.setWId(null);
            }

            수정해본다면

            .....






        } else {
            bHint.setWId(hintTesterVo.getBWId());
            WiressVo wiressVo = wiressChk(hintTesterVo);
            if (wiressVo == null) {
                return "등록되지 않은 무전기 입니다.";
            }
            if (wiressVo.getWInOut().equals("O")) {
                return "이미 사용중인 무전기 입니다.";
            } else {
                hintTesterVo.setRId(null);
                hintTesterVo.setWId(wiressVo.getWId());
            }
        }
        int result = testerDao.hintUpdate(hintTesterVo);
        if (result == 0) {
            return "발급에 실패했습니다.";
        } else {
            bHint.setInOut("I");
            hintTesterVo.setInOut("O");
            if (hintTesterVo.getRQrId() != null) {
                bHint.setRId(hintTesterVo.getBRId());
                testerDao.rfidInOut(bHint);
                testerDao.rfidInOut(hintTesterVo);
                testerDao.hintUpdateRsMappingDrAndWr(hintTesterVo);
            } else {
                bHint.setWId(hintTesterVo.getBWId());
                testerDao.wiressInOut(bHint);
                testerDao.wiressInOut(hintTesterVo);
                testerDao.hintUpdateRsMappingDrAndWr(hintTesterVo);
            }
            return "발급에 성공했습니다.";
        }
    }
}*/
