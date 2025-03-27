/*
 * 본 소프트웨어 및 관련 문서 파일(이하 "소프트웨어")의 사본을 취득한 모든 사람에게 소프트웨어를 제한 없이 거래할 수 있는 권한이 무상으로 부여됩니다.
 * 여기에는 소프트웨어 사본을 사용, 복사, 수정, 병합, 게시, 배포, 하위 라이선스 및/또는 판매할 수 있는 권한이 포함되며,
 * 소프트웨어가 제공된 사람에게는 다음 조건에 따라 그렇게 할 수 있는 권한이 부여됩니다.
 *
 * 위의 저작권 고지와 이 허가 고지는 소프트웨어의 모든 사본 또는 실질적인 부분에 포함되어야 합니다.
 *
 * 소프트웨어는 상품성, 특정 목적에의 적합성 및 비침해를 포함하되 이에 국한되지 않는 명시적 또는 묵시적 보증 없이 "있는 그대로" 제공됩니다.
 * 어떠한 경우에도 저자 또는 저작권자는 계약, 불법 행위 또는 기타 행위에 따른 소송에서 소프트웨어 또는 소프트웨어의
 * 사용 또는 기타 거래와 관련하여 발생하는 모든 청구, 손해 또는 기타 책임에 대해 책임을 지지 않습니다.
 */

package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.configuration.annotations.DeviceProperties;

@DeviceProperties(
        xmlTag = "FrDriverController", name = "DriverController")
public class DiverController{

    private DcMotor LeftUpMotor     = null;
    private DcMotor RightUpMotor    = null;
    private DcMotor LeftDownMotor   = null;
    private DcMotor RightDownMotor  = null;

    public DiverController(HardwareMap hardwareMap, String leftUp, String rightUp, String leftDown, String rightDown) {
        this.LeftUpMotor        = hardwareMap.get(DcMotor.class, leftUp);
        this.RightUpMotor       = hardwareMap.get(DcMotor.class, rightUp);
        this.LeftDownMotor      = hardwareMap.get(DcMotor.class, leftDown);
        this.RightDownMotor     = hardwareMap.get(DcMotor.class, rightDown);
    }


    public void Front() {
        LeftUpMotor.setPower(1.0);
        RightUpMotor.setPower(1.0);
        LeftDownMotor.setPower(1.0);
        RightDownMotor.setPower(1.0);
    }
}
