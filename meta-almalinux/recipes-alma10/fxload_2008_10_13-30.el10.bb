
inherit dnf-bridge

PN = "fxload"
PE = "0"
PV = "2008_10_13"
PR = "30.el10"
PACKAGES = "fxload"


URI_fxload = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fxload-2008_10_13-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fxload = " \
 glibc \
 systemd-udev \
"
