
inherit dnf-bridge

PN = "blktrace"
PE = "0"
PV = "1.3.0"
PR = "13.el10"
PACKAGES = "blktrace iowatcher"


URI_blktrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/blktrace-1.3.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blktrace = " \
 python3 \
 libaio \
 librsvg2-tools \
 bash \
 glibc \
"

URI_iowatcher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iowatcher-1.3.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iowatcher = " \
 glibc \
 blktrace \
 theora-tools \
 sysstat \
"
