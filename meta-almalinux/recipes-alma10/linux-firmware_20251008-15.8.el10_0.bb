
PN = "linux-firmware"
PE = "0"
PV = "20251008"
PR = "15.8.el10_0"
PACKAGES = "amd-ucode-firmware atheros-firmware brcmfmac-firmware cirrus-audio-firmware dvb-firmware intel-audio-firmware intel-vsc-firmware iwlegacy-firmware iwlwifi-dvm-firmware iwlwifi-mvm-firmware libertas-firmware linux-firmware linux-firmware-whence mlxsw_spectrum-firmware mrvlprestera-firmware mt7xxx-firmware netronome-firmware nxpwireless-firmware qcom-firmware realtek-firmware tiwilink-firmware amd-gpu-firmware intel-gpu-firmware nvidia-gpu-firmware liquidio-firmware"


URI_amd-ucode-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/amd-ucode-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:amd-ucode-firmware = "linux-firmware-whence ( )"
RPROVIDES:amd-ucode-firmware = "amd-ucode-firmware ( =  20251008-15.8.el10_0)"

URI_atheros-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/atheros-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:atheros-firmware = "linux-firmware-whence ( )"
RPROVIDES:atheros-firmware = "atheros-firmware ( =  20251008-15.8.el10_0)"

URI_brcmfmac-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/brcmfmac-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:brcmfmac-firmware = "linux-firmware-whence ( )"
RPROVIDES:brcmfmac-firmware = "brcmfmac-firmware ( =  20251008-15.8.el10_0)"

URI_cirrus-audio-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cirrus-audio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cirrus-audio-firmware = "linux-firmware-whence ( )"
RPROVIDES:cirrus-audio-firmware = "cirrus-audio-firmware ( =  20251008-15.8.el10_0)"

URI_dvb-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dvb-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:dvb-firmware = "linux-firmware-whence ( )"
RPROVIDES:dvb-firmware = "dvb-firmware ( =  20251008-15.8.el10_0)"

URI_intel-audio-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/intel-audio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-audio-firmware = "linux-firmware-whence ( )"
RPROVIDES:intel-audio-firmware = "intel-audio-firmware ( =  20251008-15.8.el10_0)"

URI_intel-vsc-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/intel-vsc-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-vsc-firmware = "linux-firmware-whence ( )"
RPROVIDES:intel-vsc-firmware = "intel-vsc-firmware ( =  20251008-15.8.el10_0)"

URI_iwlegacy-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlegacy-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlegacy-firmware = "linux-firmware-whence ( )"
RPROVIDES:iwlegacy-firmware = "iwl3945-firmware ( =  20251008-15.8.el10_0) iwl4965-firmware ( =  20251008-15.8.el10_0) iwlegacy-firmware ( =  20251008-15.8.el10_0)"

URI_iwlwifi-dvm-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlwifi-dvm-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlwifi-dvm-firmware = "linux-firmware-whence ( )"
RPROVIDES:iwlwifi-dvm-firmware = "iwl100-firmware ( =  20251008-15.8.el10_0) iwl1000-firmware ( =  1:20251008-15.8.el10_0) iwl105-firmware ( =  20251008-15.8.el10_0) iwl135-firmware ( =  20251008-15.8.el10_0) iwl2000-firmware ( =  20251008-15.8.el10_0) iwl2030-firmware ( =  20251008-15.8.el10_0) iwl5000-firmware ( =  20251008-15.8.el10_0) iwl5150-firmware ( =  20251008-15.8.el10_0) iwl6000-firmware ( =  20251008-15.8.el10_0) iwl6000g2a-firmware ( =  20251008-15.8.el10_0) iwl6000g2b-firmware ( =  20251008-15.8.el10_0) iwl6050-firmware ( =  20251008-15.8.el10_0) iwlwifi-dvm-firmware ( =  20251008-15.8.el10_0)"

