
inherit dnf-bridge

PN = "usbutils"
PE = "0"
PV = "017"
PR = "5.el10"
PACKAGES = "usbutils"


URI_usbutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/usbutils-017-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbutils = " \
 python3 \
 systemd-libs \
 hwdata \
 bash \
 glibc \
 libusb1 \
"
