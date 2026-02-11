
inherit dnf-bridge

PN = "ktls-utils"
PE = "0"
PV = "0.11"
PR = "3.el10"
PACKAGES = "ktls-utils"


URI_ktls-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ktls-utils-0.11-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ktls-utils = " \
 gnutls \
 keyutils-libs \
 libnl3 \
 bash \
 glib2 \
 glibc \
"
