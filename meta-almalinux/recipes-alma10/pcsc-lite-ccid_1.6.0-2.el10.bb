
inherit dnf-bridge

PN = "pcsc-lite-ccid"
PE = "0"
PV = "1.6.0"
PR = "2.el10"
PACKAGES = "pcsc-lite-ccid"


URI_pcsc-lite-ccid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-ccid-1.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-ccid = " \
 systemd \
 bash \
 pcsc-lite \
 glibc \
 libusb1 \
"