URI_iwlwifi-mvm-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlwifi-mvm-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlwifi-mvm-firmware = "linux-firmware-whence ( )"
RPROVIDES:iwlwifi-mvm-firmware = "iwl3160-firmware ( =  1:20251008-15.8.el10_0) iwl7260-firmware ( =  1:20251008-15.8.el10_0) iwlax2xx-firmware ( =  20251008-15.8.el10_0) iwlwifi-mvm-firmware ( =  20251008-15.8.el10_0)"

URI_libertas-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libertas-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libertas-firmware = "linux-firmware-whence ( )"
RPROVIDES:libertas-firmware = "libertas-sd8686-firmware ( <  20251008-15.8.el10_0) libertas-sd8787-firmware ( <  20251008-15.8.el10_0) libertas-usb8388-firmware ( <  2:20251008-15.8.el10_0) libertas-usb8388-olpc-firmware ( <  20251008-15.8.el10_0) libertas-firmware ( =  20251008-15.8.el10_0)"

URI_linux-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/linux-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:linux-firmware = "linux-firmware-whence ( )"
RPROVIDES:linux-firmware = "kernel-firmware ( =  20251008) linux-firmware ( =  20251008-15.8.el10_0)"

URI_linux-firmware-whence = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/linux-firmware-whence-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:linux-firmware-whence = ""
RPROVIDES:linux-firmware-whence = "linux-firmware-whence ( =  20251008-15.8.el10_0)"

URI_mlxsw_spectrum-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mlxsw_spectrum-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mlxsw_spectrum-firmware = "linux-firmware-whence ( )"
RPROVIDES:mlxsw_spectrum-firmware = "mlxsw_spectrum-firmware ( =  20251008-15.8.el10_0)"

URI_mrvlprestera-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mrvlprestera-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mrvlprestera-firmware = "linux-firmware-whence ( )"
RPROVIDES:mrvlprestera-firmware = "mrvlprestera-firmware ( =  20251008-15.8.el10_0)"

URI_mt7xxx-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mt7xxx-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mt7xxx-firmware = "linux-firmware-whence ( )"
RPROVIDES:mt7xxx-firmware = "mt7xxx-firmware ( =  20251008-15.8.el10_0)"

URI_netronome-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netronome-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:netronome-firmware = "linux-firmware-whence ( )"
RPROVIDES:netronome-firmware = "netronome-firmware ( =  20251008-15.8.el10_0)"

URI_nxpwireless-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nxpwireless-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nxpwireless-firmware = "linux-firmware-whence ( )"
RPROVIDES:nxpwireless-firmware = "nxpwireless-firmware ( =  20251008-15.8.el10_0)"

URI_qcom-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/qcom-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:qcom-firmware = "linux-firmware-whence ( ) atheros-firmware ( =  20251008-15.8.el10_0)"
RPROVIDES:qcom-firmware = "qcom-firmware ( =  20251008-15.8.el10_0)"

URI_realtek-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/realtek-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:realtek-firmware = "linux-firmware-whence ( )"
RPROVIDES:realtek-firmware = "realtek-firmware ( =  20251008-15.8.el10_0)"

URI_tiwilink-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tiwilink-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tiwilink-firmware = "linux-firmware-whence ( )"
RPROVIDES:tiwilink-firmware = "tiwilink-firmware ( =  20251008-15.8.el10_0)"

URI_amd-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/amd-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:amd-gpu-firmware = "linux-firmware-whence ( )"
RPROVIDES:amd-gpu-firmware = "amd-gpu-firmware ( =  20251008-15.8.el10_0)"

URI_intel-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/intel-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-gpu-firmware = "linux-firmware-whence ( )"
RPROVIDES:intel-gpu-firmware = "intel-gpu-firmware ( =  20251008-15.8.el10_0)"

URI_nvidia-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nvidia-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nvidia-gpu-firmware = "linux-firmware-whence ( ) linux-firmware ( if  linux-firmware)"
RPROVIDES:nvidia-gpu-firmware = "nvidia-gpu-firmware ( =  20251008-15.8.el10_0)"

URI_liquidio-firmware = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liquidio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:liquidio-firmware = "linux-firmware-whence ( )"
RPROVIDES:liquidio-firmware = "liquidio-firmware ( =  20251008-15.8.el10_0)"
