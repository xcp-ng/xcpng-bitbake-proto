
inherit dnf-bridge

PN = "rust-prefixdevname"
PE = "0"
PV = "0.2.0"
PR = "4.el10"
PACKAGES = "prefixdevname"


URI_prefixdevname = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/prefixdevname-0.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prefixdevname = " \
 glibc \
 libgcc \
 bash \
 systemd-libs \
"
