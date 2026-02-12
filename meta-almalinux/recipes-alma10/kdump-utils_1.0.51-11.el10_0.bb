
inherit dnf-bridge

PN = "kdump-utils"
PE = "0"
PV = "1.0.51"
PR = "11.el10_0"
PACKAGES = "kdump-utils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/kdump-utils-1.0.51-11.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kdump-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kdump-utils-1.0.51-11.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kdump-utils}"
RDEPENDS:kdump-utils = " \
 dracut-squash \
 kexec-tools \
 util-linux \
 systemd-udev \
 makedumpfile \
 bash \
 ethtool \
 dracut \
 sed \
 coreutils \
 dracut-network \
"
