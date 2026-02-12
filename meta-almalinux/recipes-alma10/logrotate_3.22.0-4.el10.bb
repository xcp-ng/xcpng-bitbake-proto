
inherit dnf-bridge

PN = "logrotate"
PE = "0"
PV = "3.22.0"
PR = "4.el10"
PACKAGES = "logrotate"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/logrotate-3.22.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_logrotate = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/logrotate-3.22.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_logrotate}"
RDEPENDS:logrotate = " \
 libacl \
 systemd \
 libselinux \
 bash \
 popt \
 glibc \
 coreutils \
"
