
inherit dnf-bridge

PN = "stunnel"
PE = "0"
PV = "5.72"
PR = "8.el10"
PACKAGES = "stunnel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/stunnel-5.72-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_stunnel = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/stunnel-5.72-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_stunnel}"
RDEPENDS:stunnel = " \
 systemd \
 systemd-libs \
 openssl-libs \
 bash \
 glibc \
"
