
inherit dnf-bridge

PN = "tboot"
PE = "1"
PV = "1.11.9"
PR = "1.el10"
PACKAGES = "tboot"


URI_tboot = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tboot-1.11.9-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tboot = " \
 zlib-ng-compat \
 openssl-libs \
 bash \
 glibc \
 grub2-efi-x64-modules \
"
