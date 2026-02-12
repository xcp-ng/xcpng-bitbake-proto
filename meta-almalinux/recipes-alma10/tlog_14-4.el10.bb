
inherit dnf-bridge

PN = "tlog"
PE = "0"
PV = "14"
PR = "4.el10"
PACKAGES = "tlog"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tlog-14-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tlog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tlog-14-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tlog}"
RDEPENDS:tlog = " \
 libutempter \
 systemd \
 systemd-libs \
 json-c \
 bash \
 libcurl \
 glibc \
"
