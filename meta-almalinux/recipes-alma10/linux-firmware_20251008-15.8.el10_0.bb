
inherit dnf-bridge

PN = "linux-firmware"
PE = "0"
PV = "20251008"
PR = "15.8.el10_0"
PACKAGES = "amd-ucode-firmware atheros-firmware brcmfmac-firmware cirrus-audio-firmware dvb-firmware intel-audio-firmware intel-vsc-firmware iwlegacy-firmware iwlwifi-dvm-firmware iwlwifi-mvm-firmware libertas-firmware linux-firmware linux-firmware-whence mlxsw_spectrum-firmware mrvlprestera-firmware mt7xxx-firmware netronome-firmware nxpwireless-firmware qcom-firmware realtek-firmware tiwilink-firmware amd-gpu-firmware intel-gpu-firmware nvidia-gpu-firmware liquidio-firmware"


URI_amd-ucode-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/amd-ucode-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:amd-ucode-firmware = " \
 linux-firmware-whence \
"

URI_atheros-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/atheros-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:atheros-firmware = " \
 linux-firmware-whence \
"

URI_brcmfmac-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/brcmfmac-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:brcmfmac-firmware = " \
 linux-firmware-whence \
"

URI_cirrus-audio-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cirrus-audio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cirrus-audio-firmware = " \
 linux-firmware-whence \
"

URI_dvb-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dvb-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:dvb-firmware = " \
 linux-firmware-whence \
"

URI_intel-audio-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/intel-audio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-audio-firmware = " \
 linux-firmware-whence \
"

URI_intel-vsc-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/intel-vsc-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-vsc-firmware = " \
 linux-firmware-whence \
"

URI_iwlegacy-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlegacy-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlegacy-firmware = " \
 linux-firmware-whence \
"

URI_iwlwifi-dvm-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlwifi-dvm-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlwifi-dvm-firmware = " \
 linux-firmware-whence \
"

URI_iwlwifi-mvm-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwlwifi-mvm-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:iwlwifi-mvm-firmware = " \
 linux-firmware-whence \
"

URI_libertas-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libertas-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libertas-firmware = " \
 linux-firmware-whence \
"

URI_linux-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/linux-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:linux-firmware = " \
 linux-firmware-whence \
"

URI_linux-firmware-whence = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/linux-firmware-whence-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:linux-firmware-whence = ""

URI_mlxsw_spectrum-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mlxsw_spectrum-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mlxsw_spectrum-firmware = " \
 linux-firmware-whence \
"

URI_mrvlprestera-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mrvlprestera-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mrvlprestera-firmware = " \
 linux-firmware-whence \
"

URI_mt7xxx-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mt7xxx-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mt7xxx-firmware = " \
 linux-firmware-whence \
"

URI_netronome-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netronome-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:netronome-firmware = " \
 linux-firmware-whence \
"

URI_nxpwireless-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nxpwireless-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nxpwireless-firmware = " \
 linux-firmware-whence \
"

URI_qcom-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/qcom-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:qcom-firmware = " \
 linux-firmware-whence \
 atheros-firmware \
"

URI_realtek-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/realtek-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:realtek-firmware = " \
 linux-firmware-whence \
"

URI_tiwilink-firmware = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tiwilink-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tiwilink-firmware = " \
 linux-firmware-whence \
"

URI_amd-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/amd-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:amd-gpu-firmware = " \
 linux-firmware-whence \
"

URI_intel-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/intel-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:intel-gpu-firmware = " \
 linux-firmware-whence \
"

URI_nvidia-gpu-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nvidia-gpu-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nvidia-gpu-firmware = " \
 linux-firmware-whence \
 linux-firmware \
"

URI_liquidio-firmware = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liquidio-firmware-20251008-15.8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:liquidio-firmware = " \
 linux-firmware-whence \
"
