
inherit dnf-bridge

PN = "mdevctl"
PE = "0"
PV = "1.3.0"
PR = "6.el10"
PACKAGES = "mdevctl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mdevctl-1.3.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mdevctl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mdevctl-1.3.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mdevctl}"
RDEPENDS:mdevctl = " \
 glibc \
 systemd-udev \
 libgcc \
"
